package array;

public class ArrayRef1 {
    public static void main(String[] args) {
        int[] students;
        students = new int[5];

        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        System.out.println("학생들 점수 차례로 공개 : " + students[0] + students[1] +
                students[2]+ students[3] + students[4]);

        // 참조값(배열의 주소값) 출력해보기
        System.out.println(students);
    }
}
