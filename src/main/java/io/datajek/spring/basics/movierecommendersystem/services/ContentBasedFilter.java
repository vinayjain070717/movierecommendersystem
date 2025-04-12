package io.datajek.spring.basics.movierecommendersystem.services;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class ContentBasedFilter implements Filter
{
    private Logger logger=LoggerFactory.getLogger(this.getClass());
    private static int instances=0;

    @Autowired
    private Movie movie;

    public ContentBasedFilter(){
        instances++;
        System.out.println("ContentBasedFilter constructor called");
    }

    @Lookup
    public Movie getMovie(){
        return movie;
    }

    public static int getInstances(){
        return ContentBasedFilter.instances;
    }

    @PostConstruct
    private void postConstruct(){
        logger.info("In ContentBasedFilter, postConstruct() method");
    }

    @PreDestroy
    private void preDestroy(){
        logger.info("In ContentBasedFilter, preDestroy() method");
    }


    public String[] getRecommendations(String movie){
        return new String[]{"Happy Feet", "Ice Age", "Shark Tale"};
    }
}
