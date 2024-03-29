package com.stepic;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {

    static class Account {
        private final String owner;
        private final long balance;
        private final boolean locked;

        Account(String owner, long balance, boolean locked) {
            this.owner = owner;
            this.balance = balance;
            this.locked = locked;
        }

        public static Comparator<Account> getComparatorByLockedBalanceAndOwner() {
//            Just an example own boolean comparator
            Comparator<Account> compBoolean = (o1, o2) ->
                    ((o1.isLocked() && o2.isLocked()) ? (0) : (o1.isLocked() ? -1: 1));

            Comparator<Account> compFull = Comparator.comparing(Account::isLocked)
                    .thenComparing(Account::getBalance,Comparator.reverseOrder())
                    .thenComparing(Account::getOwner);
            return compFull;
        }

        public String getOwner() {
            return owner;
        }

        public long getBalance() {
            return balance;
        }

        public boolean isLocked() {
            return locked;
        }

        @Override
        public String toString() {
            return owner + " " + balance + " " + locked;
        }
    }

    public static void main(String[] args) {
        List<Account> accounts = new ArrayList<>();

        accounts.add(new Account("Peter", 1000L, false));
        accounts.add(new Account("John", 1000L, false));
        accounts.add(new Account("Ivan", 8000L, true));
        accounts.add(new Account("Helen", 5000L, false));
        accounts.add(new Account("Nicole", 3000L, true));

        accounts.sort(Account.getComparatorByLockedBalanceAndOwner());

        accounts.forEach(System.out::println);
    }
}
