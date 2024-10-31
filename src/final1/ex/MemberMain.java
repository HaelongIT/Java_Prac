package final1.ex;

public class MemberMain {
    public static void main(String[] args) {
        Member member = new Member("myId", "kim");
        member.printData();
        member.changeData("myId2", "seo");
        member.printData();
    }
}
