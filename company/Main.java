package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Teacher metin = new Teacher(1, 11350, "Muhammet Metin Molak");
        Teacher erdem = new Teacher(2, 11250, "Erdem Bestas");
        Teacher taha = new Teacher(3, 10900, "Mustafa Taha Kabar");
        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(metin);
        teacherList.add(erdem);
        teacherList.add(taha);

        Student sertan = new Student(34, "Sertan Aygun", 1000, 67);
        Student oguz = new Student(41, "Oguzhan Karatas", 800, 22);
        Student cihan = new Student(50, "Cihan Turan", 600, 32);
        List<Student> studentList = new ArrayList<>();
        studentList.add(sertan);
        studentList.add(oguz);
        studentList.add(cihan);

        School MarmaraUniversity = new School(teacherList, studentList);

        oguz.calculateTuition(300);
        cihan.calculateTuition(80);
        cihan.print("Ödeme başarılı.");
        sertan.calculateTuition(20);
        sertan.print("Ödemeniz gerçekleştirildi. ");

        MarmaraUniversity.showTotalGain();


        metin.receiveSalary(metin.getSalary());
        //  System.out.println("MARMARA UNIVERSITY SPENT SALARY TO: " + metin.getName()+" || REMAINING MONEY IS: $"+ MarmaraUniversity.getTotalMoneyEarned());

        erdem.receiveSalary(erdem.getSalary());
        //  System.out.println("MARMARA UNIVERSITY SPENT SALARY TO: " + erdem.getName()+" || REMAINING MONEY IS: $"+ MarmaraUniversity.getTotalMoneyEarned());

        System.out.println("-------------------------------------------------------------");
        sertan.print();

        System.out.println(sertan);

        oguz.print();
        System.out.println(oguz);

        cihan.print();
        System.out.println(cihan);

        System.out.println("--------------------------------------------------------------");
        System.out.println(metin);
        System.out.println(erdem);
        System.out.println(taha);
    }
}
