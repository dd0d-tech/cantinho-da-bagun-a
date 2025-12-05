import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
    
        leitor.useDelimiter("[\r\n]+");

        String nome;
        int idade;
        String cidade;
        String estado;
        
        System.out.print("Digite seu nome: ");
        nome = leitor.next();
      
        System.out.print("Digite sua idade: ");
        idade = leitor.nextInt();

        System.out.print("Digite sua cidade: ");
        cidade = leitor.next();

        System.out.print("Digite seu estado: ");
        estado = leitor.next();

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Cidade: " + cidade);
        System.out.println("Estado: " + estado);

        System.err.println("Olá, " + nome + ", seja bem-vindo(a). ");
    }

}
