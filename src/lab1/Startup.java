package lab1;
/**
 * This class is meant for testing purposes
 *
 * @author your name goes here
 * @version 1.00
 */


public class Startup {
    
            WctcCourse[] courses = {new AdvancedJavaCourse(), new IntroJavaCourse()};
        
       
        for(WctcCourse w : courses) {
            w.getCredits();
        }
}
