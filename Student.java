
import java.time.*;

public class Student extends Student_course_info{  
    public static void main(String[] args)
    { 
        String stud_name = "Yallappa";

        LocalDate pdt = LocalDate.of(2004,07,15);
        LocalDate tdt = LocalDate.now();
        Period diff = Period.between(pdt, tdt);
        System.out.println("Name:" +stud_name);
        System.out.println("Date of Birth : "+pdt);
        System.out.println("Age : "+diff.getYears());
        System.out.println("Course and marks of semester 4:");
        Student_course_info sc = new Student_course_info();
        sc.stud_info();
            
    }
}
