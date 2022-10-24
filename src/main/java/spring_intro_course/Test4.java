package spring_intro_course;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");

//        Dog myDog = context.getBean("myPet",Dog.class);
//        myDog.setName("Belka");

//        System.out.println(myDog.getName());

//        System.out.println(myDog);

        context.close();
    }
}
