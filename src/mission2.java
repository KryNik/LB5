/*import java.util.*;

public class mission2 {
    public static void main(String[] args) {
        System.out.println("Введите размер матрицы:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] matrix = new int[n][n];

        rand(n, matrix);
        output(n, matrix);

        boolean[] vis = new boolean[n];
        System.out.println("Введите вершину:");
        Scanner in1 = new Scanner(System.in);
        int v = in1.nextInt() - 1;

        Queue1 myQueue = new Queue1(n);

        BFS(n, v, vis, matrix, myQueue);
    }

    public static void rand(int n, int[][] matrix) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (int) ((Math.random() * 2) + 0);
                matrix[j][i] = matrix[i][j];

                if (i == j) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void output(int n, int[][] matrix) {
        System.out.println("\nМатрица:\n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void BFS(int n, int v, boolean[] vis, int[][] matrix, Queue1 myQueue){
        vis[v] = true;
        myQueue.insert(v);
        while (!myQueue.isEmpty()){
            int s = myQueue.remove();
            System.out.print(s + 1 + " ");
            for (int i = 0; i < n; i++){
                if (matrix[s][i] == 1 & !vis[i]){
                    vis[i] = true;
                    myQueue.insert(i);
                }
            }
        }
    }
}

class Queue1 {
    private int[] queue;
    private int maxSize;
    private int nElem;
    private int front;
    private int rear;

    public Queue1(int maxSize) {
        this.maxSize = maxSize;
        queue = new int[maxSize];
        rear = -1;
        front = 0;
        nElem = 0;
    }

    public void insert(int elem) {
        if (rear == maxSize - 1) {
            rear = -1;
        }

        queue[++rear] = elem;
        nElem++;
    }

    public int remove() {
        int temp = queue[front++];

        if (front == maxSize) {
            front = 0;
        }
        nElem--;
        return temp;
    }

    public boolean isEmpty() {
        return (nElem == 0);
    }
}*/