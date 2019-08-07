/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: StuServiceImpl.java 
 * @Prject: huangbing-exam04
 * @Package: com.huangbing.service.impl 
 * @Description: TODO
 * @author: lenovo   
 * @date: 2019年8月7日 上午8:18:49 
 * @version: V1.0   
 */
package com.huangbing.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.huangbing.dao.StuMapper;
import com.huangbing.domain.Student;
import com.huangbing.service.StuService;

/** 
 * @ClassName: StuServiceImpl 
 * @Description: TODO
 * @author: lenovo
 * @date: 2019年8月7日 上午8:18:49  
 */
@Service
public class StuServiceImpl implements StuService{

	@Resource
	private StuMapper mapper;

	/* (non Javadoc) 
	 * @Title: selects
	 * @Description: TODO
	 * @return 
	 * @see com.huangbing.service.StuService#selects() 
	 */
	@Override
	public List<Student> selects() {
		// TODO Auto-generated method stub
		return mapper.selects();
	}
	
}
