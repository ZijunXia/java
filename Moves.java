import java.util.Random;
import java.util.Scanner;

public class Moves
{
    	int HeroHP = 20;
		int HeroMP = 0;
		int DragonHP = 20;
		int DragonMP = 0;
		int DragonDo = 0;
		int defense = 0;

        Scanner Input = new Scanner(System.in);
		Random Shiji = new Random();

        int Do;

		public void action(int L)
		{

				

				System.out.print("Hero:  ");
				System.out.print(" HP ");

				for(int x=HeroHP;x>0;x--)
				{
					System.out.print("*");
				}
				System.out.print(" "+HeroHP);
				System.out.println();
				System.out.print("       ");
				System.out.print(" MP ");

				for(int x=HeroMP;x>0;x--)
				{
					System.out.print("*");
				}
				System.out.print(" "+HeroMP);
				System.out.println();
				System.out.print("Dragon:");
				System.out.print(" HP ");

				for(int y=DragonHP;y>0;y--)
				{
					System.out.print("*");
				}
				System.out.print(" "+DragonHP);
				System.out.println();
				System.out.print("       ");
				System.out.print(" MP ");

				for(int y=DragonMP;y>0;y--)
				{
					System.out.print("*");
				}
				System.out.print(" "+DragonMP);
				System.out.println();
				System.out.println("==================================");
				
				System.out.println("What do you want to do ");
				System.out.println("1.Attrack 2.Save Energy");
				System.out.println("3.Defense 4.Magic Attack");
				System.out.println("____________________");

                Do = Input.nextInt();
		
					if(L==1)
					{
						DragonDo = Shiji.nextInt(4);//0 means save energy, 1 means defense, 2 means attack, 3 means use fire.
					}
			
				if(L==2)
				{

					if(HeroMP==0&&DragonMP==0)
					{
						DragonDo = 0;
					}

					else if(DragonMP==0)
					{
						DragonDo = Shiji.nextInt(2);
					}

					else if(HeroMP>2&&DragonMP>2)
						DragonDo = 2;

					else if(DragonMP<4)
					{
						DragonDo = Shiji.nextInt(3);
					}

					else
						DragonDo = 3;
				}					
			
				if(L==3)
				{
					if(Do==1)
							DragonDo=1;

					if(Do==2&&DragonMP>0)
						DragonDo=2;

					if(Do==2&&DragonMP==0)
						DragonDo=0;

					if(Do==3&&DragonMP<4)
						DragonDo=0;

					if(Do==3&&DragonMP>=4)
						DragonDo=3;

					if(Do==4)
						DragonDo=0;
				}

					if(Do==3) 
					{
						defense=1;
						System.out.println("Good Defense!");
					}
					if(DragonDo==1)
					{
						defense=1;
						System.out.println("Gragon is defense");
					}

					if(Do==1&&HeroMP==0) 
					{
						System.out.println("MP dose not enough!");
					}
					if(Do==1&&HeroMP>0)
					{
						if(defense==0)
						{
							DragonHP=DragonHP-1;
							HeroMP=HeroMP-1;
							System.out.println("You are doing attrack");
						}

						if(defense==1)
						{
							HeroMP=HeroMP-1;
							System.out.println("Your attrack doesnot work");
						}
					}
					if(Do==2)
					{
						HeroMP=HeroMP+1;
						System.out.println("You are saving erengy");
					}
					if(Do==4&&HeroMP<3)
					{
						System.out.println("MP does not enough!");
					}
					if(Do==4&&HeroMP>2)
					{
						DragonHP=DragonHP-2;
						HeroMP=HeroMP-3;
						System.out.println("You are doing magic attrack");
					}
					if(Do> 4)
						System.out.println("You are missing");

					if(DragonDo==2&&DragonMP==0)
					{
						System.out.println("Come on! What are you doing?");
					}
					if(DragonDo==2&&DragonMP>0)
					{

						if(defense==0)
						{
							HeroHP=HeroHP-2;
							DragonMP=DragonMP-1;
							System.out.println("Dragon is doing attrack");
						}

						if(defense==1)
						{
							DragonMP=DragonMP-1;
							System.out.println("Good Defense!");
						}
					}

					if(DragonDo==0)
					{
						DragonMP=DragonMP+1;
						System.out.println("Dragon is saving energy");
					}
					if(DragonDo==3&&DragonMP<4)
					{
						System.out.println("Dragon is sleeping");
					}
					if(DragonDo==3&&DragonMP>3)
					{
						HeroHP=HeroHP-4;
						DragonMP=DragonMP-4;
						System.out.println("Dragon is using fire! Can not defense");
					}

					defense = 0;
				
		}
		 public boolean getPoints()
			{
				 boolean endGame = false;

				if(HeroHP<=0)
				{
					System.out.println();
					System.out.println("Hero's HP is 0! No..I can not believe that..Hero was beaten~");
					System.out.println();
                    endGame = true;
				}

				if(DragonHP<=0)
				{
					System.out.println();
					System.out.println("Dragon's HP is 0! Dragon is dead, Hero is winner! ");
					System.out.println();
                    endGame = true;
				}
                return endGame;
			}
			
}