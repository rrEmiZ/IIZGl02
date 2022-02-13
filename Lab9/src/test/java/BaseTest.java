
import org.junit.Assert;
import org.junit.jupiter.api.Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */


/**
 *
 * @author jakub
 */

public class BaseTest {
    
    @Test
    public void add_for1and2_equals3(){
        int a = 1;
        int b = 2;
        int c = 3;
        
        int result = a+b;
        
        Assert.assertEquals(result, c);
        
    }
}
