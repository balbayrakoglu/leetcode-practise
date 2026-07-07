package com.balbayrakoglu.leetcode.deutscheBank;

import java.math.BigDecimal;
import java.util.concurrent.atomic.AtomicInteger;

public class BankAccount {

    private BigDecimal balance;

    private final Object lock = new Object();
    private AtomicInteger atomicBalance = new AtomicInteger();

    public BankAccount(BigDecimal balance, AtomicInteger atomicBalance) {
        this.balance = balance;
        this.atomicBalance = atomicBalance;
    }

    /*
      firstBigDecimal.compareTo(secondBigDecimal) < 0   // "<"
      firstBigDecimal.compareTo(secondBigDecimal) > 0   // ">"
      firstBigDecimal.compareTo(secondBigDecimal) == 0  // "=="
      firstBigDecimal.compareTo(secondBigDecimal) != 0  // "!="
      firstBigDecimal.compareTo(secondBigDecimal) >= 0  // ">="
      firstBigDecimal.compareTo(secondBigDecimal) <= 0  // "<="
    */
    public boolean withdraw(BigDecimal amount) {
        synchronized (lock) {
            if (balance.compareTo(amount) >= 0) {
                balance = balance.subtract(amount);
                return true;
            }
            return false;
        }
    }

    public void deposit(BigDecimal amount) {
        synchronized (lock) {
            if (amount == null) {
                throw new IllegalArgumentException("Amount cannot be negative");
            }
            balance = balance.add(amount);
        }
    }

    public BigDecimal getBalance() {
        synchronized (lock) {
            return balance;
        }
    }
}

