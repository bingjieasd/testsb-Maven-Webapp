package controller;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.hibernate.validator.internal.util.privilegedactions.GetConstraintValidatorList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import biz.StudentBiz;
import entity.Student;

@Controller
public class DataController {
	@Resource
	StudentBiz studentBiz;
	@RequestMapping("/getindex")
	public String getindex(HttpServletRequest request){
		System.out.println(request.getSession().getServletContext().getAttribute("stu"));
		return "index";
	}
	@GetMapping(value="/showindex")
	public String getdata(HttpSession session){
		List<Student> list=studentBiz.getAllStudent();
		
		session.setAttribute("list", list);
		System.out.println(session.getAttribute("list"));
		return "index";
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
	@PostMapping("/register.do")
	public String register(Student student){
		System.out.println(student);
		int res=studentBiz.addStudent(student);
		return "register";
	}
	@GetMapping("/register.show")
	public String registershow(HttpSession session){
		return "register";
	}
	@GetMapping("/date.test")
	public String datetest(String date){
		System.err.println(date);
		return "register";
	}
}
