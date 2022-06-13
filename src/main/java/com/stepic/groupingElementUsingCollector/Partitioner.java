package com.stepic.groupingElementUsingCollector;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.partitioningBy;

class Partitioner {

    public static Map<Boolean, List<Application>> getPartition(List<Application> applications) {
        return applications.stream().collect(partitioningBy(Application::isFree));
    }
}

class Application {
    private final String name;
    private final boolean isFree;

    public Application(String name, boolean isFree) {
        this.name = name;
        this.isFree = isFree;
    }

    public String getName() {
        return name;
    }

    public boolean isFree() {
        return isFree;
    }
}
