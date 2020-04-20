package com.kdrtut.abstrct;

public class TestBank {
    public static void main(String[] args) {
        HdfcBank hdfcBank = new HdfcBank();
        hdfcBank.loan();
        hdfcBank.credit();
        hdfcBank.debit();

        Bank bank = new HdfcBank();
        bank.loan();
        bank.credit();
        bank.debit();
    }
}
