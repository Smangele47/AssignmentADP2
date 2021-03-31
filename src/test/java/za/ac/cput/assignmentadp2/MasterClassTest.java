/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.assignmentadp2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Rusty Mabiala
 */
public class MasterClassTest {
    private MasterClass num1;
    private MasterClass num2;
    
    @BeforeEach
    public void setUp() {
        num1 = new MasterClass();
        num1 = num2;
    }
         @Test
    public void testEquality() {
        assertEquals(num1, num2);
    }
    
    // up there is the test of junit5 in this progect by Rusty
    // you are request to create your own class if you are not 
    // confortable with master class.
    // you can also create you own pom file, however you have to 
    // ignore it before merge it 
    
    
    
}
