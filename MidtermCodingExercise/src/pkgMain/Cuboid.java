package pkgMain;

import java.util.Comparator;

public class Cuboid extends Rectangle {

	private int iDepth;

	public Cuboid(int iWidth, int iLength, int iDepth) {
		super(iWidth, iLength);
		this.iDepth = iDepth;
	}
	
	public int getiDepth() {
		return iDepth;
	}

	public void setiDepth(int iDepth) {
		this.iDepth = iDepth;
	}
	
	public double volume() {
		return super.area() * iDepth;
	}
	
	@Override
	public double area() {
		return 2 * ((super.area() + (super.getiLength() * iDepth)) + (super.getiWidth() * iDepth)); 
	}
	
	@Override
	public double perimeter() {
		UnsupportedOperationException e = new UnsupportedOperationException();
		throw e;
	}
	
	
	public int compareTo(Cuboid c) {
		UnsupportedOperationException e = new UnsupportedOperationException();
		throw e;
	}
	
	
}
