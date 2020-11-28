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

    public static int min(int a, int b){
        return Math.min(a,b);
    }
    public static int max(int a, int b){
        return Math.max(a,b);
    }
    public static int minElement(int[] list) {
        int k = list[0];
        for (int i = 1; i < list.length; i++) {
            if ( list[i]<k) {

                k = list[i];
            }
        }
        return k;

    }
    public static int maxElement(int[] list){
        int k =list[0];
        for(int i=1; i<list.length; i++){
            if(list[i] >k){
                k=list[i];
            }
        }
        return k;
    }



}

