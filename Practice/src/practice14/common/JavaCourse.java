package practice14.common;

public  class JavaCourse implements Course {
	String JavaCourse=(PREFIX+"Java");
	String[] CourseUnit={"式と演算","制御構文","メソッド","配列","オブジェクト指向","継承","高度な継承"};


	@Override
	public String getCourseName() {
		return JavaCourse;
	}

	@Override
	public String[] getCourseUnit() {
		return CourseUnit;

	}
}
