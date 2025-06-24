package com.example.Patern.Poveden4eskie.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class MyIterator {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Аня");
        names.add("Борис");
        names.add("Вика");

        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }
    }
    }

