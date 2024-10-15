package array;

public class ArrayRef3 {
    public static void main(String[] args) {
        // int[] student;
        // student = new int[] {90, 80, 70, 60, 50};

        // int[] student = new int[] {90, 80, 70, 60, 50};

        int[] student = {90, 80 ,70, 65, 50};

        for (int i = 0; i < student.length; i++) {
            System.out.println("학생" + i + "의 점수는 : " + student[i]);
        }
    }
}
