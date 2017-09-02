package com.company.demo.web.screens;

import com.haulmont.cuba.gui.components.AbstractMainWindow;

import java.util.Map;

public class CatsDemo extends AbstractMainWindow {
    @Override
    public void init(Map<String, Object> params) {
        super.init(params);

        showNotification("Show cats page!");
    }
}