package testRemind;

import java.util.ArrayList;
import java.util.List;

public class 실행 {
	public void 일반적인_생활(List<사람> 사람들) {
		for (사람 s : 사람들) {
			s.걷다();
			s.먹다();
			s.자다();
			if(s instanceof 인혁) {
				인혁 인 = (인혁) s;
				인. 요리하다();
			}
			if(s instanceof 동진) {
				동진 동 = (동진) s;
				동. 속기하다();
			}
		}
	}

	public static void main(String[] args) {
		동진 dong = new 동진("동진", 22);
		인혁 in = new 인혁("인혁", 244);
		List<사람> 사람들 = new ArrayList<>();
		사람들.add(dong);
		사람들.add(in);
		System.out.println(사람들);

	}

}
