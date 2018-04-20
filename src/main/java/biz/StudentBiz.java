package biz;

import java.util.List;

import org.springframework.stereotype.Service;

import entity.Student;

public interface StudentBiz {
	public List<Student> getAllStudent();
	public Student findStudentById(Integer id);
	public int addStudent(Student stu);
	public int deleteStudentById(Integer id);
	
	public int updateStudent(Student stu);
}
