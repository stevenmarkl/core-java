package com.day11;

import java.util.Optional;

public class OptionalClassEg {

	public static void main(String[] args) {
		String name = null;
		
		Optional<String> nameOptional = Optional.ofNullable(name);
		
		if(nameOptional.isPresent()) {
			//Value is present you can access it using get()
			String value = nameOptional.get();
		}else {
			//value is absent
		}

	}

}
