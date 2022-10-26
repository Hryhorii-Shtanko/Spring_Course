package spring_intro_course;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext4.xml");

        Dog myDog = context.getBean("dog", Dog.class);
        myDog.say();


        context.close();
    }
}
