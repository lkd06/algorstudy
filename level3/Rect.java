package study.level3;

public class Rect {
	public long solution(int w,int h) {
		long answer =0;
		int a=w,b=h;
		if(a>b) {
			a=h;b=w;
		}
		for(int i=1;i<=a;i++) {
			answer+=b-Math.ceil((double)b*i/a);
		}
		return answer*2;
	}
}
