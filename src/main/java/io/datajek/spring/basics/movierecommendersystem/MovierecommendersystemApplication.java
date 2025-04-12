package io.datajek.spring.basics.movierecommendersystem;

import io.datajek.spring.basics.movierecommendersystem.services.CollabrativeFilter;
import io.datajek.spring.basics.movierecommendersystem.services.ContentBasedFilter;
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


		// RecommenderImplementation2 recommender=appContext.getBean(RecommenderImplementation2.class);
		// System.out.println("Hello to the spring boot application");

		// String[] results=recommender.recommendMovies("Finding Dory");
		// System.out.println(Arrays.toString(results));
		ContentBasedFilter cbf1=appContext.getBean(ContentBasedFilter.class);
		ContentBasedFilter cbf2=appContext.getBean(ContentBasedFilter.class);
		ContentBasedFilter cbf3=appContext.getBean(ContentBasedFilter.class);

		System.out.println(cbf1);
		System.out.println(cbf2);
		System.out.println(cbf3);

		CollabrativeFilter cf1=appContext.getBean(CollabrativeFilter.class);
		CollabrativeFilter cf2=appContext.getBean(CollabrativeFilter.class);
		CollabrativeFilter cf3=appContext.getBean(CollabrativeFilter.class);

		System.out.println(cf1);
		System.out.println(cf2);
		System.out.println(cf3);
		//Output
		// io.datajek.spring.basics.movierecommendersystem.services.ContentBasedFilter@757529a4
		// io.datajek.spring.basics.movierecommendersystem.services.ContentBasedFilter@757529a4
		// io.datajek.spring.basics.movierecommendersystem.services.ContentBasedFilter@757529a4
		// CollabrativeFilter constructor called
		// CollabrativeFilter constructor called
		// CollabrativeFilter constructor called
		// io.datajek.spring.basics.movierecommendersystem.services.CollabrativeFilter@2234078
		// io.datajek.spring.basics.movierecommendersystem.services.CollabrativeFilter@5ec77191
		// io.datajek.spring.basics.movierecommendersystem.services.CollabrativeFilter@4642b71d
		// We can see that contentBasedFitler called one time at the time of context loading and all the objects are of same type
		// And collabrative filter is called three times and all the objects are different, and the contructor is called at run time
	}

}
