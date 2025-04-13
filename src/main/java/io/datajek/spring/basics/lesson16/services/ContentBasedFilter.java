package io.datajek.spring.basics.lesson16.services;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import io.datajek.spring.basics.lesson16.repository.Movie;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Service
public class ContentBasedFilter implements Filter
{
    private Logger logger=LoggerFactory.getLogger(this.getClass());
    private static int instances=0;

    @Autowired
    private Movie movie;

    @Lookup
    public Movie getMovie(){
        return movie;
    }

    public String[] getRecommendations(String movie){
        return new String[]{"Happy Feet", "Ice Age", "Shark Tale"};
    }
}
