package com.gluonapplication.math;

import javax.json.*;
import javax.json.spi.JsonProvider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MathBlock {

    public static List<String> EQUALITY_BLOCK = Arrays.asList("## 泰勒公式", "## 高阶导数");

    private String title;

    private int startLineNo;
    private int endLineNo;

    private Type type;

    public List<String> contents;


    private List<Formula> formulas;

    public MathBlock() {
        contents = new ArrayList<>();
    }


    public Type type() {

        if (type != null) {
            return type;
        }

        if (EQUALITY_BLOCK.contains(title)) {
            return Type.EQUALITY;
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

    public String toContent() {
        StringBuilder builder = new StringBuilder("\n");
        contents.forEach(s -> builder.append(s));
        String s = builder.toString();
        return s;
    }

    public List<Formula> getFormulas() {
        if (formulas == null) {
            formulas = FormulaExtractor.getInstance().extractAlignedFormula(this);
            Collections.shuffle(formulas);
        }
        return formulas;
    }

    public String toJson() {
        JsonArrayBuilder arrayBuilder = JsonProvider.provider().createArrayBuilder();

        for (Formula formula : getFormulas()) {
            arrayBuilder.add(formula.toBuilder());
        }
        return arrayBuilder.build().toString();

    }

    public void setContents(List<String> contents) {
        this.contents = contents;
    }
}
