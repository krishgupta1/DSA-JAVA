package HeapSort;

import java.util.*;

public class ComparatorAndComparable {
    static class Student implements Comparable<Student> {
        String name;
        int rank;
        Student (String name, int rank){
            this.rank = rank;
            this.name = name;
        }

        @Override
        public int compareTo(Student s1){
            return this.rank - s1.rank;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();
        pq.add(new Student("sahil", 1));
        pq.add(new Student("krish", 2));
        pq.add(new Student("qweqwerf", 4));
        pq.add(new Student("oifnvfid", 6));

        while(!pq.isEmpty()){
            Student data = pq.poll();
            System.out.println("Data : " + data.name);
        }

    }
}
