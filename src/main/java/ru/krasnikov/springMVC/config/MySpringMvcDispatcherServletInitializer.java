package ru.krasnikov.springMVC.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MySpringMvcDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    //Указываем класс конфигурации
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringConfig.class};
    }

    //эквивалентно настройкам в <servlet-mapping> в web.xml
    protected String[] getServletMappings() {
        return new String[] {"/"};
    }
}
