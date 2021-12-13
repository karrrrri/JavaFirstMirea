package ru.mirea.task27.p1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Dictionary {
    Dictionary() {
        Map<String, String> name = new HashMap<>();

        name.put("Ivan", "Ivan");
        name.put("Sergeev", "Sergey");
        name.put("Petrov", "Peter");
        name.put("Bagrov", "Danila");
        name.put("Sidorov", "Sergey");
        name.put("Koshmarov", "Ivan");
        name.put("Zagiev", "Timur");
        name.put("Shilo", "Peter");
        name.put("Petrov", "Mikchail");
        name.put("Shachmotov", "Andrey");

        System.out.printf("Before: %s%n", name);
        Set<String> existing = new HashSet<>();
        name = name.entrySet().stream().filter(entry -> existing.add(entry.getValue())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.printf("After: %s%n", name);
    }
}

class Test {
    public static void main(String[] args) {
        new Dictionary();
    }
}