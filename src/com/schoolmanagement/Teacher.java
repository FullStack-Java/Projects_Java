package com.schoolmanagement;

/**
 * Created by Annabelle Ellis on December 9, 2021
 * This class is responsible for keeping track of
 * id, name, and salary
 * https://www.youtube.com/watch?v=e0X00EoFQbE
 */
public class Teacher {

    private int id;
    private String name;
    private int salary;
    private int totalSalaryEarned;


   public Teacher(int id, String name, int salary){
       this.id = id;
       this.name = name;
       this.salary = salary;
       this.totalSalaryEarned =0;
   }

//   Accessor and Mutator Methods

    /**
     *
     * @return the id of the student
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return name of the Student
     */

    public String getName() {
        return name;
    }

    /**
     *
     * @return salary of the student
     */

    public int getSalary() {
        return salary;
    }

    /**
     * sets the salary of the teacher
     * @param salary
     */

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int updateTotalSalaryEarned(int sal){
        this.totalSalaryEarned += sal;
        return totalSalaryEarned;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", totalSalaryEarned=" + totalSalaryEarned +
                '}';
    }
}
