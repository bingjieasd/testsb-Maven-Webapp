package entity;

import java.io.Serializable;
import java.util.List;

public class Grade  implements Serializable{
	private Integer gradeid;
	private String gradeName;
	private List<Student> students;
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public Integer getGradeid() {
		return gradeid;
	}
	public void setGradeid(Integer gradeid) {
		this.gradeid = gradeid;
	}
	public String getGradeName() {
		return gradeName;
	}
	public void setGradeName(String gradeName) {
		this.gradeName = gradeName;
	}
	
	public Grade(Integer gradeid, String gradeName, List<Student> students) {
		super();
		this.gradeid = gradeid;
		this.gradeName = gradeName;
		this.students = students;
	}
	public Grade() {
		super();
	}
	@Override
	public String toString() {
		return "Grade [gradeid=" + gradeid + ", gradeName=" + gradeName + "]";
	}
	
}
