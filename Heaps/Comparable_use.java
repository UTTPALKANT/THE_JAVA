package Heaps;

import java.util.PriorityQueue;

public class Comparable_use {
    static class Student implements Comparable<Student>{
         static String name;
        int rank;
        Student(String Name, int rank){
            this.name=name;
            this.rank=rank;
        }
        @Override
        public int compareTo(Student s2){
            return this.rank - s2.rank;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Student> studentsList = new PriorityQueue<>();

        studentsList.add(new Student("a", 03));
        studentsList.add(new Student("b ", 2));
        studentsList.add(new Student("c", 05));
        System.out.println(studentsList+"/n" );

        while (!studentsList.isEmpty()) {
            System.out.println(studentsList.peek().name + "-> " +studentsList.peek().rank);
            studentsList.remove();
            
        }
    }
}
