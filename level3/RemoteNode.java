package study.level3;

import java.util.*;


public class RemoteNode {
	
	public int solution(int n, int[][] edge) {
		int answer=0;
		Map<Integer, List<Integer>> hm = new HashMap<>();
		int node[]=new int[n];
		List<Integer> list;
		for(int i=0;i<edge.length;i++) {
			int x=edge[i][0]-1,y=edge[i][1]-1;
			if(!hm.containsKey(x)) {
				list = new ArrayList<>();
				list.add(y);
				hm.put(x, list);
			}else {
				list = hm.get(x);
				list.add(y);
				hm.put(x, list);
			}
			
			if(!hm.containsKey(y)) {
				list = new ArrayList<>();
				list.add(x);
				hm.put(y, list);
			}else {
				list = hm.get(y);
				list.add(x);
				hm.put(y, list);
			}
		}
		
		node[0]=-1;
		int where=1;
		list = hm.get(0);
		Queue<Integer> q = new LinkedList<>();
		for(int i=0;i<list.size();i++) {
			q.add(list.get(i));
			node[list.get(i)]=1;
		}
		while(!q.isEmpty()) {
			int x = q.poll();
			List<Integer> l = hm.get(x);
			for(int i=0;i<l.size();i++) {
				if(node[l.get(i)]==0) {
					node[l.get(i)]=node[x]+1;
					q.add(l.get(i));
				}
			}
		}
        return answer;
    }
}
