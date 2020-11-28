package sn.faty.Test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import sn.faty.Calculator;

public class CalculatorTest {

        Calculator calculator;

        @Before
        public  void setUp () throws  Exception
        {

            calculator =new Calculator();

        }

        @Test
        public  void testSum()
        {

            int somme=  calculator.sum(100,100);

            Assert.assertEquals(200,somme);

        }

        @Test
        public void testminus()

        {
            int diff=calculator.minus(1000,200);

            Assert.assertEquals(800,diff);

        }
    @Test
    //La methode de test de la multiplication
    public void testmultiply() {
        Assert.assertEquals(4, calculator.multiply(2,2));
    }

        @Test
        public void testdivide()
        {
            int div=calculator.divide(100,5);

            Assert.assertEquals(20,div);

        }
    @Test
    public void min() {
        int min=calculator.min(10,20);
        if (min !=10) Assert.fail();
    }

    @Test
    public void max() {
        int max=calculator.max(2000,-2000);
        Assert.assertEquals(2000,max);




    }
    @Test
    public void minElement() {
        int tab[]={
                1,4,7,9
        };
        int a=calculator.minElement(tab);
        Assert.assertEquals(1,a);

    }

    @Test
    public void maxElement() {
        int tab[]={
                1,4,7,9
        };
        int a=calculator.maxElement (tab);
        Assert.assertEquals(9,a);

    }



}

