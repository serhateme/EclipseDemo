package Work;

public class CourseManager {
	public void delte(Course course) {
		System.out.println("Kurs Silindi"+course.lesson);
	}
	public void update(Course course) {
		System.out.println("Kurs G�ncellendi"+course.lesson);
	}
	public void add(Course course) {
		System.out.println("Kurs Eklendi"+course.lesson);
	}

}
