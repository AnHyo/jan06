package coll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


//List + Map
public class List02 {
	public static void main(String[] args) {
		//외부
		List<Map<String, Object>> board = new ArrayList<Map<String, Object>>();
		//실제 데이터를 저장해보겠습니다.
		Map<String, Object> ele = new HashMap<String, Object>();
		//data
		ele.put("no", 5);
		ele.put("title", "제목입니다.");
		ele.put("writer", "poseidon");
		ele.put("data", "2023-01-05");
		
		board.add(ele); //리스트에 붙이기
		
		ele = new HashMap<>(); //같은 이름의 새로운 객체
		ele.put("no", 6);
		ele.put("title", "집에가고 싶어요");
		ele.put("writer", "가나다라마법사");
		ele.put("data", "2023-01-06");
		board.add(ele);//리스트에 붙이기
		
		ele = new HashMap<>(); //같은 이름의 새로운 객체
		ele.put("no", 7);
		ele.put("title", "숙제는 없어요.");
		ele.put("writer", "지나가는");
		ele.put("data", "2023-01-07");
		board.add(ele);//리스트에 붙이기
		
		System.out.println(board); 
		//[{no=5, data=2023-01-05, writer=poseidon, title=제목입니다.}, {no=6, data=2023-01-06, writer=가나다라마법사, title=집에가고 싶어요}, {no=7, data=2023-01-07, writer=지나가는, title=숙제는 없어요.}]
		//[] : List , {} : Map
		
		System.out.println("번호 \t 제목 \t\t 글쓴이 \t 날짜");
		System.out.println("---------------------------------------");
		for (int i = 0; i < board.size(); i++) {
			System.out.print(board.get(i).get("no")+"\t"); 
			System.out.print(board.get(i).get("title")+"\t"); //board.get(i) : Map
			System.out.print(board.get(i).get("writer")+"\t");
			System.out.print(board.get(i).get("data")+"\n"); // \n : 줄바꿈
			
			
		//List랑 Map 중요!
			
		}
	}
}
