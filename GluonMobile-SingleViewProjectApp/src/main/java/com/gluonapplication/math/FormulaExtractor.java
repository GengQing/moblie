package com.gluonapplication.math;

import java.util.*;

/**
 * Created by Geng Qing on 2019-03-26
 **/
public class FormulaExtractor {


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


    private Map<String, ArrayList<Formula>> allFormulas = new HashMap<>();

    private FormulaExtractor() {
    }

    public ArrayList<Formula> extractDerivativeByTitle(String title, MathBlock block) {

        ArrayList<Formula> formulas = allFormulas.get(title);
        if (formulas == null) {
            formulas = new ArrayList<>();
            Type type = block.type();
            switch (type) {
                case ALIGNED:
                    formulas.addAll(extractAlignedFormula(block));
                    break;
                case EQUALITY:
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

    public ArrayList<Formula> extractAlignedFormula(MathBlock block) {
        ArrayList<Formula> list = new ArrayList<>();
        for (String str : block.contents) {
            if (!str.contains("&")) {
                continue;
            }

            list.addAll(getFormula(str));
        }
        return list;
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


}
