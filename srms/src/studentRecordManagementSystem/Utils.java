package studentRecordManagementSystem;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Utils {

	// Inputs turns to title cased words.
	// Example: associate in computer technology.
	// To: Associate In Computer Technology
    public static String casing(String input) {
    	if (input == null) {
        	return "";
        }
        
        input = input.trim().toLowerCase();
        
        if (input.isEmpty()) {
        	return "";
        }
        
        String[] parts = input.split("\\s+");
        StringBuilder str = new StringBuilder();
        
        for (int i = 0; i < parts.length; i++) {
            String p = parts[i]; 
            if (p.length() == 0) {
            	continue;
            }
            
            str.append(Character.toUpperCase(p.charAt(0)));
            
            if (p.length() > 1) {
            	str.append(p.substring(1));
            }
            
            if (i < parts.length - 1) {
            	str.append(" ");
            }
        }
        
        return str.toString();
    }
    
    //This adds whitespaces to the right for alignment.
    //EXAMPLE: 
    // Name: Juan Dela Cruz | Age: 19
    // Name: John Doe | Age: 30
    //TO:
    // Name: Juan Dela Cruz | Age: 19
    // Name: John Doe       | Age: 30
    public static String padding(String s, int width) {
    	if (s == null) {
        	s = "";
        }
        
        if (s.length() >= width) {
        	return s;
        }
        
        return s + " ".repeat(width - s.length());
    }
    
    // This is a Set named STOPWORDS.
    // It takes common words like "in" (Associate In Computer Technology)
    // It excludes the words in the set when creating course codes.
    private static final Set<String> STOPWORDS = new HashSet<>(Arrays.asList("in", "of", "and", "for", "the", "to", "with", "on", "by", "a"));
    
    // It generates the acronym of the inputted course if the user gives the full course name.
    // It checks if words are in the STOPWORDS set and ignores the word found in it.
    // Associate in Computer Technology to: ACT (in is ignored so it won't return AICT.
    public static String toCourseCode(String input) {
        if (input == null) {
        	return "";
        }
        
        input = input.trim();
        
        if (input.isEmpty()) {
        	return "";
        }
        
        String cleaned = input.replaceAll("[^A-Za-z\\s]", "").trim();
        String[] parts = cleaned.split("\\s+");
        
        if (parts.length == 1 && parts[0].length() <= 6 && parts[0].equals(parts[0].toUpperCase())) {
            return parts[0];
        }
        
        StringBuilder sb = new StringBuilder();
        
        for (String p : parts) {
            String low = p.toLowerCase();
            
            if (STOPWORDS.contains(low)) {
            	continue;
            }
            
            if (p.length() == 0) {
            	continue;
            }
            
            sb.append(Character.toUpperCase(p.charAt(0)));
        }
        
        String code = sb.toString();
        
        if (code.isEmpty()) {
            for (int i = 0; i < Math.min(parts.length, 3); i++) {
                
            	if (parts[i].length() > 0)
                	sb.append(Character.toUpperCase(parts[i].charAt(0)));
            }
            
            code = sb.toString();
        }
        
        return code.toUpperCase();
    }

    // It converts various inputs that corresponds to a certain return value.
    // Every input is considered as either: Freshman, Sophomore, Junior, Senior
    public static String normalizeYearLevel(String input) {
        if (input == null) {
        	return "";
        }
        
        input = input.trim().toLowerCase();
        
        if (input.isEmpty()) {
        	return "";
        }
        
        switch (input) {
            case "1":
            case "freshman":
            case "1st":
            case "1st year":
            	return "Freshman";
            case "2":
            case "sophomore":
            case "2nd":
            case "2nd year":
            	return "Sophomore";
            case "3":
            case "junior":
            case "3rd":
            case "3rd year":
            	return "Junior";
            case "4":
            case "senior":
            case "4th":
            case "4th year":
            	return "Senior";
            default:
                try {
                    int v = Integer.parseInt(input);
                    if (v == 1) return "Freshman";
                    if (v == 2) return "Sophomore";
                    if (v == 3) return "Junior";
                    if (v == 4) return "Senior";
                } catch (Exception ignored) {
                }
        }
        
        return "";
    }
}

