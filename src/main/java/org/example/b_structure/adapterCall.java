package org.example.b_structure;

import org.example.b_structure.adapter.Adapter;
import org.example.b_structure.adapter.Doing;
import org.example.b_structure.adapter.MyFriend;

import java.util.List;

/**
 * 클라이언트 측에서 인터페이스 사용 시, 기존 클래스를 수정하지 않고, 새로운 인터페이스를 사용할 수 있다.
 * 이는 결합도를 줄여 주며, 소스 코드 변경 시, 쉽게 수정할 수 있다는 장점이 있다.
 *
 * 소스코드가 늘어나서 복잡성을 증가시키고 처리 시간에서 처리속도에 대하여 불리함을 가질 수 있다.
 */
public class adapterCall {
    public static void main(String[] args) {
        MyFriend myFriends = new MyFriend();
        Doing HwangJunSun = new Adapter(myFriends);

        List list = HwangJunSun.perform();

        list.stream()
                .forEach(System.out::println);
    }
}
