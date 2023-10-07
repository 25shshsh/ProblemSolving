package a202310;

public class RecursionExample {

    public static int n = 0;

    public static void main(String[] args) {
        System.out.println(recursion(10));
    }

    public static int recursion (int depth){
        if (depth >= 0) { // 종료조건
            n += depth;
            recursion(depth-1);
        }
        return n;
    }


}



