package io.datajek.spring.basics.movierecommendersystem.services;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;

@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Movie {
    private static int instance=0;

    private int id;
    private String name;
    private String genre;
    private String producer;

    public Movie(){
        instance++;
        System.out.println("Movie constructor called: "+instance);
    }

    public static int getInstance(){
        return Movie.instance;
    }
}
