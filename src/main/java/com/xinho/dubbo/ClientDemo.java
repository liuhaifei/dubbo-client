package com.xinho.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.ServiceLoader;

/**
 * @author lhf
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2018/6/1914:45
 */
public class ClientDemo {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext clx=new ClassPathXmlApplicationContext("dubbo-client.xml");

      IHello hello=(IHello)clx.getBean("ihello");

        System.out.println(hello.sayHello("lhf"));

        System.in.read();
    }
}
