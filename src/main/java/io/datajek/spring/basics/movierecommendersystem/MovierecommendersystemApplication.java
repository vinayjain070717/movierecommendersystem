package io.datajek.spring.basics.movierecommendersystem;

import io.datajek.spring.basics.movierecommendersystem.services.CollabrativeFilter;
import io.datajek.spring.basics.movierecommendersystem.services.ContentBasedFilter;
import io.datajek.spring.basics.movierecommendersystem.services.Movie;
import io.datajek.spring.basics.movierecommendersystem.services.RecommenderImplementation;
import io.datajek.spring.basics.movierecommendersystem.services.RecommenderImplementation2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.WebProperties.Resources.Chain.Strategy.Content;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

import java.sql.SQLOutput;
import java.util.Arrays;

@SpringBootApplication
@ComponentScan(basePackages = {"io.datajek.spring.basics.movierecommendersystem"})
@ComponentScan(includeFilters=@ComponentScan.Filter(type=FilterType.REGEX, pattern="io.datajek.spring.basics.lesson10.*"))
public class MovierecommendersystemApplication {

	public static void main(String[] args) {
		ApplicationContext appContext=SpringApplication.run(MovierecommendersystemApplication.class, args);

		// ContentBasedFilter filter=appContext.getBean(ContentBasedFilter.class);
		// CollabrativeFilter filter2=appContext.getBean(CollabrativeFilter.class);
		// System.out.println("ContentBasedFilter: "+filter);
		// System.out.println("CollabrativeFilter: "+filter2);
		RecommenderImplementation recommender=appContext.getBean(RecommenderImplementation.class);
		System.out.println("RecommenderImplementation: "+recommender);
	}

}
