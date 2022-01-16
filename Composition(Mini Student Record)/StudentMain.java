
public class StudentMain {
    public static void main(String[] args) {
        Course course1 = new Course();
        //course1.setCourseCode(courseCode);
        Course course2 = new Course();
        PhoneNum phoneno=new PhoneNum(232, 323, 23232);
        Address add=new Address("Lahore","JOher town","Paksitan","Stree 6 defence road",phoneno);
       Student std1=new Student("Hamid",31203,add,course1,course2);
       // std1.c1.getCourseTitle("OOP");
        Student std2=new Student("Rehan",32323,add,course1,course2);
        std1.getCourse1().setCourseCode(133);
        std1.getCourse1().setCourseTitle("dkf");
        //std1.getAddress().getCity();
        System.out.println(std1.toString()+std2.toString());

    }
    
}
