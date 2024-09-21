
package Exercise_08_03;

/**
 *(Sort students on grades) Rewrite Listing 8.2, GradeExam.java, to display the 
 * students in increasing order of the number of correct answers.
 * @author DEJAN
 */
public class Exercise_08_03 {
    public static void main(String[] args)
    {
        // Students' answers to the questions
        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

        // Key to the questions
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        //Students grade
        int[] studentsGrade = new int[8];
        // Grade all answers
        for (int i = 0; i < answers.length; i++)
        {
            // Grade one student
            int correctCount = 0;
            for (int j = 0; j < answers[i].length; j++)
            {
                if (answers[i][j] == keys[j])
                    correctCount++;
            }

            studentsGrade[i] = correctCount;
        }
        for (int i =0; i <studentsGrade.length; i++){
            findMin(studentsGrade);
        }
    }
    public static void findMin(int studentsGrade[]){
        int min = 11;
        int index = 0;
        for (int i = 0; i < studentsGrade.length; i++){
            if (studentsGrade[i] < min) {
                min = studentsGrade[i];
                index = i;
            }
        }
        System.out.println("Student " + index+ "'s correct count is " + studentsGrade[index]);
        studentsGrade[index] = 11;
    }
}
