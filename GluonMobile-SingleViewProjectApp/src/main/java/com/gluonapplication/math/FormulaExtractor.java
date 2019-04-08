package com.gluonapplication.math;

import com.gluonapplication.Utils;

import java.util.*;

/**
 * Created by Geng Qing on 2019-03-26
 **/
public class FormulaExtractor {

    public static final String BLOCK = "BLOCK";

    private static FormulaExtractor formulaExtractor;

    public static FormulaExtractor getInstance() {
        if (formulaExtractor == null) {
            try {
                formulaExtractor = new FormulaExtractor();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return formulaExtractor;
    }

    public Map<String, MathBlock> getBlockMap() {
        return blockMap;
    }

    private Map<String, MathBlock> blockMap;

    private Map<String, ArrayList<Formula>> allFormulas = new HashMap<>();

    private FormulaExtractor() throws Exception {
        ArrayList<MathBlock> blocks = this.splitMathBlock();
        blockMap = new HashMap<>();
        blocks.forEach(mathBlock -> blockMap.put(mathBlock.getTitle(), mathBlock));
    }

    public ArrayList<Formula> extractDerivativeByTitle(String title) {

        ArrayList<Formula> formulas = allFormulas.get(title);
        if (formulas == null) {
            formulas = new ArrayList<>();
            MathBlock block = blockMap.get(title);
            Type type = block.type();
            switch (type) {
                case ALIGNED:
                    extractAlignedFormula(formulas, block);
                    break;
                case EQAULITY:
                    for (String s : block.contents) {
                        int i = s.indexOf("=");
                        if (i <= 0) {
                            System.err.println("less 0 " + s);
                            continue;

                        }
                        Formula formula = new Formula();
                        formula.setLeft(s.substring(0, i));
                        formula.setRight(s.substring(i + 1));
                        formulas.add(formula);
                    }
                    break;
            }


            Collections.shuffle(formulas);
            allFormulas.put(title, formulas);

        }
        return formulas;
    }

    private void extractAlignedFormula(final ArrayList<Formula> formulas, MathBlock block) {
        for (String str : block.contents) {
            if (!str.contains("&")) {
                continue;
            }

            formulas.addAll(getFormula(str));
        }
    }


    public List<Formula> getFormula(String line) {
        List list = new ArrayList<Formula>();


        if (line.contains("&=")) {
            Formula formula = createFormula(line, "&=");
            if (formula != null) list.add(formula);
        } else {
            String[] fs = line.split("&");
            for (int i = 0; i < fs.length; i++) {
                String str = fs[i];
                if (str.trim().isEmpty()) {
                    continue;
                }
                Formula formula = createFormula(str, "=");
                if (formula != null) list.add(formula);
            }
        }
        return list;
    }

    private Formula createFormula(String str, String regex) {
        if (!str.contains(regex)) {
            System.err.println("no '" + str + "' sp=" + regex);
            return null;
        }
        String[] strs = str.split(regex);
        Formula formula = new Formula();
        formula.setLeft(strs[0]);
        formula.setRight(strs[1]);
        return formula;
    }

    public int countChar(String line, String s) {
        int count = 0;
        for (char c : line.toCharArray()) {
            if (c == s.toCharArray()[0]) {
                count++;
            }
        }
        return count;
    }

    private List<String> readAllLines() {
        String fileLocation = "/math02.md";
        List list = Utils.loadContent(fileLocation);
        return list;
    }

    protected ArrayList<MathBlock> splitMathBlock() throws Exception {

        ArrayList<MathBlock> allBlocks = new ArrayList<>();

        List<String> lines = readAllLines();
        boolean started = false;


        MathBlock mathBlock = null;

        for (int i = 0; i < lines.size(); i++) {
            String line = lines.get(i);
            if (!started && isMathBlockCharacters(line)) {
                started = true;
                mathBlock = new MathBlock();
                mathBlock.setStartLineNo(i);
                setTitle(mathBlock, lines, i);
                continue;
            }

            if (started && isNotNull(line)) {
                mathBlock.getContents().add(line);
            }

            if (started && isMathBlockCharacters(line)) {
                mathBlock.setEndLineNo(i);
                allBlocks.add(mathBlock);
                started = false;
            }
        }

        return allBlocks;
    }


    private void setTitle(MathBlock blockBuilder, List<String> lines, int startLineNo) {
        for (int j = startLineNo - 1; startLineNo >= 0; j--) {
            String title = lines.get(j);
            if (isNotNull(title)) {
                blockBuilder.setTitle(title);
                break;
            }
        }
    }

    private boolean isNotNull(String title) {
        return !Objects.isNull(title) && !title.trim().isEmpty();
    }

    private boolean isMathBlockCharacters(String line) {
        return line.trim().contains("$$");
    }

    public List<String> getAlignedBlockNames() {
        List list = new ArrayList<String>();
        getBlockMap().values().forEach(mathBlock -> {
            if (mathBlock.type().equals(Type.ALIGNED)) {
                list.add(mathBlock.getTitle());
            }
        });
        return list;

    }

    public MathBlock getOneBlock() {
        List<String> keys = new ArrayList<>(getBlockMap().keySet());
        Random random = new Random();
        int i = random.nextInt(keys.size());
        return getBlockMap().get(keys.get(i));
    }
}
