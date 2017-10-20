package cim.xin.service.impl;


import com.alibaba.dubbo.config.annotation.Service;

import cim.xin.service.DemoService;

//@Service
public class DemoServiceImpl implements DemoService {

	@Override
	public String sayHello(String name) {
		return "Hello " + name;
	}

}
