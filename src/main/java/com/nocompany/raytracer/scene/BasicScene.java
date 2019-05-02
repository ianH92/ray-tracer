package com.nocompany.raytracer.scene;

import com.nocompany.raytracer.geometry.GeometricObject;
import com.nocompany.raytracer.geometry.Point2D;
import com.nocompany.raytracer.geometry.Vector;
import com.nocompany.raytracer.geometry.Vector2D;

public class BasicScene {
	private int imagePixelWidth;
	private int imagePixelHeight;
	private double imageAspectRatio;
	
	private GeometricObject[] sceneGeometry;
	private Color[][] pixelArray;
	
	private Vector2D[][] primaryRayArray;
	
	private BasicScene() {}
	
	public void initializeSceneWidthAndHeight(int width, int height) {
		imagePixelWidth = width;
		imagePixelHeight = height;
		imageAspectRatio = imagePixelWidth / imagePixelHeight;
		pixelArray = new Color[width][height];
		primaryRayArray = new Vector2D[width][height];
	}
	
	public void calculatePrimaryRaysForScene() {
		
		// For each pixel in the image construct a primary ray represented by a directional vector
		for(int i = 0; i < imagePixelWidth; i++) {
			for(int j = 0; j < imagePixelHeight; j++) {
				
				// Calculate the raster coordinates of the pixel from the pixel coordinates
				double rasterCoordinateX = (i + 0.5);
				double rasterCoordinateY = (j + 0.5);
				
				// Calculate the normalized device coordinates of the pixel from the raster coordinates
				double normalizedDeviceCoordinateX = rasterCoordinateX / imagePixelWidth;
				double normalizedDeviceCoordinateY = rasterCoordinateY / imagePixelHeight;
				
				// Calculate the screen coordinates from the normalized device coordinates
				double screenCoordinateX = (2 * normalizedDeviceCoordinateX - 1);
				double screenCoordinateY = (1 - 2 * normalizedDeviceCoordinateY);
				
				// Scale by the image aspect ratio
				screenCoordinateX *= imageAspectRatio;
				
				// Construct the new direction vector for the primary ray and normalize
				primaryRayArray[i][j] = new Vector2D(screenCoordinateX, screenCoordinateY);
				primaryRayArray[i][j].normalize();
			}
		}
	}

}
