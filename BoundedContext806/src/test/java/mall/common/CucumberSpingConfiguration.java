package mall.common;


import mall.BoundedContext806Application;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { BoundedContext806Application.class })
public class CucumberSpingConfiguration {
    
}
