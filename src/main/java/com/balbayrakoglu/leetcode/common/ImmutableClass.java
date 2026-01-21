package com.balbayrakoglu.leetcode.common;

import java.util.List;
import java.util.Objects;

public final class ImmutableClass {

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
