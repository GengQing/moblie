package com.gluonapplication;

import com.gluonapplication.math.FormulaExtractor;
import com.gluonapplication.math.MathBlock;
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

import java.util.Arrays;

public class BasicView extends View {


    public BasicView() {


        Label label = new Label("Hello World!");


        WebView webView = new WebView();
        WebEngine engine = webView.getEngine();

        String content = Utils.loadString("/index.html");


        engine.loadContent(content);

        Button button = new Button("Change the World!");
        button.setGraphic(new Icon(MaterialDesignIcon.LANGUAGE));
        button.setOnAction(e -> {
                    MathBlock m = FormulaExtractor.getInstance().getOneBlock();
                    label.setText(m.getTitle());
                    String formula = content.replace("math_formula_to_replace",
                            Arrays.toString(m.getContents().toArray()));
                    engine.loadContent(formula);

                }

        );
        VBox controls = new VBox(20.0, button, label, webView);
        controls.setAlignment(Pos.CENTER);


        setCenter(controls);

    }

    @Override
    protected void updateAppBar(AppBar appBar) {
        appBar.setNavIcon(MaterialDesignIcon.MENU.button(e -> System.out.println("Menu")));
        appBar.setTitleText("Basic View");
        appBar.getActionItems().add(MaterialDesignIcon.SEARCH.button(e -> System.out.println("Search")));
    }


}
