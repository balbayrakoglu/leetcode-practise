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

    private final List<String> items;

    public ImmutableClass(int value, PersonForImmutable personForImmutable, List<String> items) {
        this.value = value;
        this.personForImmutable = new PersonForImmutable(Objects.requireNonNull(
                personForImmutable.getName()), personForImmutable.getAge());
        this.items = List.copyOf(items);
    }

    public int getValue() {
        return value;
    }

    public PersonForImmutable getPerson(){
        return new PersonForImmutable(personForImmutable.getName(), personForImmutable.getAge());
    }

    public List<String> getItems() {
        return List.copyOf(items);
    }
}
