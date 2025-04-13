package io.datajek.spring.basics.lesson16;

import io.datajek.spring.basics.lesson16.repository.Movie;
import io.datajek.spring.basics.lesson16.services.RecommenderImplementation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import java.util.Arrays;

@SpringBootApplication
@ComponentScan(basePackages = {"io.datajek.spring.basics.movierecommendersystem.lesson16"})
public class MovierecommendersystemApplication {

	public static void main(String[] args) {
		ApplicationContext appContext=SpringApplication.run(MovierecommendersystemApplication.class, args);
		RecommenderImplementation recommender=appContext.getBean(RecommenderImplementation.class);
		System.out.println(recommender);

		String[] result=recommender.recommendMovies("Finding Dory");
		System.out.println(Arrays.toString(result));

		Movie m1=appContext.getBean(Movie.class);
		System.out.println(m1);
		Movie m2=appContext.getBean(Movie.class);
		System.out.println(m2);

	}

}
