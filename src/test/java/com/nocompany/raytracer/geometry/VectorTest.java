package com.nocompany.raytracer.geometry;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class VectorTest {
	
	@Test
	public void vectorTest() {
		Vector v =  new Vector(2.0, 5.0, 1.0);
		assertTrue(v.getXCoordinate().equals(2.0));
		assertTrue(v.getYCoordinate().equals(5.0));
		assertTrue(v.getZCoordinate().equals(1.0));
	}
	
	@Test
	public void lengthTest() {
		Vector v = new Vector(2.0, 5.0, 1.0);
		assertTrue(v.length().equals(Math.sqrt(30)));
	}

}
