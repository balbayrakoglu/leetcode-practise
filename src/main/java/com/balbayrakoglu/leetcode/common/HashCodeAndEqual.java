package com.balbayrakoglu.leetcode.common;

import java.util.Objects;

public class HashCodeAndEqual {

    private String field1;
    private String field2;
    private int field3;

    HashCodeAndEqual(String field1, String field2, Integer field3) {
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof HashCodeAndEqual that)) return false;
        return field3 == that.field3 && Objects.equals(field1, that.field1) && Objects.equals(field2, that.field2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(field1, field2, field3);
    }

    public int hashCodeImpl() {
        int result = 1;

        result = 31 * result + Objects.hashCode(field1);
        result = 31 * result + Objects.hashCode(field2);
        result = 31 * result + Objects.hashCode(field3);

        return result;
    }
}
