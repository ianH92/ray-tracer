package com.nocompany.raytracer.geometry;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Test class for Point entity.
 * 
 * @author IAN
 */
public class PointTest {

    @Test
    public void pointTest() {
    	Point p = new Point(2.0, 1.0, 3.0);
    	assertTrue(p.getXCoordinate().equals(2.0));
    	assertTrue(p.getYCoordinate().equals(1.0));
    	assertTrue(p.getZCoordinate().equals(3.0));
    }
}