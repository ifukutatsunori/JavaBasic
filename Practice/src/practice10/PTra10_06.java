package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */
		Car[]car=new Car[3];
		for(int i=0;i<car.length;i++) {
			car[i]=new Car();
			car[i].gasoline=50;
			car[i].color="red";
		final int distance=300;
		int sum=0;
		int n=0;
		while(true) {
			int go = car[i].run();
			n++;
			sum+=go;

		if(sum>distance) {

				System.out.println("目的地にまで"+n+"時間かかりました。残りのガソリンは、"+car[i].gasoline+"リットルです");
			break;
		}
		}
		}
	}
}
