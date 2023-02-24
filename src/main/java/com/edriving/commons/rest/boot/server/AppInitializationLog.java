package com.edriving.commons.rest.boot.server;

import org.glassfish.jersey.server.monitoring.ApplicationEvent;
import org.glassfish.jersey.server.monitoring.ApplicationEventListener;
import org.glassfish.jersey.server.monitoring.RequestEvent;
import org.glassfish.jersey.server.monitoring.RequestEventListener;

import javax.ws.rs.ext.Provider;

@Provider
public class AppInitializationLog implements ApplicationEventListener {

    @Override
    public void onEvent(ApplicationEvent applicationEvent) {
        logEvent(applicationEvent);
    }
    private static void logEvent(ApplicationEvent applicationEvent) {
        System.out.println("Application: '" + applicationEvent.getResourceConfig().getApplicationName()
                + "'; Event: '" + applicationEvent.getType() + "'.");
    }

    @Override
    public RequestEventListener onRequest(RequestEvent requestEvent) {
        return null;
    }
}
