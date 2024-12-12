/*
 *	Author:  Andre Sookazian
 *  Date: 11/25/24
*/




import java.util.Scanner;

public class SoccerGame  {
    
    public static boolean takeShot(String teamName) { 
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println(teamName + " is shooting a ball."); 
        System.out.print("Put 1 for Goal, 0 for Miss: ");
        
        int shotResult = scanner.nextInt();
        
        if (shotResult == 1) {
            System.out.println(teamName + " just scored a goal..");
            return true;
        } else if (shotResult == 0) {
            System.out.println(teamName + " misses the shot..");
            return false;
        } else { 
            System.out.println("Not valid input! Try it again please.");
            return takeShot(teamName); 
        }
    }
    
    public static int playRound(String teamName) { 
        
        Scanner scanner = new Scanner(System.in); 
        int score = 0;
        
        System.out.println("It is " + teamName + "'s turn to take shots!"); 
        System.out.println("Type in enter to take a shot, or type exit to stop your round.");
        
        while (true) { 
            
            scanner.nextLine(); 
            
            System.out.println("Take a shot now!"); 
            boolean goal = takeShot(teamName); 
            if (goal) {
                score++;
            }
            
            System.out.println("Press Enter to take another shot, or type 'exit' to end your turn.");
            String input = scanner.nextLine(); 
            if (input.equalsIgnoreCase("exit")) { 
                break; 
            }
        }
        
        return score; 
    }
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); 
        
        System.out.print("Enter Team 1 name: "); 
        String team1Name = scanner.nextLine(); 
        
        System.out.print("Enter Team 2 name: ");
        String team2Name = scanner.nextLine();
        
        int team1Score = playRound(team1Name); 
        int team2Score = playRound(team2Name); 
        
        System.out.println("----------------------Match Results-----------");
        System.out.println(team1Name + " scored: " + team1Score + " goals.");
        System.out.println(team2Name + " scored: " + team2Score + " goals.");
        
        if (team1Score > team2Score) { 
            System.out.println(team1Name + " wins! " +  team1Name  + " is the UEFA champs. ");
        } else if (team2Score > team1Score) { 
            System.out.println(team2Name + " wins! " + team2Name + " is the UEFA champs."); 
        } else {
            System.out.println("It is a draw"); 
        }
    }
}