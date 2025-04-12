package io.datajek.spring.basics.movierecommendersystem.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class RecommenderImplementation {
    private Logger logger=LoggerFactory.getLogger(this.getClass());

    // @Autowired
    // @Qualifier("contentBasedFilter")
    private Filter filter;

    @Autowired
    @Qualifier("contentBasedFilter")
    public void setFilter(Filter filter) {
        logger.info("In RecommenderImplementation: setFilter() method, dependency injection");
        this.filter = filter;
    }

    @PostConstruct
    public void postConstruct(){
        logger.info("In RecommenderImplementation, postContruct() method");
    }

    @PreDestroy
    public void preDestroy(){
        logger.info("In RecommenderImplementation, preDestroy() method");
    }

    public String[] recommendMovies(String movie){
        System.out.println("Name of filter in use: "+filter+"\n");
        String[] results=filter.getRecommendations(movie);
        return results;
    }
}
