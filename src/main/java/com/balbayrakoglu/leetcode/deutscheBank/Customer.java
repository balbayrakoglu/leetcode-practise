package com.balbayrakoglu.leetcode.deutscheBank;

import java.util.List;

public final class Customer {

    private final String name;
    private final List<String> accounts;

    public Customer(String name, List<String> accounts) {
        this.name = name;
        this.accounts = List.copyOf(accounts);
    }

    public String getName() {
        return this.name;
    }

    public List<String> getAccounts() {
        return accounts;
    }

}
