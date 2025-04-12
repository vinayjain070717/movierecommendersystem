package io.datajek.spring.basics.movierecommendersystem.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {
    @Autowired
    @Qualifier("contentBasedFilter")
    private Filter filter;

    public String[] recommendMovies(String movie){
        System.out.println("Name of filter in use: "+filter+"\n");
        String[] results=filter.getRecommendations(movie);
        return results;
    }
}
