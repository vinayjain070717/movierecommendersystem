package io.datajek.spring.basics.lesson16.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;

@Service
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CollabrativeFilter implements Filter{
    public String[] getRecommendations(String movie){
        return new String[]{"Collabrative Filter", "Finding Nemo", "Ice Age", "Toy Story"};
    }
}
