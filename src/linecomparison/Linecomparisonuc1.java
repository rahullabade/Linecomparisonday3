package linecomparison;

public class Linecomparisonuc1 {

	double distance(int x1,int y1,int x2,int y2)
	{
		double distance;
		distance=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		return distance;
	}
	public static void main(String[] args) {
		Linecomparisonuc1 obj = new Linecomparisonuc1();
		double ans = obj.distance(1,2 , 3, 4);
		System.out.println("Distance"+ans);
	}
}
