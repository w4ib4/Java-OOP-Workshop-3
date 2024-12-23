package lvl5week3;
class Student{
	private int id;
	private String name;
    private int age;
    private char grade;
    
    public Student(int id, String name, int age, char grade) {
    	this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if (age > 0){
			this.age = age;
		}else {
			System.out.println("Age must be a positive number.");
		}
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
	    if (grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'E' || grade == 'F') {
		    this.grade = grade;
	    }else {
        System.out.println("Invalid grade. Must be one of A, B, C, D, E, F.");
        }	
    }
}
public class Q1 {

}
