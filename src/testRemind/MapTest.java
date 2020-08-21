package testRemind;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MapTest {
	public static void main(String[] args) {
		Map<String,String> map = new Hashtable<>();
		//동기화 할때 쓰는거
		Map<String,String> ctm = new ConcurrentHashMap<>();
		//hashtable보다는 나음, 이거쓰셈
		Map<String,String> hs = new HashMap<>();
		map.put("이름","동동");
		map.put("나이","6");
		System.out.println(map);
	}

}
