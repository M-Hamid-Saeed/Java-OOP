public class Student {
    private String name;
    private String email;
    private int cnic;
    private Address address;
    private Course course1;
    private Course course2;

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return String return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return int return the cnic
     */
    public int getCnic() {
        return cnic;
    }

    /**
     * @param cnic the cnic to set
     */
    public void setCnic(int cnic) {
        this.cnic = cnic;
    }

    /**
     * @return Address return the address
     */
    public Address getAddress() {
        return this.address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     * @return Course return the course1
     */
    public Course getCourse1() {
        return this.course1;
    }

    /**
     * @param course1 the course1 to set
     */
    public void setCourse1(Course course1) {
        this.course1 = course1;
    }

    /**
     * @return Course return the course2
     */
    public Course getCourse2() {
        return this.course2;
    }

    /**
     * @param course2 the course2 to set
     */
    public void setCourse2(Course course2) {
        this.course2 = course2;
    }

    public Student(String name, int cnic,Address address,Course course1,Course course2){
        setAddress(address);
        setCnic(cnic);
        setName(name);
        setCourse1(course1);
        setCourse2(course2);
    }
   
    public String toString()
    {
        return String.format("%nName:: %s%n EMail:: %s%n CNIC:: %d%n---ADDRESS---%n%s%n COURSE 1::: %s%n COURSE 2 :::%s%n",getName(),getEmail(),getCnic(),getAddress(),getCourse1(),getCourse2());
    }
}
