/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicagithub;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alvaro
 */
public class PracticaGitHubTest {
    
    public PracticaGitHubTest() {
    }

    @org.junit.Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        PracticaGitHub.main(args);
        //fail("The test case is a prototype.");
    }

    @org.junit.Test
    public void testAnyBisiesto() {
        System.out.println("anyBisiesto");
        int a = 0;
        boolean expResult = false;
        boolean result = PracticaGitHub.anyBisiesto(a);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @org.junit.Test
    public void testRestar() {
        System.out.println("restar");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = PracticaGitHub.restar(a, b);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    
}
