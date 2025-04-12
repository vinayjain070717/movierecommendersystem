package io.datajek.spring.basics.movierecommendersystem;

import io.datajek.spring.basics.movierecommendersystem.services.CollabrativeFilter;
import io.datajek.spring.basics.movierecommendersystem.services.ContentBasedFilter;
import io.datajek.spring.basics.movierecommendersystem.services.RecommenderImplementation;
import io.datajek.spring.basics.movierecommendersystem.services.RecommenderImplementation2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.sql.SQLOutput;
import java.util.Arrays;

@SpringBootApplication
public class MovierecommendersystemApplication {

	public static void main(String[] args) {
		ApplicationContext appContext=SpringApplication.run(MovierecommendersystemApplication.class, args);
		RecommenderImplementation2 recommender=appContext.getBean(RecommenderImplementation2.class);
		System.out.println("Hello to the spring boot application");

		String[] results=recommender.recommendMovies("Finding Dory");
		System.out.println(Arrays.toString(results));
	}

}
