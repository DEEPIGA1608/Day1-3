package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@SpringBootApplication

@Controller
public class proj3 {
	@RequestMapping("/proj3")
	public String getMyFav(HttpServletRequest req)
	{
		String color=req.getParameter("color");
		HttpSession session = req.getSession();
		session.setAttribute("displayColor", color);
		return "Color.jsp";
	}
}
