

public class Seconds_format {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int T = 83643;
		
		
		System.out.println(new Seconds_format().solution(T));
	}
	
	
	
	public String solution(int T) {
        // write your code in Java SE 8
		
	int	hours = T / 3600;
	int	minutes = (T % 3600) / 60;
	int	seconds = T % 60;

	 String timeString = String.format("%01dh%01dm%01ds", hours, minutes, seconds);
		
		return timeString;
    }
	
}
