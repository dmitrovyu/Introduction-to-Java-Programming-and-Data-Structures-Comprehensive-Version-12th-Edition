
package Exercise_10_09;

import java.util.Arrays;

/**
 *
 * @author DejanD
 */
public class Course {
    
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName)
    {
        this.courseName = courseName;
    }

    public void addStudent(String student)
    {
        students[numberOfStudents] = student;
        numberOfStudents++;
        if (numberOfStudents > students.length - 10) resizeArrayOfStudents();
    }
    
    //Revised getStudents method returns an array whose length is the 
    //same as the number of students in the course 
    public String[] getStudents()
    {
        String[] newStudents = Arrays.copyOfRange(students, 0, numberOfStudents);
        return newStudents;
    }

    public int getNumberOfStudents()
    {
        return numberOfStudents;
    }

    public String getCourseName()
    {
        return courseName;
    }

    
    //Automatically increase the array size if there is no room to add more students
    private void resizeArrayOfStudents() {
        String[] newArray = new String[students.length + 100];
        newArray = Arrays.copyOfRange(students, 0, students.length);
        this.students = newArray;
    }
    //Impleamentation of drop student method
    public void dropStudent(String student){
        boolean found = false;
        for (int i = 0; i < numberOfStudents; i++){
            if (students[i].equals(student)){
                found = true;
                numberOfStudents--;
            }
            if (found) students[i] = students[i+1];
            
        }
        students[numberOfStudents] = null; // erase the last one
    }
    //Method clear() removes all students from the course
    public void clear() {
        this.students = new String[100];
        this.numberOfStudents = 0;
    }

}
