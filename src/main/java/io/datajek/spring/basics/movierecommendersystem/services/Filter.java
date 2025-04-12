package io.datajek.spring.basics.movierecommendersystem.services;

public interface Filter {
    public String[] getRecommendations(String movie);
}
