package com.gluonapplication.math;

import com.gluonapplication.Utils;

import java.util.*;

/**
 * create by GengQing on 2019/4/9
 */
public class MathBlockExtractor {

    public static final String SEP = "$$";

    public Map<String, MathBlock> allMathBlocks = new HashMap<>();

    public List<MathBlock> blockList = new ArrayList<>();

    public int size;

    public MathBlockExtractor(String fileLocation) {
        List<String> list = Utils.readAllLines(fileLocation);
        extract(list);
    }

    private void extract(List<String> list) {
        Queue<String> queue = new ArrayDeque<>();

        for (int i = 0; i < list.size(); i++) {
            String line = list.get(i).trim();
            if (line.isEmpty()) {
                continue;
            }

            if (isSplitLine(line) && queue.contains(SEP)) { // 分段行, 成对出现
                MathBlock mathBlock = createOneBlock(queue);
                allMathBlocks.put(mathBlock.getTitle(), mathBlock);
            } else {
                queue.add(line);
            }
        }

        blockList.addAll(allMathBlocks.values());
        Collections.shuffle(blockList);
        this.size = blockList.size();

    }

    private MathBlock createOneBlock(final Queue<String> queue) {
        MathBlock mathBlock = new MathBlock();
        String title = null;
        while (!queue.isEmpty()) {
            String s = queue.poll();
            if (isSplitLine(s)) {
                mathBlock.getContents().addAll(queue);
                queue.clear();
                break;
            } else {
                title = s;
            }

        }

        mathBlock.setTitle(title.substring(4));
        return mathBlock;
    }

    private boolean isSplitLine(String line) {
        return SEP.equals(line);
    }

    public MathBlock getMathBlockByTitle(String title) {
        return allMathBlocks.get(title);
    }

    int cnt = 0;

    public MathBlock getOneMathBlock() {
        MathBlock mathBlock = blockList.get(cnt % size);
        cnt++;
        return mathBlock;
    }
}
