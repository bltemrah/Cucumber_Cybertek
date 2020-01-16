package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
//        //Where our feature files are located
//        features = "src/test/resources/features",
//        //telling ...
//        glue = "com/vytrack/step_definitions/",
//        dryRun = false, // if we put "true" it shows directly undefined scenario
//        //tags = "@store_manager" // run only the scenario with @store_manager
//        //tags = "@smoke"  // only run the scenario with @login
//        //tags = "@wip"  // wip working in progress
//        //tags = "@driver and @smoke",
//        //tags = "@driver or @wip"
//        //tags = "@login"
//        tags = "@login and not @wip"  //old syntax {"@login", "~@wip"}

        features = "src/test/resources/features",
        glue = "com/vytrack/step_definitions/",
        dryRun = false,
        tags = "@navigation"

)
public class CukesRunner {



}
