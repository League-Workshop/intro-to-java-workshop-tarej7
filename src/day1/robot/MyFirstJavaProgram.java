package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
Robot r2d2 = new Robot ();

for (int i = 0; i < 50 ; i++) {
	r2d2 .penDown();
	r2d2 .move(50);
	r2d2 .turn(5);

}
		
		
	}
}
