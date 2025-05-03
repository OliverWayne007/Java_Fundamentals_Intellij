package com.RevisionApril2025.LambdaExpressions;

@FunctionalInterface
interface Functional_Interface
{
    // Methods in Interface are by default Public and Abstract
    String getDescription(String name , int age , String phone , String profession);
}

public class LambdaExpressions
{
    public static void main(String[] args)
    {
        System.out.println();

        // Using Anonymous Inner Class
        Functional_Interface fi1 = new Functional_Interface()
        {
            @Override
            public String getDescription(String name, int age, String phone, String profession)
            {
                return "Name: " + name + " , Age: " + age + " , Phone: " + phone + " , Profession: " + profession;
            }
        };

        String description1 = fi1.getDescription("Ashley Mao" , 23 , "9922118876" , "Software Engineer");

        System.out.println("Description: " + description1);

        System.out.println();


        // Using Lambda Expression
        Functional_Interface fi2 = (String name , int age , String phone , String profession) ->
        {
            return "Name: " + name + " , Age: " + age + " , Phone: " + phone + " , Profession: " + profession;
        };

        String description2 = fi2.getDescription("Arpit Mangal" , 23 , "8877665532" , "ML Engineer");

        System.out.println("Description: " + description2);
    }
}
