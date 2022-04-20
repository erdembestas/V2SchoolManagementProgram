package com.company;

import java.util.List;


public class School {

    private List<Teacher> teachers;
    private List<Student> students;

    private CalculatorHelper calculatorHelper = new CalculatorHelper();

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
    }


    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void showTotalGain() {
        System.out.println("Marmara University earned : ₺ " + calculatorHelper.calculateGain(students));

    }
}
