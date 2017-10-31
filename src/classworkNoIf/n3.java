package com.company;

public class n3 {
    public void multArg(Object arg) {
        try {
            Integer  i = (Integer)arg;
            i *= 2;
            System.out.println(i);
        } catch (ClassCastException e) {
        String  str = (String)arg;
        String q = "";
        String[] qq = str.split("");
        for (int i = 0; i < str.length(); i++)
            q += qq[i] + qq[i];
        System.out.println(q);
        }
    }
}
