package com.gluonapplication.math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MathBlock {

    public static List<String> EQAULITY_BLOCK = Arrays.asList("## 泰勒公式", "## 高阶导数");

    private String title;

    private int startLineNo;
    private int endLineNo;

    private Type type;

    public List<String> contents;

    public MathBlock() {
        contents = new ArrayList<>();
    }


    public Type type() {

        if (type != null) {
            return type;
        }

        if (EQAULITY_BLOCK.contains(title)) {
            return Type.EQAULITY;
        }

        for (String str : this.getContents()) {
            if (str.contains("aligned")) {
                type = Type.ALIGNED;
                return type;
            }
        }

        return Type.NORMAL;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getStartLineNo() {
        return startLineNo;
    }

    public void setStartLineNo(int startLineNo) {
        this.startLineNo = startLineNo;
    }

    public int getEndLineNo() {
        return endLineNo;
    }

    public void setEndLineNo(int endLineNo) {
        this.endLineNo = endLineNo;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public List<String> getContents() {
        return contents;
    }

    public void setContents(List<String> contents) {
        this.contents = contents;
    }
}
