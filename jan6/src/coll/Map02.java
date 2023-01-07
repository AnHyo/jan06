package coll;

//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
import java.util.*; //(모든것이 아니라)필요한 유틸만 (자동으로)가져온다.

/*
 * List : 중복 허용하고, 순서가 있음.
 * Set : 중복 허용 안하고, 순서도 없음.
 * Map : key-value로 저장하고, key는 순서 / 중복이 없음
 * 
 */



//map (p746)
public class Map02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디를 입력하세요.");
		String id = sc.nextLine();
		System.out.println("입력하신 ID는 " + id);
		
		//poseidon, 01234567
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("poseidon", "01234567");
		map.put("test", "test");
		map.put("test01", "test0101");
		
		Scanner sc2 = new Scanner(System.in);
		
		while(true) {
			System.out.println("아이디와 비밀번호를 입력해주세요.");
			System.out.print("아이디 : ");
			String id1 = sc2.nextLine();
			
			System.out.println("비밀번호 :");
			String pw = sc2.nextLine();
			
			if(map.containsKey(id1)) { //map에 ()안의 key값이 있어?
				if(map.get(id1).equals(pw)) { //사용자가 입력한 pW와 동일해?
					System.out.println("로그인 되었습니다.");
					break;
				}
				else {//사용자가 입력한 pw값이 동일하지 않을경우
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
			}
			else { //map의 ()안에 key값이 없을 경우
				System.out.println("입력하신 아이디가 존재하지 않습니다.");
			}
			
		//	System.out.println("입력하신 아이디는 " + id1);
		//	System.out.print("암호는 : " + pw);
		//	break; //while문 탈출해!
			
		}//while
		sc2.close();
		
				
		
	}
}
