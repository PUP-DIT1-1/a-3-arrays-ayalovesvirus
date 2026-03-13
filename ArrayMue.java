//Aaliyah Rotairo ALiluran
//Computer Programming 2 DIT 1-1
//Mrs. Greta 
import java.util.Scanner;
public class ArrayMue {

    public static void main(String[] args) {

        String[][] sn = {
            {"Aaliyah", "Margarette", "Chester", "Mark Joseph", "Ashley", "Kiel", "Kim Benedick", "Enzo Elijah", "Paola", "John Carlo"},
            {"Aliluan", "Mistica", "Pacana", "Alvarez", "Basila", "Talotalo", "Lauron", "Esteban", "Leyco", "Artillagas"}
        };

        int[] grades = {90,93,94,88,89,91,87,95,86,97};

        double sum = 0;

        System.out.println("Student Records:");
        for(int i = 0; i < 10; i++){
            System.out.println(sn[0][i] + " " + sn[1][i] + " - " + grades[i]);
            sum += grades[i];
        }
       
        double avg = sum / grades.length;
        System.out.println("\nAverage Grade: " + avg);  
        
        for(int i = 0; i < grades.length-1; i++){
            for(int j = 0; j < grades.length-i-1; j++){

                if(grades[j] > grades[j+1]){

                    int tempGrade = grades[j];
                    grades[j] = grades[j+1];
                    grades[j+1] = tempGrade;

                    String tempFirst = sn[0][j];
                    sn[0][j] = sn[0][j+1];
                    sn[0][j+1] = tempFirst;

                    String tempLast = sn[1][j];
                    sn[1][j] = sn[1][j+1];
                    sn[1][j+1] = tempLast;
                }
            }
        }

  
        System.out.println("\nSorted Grades (^Ascending^):");
        for(int i = 0; i < 10; i++){
            System.out.println(sn[0][i] + " " + sn[1][i] + " - " + grades[i]);
        }

        Scanner input = new Scanner(System.in);

        System.out.print("\nEnter first name of the Student to search: ");
        String search = input.nextLine();

        boolean found = false;

        for(int i = 0; i < 10; i++){
            if(sn[0][i].equalsIgnoreCase(search)){
                System.out.println("Student Found: " + sn[0][i] + " " + sn[1][i] + " - " + grades[i]);
                found = true;
                break;
            }
        }

        if(!found){
            System.out.println("Student not found!");
        }

    }
}