package io.datajek.spring.basics.lesson16.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Service
public class RecommenderImplementation {
    private Logger logger=LoggerFactory.getLogger(this.getClass());

    @Autowired
    @Qualifier("contentBasedFilter")
    private Filter filter;

    public String[] recommendMovies(String movie){
        System.out.println("Name of filter in use: "+filter+"\n");
        String[] results=filter.getRecommendations(movie);
        return results;
    }
}
