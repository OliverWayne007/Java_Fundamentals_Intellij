package com.company;

public class Ollie16 {

    public static void main(String[] args) {
        //System.out.println("This is me using\n for the first time in java");
        Pair p1 = new Pair();
        p1.SetValue(10 , 20);
        p1.GetValue();
        Pair p2 = new Pair();
        p2 = p1;
        p2.SetValue(20 , 10);
        System.out.println("\n");
        p1.GetValue();
    }
}

class Pair
{
    private int a;
    private int b;

    public void SetValue(int x , int y)
    {
        this.a = x;
        this.b = y;
    }

    public void GetValue()
    {
        System.out.println("The value of a is: " + this.a);
        System.out.print("The value of b is: " + this.b);
    }
}
// NOTE: \n is always used inside a string as shown above.