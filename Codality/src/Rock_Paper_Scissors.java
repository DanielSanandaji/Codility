

public class Rock_Paper_Scissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String G = "PRPRRPP";
		
		
		System.out.println(new Rock_Paper_Scissors().solution(G));
		
		
		
	}
	public int solution(String G) {
        // write your code in Java SE 8
		
		int win = 2;
		int tie = 1;
		int loss = 0;
		int result_rock = 0;
		int result_scissor = 0;
		int result_paper = 0;
		
		char[] charArr = G.toCharArray();
		
		for(char character:charArr) {
			if(character == 'R') {
				result_rock += tie;
				result_scissor += loss;
				result_paper += win;
			}
			
			if (character == 'P') {
				result_rock += loss;
				result_scissor += win;
				result_paper += tie;
			}
			
			if (character == 'S') {
				result_rock += win;
				result_scissor += tie;
				result_paper += loss;
			}
		}
		
		if(result_rock > result_scissor &&  result_rock > result_paper) {
			return result_rock;
		} else if(result_scissor > result_paper) {
			return result_scissor;
		} else {
			return result_paper;
		}
		

		
    }
	

}
