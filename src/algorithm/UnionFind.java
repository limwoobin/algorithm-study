package algorithm;

public class UnionFind {

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

    public static void main(String[] args) {
        UnionFind unionFind = new UnionFind();
        int parent[] = new int[11];
        for (int i=1; i<=10; i++) {
            parent[i] = i;
        }

        unionFind.unionParent(parent , 1 , 2);
        unionFind.unionParent(parent , 2 , 3);
        unionFind.unionParent(parent , 3 , 4);
        unionFind.unionParent(parent , 5 , 6);
        unionFind.unionParent(parent , 6 , 7);
        unionFind.unionParent(parent , 7 , 8);

        System.out.println("1 과 5 = " + unionFind.findParent(parent , 1 , 5));
    }
}
