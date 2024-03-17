package 속성;

public class 투포인터문자열조작 {

    public static void main(String[] args) {
        String str = "HelloWorld";

        char[] arr = str.toCharArray();
        int ptr1 = 0;
        int ptr2 = arr.length-1;
        char temp;

        while(ptr1 < ptr2) {
            temp = arr[ptr1];
            arr[ptr1] = arr[ptr2];
            arr[ptr2] = temp;

            ptr1++;
            ptr2--;
        }

        System.out.println(new String(arr));
    }

}
