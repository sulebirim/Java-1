import java.util.*;
import java.io.*;

/*
* AgeChecker.java
*@author Vlad Vasiljevs
*26/01/15
*Version: Final
*/


public class AgeChecker {

	public static void main(String args[]){

		Scanner input = new Scanner(System.in);

			int age;

				System.out.println("How old are you?");
					age = input.nextInt();

					if (age <= 0)
						System.out.println("Nice Joke");

							else if (age >= 18)
								System.out.println("Come on in ");

									else if (age <= 17)
									System.out.println("Too Young");

	}
}