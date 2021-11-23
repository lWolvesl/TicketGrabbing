package com.li;

import com.li.entity.Person;
import com.li.entity.Ticket;
import com.li.ticket.Grabbing01;

public class test {
    public static void main(String[] args) {
        Ticket ticket = new Ticket(100);
        new Thread(new Grabbing01(ticket,new Person("A101","小明"))).start();
        new Thread(new Grabbing01(ticket,new Person("A102","小红"))).start();
        new Thread(new Grabbing01(ticket,new Person("A103","小蓝"))).start();
        new Thread(new Grabbing01(ticket,new Person("A104","小绿"))).start();
        new Thread(new Grabbing01(ticket,new Person("A105","小紫"))).start();
        new Thread(new Grabbing01(ticket,new Person("A106","小王"))).start();
        new Thread(new Grabbing01(ticket,new Person("A107","小刘"))).start();

    }
}
