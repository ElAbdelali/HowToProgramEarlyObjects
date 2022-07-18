package chapter10exercise14;

public class ShapeHierarchyTest {
	
	public static void main(String[] args) {
		
		ShapeHeirarchy[] shapes = new ShapeHeirarchy[2];
		
		shapes[0] = new Circle(6);
		shapes[1] = new Sphere(7);
		
		for(ShapeHeirarchy shape : shapes) {
			
			if(shape instanceof TwoDimensionalShape) {
				TwoDimensionalShape twoDShape = (TwoDimensionalShape) shape;
				System.out.printf("area = %.2f%n%n", twoDShape.getArea());
			}
			
			if(shape instanceof ThreeDimensionalShape) {
				ThreeDimensionalShape threeDShape = (ThreeDimensionalShape) shape;
				System.out.printf("area = %.2f%n%n", threeDShape.getArea());
				System.out.printf("volume = %.2f%n%n", threeDShape.getVolume());

				
			}
		}
		
	}

}
