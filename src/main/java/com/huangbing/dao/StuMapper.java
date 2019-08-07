/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: StuMapper.java 
 * @Prject: huangbing-exam04
 * @Package: com.huangbing.dao 
 * @Description: TODO
 * @author: lenovo   
 * @date: 2019年8月7日 上午8:16:55 
 * @version: V1.0   
 */
package com.huangbing.dao;

import java.util.List;

import com.huangbing.domain.Student;

/** 
 * @ClassName: StuMapper 
 * @Description: TODO
 * @author: lenovo
 * @date: 2019年8月7日 上午8:16:55  
 */
public interface StuMapper {

	/**
	 * 
	 * @Title: selects 
	 * @Description: TODO
	 * @return
	 * @return: List<Student>
	 */
	List<Student> selects();
}
