package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import ArrayList.Students;

public class MainClass {

	public static void main(String[] args) {
		List<Student> st = new ArrayList<Student>();
		st.add(new Student("Vaishnav", 21, 31));
		st.add(new Student("Ravi", 20, 98));
		st.add(new Student("Pranav", 22, 63));
		st.add(new Student("Anuragh", 24, 101));
		st.add(new Student("Doremon", 0, 12));
		for (Student s : st) {
			if (s.getAge() == 0)
				s.setAge(18);
			System.out.println("Name : " + s.getName() + ", RollNo : " + s.getRollNo() + ", Age : " + s.getAge());
		}

		System.out.println("Sort Based on Age");
		st.sort((s1, s2) -> s1.getAge() - s2.getAge());
		System.out.println(st);
		
		System.out.println("Sort Based on Name");
		st.sort((s1, s2) -> s1.getName().compareTo(s2.getName()));
		System.out.println(st);
		
		
		
		List<String> str = st.stream().map(x -> x.getName()).collect(Collectors.toList());
		System.out.println(str);
		
		List<Student> str1 = st.stream().filter(x -> x.getName().toLowerCase().startsWith("a")).collect(Collectors.toList());
		System.out.println(str1);
	}
}
