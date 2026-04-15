package com.balbayrakoglu.leetcode.common;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamGroupBy {

    /*
     Purpose: Demonstrate grouping with Java Streams
     Shows how to group a list of objects by a property using Collectors.groupingBy.

     Example:
     List<PersonForImmutable> people = ...; Map<Integer, List<PersonForImmutable>> grouped = people.stream().collect(Collectors.groupingBy(PersonForImmutable::getAge));
    */

    public static void main(String[] args) {
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

        List<PersonForImmutable> findThirtyYearsOld = people.stream().filter(personForImmutable -> personForImmutable.getAge() == 30).toList();

        System.out.println(findThirtyYearsOld);

        List<String> names = people.stream().map(PersonForImmutable::getName).toList();

        System.out.println(names);

        List<String> over25YearsOld = people.stream()
                .filter(personForImmutable -> personForImmutable.getAge() > 25)
                .map(PersonForImmutable::getName)
                .toList();

        for (PersonForImmutable person : people) {
            if (person.getAge() > 25) {
                System.out.println(person.getName() + "list.add(person.getName())");
            }
        }

        System.out.println(over25YearsOld);

        boolean isBob = people.stream().anyMatch(personForImmutable -> personForImmutable.getName().equalsIgnoreCase("bob"));
        for (PersonForImmutable person : people) {
            if (person.getName().equalsIgnoreCase("bob")) {
                System.out.println("true");
                break;
            }
        }

        System.out.println(isBob);

        int sumAge = people.stream().mapToInt(PersonForImmutable::getAge).sum();

        System.out.println(sumAge);
    }
}
