package construct;

public class MethodInitMain1 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        member1.name = "user";
        member1.age = 15;
        member1.grade = 90;

        // shift + F6 해당하는 동일한 문자 변환
        MemberInit member2 = new MemberInit();
        member2.name = "user";
        member2.age = 16;
        member2.grade = 80;

        MemberInit[] members = {member1, member2};
        for (MemberInit s : members) {
            System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" + s.grade);
        }
    }
}
