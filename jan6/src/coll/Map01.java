package coll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

//Map<K, V> : Key 중복 X, Value 중복 가능
public class Map01 {
	public static void main(String[] args) {
		
		//E, T, K, V,
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		//저장put(K, V)
		map.put("홍길동", 12);
		map.put("김길동", 30);
		map.put("이길동", 20);
		map.put("박길동", 10);
		map.put("최길동", 50);
		map.put("홍길동", 100);
		
		System.out.println(map);
		
		Map<String, String> map2 = new HashMap<String, String>();
		
		map2.put("유", "정");
		map2.put("한", "경");
		map2.put("멘", "토");
		
		System.out.println(map2);
		
		//출력 get(K)
		
		System.out.println(map.get("이길동")); // k 꼭 가져오기
		System.out.println(map.get("없는거")); //없다 : null
		
		//있는지 물어보기
		System.out.println(map.containsKey("이길동"));
		System.out.println(map.containsKey("이길동1"));
														//map(Key , Value)
		System.out.println(map.containsValue(100));	//O
		System.out.println(map.containsValue(1000)); //X
		
		
		//지우기 remove(K)
		System.out.println(map.remove("이길동")); //이길동의 키가 사라지고, 밸류가 반환됨
		System.out.println(map); 
		
		System.out.println(map.size());
		
		
		//1. map -> set -> list (힘들다)
		//2. map -> set === iterator (중복허용 하지 않는 속성이 set과 동일)
		
//		Set<String> map2set = new HashSet<String>();
		Set<String> map2set = map.keySet(); //key만 뽑아서 set타입으로 만들어 주는 것
		System.out.println(map2set);
		
		List<String> set2List = new ArrayList<String>(map2set); //map > set > list
		System.out.println(set2List);
		
		for (int i = 0; i < set2List.size(); i++) {
			System.out.print("K : "+ set2List.get(i));
			Integer value = map.get(set2List.get(i));
			System.out.println(", V : " + value);
			
		}
		
		//740p
		
		Set<String> mapList2 = map2.keySet(); //map2의 key를 뽑아서 Set형태로 만들어 준다.
		System.out.println(mapList2);
		
		List<String> setList2 = new ArrayList<String>(mapList2); //set형태의 map2( = mapList2)를 List형태로 바꿔준다
		System.out.println(setList2);
		
		for (int i = 0; i < setList2.size(); i++) { //map2의 key의 배열의 갯수만큼 for문을 돌려준다.
			System.out.println("K : "+ setList2.get(i)); //map2의 key의 값을 출력
			String value2 = map2.get(setList2.get(i)); //map2의 value 값을 출력(size는 동일하므로 해당 포문으로 돌릴 수 있음)
			System.out.println("V : "+ value2);
		}
		
		Iterator<String> it = map.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			System.out.print("K : " + key);
			System.out.println(", V : " + map.get(key));
		}
		
		
	
	}
}
