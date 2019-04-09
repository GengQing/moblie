package com.gluonapplication;

/**
 * create by GengQing on 2019/4/9
 */
public class HtmlTemplate {

    public static final String TITLE_TO_REPLACE = "TITLE_TO_REPLACE";
    public static String blockHtmlTemplate;

    public static String formulaHtmlTemplate;

    static {
        blockHtmlTemplate = Utils.loadString("/block.html");
        formulaHtmlTemplate = Utils.loadString("/formula.html");
    }

    public static String generateBlockHtml(String title, String content) {
        return blockHtmlTemplate.replace("MATH_FORMULA_TO_REPLACE",
                content).replace(TITLE_TO_REPLACE, title);
    }

    public static String generateFormulaHtml(String title, String json) {
        String older = "JSON_TO_REPLACE";
        return formulaHtmlTemplate.replace(older, json).replace(TITLE_TO_REPLACE, title);
    }
}
