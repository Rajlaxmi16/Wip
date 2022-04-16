import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FileHandeling {

	public static void main(String[] args) {
		
		System.out.println("\t----------------------------------\n");
        System.out.println("\t Welcome to The File Handeling \n");
        System.out.println("\t----------------------------------");
        optionsSelection();

	}
	public static void optionsSelection() {
        String[] arr = {"1.Sort files in ascending order",
                "2.Add a file to the existing directory list",
                "3.Delete a file from the existing directory list",
                "4.Search a file",
                "5.Navigate back",
                "6.Close the application"
        };
        File fileDir = new File("F:\\Wip\\Proj1");
		if(fileDir.isDirectory()){
			List<String> listFile = Arrays.asList(fileDir.list());
			System.out.println("----------------------------------");
			System.out.println("Listing files unsorted");
			for(String s:listFile){
				System.out.println(s);
		}
		System.out.println("----------------------------------");
        int[] arr1 = {1,2,3,4,5,6};
        int  slen = arr1.length;
        for(int i=0; i<slen;i++){
            System.out.println(arr[i]);
        }
        
        
        System.out.println("\nEnter your choice:\t");
        Scanner sc = new Scanner(System.in);
        int  options =  sc.nextInt();
        for(int j=1;j<=slen;j++){
            if(options==j){
                switch (options){
                    case 1:
                        System.out.println("Sorted Files in ascending order:\n");
                        Collections.sort(listFile);
            			for(String s:listFile){
            				System.out.println(s);
            			}
                        optionsSelection();
                        break;
                    case 2:
                        System.out.println("Enter the name of file to be added: \n");
                        String name = sc.next();
                        Add(name);
                        optionsSelection();

                        break;
                    case 3:
                        System.out.println("Enter the name of file to be deleted:\n");
                        String name1 = sc.next();
                        Delete(name1); 
                        optionsSelection();
                        break;
                    case 4:
                    	System.out.println("Enter the name of file to be searched:\n");
                    	String name2 = sc.next();
                        Search(name2); 
                        optionsSelection();
                        break;
                    case 5:
                        optionsSelection();
                        break;
                    case 6:
                        closeApp();
                        break;
                    default:
                        System.out.println("You have made an invalid choice!");
                        break;
                }
            }
        }

    }

	}
	public static void Add(String s) {
		File f = new File("F:\\\\Wip\\\\Proj1\\"+s);
		if(f.exists()){
			System.out.println("File already exists");
		}
		else{
			try {
				f.createNewFile();
				System.out.println("File "+f.getPath()+" was created");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void Delete(String s) {
		
		 File file= new File("F:\\\\Wip\\\\Proj1\\"+s);

		 if (file.delete()) {
         System.out.println("File deleted successfully");
		 }
		 else {
         System.out.println("Failed to delete the file");
		 }
		
	}
	
	public static void Search(String s) {
		File f = new File("F:\\\\Wip\\\\Proj1\\"+s);
	    if (s.equalsIgnoreCase(f.getName())) {
	    	System.out.println("File found");
	    }	  
	    else {
	    	System.out.println("File not found");
	    }
	}
	public static void closeApp() {
        System.out.println("Closing your application... \nThank you!");
    }
	
}	