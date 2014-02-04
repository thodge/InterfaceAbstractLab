package lab1;
/**
 * This abstract class lists properties and methods for WctcCourse
 *
 * @author your name goes here
 * @version 1.00
 */

public abstract class WctcCourse {

    private String courseName;
    private String courseNumber;
    private double credits;

    public abstract double getCredits();        

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }
    

}
