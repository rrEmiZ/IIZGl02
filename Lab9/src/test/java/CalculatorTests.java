/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import com.mycompany.lab9.Calculator;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

/**
 *
 * @author jakub
 */
public class CalculatorTests {

    @Test
    public void add_for1and2_returns3() {
        int a = 1;
        int b = 2;
        int expected = 3;

        Calculator calc = new Calculator();
        int result = calc.add(a, b);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void add_forN1and2_returns1() {
        int a = -1;
        int b = 2;
        int expected = 1;

        Calculator calc = new Calculator();
        int result = calc.add(a, b);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void add_forN1andN2_returnsN3() {
        int a = -1;
        int b = -2;
        int expected = -3;

        Calculator calc = new Calculator();
        int result = calc.add(a, b);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void add_for1andN2_returnsN1() {
        int a = 1;
        int b = -2;
        int expected = -1;

        Calculator calc = new Calculator();
        int result = calc.add(a, b);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void add_for0andN2_returnsN2() {
        int a = 0;
        int b = -2;
        int expected = -2;

        Calculator calc = new Calculator();
        int result = calc.add(a, b);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void add_for0and2_returns2() {
        int a = 0;
        int b = 2;
        int expected = 2;

        Calculator calc = new Calculator();
        int result = calc.add(a, b);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void add_for0and0_returns0() {
        int a = 0;
        int b = 0;
        int expected = 0;

        Calculator calc = new Calculator();
        int result = calc.add(a, b);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void sub_for1and0_throwsEx() {
        try {
            int a = 1;
            int b = 0;

            Calculator calc = new Calculator();
            int result = calc.div(a, b);
            Assert.fail("Cant divide by 0");
        } catch (Exception ex) {

        }

    }

}
