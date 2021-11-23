package com.li.entity;

public class Ticket {
    private int total;
    private int num;

    public Ticket(int total) {
        this.total = total;
        num = total;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
