package mall.common;


import mall.고객Application;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { 고객Application.class })
public class CucumberSpingConfiguration {
    
}
