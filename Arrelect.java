// GUEVARRA - ARRAYLISTS
import java.util.Scanner;
import java.lang.reflect.Array;
import java.text.DecimalFormat;


public class Arrelect{
    private static final DecimalFormat decfor = new DecimalFormat("0.00");
    public static void main(String args[]){
        Scanner x = new Scanner(System.in);
        
        int i=0;
        int mVote = 0;
        int winInd = -1;
        double winPer;
        int tVote;    

        String cand[] = new String[4];
        int canv[] = new int[4];

        for(i=0; i<cand.length;i++){
            System.out.print("Enter name of candidate: ");
            cand[i]= x.nextLine().toUpperCase();
            System.out.print("Enter the number of votes: ");
            canv[i]= x.nextInt();
            x.nextLine();
            System.out.println(" ");
        }
        
        for (i = 0; i < 4; i++) {
            if (canv[i] > mVote) {
                mVote = canv[i];
                winInd = i;
            }
        }

        tVote = canv[0] +
                canv[1] +
                canv[2] +
                canv[3];

        winPer = (double) mVote / tVote * 100;

        System.out.println("Election Results:");
        for (i = 0; i < 4; i++) {
            System.out.println(cand[i] + ": " + canv[i] + " votes (" + decfor.format((double) canv[i] / tVote * 100) + "%)");
        }
        

        System.out.println("Total Votes: " + tVote);
        System.out.println("The winner is " + cand[winInd] + " with " + mVote + " votes (" + decfor.format(winPer) + "% of the total votes).");
               
    }
}
