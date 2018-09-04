package com.api.provider.domain;

import java.io.Serializable;

public class Domain implements Serializable {

    private String name;

    private String attr;

    public Domain () {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAttr() {
        return attr;
    }

    public void setAttr(String attr) {
        this.attr = attr;
    }
}
