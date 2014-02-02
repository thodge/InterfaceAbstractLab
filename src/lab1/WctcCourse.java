/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab1;

/**
 *
 * @author Tammie
 */
public abstract class WctcCourse {
    private int crnNumber;
    private String courseDept;

    public int getCrnNumber() {
        return crnNumber;
    }

    public WctcCourse(int crnNumber, String courseDept) {
        this.crnNumber = crnNumber;
        this.courseDept = courseDept;
    }
    

    public void setCrnNumber(int crnNumber) {
        this.crnNumber = crnNumber;
    }

    public String getCourseDept() {
        return courseDept;
    }

    public void setCourseDept(String courseDept) {
        this.courseDept = courseDept;
    }
    
    
    
    
}
