package lambda;

import java.util.HashMap;
import java.util.Map;

public class MapClass {
	public static void main(String srgf[]) {
		Map<Integer, String> students = new HashMap<>();
		students.put(101, "Vaishnav");
		students.put(102, "Goluu");
		students.put(103, "Doremon");
		students.put(104, "Jay");
		students.put(105, "Om");
		students.put(106, "Pranav");
		System.err.println(students);
		System.out.println(students.get(102));
		System.out.println(students.values());
		System.out.println(students.keySet());
		
		for(int i:students.keySet()) {
			System.out.println(students.get(i).toUpperCase());
		}
	}
}