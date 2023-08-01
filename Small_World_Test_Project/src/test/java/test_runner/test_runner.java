package test_runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        /// set directory of the feature file
        features = "D://Coding-git//Small_World_Test//Small_World_Test_Project//src//test//java//Feature//SmallWorld.feature",
        glue = "step_definition",
        plugin = {"pretty","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}
)
public class test_runner {


}
