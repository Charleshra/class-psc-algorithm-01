import java.util.Scanner;

public class Riley{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int alegria = 0;
        int tristeza = 0;
        int amizades = 0;

        System.out.println("Quantas amizades a Riley fez?");
        amizades = scanner.nextInt();
        if(amizades==0){
            tristeza=30;
        }else{
            alegria=amizades*10;
        }
        System.out.println("amizades: " + amizades);
        System.out.println("tristeza: " + tristeza);
        System.out.println("alegria: " + alegria);

        System.out.println("Quantos pontos a Riley tirou na A1?");
        int a1 = scanner.nextInt();
        System.out.println("Quantos pontos a Riley tirou na A2?");
        int a2 = scanner.nextInt();
        System.out.println("Quantos pontos a Riley tirou na A3?");
        int a3 = scanner.nextInt();

        double media = (a1+a2+a3)/3;

        if(media >= 7) {
            System.out.println("APROVADA");
            alegria += 50;
        } else {
            System.out.println("REPROVADA");
            tristeza += 50;
        }

        System.out.println("Quantos exercícios de programação Riley fez?");
        int fez = scanner.nextInt();
        
        if(fez < 10 || fez > 0) {
            alegria += fez *10;
            tristeza -= (10-fez)*10;
        }
        if(alegria > tristeza){
            System.out.println("A mudança para a nova cidade foi uma experiência incrível para a Riley.");

        }else {
            System.out.println("A mudança para a nova cidade foi uma experiência desagradável para a Riley.");
        }

        scanner.close();
    }
}