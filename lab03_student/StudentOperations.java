import java.util.*;

class StudentOperations{
	//<Student> refers to the Student Class in Student.java
	//this array contains 2 different vars namely string(name) and long(Prn)
	ArrayList<Student> students;
	
	
	public StudentOperations(){
		//constructor
		this.students = new ArrayList<>();//arary init
			
	}
	public void addStudent(Student student){ //parameter passed dtype as student(name,prn:string,long)
		students.add(student);
		System.out.println("Student Added.");
		
	}
	public void displayStudents(){
		for(Student student: students){
			student.display(); //display method from student.java
		}
	}

}