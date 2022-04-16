public class AvgClass{
    int avg(int a, int b){
        return ((a+b)/2);
    }
    float avg(float a, float b){
        return ((a+b)/2);
    }
    double avg(double a, double b){
        return ((a+b)/2);
    }
    
}

public class Main
{
    
	public static void main(String[] args) {
	    
	    AvgClass a=new AvgClass();
	    
	    int ires=a.avg(10,20);
	    System.out.println(ires);
	    
	    float fres=a.avg(10.5,20.5);
	    System.out.println(fres);
	    
	    double dres=a.avg(10.55,20.55);
		System.out.println(dres);
	}
}
