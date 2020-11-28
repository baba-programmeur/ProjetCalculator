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
        public void testdivide()
        {
            int div=calculator.divide(100,5);

            Assert.assertEquals(20,div);

        }


    }

