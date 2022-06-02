package chapterExamples;

public class VolumeOfCyclinderObject {

	public static void main(String[] args) {
		CylinderClass volumeOfCylinder = new CylinderClass(4,2);
		double volume = volumeOfCylinder.volume(volumeOfCylinder.getRadius(), volumeOfCylinder.getHeight());
		System.out.printf("The volume of the cylinder is: %.2f", volume);

	}
}
