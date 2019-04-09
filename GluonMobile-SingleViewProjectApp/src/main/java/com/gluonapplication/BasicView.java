package com.gluonapplication;

import com.gluonapplication.math.MathBlock;
import com.gluonapplication.math.MathBlockExtractor;
import com.gluonapplication.math.Type;
import com.gluonhq.charm.glisten.control.AppBar;
import com.gluonhq.charm.glisten.control.Icon;
import com.gluonhq.charm.glisten.mvc.View;
import com.gluonhq.charm.glisten.visual.MaterialDesignIcon;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class BasicView extends View {


    private MathBlockExtractor mathBlockExtractor;


    public BasicView() {

        mathBlockExtractor = new MathBlockExtractor("/math02.md");
        WebView webView = new WebView();
        WebEngine engine = webView.getEngine();


        engine.loadContent(HtmlTemplate.blockHtmlTemplate, "text/html;charset=utf-8");

        Label label = new Label("SHOW MATH");

        Button button = new Button();
        button.setWrapText(true);
        button.setMaxSize(300, 300);
        button.setOnAction(e -> {
                    label.setText("NEXT");
                    MathBlock m = mathBlockExtractor.getOneMathBlock();
                    String html;
                    if (m.type().equals(Type.ALIGNED)) {
                        html = HtmlTemplate.generateFormulaHtml(m.getTitle(), m.toJson());
                    } else {
                        html = HtmlTemplate.generateBlockHtml(m.getTitle(), m.toContent());
                    }
                    engine.loadContent(html);

                }

        );

        VBox controls = new VBox(15.0, label, button, webView);
        controls.setAlignment(Pos.BOTTOM_LEFT);
        controls.setSpacing(10);


        setCenter(controls);

    }


    @Override
    protected void updateAppBar(AppBar appBar) {
        appBar.setNavIcon(MaterialDesignIcon.MENU.button(e -> System.out.println("Menu")));
        appBar.setTitleText("Basic View");
        appBar.getActionItems().add(MaterialDesignIcon.SEARCH.button(e -> System.out.println("Search")));
    }


}
