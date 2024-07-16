package enumeration.test.ex1;

public class AuthGradeMain1 {
    public static void main(String[] args) {

        AuthGrade[] grades = AuthGrade.values();

        for(AuthGrade grade : grades) {
            printDiscount(grade);
        }
    }

    private static void printDiscount(AuthGrade grade) {
        System.out.println("name = " + grade.name() + ", level = " + grade.getLevel() + ", description = " + grade.getDescription());
    }
}
