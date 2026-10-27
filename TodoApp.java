import java.util.*;
import java.time.LocalDate;

public class TodoApp {
    static Scanner sc = new Scanner(System.in);
    static List<String> tasks = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("=== My Java To-Do App | " + LocalDate.now() + " ===");
        
        while(true){
            System.out.println("\n1.Add Task 2.View Tasks 3.Delete Task 4.Exit");
            System.out.print("Choose: ");
            int ch = sc.nextInt();
            sc.nextLine(); // Important fix for Scanner bug
            
            if(ch==1){
                System.out.print("Enter Task: ");
                String t = sc.nextLine();
                tasks.add(t);
                System.out.println("Added!");
            } 
            else if(ch==2){
                if(tasks.isEmpty()){
                    System.out.println("No tasks yet!");
                } else {
                    System.out.println("Your Tasks:");
                    for(int i=0; i<tasks.size(); i++){
                        System.out.println((i+1)+". "+tasks.get(i));
                    }
                }
            } 
            else if(ch==3){
                System.out.print("Task number to delete: ");
                int n = sc.nextInt();
                sc.nextLine();
                if(n>0 && n<=tasks.size()){
                    tasks.remove(n-1);
                    System.out.println("Deleted!");
                }
            } 
            else if(ch==4){
                System.out.println("Bye!");
                break;
            }
        }
    }
}
