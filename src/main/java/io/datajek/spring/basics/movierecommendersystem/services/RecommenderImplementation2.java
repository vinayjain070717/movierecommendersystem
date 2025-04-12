package io.datajek.spring.basics.movierecommendersystem.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation2 {
        private Filter filter;

//        public RecommenderImplementation2(@Qualifier("collabrativeFilter") Filter filter){
//            super();
//            this.filter=filter;
//            System.out.println("Constructor Invoked ... ");
//        }
        @Autowired
        @Qualifier("contentBasedFilter")
        public void setFilter(Filter filter){
            this.filter=filter;
            System.out.println("Setter invoked...");
        }

        public String[] recommendMovies(String movie){
            System.out.println("Name of filter in use: "+filter+"\n");
            String[] results=filter.getRecommendations(movie);
            return results;
        }

}
