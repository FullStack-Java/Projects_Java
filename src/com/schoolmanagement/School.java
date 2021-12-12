package com.schoolmanagement;

import java.util.ArrayList;

public class School {

    private ArrayList<Teacher> teachers;
    private ArrayList<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    /**
     * new object is created
     * @param teachers list of teachers in the school.
     * @param students list of students in the school.
     */
    public School(ArrayList<Teacher> teachers, ArrayList<Student> students) {
        this.teachers = teachers;
        this.students = students;
        this.totalMoneyEarned = 0;
        this.totalMoneySpent = 0;
    }

    /**
     *
     * @return the list of teachers in the school.
     */
    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * Adds a teacher to the school
     * @param teacher
     */
    public void addTeachers(Teacher teacher) {
      teachers.add(teacher);
    }

    /**
     *
     * @return the list of students in the school
     */
    public ArrayList<Student> getStudents() {
        return students;
    }

    /**
     * Adds Student to the school
     * @param student the student to be added.
     */
    public void addStudents(Student student) {
        students.add(student);
    }

    /**
     * Gets total money earned by the school
     * @return
     */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     * Adds the total money spent
     * @param MoneyEarned
     */

    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    /**
     *
     * @return total money spent by the school
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * Update the money that is spent by the
     * In this case only the teachers salary will be taken
     * into consideration.
     * @param moneySpent
     */
    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneySpent -= moneySpent;
    }
}
