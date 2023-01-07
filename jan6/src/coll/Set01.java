package coll;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Set interface
//순서가 없어요. 중복도 없어요
public class Set01 {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		set.add(5);
		set.add(6);
		set.add(7);
		set.add(8);
		set.add(10);
		set.add(5);
		set.add(7);
		set.add(2);
		set.add(10);
		//Set : 중복 허용 안하므로 중복되는건 자동으로 거르고 출력
		
		System.out.println(set);
		System.out.println(set.size());
		System.out.println(set.isEmpty());
		System.out.println(set.remove(10)); //10을 삭제 , index가 없고, 값만 있다?
		System.out.println(set.toArray());

		for(Integer integer : set) {
			System.out.println(integer);
		}
		//인덱스가 없기 때문에 일반 for문은 사용 불가
		System.out.println("=======");
		
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			Integer integer = (Integer) it.next();
			System.out.println(integer);
		}
		
		
		//로또 만들어 주세요.
		
		
		
//		(int) (Math.random() * number.length)
		Set<Integer> lotto = new HashSet<Integer>();

		System.out.println(lotto.size());
		while(lotto.size() < 6) {
			lotto.add( (int) (Math.random() * 45) +1);
		}
		System.out.println(lotto);
		
		
	}

}
