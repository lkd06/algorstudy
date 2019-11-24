package study.level3;

import java.util.Comparator;
import java.util.PriorityQueue;

public class TwoQueue {
	public int[] solution(String[] operations) {
        int[] answer = new int[2];
        PriorityQueue<Integer> maxQ = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> minQ = new PriorityQueue<>();
        for(int i=0;i<operations.length;i++) {
        	String sp[]=operations[i].split(" ");
        	if(sp[0].equals("I")) {
        		int value=Integer.parseInt(sp[1]);
        		maxQ.add(value);
        		minQ.add(value);
        	}else {
        		if(sp[1].equals("1")) {
        			//최대값 제거
        			if(maxQ.size()>0)
        			maxQ.poll();
        		}else {
        			//최소값제거
        			if(minQ.size()>0)
        			minQ.poll();
        		}
        	}
        }
        if(maxQ.size()==0 || minQ.size()==0) {
        	answer[0]=0;
        	answer[1]=0;
        }else {
        	int max=maxQ.poll();
        	int min=minQ.poll();
        	
        }
        return answer;
    }
}
