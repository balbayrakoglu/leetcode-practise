package com.balbayrakoglu.leetcode.deutscheBank;

import java.util.Objects;

public final class Result {
    private final String name;
    private final boolean success;

    public Result(String name, boolean success) {
        this.name = name;
        this.success = success;
    }

    public String getName() {
        return name;
    }

    public boolean getSuccess() {
        return success;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, success);
    }

    @Override
    public boolean equals(Object obj) {
        return Objects.equals(name, success);
    }
}
