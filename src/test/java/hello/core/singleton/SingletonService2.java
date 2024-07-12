package hello.core.singleton;

public class SingletonService2 {

    //1. static 영역에 객체를 담을 변수 선언
    private static SingletonService2 instance;

    //2. public으로 열어서 객체 인스턴스가 필요하면 이 static 메서드를 통해서만 조회하도록 허용한다.
    // 메서드가 처음 호출될 때 객체를 생성하고 리턴한다. 이때 생성된 객체는 계속 사용된다.
    public static SingletonService2 getInstance() {
        if (instance == null) {
            instance = new SingletonService2();
        }
        return instance;
    }

    //3. 생성자를 private로 선언해서 외부에서 new 키워드를 사용한 객체 생성을 못하게 막는다.
    private SingletonService2() {

    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }


}
