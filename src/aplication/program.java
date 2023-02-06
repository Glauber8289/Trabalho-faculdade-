package aplication;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Quantas notas serão digitadas ?");
		int qtd = sc.nextInt();
		
		int [] Notas = new int[qtd];
		double soma=0;
		double media=0;
		
	
		for(int i = 0;i<Notas.length;i++) {
		System.out.println("Digite a " + (i+1)+ "ª nota :");
		Notas[i]  = sc.nextInt();   
		
		
		//System.out.println("Digite s para saber a soma se quiser saber a media digite m");
		//char s=sc.next().charAt(0);
		soma+=Notas[i];
		
		media=soma/qtd;
		
		//System.out.println("Digite s para saber a soma se quiser saber a media digite m");
        //String s = sc.nextLine();
		//if(s=='s') {
		
		// else if (s=='m') {
		System.out.println("A soma das notas digitadas é "+soma);
		}
		System.out.println("A media e "+media);
	     }
	//}
	}
