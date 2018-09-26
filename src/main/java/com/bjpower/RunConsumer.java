package com.bjpower;

import com.bjpower.ISomeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * company: www.abc.com
 * Author: Reyco
 * Create Data: 2018/8/24
 */
public class RunConsumer {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-dubbo-consumer.xml");
        // 获取到提供者提供的服务对象
        ISomeService service = (ISomeService) ac.getBean("someService");
        // 消费服务
        service.hello();
    }
}
