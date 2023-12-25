package org.example.c_behavior.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Observer Pattern 예제 구현.
 * 객체 간에 일대다 종속성을 정의하는 행위패턴이다. 어떠한 객체의 상태가 변하면,
 * 그 객체에 의존하는 다른 객체들이 변화를 통지 받으며, 자동으로 업데이트 되도록 한다.
 *
 * 이는 느슨한 결합으로 독립적으로 확장이 가능하며 재사용성이 높다. 하지만 객체 상태가 변경 될 때마다 모든 옵저버한테 알려야 하는 상황이 있는 경우는
 * 성능에 영향을 미치는 경우가 있다.
 *
 * 실제 사용 가능한 서비스
 * @구독서비스 : 구독되어 있는 사람들 에게만 통지 하는 형태.
 * @채팅앱
 * @알람시스템
 * @DB 데이터 변경 감지
 */
public class BoxingGym implements Member{
    List<Says> saysList = new ArrayList<>();

    public void registerBoxing(Says says) {
        saysList.add(says);
        System.out.println(says + " 복싱짐 등록 완료");
    }

    public void removeBoxing(Says says) {
        saysList.remove(says);
        System.out.println(says + " 복싱짐 등록 취소");
    }

    public void notifyMessage() {
        for(Says says : saysList) {
            says.say();
        }
    }

}
