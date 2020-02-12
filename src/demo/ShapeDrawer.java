package demo;

public class ShapeDrawer {

	public static void main(String[] args) {
		ShapeInterface shapeInterface = shape -> System.out.println(shape);
		shapeInterface.draw("Drawing Circle");
		shapeInterface.draw("Drawing Rectangle");
		shapeInterface.draw("Drawing Triangle");
	}

}
