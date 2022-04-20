package com.company;

import java.util.List;

public class CalculatorHelper {
    public int calculateGain(List<Student> studentList){
        return studentList.stream().mapToInt(student -> student.getPaidTotalAmount()).sum();
    }
}
