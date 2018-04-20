package controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import biz.StudentBiz;
import entity.Student;

@RestController
public class DataController {
	@Resource
	StudentBiz studentBiz;
	@RequestMapping("/getindex")
	public String getindex(){
		return "index";
	}
	@GetMapping("/getdata")
	public Student getdata(){
		return studentBiz.findStudentById(1006);
	}
	
	@GetMapping("/setsession")
	public String setsession(HttpSession session){
		session.setAttribute("user", "lbj");
		return (String)session.getAttribute("user");
	}
	@GetMapping("/gessession")
	public String getsession(HttpSession session){
		return (String)session.getAttribute("user");
	}
}
