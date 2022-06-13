package com.example.tasks_from_code_wars;

import java.util.Objects;

public class Person {
    int Age;
    String name;
    Integer weight;

    public Person(int age, String name, Integer weight) {
        Age = age;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if ((this != null) && (this == o)) return true;
        if ((o == null) || (this.getClass() != o.getClass() )) return false;
        final Person person = (Person) o;
        if (this.Age != person.Age) return false;
        return  ((this.name != null ? this.name.equals(person.name) : person.name == null) &&
                (this.weight != null ? this.weight.equals(person.weight) : person.weight == null)) ;


    }

    @Override
    public int hashCode() {
        int result = this.Age;
        result = result * 31 + (this.name != null ? this.name.hashCode() : 0);
        result = result * 31 + (this.weight != null ? this.weight.hashCode() : 0);
        return result;

    }
}
