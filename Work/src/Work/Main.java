package Work;

public class Main {

	public static void main(String[] args) {
		Course course1= new Course(3,"   C#    ",15);
		
		Course course2=new Course(4,"    Java   ",17);
		
		Course course3=new Course(5,"    HTML   " ,  25);
		
		Course[] courses= {course1,course2,course3};
		for(Course course : courses )
		{
			System.out.println("Kurs Adı: "+course.lesson+"Kurs id:  "+course.id);
			
		}
		
		System.out.println("-------------------");
		CourseManager coursemanager=new CourseManager();
		coursemanager.add(course1);
		coursemanager.delte(course2);
		coursemanager.add(course3);
	}

}
