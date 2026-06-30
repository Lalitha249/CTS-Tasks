package MVC_Pattern_Example;

public class Student {
  private String name;
  private int id;
  private String Grade;
  public String getName() {
	return name;
  }
  
  public Student(String name, int id, String grade) {
	this.name = name;
	this.id = id;
	Grade = grade;
}

  public void setName(String name) {
	this.name = name;
  }
  public int getId() {
	return id;
  }
  public void setId(int id) {
	this.id = id;
  }
  public String getGrade() {
	return Grade;
  }
  public void setGrade(String grade) {
	Grade = grade;
  }
}
