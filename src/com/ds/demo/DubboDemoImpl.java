package com.ds.demo;

import com.ds.common.rpc.DubboDemo;


public class DubboDemoImpl implements DubboDemo {

	@Override
	public String sayHello(String name) {
		return "dubbo demo provider say : " + name;
	}

}
