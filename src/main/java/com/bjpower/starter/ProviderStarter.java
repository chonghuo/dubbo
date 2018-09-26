package com.bjpower.starter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * 提供者启动类
 * company: www.abc.com
 * Author: Reyco
 * Create Data: 2018/8/24
 */
public class ProviderStarter {
        public static void main(String[] args) throws IOException {
            // 创建Spring容器
            ApplicationContext ac = new ClassPathXmlApplicationContext("spring-dubbo-provider.xml");
            // 启动Spring容器
            ((ClassPathXmlApplicationContext) ac).start();
            // 使当前应用处于阻塞状态，以使当前主线程不结束
            System.out.println("===========");
            System.in.read();
        }
}
