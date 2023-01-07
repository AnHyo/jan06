package coll;

public class KeyMaker {
/*	public static void main(String[] args) {
		
		int r = (int)(Math.random() * 10); //0~9 까지 뽑기 : 0부터 출력되므로 10개로 돌려야 한다.
		System.out.println(r);
		
		char[] alpa = {'A','B','C','D','E','F','G','H','I','J','K'
				,'L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'
							};//A~Z
		r = (int)(Math.random() * 26);
		//System.out.println(alpa[r]);
		
	}
*/
	//// n은 숫자 a는 영문자
	//annna-aaaaa-aaana-nanan-annaa
	//위와 같은 패턴으로 시리얼 만들어서 리스트에 저장하기
	
	   private final static String pattern = "annna-aaaaa-aaana-nanan-annaa";
	   private final static int[] number = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
	   private final static char[] alpa = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
	         'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };

	   public String makeKey() {
	      //String key = "";
		   StringBuilder sb = new StringBuilder();
	      for (int i = 0; i < pattern.length(); i++) {
	         if (pattern.charAt(i) == 'a') { //pattern의 문자중 "a"에
	           // key += alpabet(); //char 타입의 alpa배열의 랜덤값인 alpabet을 key에 넣라.
	        	 sb.append(alpabet()); 
	         } else if(pattern.charAt(i) == 'n'){//pattern의 문자중 "n"에
	        	 // key += alpabet(); // int 타입의 number배열의 랜덤값을 key에 넣어라.
	            sb.append(number); 
	         } else {
	           // key += "-"; // pattern에서 a,n 둘다 아닌곳에는 "-"문자열을 키에 엏어라
	        	 sb.append("-");
	         }
	      }
	      //return key;//키값을 받아서 돌려줌
	      return sb.toString();
	   }

	   private int number() {
	      //각 배열의 길이만큼 돌게 변경
	      return (int) (Math.random() * number.length);
	      // number의 길이만큼 랜덤으로 돌려서 int타입 변환 후 int타입으로 돌려줘라
	   }

	   private char alpabet() {
	      //각 배열의 길이만큼 돌게 변경
	      return alpa[(int) (Math.random() * alpa.length)];
	      //alpa의 배열의 길이만큼 랜덤으로 돌려서  char타입으로 돌려줘라
	   }

	   public static void main(String[] args) {
	      KeyMaker key = new KeyMaker(); 
	      String result = key.makeKey();
	      System.out.println(result);
	   }
	

}
