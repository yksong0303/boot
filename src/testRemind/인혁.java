package testRemind;

public class 인혁 extends 사람 {
	public 인혁() {
		this("인혁", 33);
	}

	public 인혁(String 이름, int 나이) {
		super(이름, 나이);
	}
	
	public void 요리하다() {
		System.out.println(이름 + "이 요리합니다.");
	}
}
