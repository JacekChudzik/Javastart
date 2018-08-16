import point.Point;
import pointControler.pointControler;

public class PointTest {

	public static final int ADD_X = 1;
	public static final int ADD_Y = 2;
	public static final int MINUS_X = 3;
	public static final int MINUS_Y = 4;

	public static void main(String[] args) {

		Point p2 = new Point(1, 1);

		pointControler control = new pointControler();

		int number = 4;

		switch (number) {

		case 1:
			control.addX(p2);
			break;
		case 2:
			control.addY(p2);
			break;
		case 3:
			control.minusX(p2);
			break;
		case 4:
			control.minusY(p2);
		}

		System.out.print(p2.getX() + " , " + p2.getY());

	}

}
