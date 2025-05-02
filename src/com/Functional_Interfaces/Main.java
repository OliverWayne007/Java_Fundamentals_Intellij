package com.Functional_Interfaces;

public class Main {

    public static void main(String[] args) {

        FunctionalInterface obj1 = new Demo();
        obj1.show();

        // Implementing the functional interface by using anonymous inner classes
        FunctionalInterface obj2 = new FunctionalInterface()
        {
            @Override
            public void show()
            {
                System.out.println("In show in anonymous inner class....");
            }
        };

        obj2.show();

    }

}
