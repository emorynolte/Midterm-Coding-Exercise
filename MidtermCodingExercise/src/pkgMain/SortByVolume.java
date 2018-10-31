package pkgMain;
import java.util.*;


public class SortByVolume implements Comparator<Cuboid> {
	
	public int compare(Cuboid a, Cuboid b) {
		int compare = 0;
		if (a.volume() > b.volume()) {
			compare = 1;
		}
		else if (a.volume() < b.volume()) {
			compare = -1;
		}
		return compare;
	}

}
