package com.li;

import java.util.Random;

//单个类实现多线程抢票

public class TestOneClass {
    int ticket = 10;
    int num = 0;

    public static void main(String[] args) {
        TestOneClass test = new TestOneClass();

        Thread mary = new Thread(test.new threat());
        Thread xiaoMing = new Thread(test.new threat());
        mary.start();
        xiaoMing.start();
    }

    class threat implements Runnable {
        @Override
        public void run() {
            while (true) {
                synchronized (TestOneClass.class) {
                    if (ticket <= 0) {
                        break;
                    }
                    ticket--;
                    num++;
                    System.out.println("出票信息：" + Thread.currentThread().getName() + "抢到了第" + num + "张票,剩余" + ticket + "张票");
                }
                int sleep = new Random().nextInt(10);
                try {
                    Thread.sleep(sleep * 100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
