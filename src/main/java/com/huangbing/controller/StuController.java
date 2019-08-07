/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: StuController.java 
 * @Prject: huangbing-exam04
 * @Package: com.huangbing.controller 
 * @Description: TODO
 * @author: lenovo   
 * @date: 2019年8月7日 上午8:20:25 
 * @version: V1.0   
 */
package com.huangbing.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.huangbing.domain.Student;
import com.huangbing.service.StuService;

/** 
 * @ClassName: StuController 
 * @Description: TODO
 * @author: lenovo
 * @date: 2019年8月7日 上午8:20:25  
 */
@Controller
public class StuController {

	@Resource
	private StuService service;
	
	@RequestMapping("selects")
	public String selects(HttpServletRequest request) {
		List<Student> list = service.selects();
		request.setAttribute("list", list);
		return "list";
	}
}
