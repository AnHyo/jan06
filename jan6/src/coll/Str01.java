package coll;

import java.util.Arrays;
import java.util.List;

//스트링 문자열 String
public class Str01 {
	public static void main(String[] args) {
		
		String str = "100";
		String str2 = new String("100");
		
		char ch = 'A';
		str = str + 'A';
		str = str + ch + 150; //연결
		
		System.out.println(str); //100A150
		
		int num = 100 + 150; //계산
		
		str2 = "A" + 127; // char은 더할 수 없다. 왜냐하면 캐릭터는 int로 인식이 가능하기 때문
		//문자 + 숫자 = 문자
		//문자 + 문자 = 문자
		//숫자 + 문자 = 문자
		//숫자 + 숫자 = 숫자
		
		System.out.println(str2);
		
		str2 = 1 + 2 + 3 + "A";
		System.out.println(str2); //6A
		
		str2 = "2" + 1 + 2 + 3 + "A";
		System.out.println(str2); //2123A
		
		str2 = "2" + (1 + 2 + 3) + "A";
		System.out.println(str2); //26A
		
		str2 = "안녕하세요";
		
		char[] hi = str2.toCharArray();
		System.out.println(Arrays.toString(hi));
		//[안, 녕, 하, 세, 요]
		
		System.out.println(str2.charAt(0)); //한글자씩 뽑아내기
		System.out.println(str2.indexOf("안")); //0 (있다면 해당 글자가 있는 번호 출력)
		System.out.println(str2.indexOf("가"));	// -1 (해당 글자가 없다면 -1이 출력)
		
		List<String> hiList = Arrays.asList(str2);
		System.out.println(hiList);
		
		String str3 = new String(hi, 1, 2);
		System.out.println(str3);
		
		str3 = "sjfsdfjsfjsdfjsdfsfjsdfjsdfsdfjsdfjsdfjsdfjwejjfr";
		System.out.println("j가 몇 개?");
		
		int count = 0;
		for(int i =0; i<str3.length();i++) {
			if(str3.charAt(i) == 'j') {
				count += 1;
			}
		}
		System.out.println("총" + count + "개");
		
		str3 = "Hi5";
		//is는 맞는지(포함하는지) 확인하는 것. 참거짓의 형태로 출력
		System.out.println(Character.isAlphabetic('A')); //()안이 알파벳이야?
		System.out.println(Character.isDigit('5')); //()안이 숫자야?
		System.out.println(Character.isUpperCase('A'));//()안이 대문자야?
		System.out.println(Character.isLowerCase('a')); //()안이 소문자야?
		
		System.out.println(Character.isAlphabetic(str3.charAt(0)));
		System.out.println(Character.isAlphabetic(str3.charAt(1)));
		System.out.println(Character.isAlphabetic(str3.charAt(2)));
		
		System.out.println("========================");
		
		System.out.println(Character.isDigit(str3.charAt(0)));
		System.out.println(Character.isDigit(str3.charAt(1)));
		System.out.println(Character.isDigit(str3.charAt(2)));
		
		System.out.println(str2.contains("cat")); //str2 에 "cat"이라는 문자열이 포함되어 있는가?
		System.out.println(str2.contains("Hi"));
		
		str3 = str3.concat("입니다.");
		System.out.println(str3); //Hi3입니다.
		
		System.out.println(str3.endsWith("니다.")); //str3이 "니다."로 끝나? 
		
		String email = "wisejia@naver.com";
		System.out.println(email.endsWith(".com"));
		
		String str1 = new String("Hi");
		str2 = new String("Hi");
		
		
		System.out.println(str1 == str2);
		//불변성, immortal , false로 나옴 "Hi"라는 내용은 같지만, 메모리 공간에 각각 독자적인 공간으로 들어가 있기 때문에
		// ==라고 하면 false가 되는 것이다., new String("Hi")로 각각 붙었기 때문에 새로운 객체가 각각 새롭게 생성된 것
		
		System.out.println(str1.equals(str2));
		
		str1 = "안녕하세요";
		
		StringBuffer sb = new StringBuffer(str1); //StringBuffer를 사용해서 새로운 객체 만들지 않고, 문자를 추가하거나 변경해 줄 수 있다.
		sb.append("날씨가 참 좋네요");
		sb.append("하하하하;;;");
		
		System.out.println(sb);
		//System.out.println(sb.toString()); = 스트링으로 바꿔주는 것
		
		System.out.println(email.indexOf("@")); //"@"가 어디에 있는지 확인 : 0~ "@"
		
		//wisejia@naver.com
		String str4 = email.substring(0, 7); //substring : 설정한 범위만큼 잘라서 가져온다. 출력은 0~6까지 잘라서 나온다.
		System.out.println(str4);
		
		String server = email.substring(8, email.length()); //email.length() : email길이의 끝까지
		System.out.println(server); //naver.com
		
		//hyan2373@gmail.com
		//id와 도메인으로 분리해주세요.
		
		email = "hyan2373@gmail.com";
		
		String id = email.substring(0, email.indexOf("@"));
		String server2 = email.substring(email.indexOf("@")+1, email.length());
		System.out.println(id);
		System.out.println(server2);
		
		
		
		
		
		
		
	}
}
