package com.stepic;

import java.util.Comparator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class ComparatorExample2 {


    static class LongRange {
        private final long left;
        private final long right;

        public static Comparator<LongRange> getComparator() {
           Comparator v2 = Comparator.comparingLong((LongRange x) -> Math.abs(x.getRight()- x.getLeft())).thenComparing(LongRange::getLeft);

            return Comparator.comparing(LongRange::difference).thenComparing(LongRange::getLeft);
        }

        public LongRange(long left, long right) {
            this.left = left;
            this.right = right;
        }

        public long getLeft() {
            return left;
        }

        public long getRight() {
            return right;
        }

        public long difference(){
            return Math.abs(getRight()-getLeft());
        }

        @Override
        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (other == null || getClass() != other.getClass()) {
                return false;
            }
            LongRange longRange = (LongRange) other;
            return left == longRange.left &&
                    right == longRange.right;
        }

        @Override
        public int hashCode() {
            return Objects.hash(left, right);
        }

        @Override
        public String toString() {
            return String.format("%d %d", left, right);
        }
    }

    public static void main(String[] args) {
        Set<LongRange> numbers = new TreeSet<>(LongRange.getComparator());

        numbers.add(new LongRange(0, 5));
        numbers.add(new LongRange(2, 4));
        numbers.add(new LongRange(1, 3));
        numbers.add(new LongRange(1, 4));
        numbers.add(new LongRange(1, 7));
        numbers.add(new LongRange(3, 5));


        numbers.forEach(System.out::println);


        var a = new LongRange(-9,-3);
        System.out.println(a.difference());
    }
}
