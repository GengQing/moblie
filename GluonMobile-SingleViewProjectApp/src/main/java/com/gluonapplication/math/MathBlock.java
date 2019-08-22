package com.gluonapplication.math;

import javax.json.*;
import javax.json.spi.JsonProvider;
import java.util.*;

public class MathBlock {

    public static final String SUFFIX = ">";
    public static final String ALIGNED = "aligned";
    public static List<String> EQUALITY_BLOCK =
            Arrays.asList("泰勒公式", "高阶导数", "补充积分", "排列组合公式", "导数四则运算",
                    "反函数求导", "周期函数积分", "变上限积分");

    public static List<String> exculdeAligned = Arrays.asList("几个重要等价无穷小");

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
            type = Type.EQUALITY;
            return type;
        }

        for (String str : this.getContents()) {
            if (str.contains(ALIGNED) && !title.endsWith(SUFFIX)) {
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
        StringJoiner builder = new StringJoiner("<br/>");
        contents.forEach(s -> builder.add(s));
        String s = builder.toString();
        return s;
    }

    public List<Formula> getFormulas() {
        if (formulas == null) {
            formulas = FormulaExtractor.getInstance().extractDerivativeByTitle(this);
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
