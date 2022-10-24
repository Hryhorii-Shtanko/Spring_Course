package spring_intro_course;

import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:myApp.properties")
//@ComponentScan("spring_course")
public class MyConfig {

@Bean
        //@Scope("prototype")
    public Pet catBean(){
    return new Cat();
    }
    @Bean
    public Person personBean(){
    return new Person(catBean());
    }
}
