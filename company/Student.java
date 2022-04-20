package com.company;

/**
 * Created By Erdem Beştaş
 * tution, name, id,tutionPaid, grade
 */
public class Student extends User implements TuitionCalculator {
    private int grade;
    private int paidTotalAmount;
    private int feesTotal;


    public Student(int id, String name, int feesTotal, int grade) {
        this.id = id;
        this.name = name;
        this.feesTotal = feesTotal;
        this.grade = grade;
    }


    public void setGrade(int grade) {
        this.grade = grade;

    }

    @Override
    public int calculateTuition(int paidAmount) {
        if (paidAmount <= 0) {
            System.out.println("Negatif ödeme yapılamaz.");
        }

        if (isProperPayment(paidAmount)) {
            return paidTotalAmount += paidAmount;
        }
        return paidTotalAmount;
    }


    private boolean isProperPayment(int paidAmount) {
        if (feesTotal - paidAmount < 0) {
            System.out.println("Okul ücretinde fazla ödeme yaptınız. Tekrar deneyiniz. Öğrenci isim: " + this.name);
            return false;
        }
        return true;
    }

    public int getGrade() {
        return grade;
    }

    public int getPaidTotalAmount() {
        return paidTotalAmount;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    public int getRemainingFees() {
        return feesTotal - paidTotalAmount;
    }

    @Override
    public String toString() {
        return "Student's NAME: " + id + ". " + name + " || TOTAL FEES PAID: $" + (feesTotal - paidTotalAmount) + " || REMAINS: $" + getRemainingFees();
    }

}