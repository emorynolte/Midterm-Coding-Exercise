package pkgMain;

import static org.junit.Assert.*;


import org.junit.Test;

import java.util.*;

public class RectangleTest {

	@Test
	public void testRectangle() {
		Rectangle r = new Rectangle(2,4);
		
	}
	
	@Test
	public void testPerimeter() {
		Rectangle r = new Rectangle(2,4);
		assertTrue(r.perimeter() == 12.0);
	}

	@Test
	public void testArea() {
		Rectangle r = new Rectangle(2,4);
		assertTrue(r.area() == 8.0);
	}

	@Test
	public void testGetiWidth() {
		Rectangle r = new Rectangle(2,4);
		assertTrue(r.getiWidth() == 2);
	}

	@Test
	public void testSetiWidth() {
		Rectangle r = new Rectangle(2,4);
		r.setiWidth(3);
		assertTrue(r.getiWidth() == 3);
	}

	@Test
	public void testGetiLength() {
		Rectangle r = new Rectangle(2,4);
		assertTrue(r.getiLength() == 4);
	}

	@Test
	public void testSetiLength() {
		Rectangle r = new Rectangle(2,4);
		r.setiLength(3);
		assertTrue(r.getiLength() == 3);
	}

	@Test
	public void testCompareTo() {
		ArrayList<Rectangle> ar = new ArrayList<Rectangle>();
		
		ar.add(new Rectangle(4,6));
		ar.add(new Rectangle(2,5));
		ar.add(new Rectangle(2,4));
		
		Collections.sort(ar);
		assertTrue(ar.get(0).getiLength() == 4);
		assertTrue(ar.get(1).getiLength() == 5);
		assertTrue(ar.get(2).getiLength() == 6);
		
		
		
	}

}
