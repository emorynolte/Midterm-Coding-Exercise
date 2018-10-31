package pkgMain;

import static org.junit.Assert.*;
import java.util.*;

import org.junit.Test;

public class CuboidTest {

	@Test
	public void testPerimeter() {
		Cuboid c = new Cuboid(2,2,2);
		
		try {
			c.perimeter();
			fail("expected exception was not thrown");
			
		}
		catch(UnsupportedOperationException e) {
			// if we are here the exception was thrown correctly
			assertTrue(true);
		}
	}

	@Test
	public void testArea() {
		Cuboid c = new Cuboid(2,2,2);
		assertTrue(c.area() == 24);
	}

	@Test
	public void testCuboid() {
		Cuboid c = new Cuboid(2,2,2);
	}

	@Test
	public void testGetiDepth() {
		Cuboid c = new Cuboid(2,2,5);
		assertTrue(c.getiDepth() == 5);
	}

	@Test
	public void testSetiDepth() {
		Cuboid c = new Cuboid(2,2,2);
		c.setiDepth(5);
		assertTrue(c.getiDepth() == 5);
	}

	@Test
	public void testVolume() {
		Cuboid c = new Cuboid(2,2,2);
		assertTrue(c.volume() == 8);
	}

	@Test
	public void testCompareByVolumeAndArea() {
		ArrayList<Cuboid> ar = new ArrayList<Cuboid>();
		ar.add(new Cuboid(1,1,1));
		ar.add(new Cuboid(2,1,4));
		ar.add(new Cuboid(1,7,1));
		
		//the last two are useful for testing, (2,1,4)vs(1,7,1) has volumes of 8 and 7 respectively, but areas of 28 and 30, so they should swap if we switch the sorts
		
		Collections.sort(ar, new SortByVolume() );
		assertTrue(ar.get(0).volume() == 1);
		assertTrue(ar.get(1).volume() == 7);
		assertTrue(ar.get(2).volume() == 8);
		
		Collections.sort(ar, new SortByArea());
		assertTrue(ar.get(0).area() == 6);
		assertTrue(ar.get(1).area() == 28);
		assertTrue(ar.get(2).area() == 30);
		
		
		
		
	}
	


}
