package com.company;

import java.util.Random;

public class n1 {
    public void n1() {
        int[] q = new int[10];
        int count = 0;
        Random rnd = new Random();
        for (int i = 0; i<10; i++) {
            q[i] = rnd.nextInt(100);
            count += q[i]%2;
            System.out.print(q[i]+" ");
        }
        System.out.println("\n"+count);
    }
}
