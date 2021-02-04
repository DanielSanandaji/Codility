

public class Head_Or_Tails {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A = {1, 0, 0, 1, 0, 0};
		
		
		System.out.println(new Head_Or_Tails().solution(A));
	}

	public int solution(int[] A) {
		
		int head = 0;
		int tails = 0;
		
		for(int index:A) {
			
			if(index == 1) {
				head++;
			} else {
				tails++;
			}
			
			
		}
		
		if (head<tails) {
			return head;
		} else {
			return head;
		}
	}
	

	
}
