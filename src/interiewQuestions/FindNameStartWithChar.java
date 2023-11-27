package interiewQuestions;

import java.util.Arrays;
import java.util.List;

//Write a program to find the 	in list witch started with "A" character using java 8
//input :["Amal","Aruna","Saman","Roy"]
//Output :["Amal","Aruna"]

public class FindNameStartWithChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("Amal","Aruna","Saman","Roy");
		list.stream().filter(name->name.startsWith("A")).forEach(System.out::println);
	}

}
