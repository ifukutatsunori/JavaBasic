/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import practice18.entity.Player;

public class PTra18_04 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		ArrayList<Player>array=new ArrayList<Player>();
		 try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
	            while (scanner.hasNext()) {

	               Player player=new Player();
	               String line =scanner.nextLine();
	               String[] list =line.split(",", 0);
	               player.setPosition(list[0]);
	               player.setName((list[1]));
	               player.setCountry(list[2]);
	               player.setTeam(list[3]);
	               array.add(player);
	               Collections.shuffle(array);
	            }
		  } catch (FileNotFoundException e) {
	            System.out.println("ファイルが見つかりません");
	        }

		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください
		     Collections.shuffle(array);

		     int GKcount=0;
		     int DFcount=0;
		     int MFcount=0;
		     int FWcount=0;


		 for (int i = 01; i<array.size(); i++) {
			 if(array.get(i).getPosition().equals("GK")) {
				 if(GKcount<1) {
				 Player GK= array.get(i);
				 System.out.println(GK);
				 GKcount++;
				 }
			 }
			 if(array.get(i).getPosition().equals("DF")) {
				 if(DFcount<4) {
			 	 Player DF= array.get(i);
			 	System.out.println(DF);
			 	DFcount++;
				 }
			 }
			 if(array.get(i).getPosition().equals("MF")) {
				 if(MFcount<4) {
			 	 Player MF= array.get(i);
			 	System.out.println(MF);
			 	MFcount++;
				 }
			 }
			 if(array.get(i).getPosition().equals("FW")) {
				 if(FWcount<2) {
			 	 Player FW= array.get(i);
			 	System.out.println(FW);
			 	FWcount++;
				 }
			 }
		 }
	}
}