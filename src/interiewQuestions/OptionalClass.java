package interiewQuestions;

import java.util.Optional;

public class OptionalClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = null;  // when pass the null system print "Value is not present"
		
		Optional<String> optional = Optional.ofNullable(str);
		
		if(optional.isPresent()) {
			System.out.println("Value is " +optional.get());
		}else {
			
			String value = optional.orElse("Default");
			System.out.println("Value is not present " +value);
		}

	}

}
