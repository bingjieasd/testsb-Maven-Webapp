package biz.impl;

import java.util.List;

import javax.annotation.Resource;


import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


import dao.StudentDao;

import entity.Student;
import biz.StudentBiz;
@Transactional
@Service("studentBiz")
public class StudentBizImpl implements StudentBiz {
	static Logger log=Logger.getLogger(StudentBizImpl.class);
	@Resource
	private StudentDao studentDao;
	
//	public StudentBizImpl(StudentDao studentDao) {
//		super();
//		this.studentDao = studentDao;
//	}

	public StudentDao getStudentDao() {
		return studentDao;
	}

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}
	public List<Student> getAllStudent() {
		 List<Student> list=studentDao.getAllStudent();
		return list;
	}
	public Student findStudentById(Integer id) {
			return studentDao.findStudentById(id);
	}

	public int addStudent(Student stu) {
		return studentDao.addStudent(stu);
	}
	public int deleteStudentById(Integer id) {
		int a=studentDao.deleteStudentById(10071);
		int b=studentDao.deleteStudentById(10070);
		double c=1/0;
		return a+b;
	}

	public int updateStudent(Student stu) {

		return studentDao.updateStudent(stu);
	}

}
