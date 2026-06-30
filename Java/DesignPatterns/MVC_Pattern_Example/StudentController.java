package MVC_Pattern_Example;

public class StudentController {
 private Student student;
 private StudentView view;
 public StudentController(Student student,StudentView view)
 {
	 this.student=student;
	 this.view= view;
 }

	  public void setName(String name) {
		student.setName(name);
	  }
	 public void SetID(int id)
	 {
		 student.setId(id);
	 }
	 public void setGrade(String Grade)
	 {
		 student.setGrade(Grade);
	 }
	 public void updateView()
	 {
		 view.displayStudentDetails(student);
	 }
}
