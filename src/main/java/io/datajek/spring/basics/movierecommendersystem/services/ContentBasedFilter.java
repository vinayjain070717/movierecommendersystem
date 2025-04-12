package io.datajek.spring.basics.movierecommendersystem.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class ContentBasedFilter implements Filter
{
    
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

    public String[] getRecommendations(String movie){
        return new String[]{"Happy Feet", "Ice Age", "Shark Tale"};
    }
}
