package gun3odev1;

public class Main {

    public static void main(String [] args) {

        Course java = new Course(1, "Java");
        Course cSharp = new Course(2, "C Sharp");
        Course python = new Course(3, "Python");

        Course[] courses = {
                java, cSharp, python
        };

       User enginDemirog = new User(1, "Engin", "Demirog", "Istanbul");

       Student mert = new Student(2, "Mert", "C", "Izmir", "3535-3535-3535-3535");
       StudentManager studentManager = new StudentManager();
       studentManager.watchCourse(mert, cSharp);

       Instructor instructor = new Instructor(1, "Engin", "Demiroğ", "Istanbul", "TR330006100519786457841326");
       InstructorManager instructorManager = new InstructorManager();

       instructorManager.addCourse(instructor, new Course(1, "Matlab"));
       instructorManager.addMultipleCourse(instructor,courses);
       instructorManager.removeCourse(instructor, python);



    }


}
