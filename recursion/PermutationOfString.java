// Name: Sourabh Shripad Naik
// Date: 14/06/2020
// Problem Statement: Print all the permutations of given string
// Approach: Recursion

package recursion;

import java.util.*;

public class PermutationOfString {
	static Set<String> set = new HashSet<>();
	
	// recursive method
	static void permutations(String s, int l, int r) {
		// base condition 
		if(l==r) {
			// For Unique String
			if(set.contains(s)) return;
			set.add(s);
			//
			System.out.println(s);
			return;
		}
		
		//recursive call and back tracking
		for(int i=l;i<=r;i++) {
			s = interchangeChar(s, l, i);
			permutations(s, l+1, r);
			s = interchangeChar(s, l, i); // backtracking
		}
	}
	
	// simple interchange or swap function
	static String interchangeChar(String s, int a, int b) {
		char arr[] = s.toCharArray();
		char temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
		return String.valueOf(arr);
	}

	public static void main(String[] args) {
		String a = "abcc";
		permutations(a, 0, a.length()-1);
	}

}
