package com.bala.practice.cleancode.isp;

interface Printer {
    void print();
}

interface Scanner {
    void scan();
}

class BasicPrinter implements Printer {
    public void print() { }
}

class AllInOnePrinter implements Printer, Scanner {
    public void print() { }
    public void scan() { }
}
