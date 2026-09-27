import java.util.*;

public class NumberGame{

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        Random random = new Random();
        
        String playAgain ="yes";
        int score =0;
       

        while(playAgain.equals("yes")){

        
           int number = random.nextInt(100)+1;
          
           int guess = 0;
           int attempt =0;


          
           while(guess != number && attempt < 7){
        
               System.out.println("enter your guess: ");
               guess = in.nextInt();
               attempt++;

           if(guess == number){
            System.out.println("correct");
            score++;
           }else if (guess >number){
            System.out.println(" too high!");
           }else {
            System.out.println(" too low!");
           }

           if(attempt ==7 && guess != number){
                System.out.println("game over");
                System.out.println("the number is :"+ number );   
           }
    }
    in.nextLine();

    System.out.println("do you want to play Again? (yes/no)");
    playAgain = in.nextLine();
}

System.out.println("your score is :"+ score);
System.out.println("thanks for playing ");
}
}

