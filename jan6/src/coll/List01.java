package coll;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//List : 순서가 있어요. 중복 허용합니다.
//Set : 순서가 없어요. 중복 허용 안해요.
//Map : 순사가 없어요. 중복 허용 안해요.
//		<Key , Value>형태로 저장해요.
//		Key : 중복하면 안되요 ( =Set)

public class List01 {
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		//add(E) : 뒤에 붙어요
		//add(index, E) : 해당 index에 끼어들어가요
		//list.add(0, 150);
		list.add(150); //위와 동일한데, 어차피 첫값은 0번이라 안써도 되는 것임
		System.out.println(list.size()); //길이
		
		//remove(index); //index를 0으로 만들겠다는 의미, 지우겠다.
		//clear(); // 초기화의 의미?
		
		//set(index, E); // 교체. 새로운 인덱스 값으로 바꿔버리겠다.
		//indexOf : 해당 list에 150이라는 값이 있는가? = 있다면 0 출력, 없다면 -1이 출력된다.
		//int count = 0 이 됨
		int count = list.indexOf(150); //E(요소)가 있는 index, 해당 인덱스를 인트값으로
		System.out.println(count);
		//해당 값이 있는지??
		//contains : 해당 타입의 열 안에 ()안의 문자 혹은 숫자가 있는지 확인하여, true,false로 출력됨
		System.out.println( list.contains(150) );
		System.out.println( list.contains(50) );
		
		//0번지에 있는 값을 줍니다. : 현재 0번에 있는 값은 150
		Integer value = list.get(0);
		System.out.println(value);
		
		//비어있어?
		list.isEmpty();
		System.out.println( list.isEmpty() );
		
		//[150, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		for(int i = 1; i < 11 ; i++) {
			list.add(i);
		}
		System.out.println(list);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("---------------");
		
		//iterator : 계속 출력시켜줄 요소가 존재해? : 위와 동일한 동작을 함
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

		
		//객체.hasNext() 뽑아줄 내용이 있는지 질문
		//해당 이터레이션(iteration)이 다음요소를 가지고 있으면
		//true를 반환하고, 다음 요소를 가지고 있지 않으면 false
		
		//객체.next() 출력 : 다음 요소를 반환
		
		
			List<String> key = new ArrayList<String>();
			key.add("123-456-789");
			key.add("111-222-333");
			key.add("444-555-666");
			
			System.out.println(key);
			//[123-456-789 , 111-222-333, 444-555-666]
			
		
	}

}
