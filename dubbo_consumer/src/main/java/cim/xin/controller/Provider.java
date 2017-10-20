package cim.xin.controller;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Provider {
	public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] {"classpath:dubbo/dubbo_provider.xml"});
        context.start();
        System.in.read(); // press any key to exit
    }
}
