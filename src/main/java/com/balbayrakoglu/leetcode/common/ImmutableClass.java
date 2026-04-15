package com.balbayrakoglu.leetcode.common;

import java.util.List;
import java.util.Objects;

public final class ImmutableClass {
    /*
     Purpose: Example of an immutable class in Java.
     Demonstrates defensive copying and returning copies to preserve immutability of internal state.

     Example:
     ImmutableClass ic = new ImmutableClass(1, new PersonForImmutable("Alice",30), List.of("a","b"));
     ic.getItems(); // returns an unmodifiable copy
    */

    private final int value;

    private final PersonForImmutable personForImmutable;

    private final List<PersonForImmutable> listPersonForImmutable;

    private final List<String> items;

    public ImmutableClass(int value, PersonForImmutable personForImmutable, List<String> items, List<PersonForImmutable> listPersonForImmutable) {

        Objects.requireNonNull(personForImmutable, "personForImmutable must not be null");
        Objects.requireNonNull(items, "items must not be null");
        Objects.requireNonNull(listPersonForImmutable, "listPersonForImmutable must not be null");

        this.value = value;

        this.items = List.copyOf(items);

        this.personForImmutable = new PersonForImmutable(personForImmutable.getName(), personForImmutable.getAge());

        this.listPersonForImmutable = listPersonForImmutable.stream().map(PersonForImmutable::new).toList();

    }

    public int getValue() {
        return value;
    }

    public PersonForImmutable getPerson() {
        return new PersonForImmutable(personForImmutable.getName(), personForImmutable.getAge());
    }

    public List<String> getItems() {
        return List.copyOf(items);
    }

    public List<PersonForImmutable> getListPersonForImmutable() {
        return listPersonForImmutable.stream()
                .map(PersonForImmutable::new)
                .toList();
    }
}

