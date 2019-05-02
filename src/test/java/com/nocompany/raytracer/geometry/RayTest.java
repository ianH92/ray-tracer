package com.nocompany.raytracer.geometry;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Test class for Ray.java.
 * 
 * @author ianH92
 */
public class RayTest {
	
	@Test
	public void rayTest() {
		Ray ray = new Ray(new Point(2.0, 2.0, 2.0), new Vector(1.0, 5.0, 3.0));
		
		Point origin = ray.getOrigin();
		assertTrue(origin.getXCoordinate().equals(2.0));
		assertTrue(origin.getYCoordinate().equals(2.0));
		assertTrue(origin.getZCoordinate().equals(2.0));
		
		Vector direction = ray.getDirection();
		assertTrue(direction.getXCoordinate().equals(1.0));
		assertTrue(direction.getYCoordinate().equals(5.0));
		assertTrue(direction.getZCoordinate().equals(3.0));
	}

}
