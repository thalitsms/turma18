package POO;

import java.util.*;


public class Desafio1 {
	public static void main(String[] args)  
{
		

	Scanner ler = new Scanner (System.in);
	Triangulo T3 = new Triangulo();
	double base1, altura1, area1;
	double base2, altura2, area2;
	double base3, altura3, area3;
	
	System.out.println("Digite a base 1: ");
	base1 = ler.nextDouble();
	System.out.println("Digite a altura 1: ");
	altura1 = ler.nextDouble();
	
	area1 = (base1 * altura1 / 2);
	
	System.out.println("Base 1: " + base1);
	System.out.println("Triangulo 1: " + altura1);
	System.out.println("Area 1: " + area1);
	
	System.out.println("Digite a base 2: ");
	base2 = ler.nextDouble();
	System.out.println("Digite a altura 2: ");
	altura2 = ler.nextDouble();
	
	area2 = (base2 * altura2 / 2);
	
	System.out.println("Base 2: " + base2);
	System.out.println("Triangulo 2: " + altura2);
	System.out.println("Area 2: " + area2);
	
	System.out.println("Digite a base 3: ");
	base3 = ler.nextDouble();
	System.out.println("Digite a altura 3: ");
	altura3 = ler.nextDouble();
	
	area3 = (base3 * altura3 / 2);
	
	System.out.println("Base 3: " + base3);
	System.out.println("Triangulo 3: " + altura3);
	System.out.println("Area 2: " + area3);
	
	if (area1 > area2 && area1 > area3)
	{
		System.out.println("Triangulo 1 tem a maior area!");
	}else if(area1 == area2 && area1 == area3)
	{
		System.out.println("Triangulos iguais!");
	}
	
	if (area2 > area3 && area2 > area1)
	{
		System.out.println("Triangulo 2 tem a maior area!");
	}
	
	if (area3 > area2 && area3 > area1)
	{
		System.out.println("Triangulo 3 tem a maior area!");
	}
}
}
