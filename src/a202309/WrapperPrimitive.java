package a202309;

import java.util.HashMap;
import java.util.Map;

public class WrapperPrimitive {

    public static void main(String[] args) {

        // 1. 박싱 언박싱
        int primitive = 10;
        int primitive2 = 0;

        Integer wrapper = primitive; // Boxing : 기본타입(Primitive type) >> 래퍼 클래스(Wrapper)
        primitive2 = wrapper; // UnBoxing : 래퍼 클래스(Wrapper) >> 기본타입(Primitive type)

        System.out.println(primitive + " " + wrapper + " " + primitive2); // 10 10 10


        // 2. 용도
        Map<String, Integer> map = new HashMap<>(); // wrapper클래스는 제너릭 타입에 이용
        Integer integer = null; // 값을 담는 객체이기 때문에 null도 들어올 수 있음

        // 래퍼타입'끼리'의 값은 참조타입과 마찬가지로 equals로 비교.
        // 왜? ==는 값이 같은 주소를 가르키는지 비교하지만,
        // 객체는 내부 값은 같아도 주소가 다르기 때문에 내부 값을 비교하는 equals로 비교해야함
        System.out.println(wrapper.equals(integer));
        
        // 3. 결론
        // 객체를 생성해야하는 경우나 null값을 사용해야하는 경우, 값을 감싸 숨기고 있어야 하는 경우, 제너릭 타입에 명시해야하는 경우 사용

    }
}
