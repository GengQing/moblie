package com.gluonapplication;

import com.gluonapplication.math.MathBlock;
import com.gluonapplication.math.MathBlockExtractor;
import com.gluonapplication.math.Type;
import com.gluonhq.charm.glisten.control.AppBar;
import com.gluonhq.charm.glisten.mvc.View;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class BasicView extends View {


    private MathBlockExtractor mathBlockExtractor;


    public BasicView() {

        mathBlockExtractor = new MathBlockExtractor("/Formula.md");
        WebView webView = new WebView();
        WebEngine engine = webView.getEngine();


        engine.loadContent(HtmlTemplate.blockHtmlTemplate, "text/html;charset=utf-8");

        Label label = new Label("SHOW FORMULA");

        Button button = new Button();
        button.setWrapText(true);
        button.setMaxSize(300, 300);
        button.setOnAction(e -> {
                    label.setText("NEXT");
                    MathBlock m = mathBlockExtractor.getOneMathBlock();
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


    @Override
    protected void updateAppBar(AppBar appBar) {
//        appBar.setNavIcon(MaterialDesignIcon.MENU.button(e -> System.out.println("Menu")));
        appBar.setTitleText("MATH");
//        appBar.getActionItems().add(MaterialDesignIcon.SEARCH.button(e -> System.out.println("Search")));
//        appBar.getMenuItems().add(new MenuItem("积分"));
    }


}
