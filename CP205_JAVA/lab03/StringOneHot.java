package lab03;

import java.util.*;

public class StringOneHot {
	String str;
	int len;
	String [] alpha;
	Set<String> set;
	Map<String, OneHotVector> ohv;
	Map<Integer, String> map;

	public StringOneHot(String str) {
		this.str = str;
		this.len = str.length();
	}

	public String getString() {
		return str;
	}

	public String getStrSet() {
		set = new TreeSet<>();
		for (int i = 0; i < len; i++)
			set.add(str.substring(i,i+1));
		indexing();
		return set.toString();
	}

	public void indexing() {
		alpha = new String[set.size()];
		Iterator<String> e = set.iterator();
		int i = 0;
		while (e.hasNext()) {
			alpha[i] = e.next();
			i++;
		}
	}

	public String getStrMap() {
		map = new HashMap<>();
		for (int i = 0; i < set.size(); i++)
			map.put(i, alpha[i]);
		return map.toString();
	}
	
	public void setStrOneHotVec() {
		ohv = new HashMap<>();
		for (int i = 0; i < set.size(); i++)
			ohv.put(alpha[i], new OneHotVector (i ,set.size()));
	}
	public Map getStrOneHotVec() {
		setStrOneHotVec();
		return ohv;
	}
}
	

