package ex10.lamp;

public class RedLamp implements Lamp{
    @Override
    public void lampOn() {
        System.out.println("빨간색 불이 켜졌습니다");
    }
}
