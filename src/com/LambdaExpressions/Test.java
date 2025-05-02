package com.LambdaExpressions;

@java.lang.FunctionalInterface
interface Flight
{
    String bookFlight(String source , String destination);
}

class EaseMyTrip implements Flight
{
    @Override
    public String bookFlight(String source , String destination)
    {
        System.out.println("Your flight has been booked from " + source + " to " + destination);
        return ("Happy Journey !");
    }
}

public class Test {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("This is the Test class !");
        System.out.println();

        // Implementing the Functional Interface the traditional way
        Flight flight1 = new EaseMyTrip();
        String message1 = flight1.bookFlight("Bengaluru" , "Raipur");
        System.out.println(message1);

        System.out.println();

        // Implementing the Functional Interface using Anonymous Inner class
        Flight flight2 = new Flight()
        {
            @Override
            public String bookFlight(String source , String destination)
            {
                System.out.println("Your flight has been booked from " + source + " to " + destination);
                return ("Happy Journey !");
            }
        };

        String message2 = flight2.bookFlight("Bengaluru" , "Raipur");
        System.out.println(message2);

        System.out.println();

        // Implementing the Functional Interface using Lambda Expression
        Flight flight3 = (source , destination) -> {
            System.out.println("Your flight has been booked from " + source + " to " + destination);
            return ("Happy Journey !");
        };

        String message3 = flight3.bookFlight("Bengaluru" , "Raipur");
        System.out.println(message3);

    }

}
