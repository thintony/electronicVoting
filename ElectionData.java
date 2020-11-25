import java.util.Scanner;

public class ElectionData {

	public static void main(String[] args) {
		Scanner card = new Scanner(System.in);
		int voteCounter = 1;
		int runnerUp = 0;
		int runnerUp1 = 0;
		int runnerUp2 = 0;
		int cardId = 0;
		
		while(voteCounter <= 32) {
			System.out.println("Enter cardId(1=runnerUp,2 = runnerUp1,3 =runnerUp2 )");
			 cardId = card.nextInt();
	
		if(cardId >= 4) {
			System.out.print("Fake CardId");
			System.out.println();
			continue;
			
		}
	
		else
			if(cardId == 1) 
				runnerUp = runnerUp + 1;
				
			 else if(cardId == 2)
					runnerUp1 = runnerUp1 + 1;
				
			 else
						runnerUp2 = runnerUp2 + 1;
				
				voteCounter = voteCounter + 1;
				
			}
				
			System.out.printf("RunnerUp:%n%d%n%nRunnerUp1:%n%d%n%nrunnerUp2:%n%d", runnerUp,runnerUp1,runnerUp2);
			System.out.println();
			System.out.println();
			
			
			if(runnerUp > runnerUp1 && runnerUp > runnerUp2)
				System.out.printf("RunnerUp WON");
			
			else if
			(runnerUp1 > runnerUp && runnerUp1 > runnerUp2)
				System.out.print("RunnerUp1 WON");
			
			else 
				System.out.print("RunnerUp2 WON");
			
	}
	

}
