package algorithm;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 가장 적은 비용으로 모든 노드를 연결 (사이클이 발생하면 안됨)


class A implements Comparable<A> {
    int s;
    int e;
    int v;
    public A(int s , int e , int v) {
        super();
        this.s = s;
        this.e = e;
        this.v = v;
    }

    @Override
    public int compareTo(A o) { // min heap 을 만들기 위한 우선순위 큐용 Comparable 메서드
        return o.v >= this.v ? -1 : 1;
    }
}

public class Kruskal {
    static int N; // 정점의 개수
    static int E; // 간선의 개수
    static PriorityQueue<A> pq; // 간선 값을 Min Heap 으로 하는 우선순위 큐
    static int[] parent;    // union find 에 필요한 부모 노드를 저장하는 배열
    static boolean[] visit; // 방문 여부 배열
    static int result; // 결과 값 저장

    public static int find(int a) {
        if (a == parent[a]) return a; // 초기화된 상태(정점이 처음 등장) 이면 자기 자신이 부모
        parent[a] = find(parent[a]); // find 할때마다 부모는 최상위 부모로 설정 (재귀로 구현)
        return parent[a];
    }

    public static void union(int a , int b) {
        int aRoot = find(a);
        int bRoot = find(b);
        if(aRoot != bRoot) {
            parent[aRoot] = b;
        } else {
            return;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        N = Integer.valueOf(br.readLine()); // 노드의 개수
        E = Integer.valueOf(br.readLine()); // 간선의 개수

        parent = new int[N+1]; // Disjoint-set
        visit = new boolean[N+1];
        result = 0;

        pq = new PriorityQueue<A>();
        String[] tempStr;
        for(int i=0; i<E; i++) {
            tempStr = br.readLine().split(" ");
            pq.add(new A(Integer.valueOf(tempStr[0]) , Integer.valueOf(tempStr[1]) , Integer.valueOf(tempStr[2])));
        } // 모든 간선에 대해 [시작 , 끝 , 비용] 을 가진 클래스로 우선순위 큐에 add

        for(int i=1; i<=N; i++) {
            parent[i] = i;
        } // union-find 의 초기화는 일단 자기 자신의 부모노드가 자기 자신으로 설정

        for(int i=0; i<E; i++) { // 모든 간선에 대해 확인
            A oneNode = pq.poll(); // 현재 큐에 있는 모든 인스턴스중 비용이 가장 적은 간선이 poll 된다.
            int start = oneNode.s;
            int end = oneNode.e;
            int a = find(start);  // 만약 이 간선을 선택해서 연결한다 했을때 사이클이 생기면 안되므로
            int b = find(end);  // 양쪽의 루트노드가 무엇인지 확인하고
            if (a == b) continue; // 만약 같으면 선택하지 않고 넘어간다.

            union(start , end);
            result += oneNode.v;
        }
        System.out.println(result);
    }
}

