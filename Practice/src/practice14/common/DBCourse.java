package practice14.common;

public  class DBCourse implements Course{
	String DBCourse=(PREFIX+"DB基礎");
	String[] CourseName={"DB基礎","SQL基礎","正規化","SQL応用"};


	@Override
	public String getCourseName() {
		return  DBCourse;
	}

	@Override
	public String[] getCourseUnit() {
		return CourseName;
	}
}
