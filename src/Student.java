public class Student {
    private int idNumber;
    private CollegeCourse[] courses = new CollegeCourse[5];

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public CollegeCourse getCourse(int index) {
        return courses[index];
    }

    public void setCourse(CollegeCourse course, int index) {
        this.courses[index] = course;
    }
}
