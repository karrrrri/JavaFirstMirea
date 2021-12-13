package ru.mirea.task27.p2;

import java.util.*;

public class City {
    String city, country;

    public City(String city, String country) {
        this.city = city;
        this.country = country;
    }

    public static void main(String[] args) {

        City Moscow = new City("Moscow", "Russia");
        City Misk = new City("Misk", "Belarus");
        City Bern = new City("Bern", "Switzerland");
        City Nizhny = new City("Nizhny Novgorod", "Russia");

        Map<String, ArrayList<String>> map = new HashMap<>();
        map.put(Moscow.country, new ArrayList<>(Arrays.asList(Moscow.city, Nizhny.city)));
        map.put(Misk.country, new ArrayList<>(Collections.singletonList(Misk.city)));
        map.put(Bern.country, new ArrayList<>(Collections.singletonList(Bern.city)));

        System.out.println(map);
    }
}