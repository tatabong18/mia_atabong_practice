package class_practice;

public class StudentMethod {

    private String name;
    private double mathScore;
    private double sciScore;

    private double AlgebraScore;

    private static int numberOfStudents;

    public StudentMethod() {
        numberOfStudents++;
    }

    public double getMathScore() {
        return mathScore;
    }

    public void setMathScore(double mathScore) {
        this.mathScore = mathScore;
    }

    public double getSciScore() {
        return sciScore;
    }

    public void setSciScore(double sciScore) {
        this.sciScore = sciScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public double getAlgebraScore() {
        return AlgebraScore;
    }

    public void setAlgebraScore(double algebraScore) {
        this.AlgebraScore = algebraScore;
    }
}



