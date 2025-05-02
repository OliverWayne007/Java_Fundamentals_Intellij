package com.RevisionApril2025.Static_Inheritance;

// Important Notes:
// 1. Fields or Variables or Properties whether Static or Non-Static are not overridden, they are hidden.
// 2. The concept of Overriding exists only for Methods or Behaviours.
// 3. Only Non-Static, Non-Private and Non-Final methods can be overridden.
// 4. Private and Final methods cannot be overridden.
// 5. In case of Static methods, "Method-Hiding" takes place not "Method-Overriding".

// In case of Method-Overriding, the method to call is determined at runtime depending on the "Instance-type"
// and not the "Reference-Type".

// In case of Method-Hiding, the method to invoke is determined at the compile-time depending on the "Reference-Type"
// irrespective of the "Instance-Type".

// Method-Hiding is neither Compile-Time Polymorphism nor Runtime Polymorphism.

// Method-Hiding does not come under Compile-Time polymorphism because Compile-Time polymorphism takes place
// between methods in the same class. In Compile-Time polymorphism, "Which function to call/invoke" depends on the
// signature of the function and this binding happens at Compile-Time ( Also called Static/Compile-Time Binding ).
// This is also called Method-Overloading.
// Compile-Time polymorphism has nothing to do with Inheritance, whereas
// Method-Hiding takes place when the child class also has a Static-Method of the exact same signature as the
// parent class.

// Method-Hiding does not come under Runtime polymorphism because Runtime polymorphism takes place when
// "which function to call/invoke" depends on the type of "Instance" instead of the type of "Reference" and this
// happens Dynamically at Runtime ( That is why it is called Dynamic/Runtime Binding ).
// This is also called Method-Overriding.
// But in case of Method-Hiding, "which function to call/invoke" depends on the type of the "Reference" and
// takes place at Compile-Time.

// In Java, Fields (Both Static and Non-Static) and Methods (Static) are resolved at Compile-Time.

public class Static_Inheritance
{
    public static void main(String[] args)
    {
        A obj1 = new B();

        obj1.show();

        System.out.println();

        A.config();
        obj1.config();

        System.out.println();

        System.out.println("obj1.x: " + obj1.x);

        System.out.println();

        System.out.println("A.name: " + A.name);
        System.out.println("obj1.name: " + obj1.name);

        System.out.println();

        System.out.println("A.y: " + A.y);
        System.out.println("obj1.y: " + obj1.y);

        System.out.println();

    }
}
