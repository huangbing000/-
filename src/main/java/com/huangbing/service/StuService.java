/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: StuService.java 
 * @Prject: huangbing-exam04
 * @Package: com.huangbing.service 
 * @Description: TODO
 * @author: lenovo   
 * @date: 2019年8月7日 上午8:18:32 
 * @version: V1.0   
 */
package com.huangbing.service;

import java.util.List;

import com.huangbing.domain.Student;

/** 
 * @ClassName: StuService 
 * @Description: TODO
 * @author: lenovo
 * @date: 2019年8月7日 上午8:18:32  
 */
public interface StuService {

	/**
	 * 
	 * @Title: selects 
	 * @Description: TODO
	 * @return
	 * @return: List<Student>
	 */
	List<Student> selects();
}
