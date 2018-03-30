package Modelo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) throws IOException {
	     Scanner sc=new Scanner(System.in);
	     BufferedReader ent=new BufferedReader(new InputStreamReader(System.in));
	     String U[]={"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
	     String D[]={"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
	     String C[]={"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
	     char seguir;
	     do{
	    	 System.out.println("Porfavor ingrese un numero entre 1 y 1000: ");
	    	 int N = sc.nextInt();
	    	 String rom="";
	    	 int u=N % 10;
	    	 int d=N / 10 % 10;
	    	 int c=N / 100 % 10;
	    	 if (N>1000){
	    		 System.out.println("el numero que digito no es valido \n");
	    	 }else 
	    		 if(N==1000){
	    			 rom+="M";
	    		  System.out.println("El numero "+N+" convertido a romano es: "+rom+ "\n");
	    		 }else 
	    			 if (N<1000){
	    				 if(N>=100){   
	    					 rom+=(C[c]+D[d]+U[u]);
	    					 System.out.println("El numero "+N+" convertido a romano es: "+rom+ "\n");
	    				 }else{
	    					 if(N>=10){
	    						 rom+=(D[d]+U[u]);
	    						 System.out.println("El numero "+N+" convertido a romano es: "+rom+ "\n");
	    					 }else{
	    						 rom+=(U[u]);
	    						 System.out.println("El numero "+N+" convertido a romano es: "+rom+ "\n");
	    					 }          
	    				 }
	    			 }	
	    	 System.out.println("Desea convertir algun ortro numero??");
	    	 System.out.println("     S = SI   o   N =  NO ");
	    	 seguir = (ent.readLine ()).charAt(0);
	    	 if (seguir!='s' & seguir!='S'){
	    		 System.out.println("\n      Hasta Pronto");
	    	 }
				
	     }while((seguir=='s'||seguir=='S'));
	}
	
}
