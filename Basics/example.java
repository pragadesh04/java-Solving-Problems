// 

import java.util.*;

class example {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		char[] chars = {'a','e','i','o','u'};

		for(int i =0; i < n.length(); i++){
			for(int j = 0; j < 5; j++){
				if(n.charAt(i) == chars[j]){
					System.out.printf("%c ", n.charAt(i));
				}
			}
			System.out.printf("\n");
		}
		
	}	
}