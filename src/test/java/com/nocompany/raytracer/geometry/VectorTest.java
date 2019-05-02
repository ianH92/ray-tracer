package com.nocompany.raytracer.geometry;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Test class for Ray.java
 * 
 * @author ianH92
 */
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
	
	@Test
	public void getUnitVectorTest() {
		Vector v = new Vector(2.0, 2.0, 1.0);
		Vector expectedUnitVector = new Vector(2.0 / 3.0, 2.0 / 3.0, 1.0 / 3.0);
		Vector unitVector = v.getUnitVector();
		
		assertTrue(unitVector.getXCoordinate().equals(expectedUnitVector.getXCoordinate()));
		assertTrue(unitVector.getYCoordinate().equals(expectedUnitVector.getYCoordinate()));
		assertTrue(unitVector.getZCoordinate().equals(expectedUnitVector.getZCoordinate()));
	}
	
	@Test
	public void normalizeTest() {
		Vector v = new Vector(2.0, 2.0, 1.0);
		Vector expectedNormalizedV = new Vector(2.0 / 3.0, 2.0 / 3.0, 1.0 / 3.0);
		v.normalize();
		
		assertTrue(v.getXCoordinate().equals(expectedNormalizedV.getXCoordinate()));
		assertTrue(v.getYCoordinate().equals(expectedNormalizedV.getYCoordinate()));
		assertTrue(v.getZCoordinate().equals(expectedNormalizedV.getZCoordinate()));
	}

}
