package lab03;

import java.util.*;

public class OneHotVector {
	Vector<Integer> vec = new Vector();
	int i;
	int size;

	public OneHotVector(int i, int size) {
		this.i = i;
		this.size = size;
	}

	public String toString() {
		for (int j = 0; j < size; j++)
			if (i == j)
				vec.add(1);
			else
				vec.add(0);

		return vec.toString();
	}

}
