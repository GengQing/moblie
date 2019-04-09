package com.gluonapplication.math;

import javax.json.JsonObjectBuilder;
import javax.json.spi.JsonProvider;

/**
 * Created by Geng Qing on 2019-03-26
 **/
public class Formula {
    private String left;
    private String right;

    public String getLeft() {
        return left;
    }

    public void setLeft(String left) {
        this.left = left;
    }

    public String getRight() {
        return right;
    }

    public void setRight(String right) {
        this.right = right;
    }

    public JsonObjectBuilder toBuilder() {
        JsonObjectBuilder objectBuilder = JsonProvider.provider().createObjectBuilder();
        objectBuilder.add("left", getLeft())
                .add("right", getRight());
        return objectBuilder;
    }
}
