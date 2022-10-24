package spring_intro_course;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
	//	Pet pet = context.getBean("myPet",Pet.class);
		
//Pet pet = new Cat();
//Person person = new Person(pet);
		Person person = context.getBean("myPerson", Person.class);
person.callYourPet();

context.close();
	}

}
  