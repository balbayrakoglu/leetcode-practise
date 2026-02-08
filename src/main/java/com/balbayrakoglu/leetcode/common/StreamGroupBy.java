package com.balbayrakoglu.leetcode.common;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamGroupBy {

    public static void main(String[] args)  {
        // Example of grouping a list of people by their age
        List<PersonForImmutable> people = Arrays.asList(
            new PersonForImmutable("Alice", 30),
            new PersonForImmutable("Bob", 25),
            new PersonForImmutable("Charlie", 30),
            new PersonForImmutable("David", 25)
        );

        Map<Integer, List<PersonForImmutable>> groupedByAge = people.stream()
            .collect(Collectors.groupingBy(PersonForImmutable::getAge));

        System.out.println(groupedByAge);
    }
}
