package coll;

import java.util.*;

public class Ex1 {
	public static void main(String[] args) {
		
//		Map<String, String> map = new HashMap<String, String>();
//		
//		map.put("poseidon", "01234567");
//		map.put("test", "test");
//		map.put("test01", "test0101");
//		
//		List<Map.Entry<String, String>> li = map.entrySet().stream().collect(Collectors.toList());
//		
	//	System.out.println("리스트 :" +li);
		
		
		//문자열을 입력받아서, 같은 문자가 연속적으로 반복되는 경우에 그 반복 횟수를 표시하여 문자열을 압축하기.
		//입력예시 : aaabbcccccca
		//출력예시 : a3b2c6a1
		
		String mon = "aaabbcccccca";
		String mo1 = mon.substring(0,11);
		String mo2 = mon.substring(11,mon.length());
		
		
		int c_a1 = 0, c_b=0, c_c=0, c_a2=0;
		for (int i = 0; i < mo1.length(); i++) {
			if(mo1.charAt(i) == 'a') {
				c_a1 += 1;	
			}
			else if(mo1.charAt(i) == 'b') {
				c_b += 1;
			}
			else if(mo1.charAt(i) == 'c') {
				c_c += 1;
			}
			
		}
		for (int i = 0; i < mo2.length(); i++) {
			c_a2 +=1;
		}
		
		
		System.out.println("a"+c_a1+"b"+c_b+"c"+c_c+"a"+c_a2);
		
		
		
		
				
	}
}



