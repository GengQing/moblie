package com.gluonapplication;

import com.gluonapplication.math.MathBlock;
import com.gluonapplication.math.MathBlockExtractor;
import com.gluonapplication.math.Type;
import com.gluonhq.charm.glisten.control.AppBar;
import com.gluonhq.charm.glisten.mvc.View;
import com.gluonhq.charm.glisten.visual.MaterialDesignIcon;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class BasicView extends View {

    public static final String FORMULA = "formula";
    public static final String STRATEGY = "strategy";
    public static String selectStr = "";


    private MathBlockExtractor mathBlockExtractor;
    private MathBlockExtractor strategAndStepsExtractor;

    private WebEngine engine;


    public BasicView() {

        mathBlockExtractor = new MathBlockExtractor("/Formula.md");
        strategAndStepsExtractor = new MathBlockExtractor("/StrategyAndSteps.md");
        WebView webView = new WebView();
        engine = webView.getEngine();


        engine.loadContent(HtmlTemplate.blockHtmlTemplate, "text/html;charset=utf-8");

        Label label = new Label("SHOW FORMULA");

        Button button = new Button();
        button.setWrapText(true);
        button.setMaxSize(300, 300);
        button.setOnAction(e -> {
                    label.setText("NEXT");
                    MathBlock m = getOneMathBlock();
                    String html;
                    if (m.type().equals(Type.ALIGNED) || m.type().equals(Type.EQUALITY)) {
                        html = HtmlTemplate.generateFormulaHtml(m.getTitle(), m.toJson());
                    } else {
                        html = HtmlTemplate.generateBlockHtml(m.getTitle(), m.toContent());
                    }
                    engine.loadContent(html);

                }

        );

        VBox controls = new VBox(10.0, label, button, webView);
        controls.setAlignment(Pos.BOTTOM_LEFT);


        setCenter(controls);

    }

    private MathBlock getOneMathBlock() {
        if (selectStr.equals(STRATEGY)) {
            return strategAndStepsExtractor.getOneMathBlock();
        } else {
            return mathBlockExtractor.getOneMathBlock();
        }
    }


    @Override
    protected void updateAppBar(AppBar appBar) {
//        appBar.setNavIcon(MaterialDesignIcon.MENU.button(e -> System.out.println("Menu")));
        appBar.setTitleText("MATH");
//        appBar.getActionItems().add(MaterialDesignIcon.SEARCH.button(e -> System.out.println("Search")));
        appBar.getActionItems().add(MaterialDesignIcon.WEB_ASSET.button(this::loadFromWeb));
        MenuItem formula = new MenuItem(FORMULA);
        formula.setOnAction(event -> {
                    selectStr = formula.getText();
                    appBar.setTitleText(selectStr);
                }
        );
        appBar.getMenuItems().add(formula);
        MenuItem strategy = new MenuItem(STRATEGY);
        strategy.setOnAction(event -> {
            selectStr = strategy.getText();
            appBar.setTitleText(selectStr);
        });
        appBar.getMenuItems().add(strategy);
    }

    private void loadFromWeb(ActionEvent actionEvent) {
        engine.load("https://github.com/GengQing/moblie/blob/master/GluonMobile-SingleViewProjectApp/src/main/resources/Formula.md");

        new Thread(() -> {
            int cnt =0;
            while (engine.getDocument() == null) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                cnt ++;
                if (cnt > 20) {
                    break;
                }
            }
            Document document = engine.getDocument();
            if (document == null) {
                System.out.println("the doc is null");
                return;
            }
            NodeList nodeList = document.getElementsByTagName("article");
            if (nodeList.getLength() == 0) {
                System.out.println("the article is null");
            } else {
                String s = nodeList.item(0).getTextContent();
                System.out.println(s);
            }

        }).start();

    }


}
