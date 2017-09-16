import java.util.Date;
import java.util.ArrayList;
/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		
		return students;
	}

	@Override
	public void setStudents(Student[] students) {
		if(students.length==0)
			throw new IllegalArgumentException("Length is zero...");
		this.students =students;
	}

	@Override
	public Student getStudent(int index) {
		if(index<0||students==null)
			throw new IllegalArgumentException("Students array is null..or index is zero..");
		for(int i =0;i<students.length;i++)
		{
			if(i==index)
				return students[i];
		}
		return null;
	}

	@Override
	public void setStudent(Student student, int index)
	{
		if(student==null)
			throw new IllegalArgumentException("Student array is null...");
		if(index<0||index>students.length)
			throw new IllegalArgumentException("Index less than zero or greater than student  array");
		
		
		list.add(students[this.student(index)]);
		list.add(index);
		
	}

	@Override
	public void addFirst(Student student) 
	{
		if(student==null)
			throw new IllegalArgumentException("Students array is null..");
		LinkedList<students> list = new LinkedList<students>();
			for(int i =0;i<students.length;i++)
			{
				list.add(students[i])
			}
		list.add(students.indexOf(0));
	}

	@Override
	public void addLast(Student student) {
		if(student==null)
			throw new IllegalArgumentExceeption("Student array is null....")
		if(index>atudent.length)
			throw new IllegalArgumentException("Index is greater than student array ..length")
			LinkedList<students> list = new LinkedList<students>();
			for(int i =0;i<students.length;i++)
			{
				list.add(students[i])
			}
			list.add(students.length-1);
	}

	@Override
	public void add(Student student, int index) {
		
	    //this.student = Student[index];
	}

	@Override
	public void remove(int index) {
		for(int i=0;i<students.length;i++)
		{
			if(i==index)
				l.remove(index);
		}
	}

	@Override
	public void remove(Student student) {
		//al.remove(student);
	}

	@Override
	public void removeFromIndex(int index) {
		/*for(int i =0;i<al.size();i++)
		{
			if(i==index)
				al.remove(students)
		}*/
	}

	@Override
	public void removeFromElement(Student student) {
		//al.remove(student);
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) 
	{
		/*String[] arr = new al.toArray(new String[al.size()]);
		for(int i = firstDate;i<lastDate;i++)
		{
			arr[i] = al.get(students.indexOf(i));
		}*/
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		/*for(int i =0;i<al.size();i++)
		{
			al.get(students.indexOf(student)+1);
			return students;
		}*/
		return null;
	}
}
