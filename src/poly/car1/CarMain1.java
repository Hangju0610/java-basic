package poly.car1;

/**
 * 다형성을 활용한 런타임 변경
 * 런타임 : Application 실행 도중에 변경 가능
 *
 * Car를 운전하는 코드는? Driver
 * Driver 코드는 전혀 변경하지 않는다.
 * 기능을 확장해도 main()을 제외한 프로그램의 핵심 부분의 코드는 전혀 수정하지 않아도 된다.
 */
public class CarMain1 {
    public static void main(String[] args) {
        Driver driver = new Driver();

        //차량 선택(k3)
        Car k3Car = new K3Car();
        driver.setCar(k3Car);
        driver.drive();

        //차량 변경(k3 -> model3)
        Car model3Car = new Model3Car();
        driver.setCar(model3Car);
        driver.drive();

        // 차량 변경(model3 -> avante)
        Car avanteCar = new AvanteCar();
        driver.setCar(avanteCar);
        driver.drive();
    }
}
