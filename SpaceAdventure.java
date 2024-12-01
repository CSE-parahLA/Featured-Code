import java.util.Scanner;

public class SpaceAdventure {
//Parah Lillian Anderson
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        // Welcome message
        System.out.println("Welcome to the 'Space Adventure' game!");
        System.out.println("You are a space explorer who has just landed on an uncharted planet.");
        System.out.println("Are you ready to explore? (yes/no)");

        String start = key.nextLine();
        //first decision
        if (start.equals("yes")) {
            System.out.println("You step out of your spaceship and see two paths: one leading to a strange alien city and the other to a dense alien jungle.");
            System.out.println("Do you want to go to the city or the jungle? (city/jungle)");

            String firstChoice = key.nextLine();
            
            //second decision
            if (firstChoice.equals("city"))
            {
            	 cityPath(key);
            } 
            else if (firstChoice.equals("jungle")) 
            {
                junglePath(key);
            } 
            else 
            {
                System.out.println("Invalid choice. Your adventure ends before it even begins.");
            }
        } 
        else 
        {
            System.out.println("Maybe next time!");
        }

       
    }
    	//controls the city path
    public static void cityPath(Scanner key) 
    {
        System.out.println("You enter the alien city and are greeted by a mysterious figure.");
        System.out.println("The figure asks if you seek knowledge or power. (knowledge/power)");
        
        //creating decisions inside of the city path
        
        String secondChoice = key.nextLine();

        if (secondChoice.equals("knowledge")) 
        {
            System.out.println("The figure leads you to a grand library filled with ancient alien texts.");
            System.out.println("Do you want to study the texts or leave the city? (study/leave)");

            String thirdChoice = key.nextLine();

            if (thirdChoice.equals("study"))
            {
                System.out.println("You gain vast knowledge of the universe, but at the cost of never being able to leave the planet.");
                System.out.println("You become the guardian of the knowledge. Game over.");
            } 
            else if (thirdChoice.equals("leave")) 
            {
                System.out.println("You leave the city and head back to your ship, wiser but free. You win!");
            } 
            else 
            {
                System.out.println("Invalid choice. You are lost in the city forever. Game over.");
            }

        } 
        else if (secondChoice.equals("power")) 
        {
            System.out.println("The figure hands you a strange alien weapon.");
            System.out.println("Do you accept the weapon or refuse it? (accept/refuse)");

            String thirdChoice = key.nextLine();

            if (thirdChoice.equals("accept")) 
            {
                System.out.println("You wield the weapon and become the ruler of the alien city.");
                System.out.println("But power comes at a price, and soon the citizens rebel. Game over.");
            } 
            else if (thirdChoice.equals("refuse")) 
            {
                System.out.println("You refuse the weapon and leave the city peacefully. You win!");
            } 
            else 
            {
                System.out.println("Invalid choice. The city authorities imprison you. Game over.");
            }
        } 
        else 
        {
            System.out.println("Invalid choice. The city guards capture you. Game over.");
        }
    }
    		//controls the jungle path
    public static void junglePath(Scanner key) 
    {
        System.out.println("You enter the dense alien jungle and soon encounter a fork in the path.");
        System.out.println("Do you want to follow the glowing plants or the strange sounds? (plants/sounds)");

        String secondChoice = key.nextLine();

        if (secondChoice.equals("plants")) 
        {
            System.out.println("You follow the glowing plants and come across a hidden alien temple.");
            System.out.println("Do you enter the temple or continue exploring the jungle? (enter/explore)");

            String thirdChoice = key.nextLine();

            if (thirdChoice.equals("enter")) 
            {
                System.out.println("Inside the temple, you find ancient alien artifacts. Do you take one or leave them? (take/leave)");

                String artifactChoice = key.nextLine();

                if (artifactChoice.equals("take"))
                {
                    System.out.println("You take the artifact, but it triggers a trap and the temple collapses. Game over.");
                } 
                else 
                {
                    System.out.println("You leave the artifacts untouched and exit the temple safely. You win!");
                }

            } 
            else if (thirdChoice.equals("explore")) 
            {
                System.out.println("As you continue exploring the jungle, you discover a new species of alien life. You become famous for your discovery! You win!");
            }
            else 
            {
                System.out.println("Invalid choice. The jungle consumes you. Game over.");
            }

        } 
        else if (secondChoice.equals("sounds")) 
        	{
            System.out.println("You follow the strange sounds and encounter a tribe of alien creatures.");
            System.out.println("They seem hostile. Do you try to communicate or run away? (communicate/run)");

            String thirdChoice = key.nextLine();

            if (thirdChoice.equals("communicate")) 
            {
                System.out.println("The creatures understand your peaceful intentions and share their knowledge with you.");
                System.out.println("You form an alliance with the alien tribe and are hailed as a hero. You win!");
            } 
            
            else if (thirdChoice.equals("run")) 
            {
                System.out.println("You try to run, but the creatures are faster. They capture you and imprison you. Game over.");
            } 
            
            else 
            {
                System.out.println("Invalid choice. The creatures overpower you. Game over.");
            }

        } 
        else 
        {
            System.out.println("Invalid choice. The jungle's dangers overwhelm you. Game over.");
        }
  
	}
}
        
        
   

