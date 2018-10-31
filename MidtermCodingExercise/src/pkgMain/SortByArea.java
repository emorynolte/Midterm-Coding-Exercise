package pkgMain;

import java.util.*;
	
public class SortByArea implements Comparator<Cuboid> {
		
	public int compare(Cuboid a, Cuboid b) {
		int compare = 0;
		if (a.area() > b.area()) {
			compare = 1;
		}
		else if (a.area() < b.area()) {
			compare = -1;
		}
		return compare;
	}

}
