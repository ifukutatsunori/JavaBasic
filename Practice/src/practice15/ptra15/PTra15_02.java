/*
 * PTra15_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice15.ptra15;

import practice15.common.Java2Month;

public class PTra15_02 {
	public static void main(String[] args) {

		Java2Month room = new Java2Month();

		// roomに格納されたJava2MonthインスタンスのgetCurriculumメソッドを呼び出してください
		Java2Month[]CurriculumList={room};{
		for(Java2Month java2Month:CurriculumList)
			java2Month.getCurriculum();

		// 取得したカリキュラム情報を全て出力してください
			for(int i=0;i<CurriculumList.length;i++) {
			System.out.println(CurriculumList[i].getCurriculum());
		}
		}
	}
}
