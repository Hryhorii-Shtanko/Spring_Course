package spring_intro_course;


public class Cat implements Pet {
    public Cat() {
        System.out.println("Cat bean is created");
    }

    @Override
    public void say() {
        System.out.println("Meow-Meow");
    }

    protected void init() {
        System.out.println("Class Cat: init method");
    }

    private void destroy() {
        System.out.println("Class Cat: destroy method");
    }

}
