import java.util.Scanner;
import java.util.Random;

public class Kolo {

    private int r;
    private String name;

    public Kolo() {
  		setR(0);
  		setName(new String());
    }

    public Kolo (int r, String name) {
    	setR(r);
    	setName(name);
    }

    
	public void setR(int r) {
    	this.r = r;
    }

    public int getR() {
    	return r;
    }

    public void setName(String name) {
    	this.name = name;
    }

    public String getName() {
    	return name;
    }
    //-------------------------------------------
    public static void wczytajR(Kolo kolo) {
    	Scanner in = new Scanner(System.in);

    	System.out.println("Podaj promien kola : ");

        kolo.setR(in.nextInt());

        System.out.println("Promien kola to : " + kolo.getR() );
        
    }


	public static int wczytajP() {
    	Scanner in = new Scanner(System.in);
    	int p;

    	System.out.println("Podaj liczba probek : ");

        p = in.nextInt();

        System.out.println("Liczba probek to : " + p );
        
        return p;
    }
	
	//-------------------------------------------------
    public double poleAnal()
	{
		double pole = Math.PI *r*r;
        return pole;
		
	}

	public double poleMonCar(int p)
	{
		double polekw = 4*r*r;
        Random a = new Random();
        int k=0;
        double x, y;
        
        for (int i = 1; i < p + 1; i++)
        {
            x= -r + 2*r*a.nextDouble();
            y= -r + 2*r*a.nextDouble();
            
            if ((x * x + y * y) <= r * r)
            {
                k++;
            }
        }
        
        
        double pole = polekw * k / p;
        return pole;
	}
	
	
}
