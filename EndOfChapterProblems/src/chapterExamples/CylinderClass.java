package chapterExamples;

public class CylinderClass {
	private double radius = 1;
	private double height = 1;
	
	CylinderClass(double radius, double height) {
		
		this.setRadius(radius);
		this.setHeight(height);

	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		if(radius <= 0) {
			throw new IllegalArgumentException("The height passed was an invalid value.");
		}
		this.radius = radius;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		if(height <= 0) {
			throw new IllegalArgumentException("The height passed was an invalid value.");
		}
		this.height = height;
	}
	public double volume(double radius, double height) {
		double volume = Math.pow(radius, 2) * Math.PI * height;
		return volume;
		
	}

}
