package fukushima;

class Subject {
	int id;
	String name;
	String teacher;
	Subject(int id, String name, String teacher) {
		this.id = id;
		this.name = name;
		this.teacher = teacher;
	}
}

class Result {
	int s_id;
	int id;
	int point;
	Result(int s_id, int id, int point) {
		this.s_id = s_id;
		this.id = id;
		this.point = point;
	}
}

class Student {
	int s_id;
	String name;
	int age;
	Student(int s_id, String name, int age) {
		this.s_id = s_id;
		this.name = name;
		this.age = age;
	}
}

public class Main {
	static Subject[] subject_table = {
			new Subject(10010, "情報構造論", "t-saitoh" ),
			new Subject(10020, "電気磁気学", "takaku"),
			new Subject(10030, "電気回路", "komatsu")
	};
	static Result[] result_table = {
			new Result(58563, 10020, 83),
			new Result(58564, 10010, 95),
			new Result(58573, 10030, 64),
			new Result(58563, 10010, 89)
	};
	static Student[] student_table = {
			new Student(58563, "斉藤太郎", 18),
			new Student(58564, "山田次郎", 19),
			new Student(58573, "渡辺花子", 18)
	};
	public static void main(String[] args) {
		for (Result result : result_table) {
			String studentName = "";
			for (Student student : student_table) {
				if (student.s_id == result.s_id) {
					studentName = student.name;
					break;
				}
			}
			String subjectName = "";
			for (Subject subject : subject_table) {
				if (subject.id == result.id) {
					subjectName = subject.name;
					break;
				}
			}
			System.out.printf("%s %s %d\n", studentName, subjectName, result.point);
		}
	}
}
