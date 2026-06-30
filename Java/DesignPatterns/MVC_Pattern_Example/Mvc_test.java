package MVC_Pattern_Example;

public class Mvc_test {
public static void main(String[] args) {
	Student student = new Student("Lallitha", 236, "e");

	StudentView view = new StudentView();
	StudentController sc= new StudentController(null, null);
}
}
