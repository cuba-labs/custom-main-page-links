package com.company.demo.web;

import com.haulmont.cuba.web.App;
import com.haulmont.cuba.web.sys.LinkHandler;
import com.vaadin.server.VaadinSession;
import com.vaadin.server.WrappedSession;

import java.util.Map;

import static com.haulmont.cuba.web.AppUI.LAST_REQUEST_PARAMS_ATTR;

public class CatsLinkHandler extends LinkHandler {
    public CatsLinkHandler(App app, String action, Map<String, String> requestParams) {
        super(app, action, requestParams);
    }

    @Override
    public boolean canHandleLink() {
        return "cats".equals(action) || super.canHandleLink();
    }

    @Override
    public void handle() {
        if ("cats".equals(action)) {
            // open custom main window
            App.getInstance()
                    .navigateTo("cats-demo");

            action = null;
            requestParams.clear();

            WrappedSession wrappedSession = VaadinSession.getCurrent().getSession();
            wrappedSession.removeAttribute(LAST_REQUEST_PARAMS_ATTR);
        } else {
            super.handle();
        }
    }
}