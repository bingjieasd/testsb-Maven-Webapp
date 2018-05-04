package entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Student implements Serializable{
	//
	private  Integer studentNo;
	private String loginpwd;
	private String studentName;
	private Integer sex;
	private String phone;
	private String address;
//	@JsonFormat(pattern = "yyyy/MM/dd")
//	@DateTimeFormat(pattern="yyyy/MM/dd")
	private String borndate;
	private Grade grade;
	public String getBorndate() {
		return borndate;
	}
	public void setBorndate(String borndate) {
		this.borndate = borndate;
	}
	public Grade getGrade() {
		return grade;
	}
	public void setGrade(Grade grade) {
		this.grade = grade;
	}
	public Student(Integer studentNo, String loginpwd, String studentName,
			Integer sex, String phone, String address, Grade grade) {
		super();
		this.studentNo = studentNo;
		this.loginpwd = loginpwd;
		this.studentName = studentName;
		this.sex = sex;
		this.phone = phone;
		this.address = address;
		this.grade = grade;
	}
	
	
	@Override
	public String toString() {
		return "Student [studentNo=" + studentNo + ", loginpwd=" + loginpwd + ", studentName=" + studentName + ", sex="
				+ sex + ", phone=" + phone + ", address=" + address + ", borndate=" + borndate + ", grade=" + grade
				+ "]";
	}
	public Student() {
		super();
	}
	public Student(Integer studentNo, String loginpwd, String studentName,
			Integer sex, String phone, String address) {
		super();
		this.studentNo = studentNo;
		this.loginpwd = loginpwd;
		this.studentName = studentName;
		this.sex = sex;
		this.phone = phone;
		this.address = address;
	}
	public Integer getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(Integer studentNo) {
		this.studentNo = studentNo;
	}
	public String getLoginpwd() {
		return loginpwd;
	}
	public void setLoginpwd(String loginpwd) {
		this.loginpwd = loginpwd;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
