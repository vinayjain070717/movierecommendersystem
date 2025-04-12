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

import java.sql.SQLOutput;
import java.util.Arrays;

@SpringBootApplication
public class MovierecommendersystemApplication {

	public static void main(String[] args) {
		ApplicationContext appContext=SpringApplication.run(MovierecommendersystemApplication.class, args);

		ContentBasedFilter filter=appContext.getBean(ContentBasedFilter.class);
		System.out.println("\nContentBasedFilter bean with singleton scope");
		System.out.println(filter);

		Movie movie1=filter.getMovie();
		Movie movie2=filter.getMovie();
		Movie movie3=filter.getMovie();

		System.out.println("\nMovie bean with prototype scope");
		System.out.println(movie1);
		System.out.println(movie2);
		System.out.println(movie3);

		System.out.println("\nContentBasedFilter instances created: "+ContentBasedFilter.getInstances());
		System.out.println("Movie instances created: "+Movie.getInstance());
	}

}
