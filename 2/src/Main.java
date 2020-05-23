import java.util.Arrays;

public class main {
	public main(String[] args) {
		Student[] a = {
				new Student(11111, "박땡땡", "수학", 3),new Student(11221, "황땡땡", "경영", 4),
				new Student(11111, "김땡땡", "컴퓨터", 1),new Student(11111, "이땡땡", "수학", 2)
		};
		Arrays.sort(a);
		print(a,"ID");
		Arrays.sort(a, Student.WITH_DEPT);
		print(a,"학과");
		Arrays.sort(a, Student.WITH_NAME);
		print(a,"이름");
		Arrays.sort(a, Student.WITH_GRADE);
		print(a,"학년");
	}

	private void print(Student[] a, String string) {
		// TODO Auto-generated method stub
		
	}
}
