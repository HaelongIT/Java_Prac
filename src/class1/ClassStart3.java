package class1;

public class ClassStart3 {
    public static void main(String[] args) {
        Student student1;
        student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        // 1. Student 자료형을 담을 수 있는 참조변수 만들기
        // 2. Student 인스턴스를 새로 메모리에 하나 만들어서 참조변수와 연결
        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println("이름 : " + student1.name + ", 나이 : " + student1.age
                + ", 성적 : " + student1.grade);

        System.out.println("이름 : " + student2.name + ", 나이 : " + student2.age
                + ", 성적 : " + student2.grade);
    }
}
