package com.Comparable_and_Comparator;

import java.util.*;

class Student
{
    int age;
    String name;

    Student(int age , String name)
    {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "{ name: " + this.name + " --> age: " + this.age + " }";
    }

}

public class Main {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();

        nums.add(43);
        nums.add(31);
        nums.add(72);
        nums.add(28);
        nums.add(9);
        nums.add(19);
        nums.add(9);

        // Default sorting based on value of integers
        Collections.sort(nums);

        for(int num : nums)
        {
            System.out.println(num);
        }

        System.out.println();

        // What if we want to sort on the basis of the last digit of a number ?
        // Let's see how we can do that !

        // Note that Comparator<T> is a functional interface containing an abstract method compare
        // that takes two arguments of type T and returns an integer

        // Following is the implementation of the compare function of the Comparator interface that can be
        // used to sort in the default order.

        // Since Comparator is a functional interface, we can implement the compare function present in it
        // using Anonymous Inner class as shown below.

        Comparator<Integer> comp = new Comparator<Integer>()
        {
            @Override
            public int compare(Integer a , Integer b)
            {
                if(a > b)
                {
                    // If we return 1 for a > b, then it swaps if a > b
                    return 1;
                }
                // If we return -1 for a <= b, then it does not swap if a <= b
                return -1;
            }
        };

        Collections.sort(nums , comp);

        System.out.println(nums);

        System.out.println();

        // Now, let's see how to implement the compare function inside the Comparator interface using lambda
        // expressions

        Comparator<Integer> comp1 = (a , b) -> {
            if(a > b)
            {
                return 1;
            }
            return -1;
        };

        Collections.sort(nums , comp1);

        System.out.println(nums);

        System.out.println();

        // Now, let's see how can we sort the numbers based on their last digits/
        // Basically, if the last digit of a is greater than the last digit of b then we want to swap.
        // Otherwise, if the last digit of a is smaller than the last digit of b then we don't want to swap.
        // And if the last digit of both a and b are equal, then we want to sort based on their value.

        Collections.sort(nums , (a , b) -> {
            if(a % 10 > b % 10)
            {
                return 1;
            }
            else if(a % 10 == b % 10)
            {
                if(a > b)
                {
                    return 1;
                }
                else if(a == b)
                {
                    return 0;
                }
                else
                {
                    return -1;
                }
            }
            else
            {
                return -1;
            }
        });

        System.out.println(nums);

        System.out.println();

        // Now, let's try to sort a list of Students based on their age and if age is equal then based on their names

        // Creating a list of students
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(23 , "Arpit Singh"));
        studentList.add(new Student(23 , "Ankit Singh"));
        studentList.add(new Student(22 , "Amit Dey"));
        studentList.add(new Student(21 , "Kunga Tashi"));
        studentList.add(new Student(22 , "Pratham Gandhi"));

        // Applying the sort function with a suitable implementation of the compare function of the Comparator
        // interface

        Collections.sort(studentList , (stud1 , stud2) -> {
            if(stud1.age > stud2.age)
            {
                return 1;
            }
            else if(stud1.age == stud2.age)
            {
                return stud1.name.compareTo(stud2.name);
            }
            else
            {
                return -1;
            }
        } );

        System.out.println(studentList);

        System.out.println();

        // Now, let's try to sort a list of lists using our own custom comparator

        // Creating a list of lists
        List< List<Integer> > listoflists = new ArrayList<>();

        listoflists.add(Arrays.asList(2 , 3 , 4 , 5));
        listoflists.add(Arrays.asList(1 , 3 , 6 , 5));
        listoflists.add(Arrays.asList(1 , 3 , 5 , 4));
        listoflists.add(Arrays.asList(3 , 1 , 2 , 4));
        listoflists.add(Arrays.asList(2 , 1 , 1 , 1));
        listoflists.add(Arrays.asList(1 , 2 , 3 , 4));

        Collections.sort(listoflists , (list1 , list2) -> {

            // Converting a list of Integer -> list<Integer> to an array of Integer -> Integer[]
            // This conversion is done inorder to be able to utilise the built-in Arrays.compare(T[] a , T[] b)
            // function present in the Arrays class.
            Integer[] arr1 = new Integer[list1.size()];
            arr1 = list1.toArray(arr1);
            Integer[] arr2 = new Integer[list2.size()];
            arr2 = list2.toArray(arr2);

            // Utilising the Arrays.compare(T[] a , T[] b) method to compare arr1 and arr2 lexicographically.
            return Arrays.compare(arr1 , arr2);

        });

        System.out.println(listoflists);

        System.out.println();

        // Creating anotherlistOflists because listoflists is already sorted now.
        List< List<Integer> > anotherlistoflists = new ArrayList<>();
        anotherlistoflists.add(Arrays.asList(2 , 3 , 4 , 5));
        anotherlistoflists.add(Arrays.asList(1 , 3 , 6 , 5));
        anotherlistoflists.add(Arrays.asList(1 , 3 , 5 , 4));
        anotherlistoflists.add(Arrays.asList(3 , 1 , 2 , 4));
        anotherlistoflists.add(Arrays.asList(2 , 1 , 1 , 1));
        anotherlistoflists.add(Arrays.asList(1 , 2 , 3 , 4));

        // Implementing our own compare function of the Comparator interface and applying the sort
        // on anotherlistoflists

        Collections.sort(anotherlistoflists , (list1 , list2) -> {
            int size1 = list1.size();
            int size2 = list2.size();
            int n = Math.min(size1 , size2);
            for(int i = 0 ; i < n ; i++)
            {
                if(list1.get(i) > list2.get(i))
                {
                    return 1;
                }
                else if(list1.get(i) < list2.get(i))
                {
                    return -1;
                }
            }
            if(size1 < size2)
            {
                return -1;
            }
            else if(size1 > size2)
            {
                return 1;
            }
            else
            {
                return 0;
            }
        } );

        System.out.println(anotherlistoflists);

        System.out.println();

    }

}
