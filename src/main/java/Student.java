/** 
 * A class about a student
 * @author Eric Wang
 * @version uh idk
*/

public class Student {
    private String name;
    private int age;
    private String studentNumber;

    /**
     * Construct student
     * @param name String, name of student
     * @param age  int, age of student
     * @param studentNumber String, student number of student
     */
    public Student (String name, int age, String studentNumber) {
        this.name = name;
        this.age = age;
        this.studentNumber = studentNumber;
    }
    /**
     * gets name of student
     * @return returns name of student
     */
    public String getName () {
        return name;
    }
    /**
     * gets age of student
     * @return returns age of student
     */
    public int getAge () {
        return age;
    }
    /**
     * gets student number of student
     * @return returns student number of student
     */
    public String getStudentNumber () {
        return studentNumber;
    }

    /**
     * converts student object to string
     * @return returns in format "name, age - studentNumber"
     */
    @Override
    public String toString () {
        return name + ", " + age + " - " + studentNumber;
    }

    /**
     * compares two students
     * returns false if object isn't a student
     * @return returns true if the student numbers are equal, otherwise false
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this.getClass()!=obj.getClass()) {
            return false;
        }
        Student a = (Student)obj;
        return studentNumber.equals(a.getStudentNumber());
    }


}