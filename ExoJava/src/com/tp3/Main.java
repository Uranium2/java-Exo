package com.tp3;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException {
        Class<?> scc = String.class;
        System.out.println(scc);
        Method method = null;
        try {
            method = scc.getMethod("substring", int.class, int.class);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        System.out.println(scc.getConstructor());
        while ((scc = scc.getSuperclass()) != null )
        {
            //Class<?>[] interfaces = scc.getInterfaces();
            System.out.println(method);

            //for (Class<?> inter: interfaces) {
                //System.out.println("interfaces: " + inter.getName());
            //}
            //System.out.println(scc.getName());
        }
    }
}

//get constructor
//get instance?
