import java.util.Scanner;

public class Main {
    public static void main(String[] args){

       /* Scanner scan = new Scanner(System.in);
        System.out.println("Digite a idade: ");
        int idade = scan.nextInt();
        System.out.println("Digite a altura:");
        double altura = scan.nextDouble();
        System.out.println("Digite o nome:");
        String nome = scan.next();
        System.out.println("O "+ nome +" tem "+ altura +" de altura, e idade: "+ idade);
        if(idade <=17){
            System.out.println("eh de menor");
        }else{
            System.out.println("eh de maior");
        } 
         scan.close();*/
       

        int[] vetor;

        vetor = new int[10];

        for(int a = 0; a < 10; a++){
            vetor[a] = a+1;
            System.out.println("Valor do vetor: "+ vetor[a]);
            System.out.println("posição: "+ a);
        }



    }
}