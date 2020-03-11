package login.sumit.registration;

public interface StudentDao {
	public int insertStudent(Student s);

	public Student getStudent(String username, String password);
}
