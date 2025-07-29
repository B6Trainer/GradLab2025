package com.bala.practice.cleancode.isp;

interface Machine {
    void print();
    void scan();
    void fax();

}

class OldPrinter implements Machine {
    public void print() { }
    public void scan() { }
    public void fax() {
        throw new UnsupportedOperationException();
    }
}

