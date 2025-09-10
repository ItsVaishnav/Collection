package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListClass {

	public static void main(String[] args) {
		List<Integer> st = new ArrayList<Integer>();
		st.add(10);
		st.add(20);
		st.add(30);
		st.add(40);
		st.add(50);
		st.add(60);
		st.add(70);
		for (int i : st) {
			if (i % 6 == 0) {
				System.out.println("The Square of " + i + " is : " + i * i);
			}
		}

//		Stream API 
		// it takes
		// source,operation,terminal operation

		List<Integer> filtered = st.stream().filter((a) -> a % 6 == 0).collect(Collectors.toList());

		System.out.println(filtered);

		List<Integer> filteredsq = st.stream().filter((a) -> a % 6 == 0).map((a) -> a * a).collect(Collectors.toList());

		System.out.println(filteredsq);
	}

}
