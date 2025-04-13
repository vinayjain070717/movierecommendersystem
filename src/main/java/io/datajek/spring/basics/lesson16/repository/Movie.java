package io.datajek.spring.basics.lesson16.repository;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

import org.slf4j.Logger;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;

@Repository
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Movie {
    private Logger logger=org.slf4j.LoggerFactory.getLogger(this.getClass());
    private static int instance=0;

    private int id;
    private String name;
    private String genre;
    private String producer;

    public Movie(){
        instance++;
        System.out.println("Movie constructor called: "+instance);
    }

    @PostConstruct
    private void postConstruct(){
        logger.info("In Movie, postConstruct() method: "+instance);
    }

    @PreDestroy
    private void preDestroy(){
        logger.info("In Movie, preDestroy() method: "+instance);
    }

    public static int getInstance(){
        return Movie.instance;
    }
}
