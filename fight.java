import java.util.Random;
import java.util.Scanner;
public class fight
{
	public static void main(String[] args)
	{
		int HeroHP = 20;
		int HeroMP = 0;
		int DragonHP = 20;
		int DragonMP = 0;
		int DragonDo = 0;
		int defense = 0; 

        Game g = new Game();
		Moves m = new Moves();


		g.introduction();

		Scanner Level = new Scanner(System.in);
		int L = Level.nextInt();
		System.out.println("==================================");

		while(true)
		{          
			m.action(L);
			boolean end = m.getPoints();
            if(end==true)
            {
                break;
            }
			
			System.out.println("____________________");
			System.out.println();
			System.out.println("==================================");
        }
	}
}
