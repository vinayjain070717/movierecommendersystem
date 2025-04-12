package io.datajek.spring.basics.movierecommendersystem.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class CollabrativeFilter implements Filter{
    public String[] getRecommendations(String movie){
        return new String[]{"Collabrative Filter", "Finding Nemo", "Ice Age", "Toy Story"};
    }
}
