package com.li.ticket;

import com.li.entity.Person;
import com.li.entity.Ticket;

import java.util.Random;

/**
 * @author li
 */
public class Grabbing01 implements Runnable{
    private Ticket ticket;
    private Person person;

    public Grabbing01(Ticket ticket, Person person) {
        this.ticket = ticket;
        this.person = person;
    }

    @Override
    public void run() {

        while (true) {
            synchronized (ticket){
                int total = ticket.getTotal();
                if (total <=0){
                    break;
                }
                ticket.setTotal(--total);
                System.out.println("出票信息：" + person.getName()
                        + "抢到第" + (ticket.getNum()-total) + "张票，剩余" + total + "张票");
            }
            int sleep = new Random().nextInt(10);
            try {
                Thread.sleep(sleep*10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
