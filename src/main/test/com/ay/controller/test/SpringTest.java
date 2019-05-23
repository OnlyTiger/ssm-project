package com.ay.controller.test;

import com.ay.controller.AyTestController;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


/**
 * @author Ay
 * @create 2018/05/16
 **/
public class SpringTest {


    @Test
    public void testSpring(){
        //获取运用上下文
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取AyTestController类
        AyTestController ayTestController =
                (AyTestController) applicationContext.getBean("ayTestController");
        //调用sayHello方法
        //ayTestController.hello();

        //装载多个配置文件实例化ApplicationContext容器
        String[] configs = {"bean1.xml","bean2.xml","bean3.xml"};
        ApplicationContext cxt = new ClassPathXmlApplicationContext(configs);

//        //装载单个配置文件实例化ApplicationContext容器
//        ApplicationContext cxt = new FileSystemXmlApplicationContext("c:/beans.xml");
//        //装载多个配置文件实例化ApplicationContext容器
//        String[] configs = {"c:/beans1.xml","c:/beans2.xml"};
//        ApplicationContext cxt = new FileSystemXmlApplicationContext(configs);


    }
    @Test
    public void test2(){
        Resource resource = new ClassPathResource("applicationContext.xml");
        BeanFactory factory = new XmlBeanFactory(resource);
        AyTestController ayTestController =
                (AyTestController) factory.getBean("ayTestController");
        //ayTestController.hello();
    }



}
