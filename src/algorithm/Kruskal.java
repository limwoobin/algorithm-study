package algorithm;

import sun.jvm.hotspot.oops.Array;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Vector;
import java.util.stream.Collectors;

// 가장 적은 비용으로 모든 노드를 연결 (사이클이 발생하면 안됨)
public class Kruskal {
    // 부모 노드를 찾는 함수
    int getParent(int parent[] , int x) {
        if(parent[x] == x) return x;
        return parent[x] = getParent(parent , parent[x]);
    }

    // 두 부모 노드를 합치는 함수
    int unionParent(int parent[] , int a , int b) {
        a = getParent(parent , a);
        b = getParent(parent , b);
        if(a < b) {
            return parent[b] = a;
        } else {
            return parent[a] = b;
        }
    }

    // 같은 부모를 가지는지 확인
    int findParent(int parent[] , int a , int b) {
        a = getParent(parent , a);
        b = getParent(parent , b);
        if (a == b) {
            return 1;
        } else {
            return 0;
        }
    }

    // 간선 정보를 갖는 클래스 생성
    static class Edge {
        public int node[] = new int[2];
        public int distance;
        Edge(int a , int b , int distance) {
            this.node[0] = a;
            this.node[1] = b;
            this.distance = distance;
        }

    }

    public static void main(String[] args) {
        Kruskal kruskal = new Kruskal();
    }
}

