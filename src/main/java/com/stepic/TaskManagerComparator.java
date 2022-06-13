package com.stepic;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;

//class TaskManager {
//    /**
//     * Highest priority queues come first in the list.
//     * The 0th queue contains tasks with the highest priority.
//     */
//    static List<Queue<Task>> taskQueues = new ArrayList<>();
//
////    public TaskManager() {
////        if (numberOfQueues < 1) {
////            throw new IllegalArgumentException("The number of queues must be >= 1");
////        }
////        for (int i = 0; i < numberOfQueues; i++) {
////            taskQueues.add(new ArrayDeque<>());
////        }
////    }
//
//    public void add(Task task, int priority) {
//        if (priority < 0 || priority >= taskQueues.size()) {
//            throw new IllegalArgumentException("The task has an illegal priority " + priority);
//        }
//        taskQueues.get(priority).add(task);
//    }
//
//    /**
//     * Returns a supplier to access tasks in the right order according to their priority.
//     * If all the queues are empty, it returns null.
//     */
//    public Supplier<Task> getTaskSupplier() {
//        Task t1 = new Task(1, 1);
//        Task t2 = new Task(2, 12);
//        Task t3 = new Task(3, 4);
//        Task t4 = new Task(4, 8);
//        Task t5 = new Task(5, 4);
//        Task t6 = new Task(6, 156);
//        Task t7 = new Task(7, 11);
//        Task t8 = new Task(12, 1);
//        Task t9 = new Task(11, 3);
//
//        Queue<Task> q1 = new LinkedList<>();
//        Queue<Task> q2 = new LinkedList<>();
//        Queue<Task> q3 = new LinkedList<>();
//
//
//
//        q1.add(t1);
//        q1.add(t2);
//        q1.add(t3);
//
//        q2.add(t4);
//        q2.add(t5);
//
//        q3.add(t6);
//        q3.add(t7);
//        q3.add(t8);
//        q3.add(t9);
//
//        taskQueues.add(q1);
//        taskQueues.add(q2);
//        taskQueues.add(q3);
//
//
//        Supplier<Task> taskSupplier = () -> {
//            return taskQueues.stream().filter(Objects::nonNull).findFirst().get().poll();
//        };
//
//        return taskSupplier;
//    }
//}
//
//
//class TasksHandling {
//
//    public static void main(String[] args) {
//        Task t1 = new Task(1, 1);
//        Task t2 = new Task(2, 12);
//        Task t3 = new Task(3, 4);
//        Task t4 = new Task(4, 8);
//        Task t5 = new Task(5, 4);
//        Task t6 = new Task(6, 156);
//        Task t7 = new Task(7, 11);
//        Task t8 = new Task(12, 1);
//        Task t9 = new Task(11, 3);
//
//        Queue<Task> q1 = new LinkedList<>();
//        Queue<Task> q2 = new LinkedList<>();
//        Queue<Task> q3 = new LinkedList<>();
//
//
//
//        q1.add(t1);
//        q1.add(t2);
//        q1.add(t3);
//
//        q2.add(t4);
//        q2.add(t5);
//
//        q3.add(t6);
//        q3.add(t7);
//        q3.add(t8);
//        q3.add(t9);
//
//        taskQueues.add(q1);
//        taskQueues.add(q2);
//        taskQu.taskQueues.add(q3);
//
//        TaskManager t = new TaskManager();
//        Supplier<Task> taskSupplier = t.getTaskSupplier();
//        System.out.println(taskSupplier.get());
//        Task task;
//        while ((task = taskSupplier.get()) != null) {
//            System.out.println(task.getNumber());
//        }
//}}
