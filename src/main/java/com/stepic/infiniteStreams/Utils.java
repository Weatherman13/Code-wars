package com.stepic.infiniteStreams;

import java.util.stream.Stream;

public class Utils {
    private Utils() { }

    public static Stream<User> generateUsers(int numberOfUsers) {
        return Stream.iterate(0, i -> i < numberOfUsers, i -> i + 1)
                .map(num -> new User(num, "user"+ num.toString() + "@gmail.com")); // write your code here
    }
}

class User {
    private final long id;
    private final String email;

    User(long id, String email) {
        this.id = id;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }
}
