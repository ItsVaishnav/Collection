package lambda;

import java.util.HashSet;
import java.util.Set;

public class SetClass {

	public static void main(String[] args) {
		Set<Integer> st = new HashSet<>();
		st.add(10);
		st.add(50);
		st.add(40);
		st.add(30);
		st.add(20);
		st.add(80);
		st.add(10);
		st.add(90);
		System.out.println(st);
	}

}
