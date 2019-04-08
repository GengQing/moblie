package com.gluonapplication;

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

public class BasicView extends View {

    public BasicView() {

        Label label = new Label("Hello JavaFX World!");


        WebView webView = new WebView();
        WebEngine engine = webView.getEngine();

        String content = Utils.loadString("/index.html");


        engine.loadContent(content);

        Button button = new Button("Change the World!");
        button.setGraphic(new Icon(MaterialDesignIcon.LANGUAGE));
        button.setOnAction(e -> {

                    label.setText("Hello JavaFX Universe!");
                    engine.executeScript("document.getElementById('math').innerHTML = '$$a^2=3.14$$';" +
                            "MathJax.Hub.Queue([\"Typeset\", MathJax.Hub, math])");
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
