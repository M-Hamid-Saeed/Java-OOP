public class Course {
    private String courseTitle;
    private int courseCode;
    
    /**
     * return String return the courseTitle
     */
    public String getCourseTitle() {
        return courseTitle;
    }

    /**
     * param courseTitle the courseTitle to set
     */
    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    /**
     * @return int return the courseCode
     */
    public int getCourseCode() {
        return courseCode;
    }

    /**
     * @param courseCode the courseCode to set
     */
    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }

    public Course(){
        
    }

    public String toString()
    {
        return String.format ("%nCourse Title--> %s%n Course Code--> %d",getCourseTitle(),getCourseCode());
    }

}
