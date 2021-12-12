package com.schoolmanagement;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Teacher> teachersList = new ArrayList<Teacher>();
        ArrayList<Student> studentList = new ArrayList<Student>();

        Teacher lizzy = new Teacher(1, "Lizzy", 5000);
        Teacher melisa = new Teacher(2, "Melisa", 7000);
        Teacher vanhousen = new Teacher(3, "VanHousen", 4000);

        teachersList.add(lizzy);
        teachersList.add(melisa);
        teachersList.add(vanhousen);



        Student tamara = new Student(1, "Tamara", 4);
        Student tamira = new Student(2, "Tamira",7);
        Student ashley = new Student(3, "Ashley",8);

        studentList.add(tamara);
        studentList.add(tamira);
        studentList.add(ashley);

        School whs = new School(teachersList,studentList);
        System.out.println("WHS has earned, $" + whs.getTotalMoneyEarned());

//        whs.getTeachers();
//        System.out.println();

        tamara.payFees(5000);
        tamara.setFeesOwed();
        System.out.println(tamara.getFeesOwed());
        System.out.println(tamara);
        System.out.println("WHS has earned, $" + whs.getTotalMoneyEarned());

        System.out.println("--------- SCHOOL PAYING SALARY ----------");
        System.out.println(lizzy.updateTotalSalaryEarned(lizzy.getSalary()));
        System.out.println(lizzy.updateTotalSalaryEarned(lizzy.getSalary()));

        System.out.println(melisa);





    }
}
