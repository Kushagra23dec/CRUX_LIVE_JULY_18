package HashMap;

//ADOBECODEBANC ABC


import java.util.*;

public class HashMap_Intro {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
 
		 String s1 = sc.next();
		 String s2 = sc.next();
		 
		  System.out.println(ReturnMinimum(s1,s2));
	}
	
	public static String ReturnMinimum(String s1, String s2) {
		String ans = "";
		Map<Character,Integer> map2 = new HashMap<>();
		
		int mcount = 0, dmcount = s2.length();
		
		Map<Character,Integer> map1 = new HashMap<>();
		
		for(int i = 0; i<s2.length(); i++) {
			map2.put(s2.charAt(i),map2.getOrDefault(s2.charAt(i), 0)+1);
		}
		
		int ei = -1,si = -1;
		
		while(true) {
			
			while(ei<s1.length() -1 && mcount < dmcount) {
				ei++;
	 map1.put(s1.charAt(ei),map1.getOrDefault(s1.charAt(ei), 0)+1);
	 		
	 		if(map1.getOrDefault(s1.charAt(ei), 0) <= map2.getOrDefault(s1.charAt(ei), 0));
	 			mcount++;
			
	 			return ans;
			
			}
			
			
			return ans;
		}
		
		// shrink

	}

}
