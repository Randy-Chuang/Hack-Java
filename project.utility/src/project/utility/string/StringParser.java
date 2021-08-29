package project.utility.string;

import java.util.Arrays;

public class StringParser {

    public static void printStrArray(String[] tokenStrings) {
    	System.out.println(Arrays.toString(tokenStrings));
    }
    
    public static String firstNonBlankString(String[] tokenStrings) {
    	for(String str: tokenStrings) {
    		if(!str.isBlank()) {
    			return str;
    		}
    	}
    	return null;
    }
    
    public static Character firstNonBlankCharacter(String string) {
    	for(Character character: string.toCharArray()) {
    		if(!Character.isWhitespace(character)) {
    			return character;
    		}
    	}
    	return null;
    }
}
