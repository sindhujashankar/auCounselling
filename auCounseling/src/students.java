import java.util.Scanner;

 public class students {
     colleges colleges=new colleges();
     public  static void main(String[] args) {

         int i, noOfStudent, regNo, physicsMark, chemistryMark, mathsMark, j, temp;
         System.out.print("Enter the no of student: ");
         Scanner input = new Scanner(System.in);
         noOfStudent = input.nextInt();

         int[] cutOff;
         cutOff = new int[noOfStudent];


         for (i = 0; i < noOfStudent; i++) {
             System.out.print("Enter students reg number:");

             regNo = input.nextInt();

             System.out.println(regNo);


             System.out.println("Marks");
             System.out.print("Enter physics marks: ");
             physicsMark = input.nextInt();
             System.out.println("Physics Mark: " + physicsMark);
             System.out.print("Enter chemistry marks: ");
             chemistryMark = input.nextInt();
             System.out.println("Chemistry Mark: " + chemistryMark);
             System.out.print("Enter maths marks: ");
             mathsMark = input.nextInt();
             System.out.println("Maths Mark: " + mathsMark);
             int cOff = (physicsMark / 4) + (chemistryMark / 4) + (mathsMark / 2);
             cutOff[i ] = cOff;
             System.out.println("Student CutOff: " + cOff);
             System.out.println("\n");

         }
         for (i = 0; i < noOfStudent; i++) {
             for (j = i + 1; j < noOfStudent; j++) {
                 if (cutOff[i] < cutOff[j]) {
                     temp = cutOff[i];
                     cutOff[i] = cutOff[j];
                     cutOff[j] = temp;
                 }
             }
             System.out.println("Cutoff: " + cutOff[i]);
         }
     }
    }


