package mall.common;


import mall.BoundedContext1319Application;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { BoundedContext1319Application.class })
public class CucumberSpingConfiguration {
    
}
