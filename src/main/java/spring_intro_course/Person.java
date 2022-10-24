package spring_intro_course;


import org.springframework.beans.factory.annotation.Value;

//@Component("personBean")
public class Person {
//	@Qualifier("catBean")
//	@Autowired
private Pet pet;
	@Value("${person.surname}")
	private String surname;
	@Value("${person.age}")
	private int age;

//	public Person() {
//		System.out.println("Person bean is created");
//	}

//	@Autowired
//public Person(@Qualifier("catBean")Pet pet) {
//		System.out.println("Person bean is created");
//		this.setPet(pet);
//	}


public Person(Pet pet) {
		System.out.println("Person bean is created");
		this.setPet(pet);
	}

//	@Autowired
//	@Qualifier("dog")
public void setPet(Pet pet) {
//	System.out.println("Class Person: set pet");
	this.pet = pet;
}

	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void callYourPet() {
	System.out.println("Hello my precious Pet!");
	pet.say();
}
public Pet getPet() {
	return pet;
}



}
