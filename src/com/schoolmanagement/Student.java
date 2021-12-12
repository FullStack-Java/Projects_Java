package com.schoolmanagement;

/**
 * Created by Annabelle Ellis on December 9, 2021
 * This class is responsible for keeping track
 * of students fees, name,grade & fees
 * paid
 * https://www.youtube.com/watch?v=e0X00EoFQbE
 */

public class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;
    private int feesOwed;


    /**
     * A constructor will create a new Student object
     * by initializing the values.
     * @param id id for the student: unique
     * @param name name of the student
     * @param grade grade of the student
     */

    public Student(int id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.feesTotal = 30000;
        this.feesPaid = 0;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    /**
     * Use to update the students grade.
     * @param grade new grade of the student
     */

    public void setGrade(int grade) {
        this.grade = grade;
    }


    public int getFeesPaid() {
        return feesPaid;
    }

    /**
     * Keep adding the fees to the other fees that was made.
     * @param feesPaid
     */
    public void payFees(int feesPaid) {

        this.feesPaid += feesPaid;
        School.updateTotalMoneyEarned(this.feesPaid);
    }



    public int getFeesOwed() {
        return this.feesOwed;
    }

    /**
     * Updates the remaining fees that are owed
     */
    public void setFeesOwed() {
        this.feesOwed = this.feesTotal - feesPaid;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                ", feesPaid=" + feesPaid +
                ", feesTotal=" + feesTotal +
                ", feesOwed=" + feesOwed +
                '}';
    }
}
