package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class MainClass {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(200);
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
//		To Update the elements 
		numbers.set(3,55);
		System.out.println(numbers);
//		To Remove the Element by value 
		numbers.remove(Integer.valueOf(50));
		System.out.println(numbers);
		
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		
//		This is advanced form of for loop 
//		For Each Loop
		for(int i:numbers) {
			System.out.println(i);
		}
		
		numbers.sort(null);
		System.out.println(numbers);
		
		
//		With Custoe classs
		
		
		ArrayList<Students> students = new ArrayList<Students>();
		students.add(new Students("Vaishnav", 22, 31));
		students.add(new Students("Ravi", 22, 98));
		students.add(new Students("Pranav", 22, 63));
		students.add(new Students("Anuragh", 24, 101));
		System.out.println(students);
		for (Students student : students) {
			System.out.println("Name : "+student.getname()+" ,age : "+student.getage()+" ,RollNo : "+student.getRollNo());
		}
		
	}

}
