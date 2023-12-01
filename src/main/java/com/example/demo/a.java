package com.example.demo;

import java.util.ArrayList;

public class a {
    ArrayList<String> k =new ArrayList<>();

    {

        for (int i = 0; i < 100; i++) {
            k.add("ok");
        }
    }

    @Override
    public String toString() {
        StringBuilder sd = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            sd.append(k);
        }
        return sd.toString();
    }
}
