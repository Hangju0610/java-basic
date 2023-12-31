package final1;

// final 필드 - 생성자 초기화
public class ConstructInit {
    final int value;

    // 생성자를 통해 딱 한번만 값을 받을 수 있다.
    public ConstructInit(int value) {
        this.value = value;
    }
}
