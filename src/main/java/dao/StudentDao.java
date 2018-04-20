package dao;

import java.util.List;



import entity.Student;

public interface StudentDao {
	public List<Student> getAllStudent();
	public Student findStudentById(Integer id);
	public int addStudent(Student stu);
	public int deleteStudentById(Integer id);
	
	public int updateStudent(Student stu);
	
	}
