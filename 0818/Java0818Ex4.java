package com.the.ex;

public class Java0818Ex4 {

	public static void main(String[] args) {

        System.out.println("=== 학생 객체 생성 ===");
        Java0818Ex3 student1 = new Java0818Ex3("Alice", 20);
        Java0818Ex3 student2 = new Java0818Ex3("Bob", 22);

        student1.introduse();
        student2.introduse();

        System.out.println("=== 전체 학생 수 ===");
        Java0818Ex3.printTotalStudents();
}
}