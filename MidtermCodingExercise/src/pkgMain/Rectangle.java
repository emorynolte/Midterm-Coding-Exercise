package pkgMain;

public class Rectangle extends Shape implements java.lang.Comparable<Rectangle> {
	
	private int iWidth;
	private int iLength;
	
	
	public Rectangle(int iWidth, int iLength) {
		this.iWidth = iWidth;
		this.iLength = iLength;
	}
	
	public int getiWidth() {
		return iWidth;
	}

	public void setiWidth(int iWidth) {
		this.iWidth = iWidth;
	}

	public int getiLength() {
		return iLength;
	}

	public void setiLength(int iLength) {
		this.iLength = iLength;
	}

	@Override
	public double area() {
		return iWidth * iLength;
	}
	
	@Override
	public double perimeter() {
		return 2 * (iWidth + iLength);
	}
	
	
	public int compareTo(Rectangle r) {
		
		int compare = 0;
		if (this.area() > r.area()) {
			compare = 1;
		}
		else if (this.area() < r.area()) {
			compare = -1;
		}
		return compare;

	}
	

}
