package sn.faty;

public class Calculator {


   public  int sum(int a, int b)
    {
        return a + b;
    }

    public int minus(int a, int b) {
        return a - b;
    }

    public int divide(int a, int b) throws divisionParZero {

        if(b==0)

            throw new divisionParZero("La division par zero est impossible");

        return a / b;
    }

    }

