package com.kdrtut.abstrct;

public abstract class Bank {
    int amount;
    float rate;
    static double emi;
    final int loanMonths = 240;

    public abstract void loan();

    public void credit() {
        System.out.println("Bank -- Credit");
    }

    public void debit() {
        System.out.println("Bank -- Debit");
    }
}
