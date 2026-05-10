package org.example.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;  // No root-level config (like DataSources) for now
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{AppConfig.class};  // Your AppConfig class here
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};  // Map all requests
    }
}