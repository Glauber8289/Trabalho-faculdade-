package aplication;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
	    int n=50;
		int[] Num = new int[n];
		
		int media;
		int soma;
		
		for(int i =1;i<n;i++) {
		System.out.println("Digite um numero na posição "+i);
		int nu = sc.nextInt();   
		System.out.println("Digite s para saber a soma se quiser saber a media digite m");
		char s=sc.next().charAt(0);
		soma=nu+i;
		media=soma/i;
		//System.out.println("Digite s para saber a soma se quiser saber a media digite m");
        //String s = sc.nextLine();
		if(s=='s') {
		System.out.println("A soma na posicão  "+i+"é "+soma);
		}
		 else if (s=='m') {
		System.out.println("A media das notas digitadas é "+media);
	     }
	}
	}
}
