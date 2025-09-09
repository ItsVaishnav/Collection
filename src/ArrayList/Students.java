package ArrayList;

public class Students {
	private String name;
	private int age;
	private int rollNo;
	
	public Students(String name,int age , int rollNo) {
		this.name = name;
		this.age = age;
		this.rollNo = rollNo;
	}
	
	public void setname(String name) {
		this.name = name;
	}
	public void setage(int age) {
		this.age = age;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getname() {
		return this.name;
	}
	public int getage() {
		return this.age;
	}
	public int getRollNo() {
		return this.rollNo;
	}
	
	@Override
	public String toString() {
		return "Name : "+getname()+" ,age : "+getage()+" ,RollNo : "+getRollNo();
	}
}
