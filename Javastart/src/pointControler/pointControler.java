package pointControler;

import point.Point;

public class pointControler {

	

	public void addX(Point p1) {
		
		p1.setX(p1.getX()+1);
		System.out.println(p1.getX());

	};

	public void minusX(Point p1) {
		int x = p1.getX() - 1;
		p1.setX(x);
		System.out.println(p1.getX());
	};

	public void addY(Point p1) {
		int y = p1.getX() + 1;
		p1.setY(y);
		System.out.println(p1.getY());
	};

	public void minusY(Point p1) {
		int y = p1.getX() - 1;
		p1.setY(y);
		System.out.println(p1.getY());
	};

}
