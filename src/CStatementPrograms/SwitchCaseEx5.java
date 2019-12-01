package CStatementPrograms;

public class SwitchCaseEx5 {
	public  static void main(String args[]){
		String player = "batsmen";
		 
		switch(player){
		case "batsmen":
		       System.out.println(" Batsmen are players who plays with a bat");
		       break;
		case "bowler":
		       System.out.println("who throws the ball");
		       break;
		case "wicket-keeper":
		       System.out.println("who keeps the ball behind the wickets");
		       break;
		case "fielder":
		       System.out.println("who fields in the ground");
		       break;
		default:
		       System.out.println("no entry present");
		}
		}
		
}
