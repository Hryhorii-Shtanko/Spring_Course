package hibernate_many_to_many;

import hibernate_many_to_many.entity.Section;
import hibernate_many_to_many.entity.Child;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();
        Session session = null;

        try {
            session = factory.getCurrentSession();
            Section section1 = new Section("Socket");
            Child child1 = new Child("Gregory", 5);
            Child child2 = new Child("Masha", 7);
            Child child3 = new Child("Vasya", 6);

            session.beginTransaction();

            session.save(section1);

            section1.addChildToSection(child1);
            section1.addChildToSection(child2);
            section1.addChildToSection(child3);
            session.save(child1);
            session.save(child2);
            session.save(child3);

            session.getTransaction().commit();
            System.out.println("Done!!~");

        } finally {
            session.close();
            factory.close();
        }
    }

}
