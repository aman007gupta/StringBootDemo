package com.example.helloworlddemo;

import com.example.helloworlddemo.component.DemoBean;
import com.example.helloworlddemo.component.EmployeeBean;
import com.example.helloworlddemo.controller.HelloRestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class HelloworlddemoApplication {
    public static final Logger logger = LoggerFactory.getLogger(HelloworlddemoApplication.class);

    public static void main(String[] args) {
        logger.debug("Hello!");
        ApplicationContext context = SpringApplication.run(HelloworlddemoApplication.class, args);
        DemoBean demoBean = context.getBean(DemoBean.class);
        logger.info("Demo Bean= " + demoBean.toString());
        System.out.println(context.getBean(HelloRestController.class));
        logger.debug("\n*** Example Using @Autowire annotation on property");
        EmployeeBean employeeBean = context.getBean(EmployeeBean.class);
        employeeBean.setEid(100);
        employeeBean.setEname("Aman");
        employeeBean.showEmployeeDetails();
    }

}
