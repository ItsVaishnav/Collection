package ArrayList;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
		System.out.println(numbers.contains(20));
		System.out.println("Size : "+numbers.size());
		System.out.println(numbers);
		System.out.println("After Remove the element");
		System.out.println(numbers.remove(2));
		System.out.println(numbers);
		numbers.add(3,45);
		System.out.println(numbers);
		System.out.println(numbers.get(2));
		numbers.set(3,55);
		System.out.println(numbers);
		numbers.remove(Integer.valueOf(50));
		System.out.println(numbers);
		
	}

}
