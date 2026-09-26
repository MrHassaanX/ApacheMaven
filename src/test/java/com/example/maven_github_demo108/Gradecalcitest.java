package com.example.maven_github_demo108;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */

public class Gradecalcitest {
	 @Test
	    void testTotal() {
	        assertEquals(225,
	            Gradecalci.calculateTotal(75, 68, 82));
	    }

	    @Test
	    void testAverage() {
	        assertEquals(75.0,
	        		 Gradecalci.calculateAverage(75, 68, 82));
	    }

	    @Test
	    void testPass() {
	        assertTrue( Gradecalci.isPass(75.0));
	    }

	    @Test
	    void testFail() {
	        assertFalse( Gradecalci.isPass(35.0));
	    }


}