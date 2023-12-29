package static1;

public class Data3 {
    public String name;
    public static int count; // static

    public Data3(String name) {
        this.name = name;
        count++;
//        Data3.count++; // 이것도 가능. 붕어빵 틀에 접근하는 것이니깐.
    }
}
