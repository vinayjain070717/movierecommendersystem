package io.datajek.spring.basics.movierecommendersystem.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class ContentBasedFilter implements Filter
{
    public ContentBasedFilter(){
        System.out.println("ContentBasedFilter constructor called");
    }
    public String[] getRecommendations(String movie){
        return new String[]{"Happy Feet", "Ice Age", "Shark Tale"};
    }
}
