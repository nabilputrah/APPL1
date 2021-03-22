package tugas4w2;

/**
 *
 * @author nabil
 */
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
public class CopyingAFile {
    public static void main(String[] args) {
        String keepLooking = "y";
        Scanner scan = new Scanner(System.in);
        while (keepLooking.equals("y") || keepLooking.equals("Y")){
            System.out.println("Enter the name of the file (must include with '.txt' : ");
        try {
            String fileName = new Scanner(System.in).nextLine();
            File fileLoc = new File("C:\\Users\\nabil\\Documents\\GitHub\\APPL1\\W2\\Tugas4W2\\src\\tugas4w2\\" + fileName);   
            Scanner hasil = new Scanner(fileLoc); 
            while (hasil.hasNextLine()) {
                    System.out.println(hasil.nextLine());
            }
            break;
        }catch (FileNotFoundException e){
            System.out.print("File Does not exist\n");

        }
        System.out.print("Wanna keep looking? (y/n) ");
        keepLooking = scan.next();
        }
    }
    
}
