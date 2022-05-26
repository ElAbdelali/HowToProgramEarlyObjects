package chapterExamples;

public class VolumeOfCyclinderObject {

	public static void main(String[] args) {
		CylinderClass volumeOfCylinder = new CylinderClass(-2,2);
		
		System.out.printf("The volume of the cylinder is: %.2f", 
				volumeOfCylinder.volume(volumeOfCylinder.getRadius(), 
				volumeOfCylinder.getHeight()));

	}
}
