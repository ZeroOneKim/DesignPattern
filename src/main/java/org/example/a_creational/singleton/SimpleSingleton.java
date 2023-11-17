package org.example.a_creational.singleton;

/**
 * 싱글톤으로 가장 간단하게 만들 수 있는 방법이다.
 * private 생성자 만을 정의하여 외부 클래스로부터 인스턴스 생성을 차단하는 방식이다.
 *
 * --- 예시 상황을 만들었다. ---
 * SMTP 무료로 제공하는 서비스를 제공받았으며, 그 서비스를 이용하기 위한 소스를 싱글톤으로 작성해본다.
 */
public class SimpleSingleton {
    private String port;
    private String emailId;
    private String passwordSMTP;

    private static final SimpleSingleton ob = new SimpleSingleton();

    private SimpleSingleton() {
        this.port = "1234"; //SMTP 포트
        this.emailId = "what@Example.yikim.com";
        this.passwordSMTP = "A1QrEgS3413WaE";
    }

    public static SimpleSingleton getOb() {
        return ob;
    }

    public String getPort() {
        return this.port;
    }
    public String getEmailId() {
        return this.emailId;
    }
    public String getPasswordSMTP() {
        return this.passwordSMTP;
    }
}
