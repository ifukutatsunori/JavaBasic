package practice10;

import java.util.Random;

public class Car {
	int seriaNo;
	String color;
	int gasoline;


	int run() {
		if(this.gasoline>0) {
			Random rnd = new Random();
			this.gasoline--;
			return rnd.nextInt(15)+1;
		}else{
			return -1;
		}
	}
}
