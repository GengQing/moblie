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

import java.io.*;
import java.net.URL;
import java.nio.charset.Charset;

public class BasicView extends View {

    public BasicView() {

        Label label = new Label("Hello JavaFX World!");


        WebView webView = new WebView();
        WebEngine engine = webView.getEngine();
        InputStream html = GluonApplication.class.getResourceAsStream("/index.html");

        try {

            engine.loadContent(convert(html, Charset.defaultCharset()));

        } catch (Exception e) {
            e.printStackTrace();
        }

        Button button = new Button("Change the World!");
        button.setGraphic(new Icon(MaterialDesignIcon.LANGUAGE));
        button.setOnAction(e -> {

                    label.setText("Hello JavaFX Universe!");
                    engine.executeScript("document.getElementById('math').innerHTML = '$$a^2=3.14$$';" +
                            "MathJax.Hub.Queue([\"Typeset\", MathJax.Hub, math])");
                }

        );
        VBox controls = new VBox(15.0, label, button, webView);
        controls.setAlignment(Pos.CENTER);


        setCenter(controls);

    }

    @Override
    protected void updateAppBar(AppBar appBar) {
        appBar.setNavIcon(MaterialDesignIcon.MENU.button(e -> System.out.println("Menu")));
        appBar.setTitleText("Basic View");
        appBar.getActionItems().add(MaterialDesignIcon.SEARCH.button(e -> System.out.println("Search")));
    }


    public String convert(InputStream inputStream, Charset charset) throws IOException {

        StringBuilder stringBuilder = new StringBuilder();
        String line = null;

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, charset))) {
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line);
            }
        }

        return stringBuilder.toString();
    }
}
