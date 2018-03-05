/*
 * PTra13_09.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;
import practice13.common.Employee;
public class PTra13_09 {

	/*
	 * ★ PTra13_08で作成したEmployeeクラスを使用します
	 */
	/** 名前データ（定数） */
	public static final String[] NAMEDATA = {"山田", "佐藤", "小林"};

	/** メールデータ（定数） */
	public static final String[] MAILDATA = {"yamada@hoge.com","satou@hoge.com","kobayashi@hoge.com"};

	/** パスワードデータ（定数） */
	public static final String[] PASSDATA = {"rezo0001","rezo0002","rezo0003"};

	/** 部署データ（定数） */
	public static final String[][] QUATERDATA = {
														{"総務部","業務部","シテム部"},
														{"5","10","35"},
													};

	/**
	 * エントリーポイント
	 * @param args
	 */
	public static void main(String[] args) {

		// ★ 定数で定義されている各データを使用して、Employeeインスタンスを３つ作成してください
			Employee[] emp=new Employee[3];
	for(int i=0;i<emp.length;i++) {
			emp[i]=new Employee();
			emp[i].setUserNm(NAMEDATA[i]);
			emp[i].setMail(MAILDATA[i]);
			emp[i].setPassword(PASSDATA[i]);
			emp[i].setDepartmentNm(QUATERDATA[0][i]);
			emp[i].setDepartmentCnt(Integer.parseInt(QUATERDATA[1][i]));

			System.out.println(emp[i].getUserNm());
			System.out.println(emp[i].getMail());
			System.out.println(emp[i].getPassword());
			System.out.println(emp[i].getDepartmentNm());
			System.out.println(emp[i].getDepartmentCnt());
		}
	}
}