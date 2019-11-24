package study.level2;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Hot {
	public int solution(int[] scoville, int K) {
		int answer = 0;  
        PriorityQueue<Integer> proQ = new PriorityQueue<>();
        for(int i=0;i<scoville.length;i++) {
        	proQ.add(scoville[i]);
        }
        int first=0,second=0;
        
        while(true) {
        	first = proQ.poll();
        	if(proQ.size()==0 && first<K) {
        		return -1;
        	}
        	if(first>=K) {
        		return answer;
        	}
        	answer++;
        	
        	second = proQ.poll();
        	proQ.add(first+second*2);
        }
    }
}
