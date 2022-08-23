package students;


import java.util.ArrayList;

public class Students {
    long id;
    String studentName;
    ArrayList<Integer> listOfGrades;

    public Students(long id, String studentName) {
        this.id = id;
        this.studentName = studentName;
        this.listOfGrades = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public ArrayList<Integer> getListOfGrades() {
        return listOfGrades;
    }

    public void setListOfGrades(ArrayList<Integer> listOfGrades) {
        this.listOfGrades = listOfGrades;
    }

    public void addGrade(int grade) {
        listOfGrades.add(grade);
    }

    public double getGradeAverage() {
        double average = 0;
        for (int grade : listOfGrades) {
//           System.out.println( average += grade);
//           grades / grades.size();
            average += grade;
//            average / grades.size();
        }
        return average / listOfGrades.size();
    }
}
