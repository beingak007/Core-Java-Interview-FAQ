package in.Collection.ArrayList;

import java.util.ArrayList;

public class CustomArrayList extends ArrayList {

	@Override
	public boolean add(Object object) {
		if (this.contains(object)) {
			return true;

		} else {
			return super.add(object);
		}

	}
	public static void main(String[] args) {
		
		CustomArrayList cl = new CustomArrayList();
		cl.add(1);
		cl.add(1);
		cl.add(1);
		cl.add(2);
		
		System.out.println(cl);
		
		
	}

}
