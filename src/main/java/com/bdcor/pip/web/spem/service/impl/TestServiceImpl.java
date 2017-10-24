package com.bdcor.pip.web.spem.service.impl;
/**
 * @author qianyanan
 * 
 */
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.bdcor.pip.web.spem.dao.TestMapper;
import com.bdcor.pip.web.spem.domain.Test;
import com.bdcor.pip.web.spem.domain.TestExample;
import com.bdcor.pip.web.spem.service.TestService;
@Cacheable(value = { "fleetCache" })
@Service("TestService")

public class TestServiceImpl implements TestService{
	
	@Autowired
	private TestMapper testMapper;
	public List<Test> getlist() {
		TestExample example = new TestExample();
		List<Test> list  = testMapper.selectByExample(example);
		System.out.println("---");
		System.out.println("---");
		System.out.println("client");
		System.out.println("client");
		System.out.println("client");
		System.out.println("client");
		System.out.println("write");
		return list;
	}
	
}
