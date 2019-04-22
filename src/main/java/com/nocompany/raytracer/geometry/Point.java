package com.nocompany.raytracer.geometry;

/**
 * @author ianH92
 */
public class Point {
    
    private Double x;
    private Double y;
    private Double z;

    /**
     * Constructs a point
     *
     * @param x The x-coordinate
     * @param y The y-coordinate
     * @param z The z-coordinate
     */
    public Point(Double x, Double y, Double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Double getXCoordinate() {
        return x;
    }

    public Double getYCoordinate() {
        return y;
    }
    
    public Double getZCoordinate() {
        return z;
    }

}