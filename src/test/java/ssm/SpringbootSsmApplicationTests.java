package ssm;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;
import ssm.pojo.Man;
import ssm.pojo.Person;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootSsmApplicationTests {

    @Autowired
    Man man;

    @Autowired
    Person person;

    @Autowired
    ApplicationContext ioc;

    @Test
    public void contextLoads() {

        System.out.println(man);
    }

    @Test
    public void testMan(){
        System.out.println(person);
    }

    @Test
    public void testResource(){
        boolean b = ioc.containsBean("helloService");
        System.out.println(b);
    }

}
