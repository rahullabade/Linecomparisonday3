package linecomparison;

public class Linecomparisonuc2 {
	double distance(int x1,int y1,int x2,int y2)
	{
		double distance;
		distance=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		return distance;
	}
	public static void main(String[] args) {
		Linecomparisonuc1 obj = new Linecomparisonuc1();
		double line1 = obj.distance(1,1 , 1, 1);
		double line2 = obj.distance(1,2 , 3, 4);
		System.out.println("Distance"+line1);
		System.out.println("Distance"+line2);
	}

}
