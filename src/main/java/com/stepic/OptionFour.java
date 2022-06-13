package com.stepic;

import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class OptionFour {
    static class PrintLoginQuiz {

        public static void printLoginIfPro(Set<User> users, String id) {
            users.stream()
                    .filter(account -> account.getAccount().isPresent())
                    .filter(account -> account.getAccount().get().getId().equals(id))
                    .filter(account -> account.getAccount().get().getType() == "pro")
                    .forEach(account -> System.out.println(account.getLogin()));

        }
    }

    static class Account {
        private String id;
        private String type;

        public Account(String id, String type) {
            this.id = id;
            this.type = type;
        }

        public String getId() {
            return id;
        }

        public String getType() {
            return type;
        }
    }

    static class User {
        private String login;
        private Account account;

        public User(String login, Account account) {
            this.login = login;
            this.account = account;
        }

        public String getLogin() {
            return login;
        }

        public Optional<Account> getAccount() {
            return Optional.ofNullable(account);
        }
    }
}
