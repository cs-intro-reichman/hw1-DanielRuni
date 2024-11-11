// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int currentValue = Integer.parseInt (args[0]);
		double rate = Double.parseDouble (args[1]);
		int n = Integer.parseInt (args[2]);
		double precent = rate / 100;
		double futureValue = currentValue * (Math.pow((1 + precent) , n));
		System.out.println("After " + n + " years, $" + currentValue +
							" saved at " + rate + "% will yield $" + (int)futureValue);
	}
}