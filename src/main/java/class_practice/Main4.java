package class_practice;


class Main4 {
    public static void main(String[] args) {
        StudentMethod student1 = new StudentMethod();
        student1.setName("Mia");
        student1.setMathScore(5.0);
        student1.setAlgebraScore(5.0);
        student1.setSciScore(5.2);
        StudentMethod student2 = new StudentMethod();
        student2.setName("Maureen");
        student2.setMathScore(3.9);
        student2.setAlgebraScore(5.0);
        student2.setSciScore(7.8);


        int numberOfStudents1 = student1.getNumberOfStudents();
        System.out.println(numberOfStudents1);

        int numberOfStudents2 = student2.getNumberOfStudents();
        System.out.println(numberOfStudents2);

        double totalScore = student1.getMathScore() + student1.getSciScore() + student1.getAlgebraScore();
        double averageScore = totalScore / 2;

        System.out.println("name = " + student1.getName() + "average score = " + averageScore);

    }
}

