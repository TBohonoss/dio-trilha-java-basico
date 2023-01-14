public class Operadores {
    public static void main(String[] args) {
        boolean condicao1 = true;

        boolean condicao2 = false;

        String resultado1 = condicao1 && condicao2 ? "verdadeiro" : "falso";
       
        System.out.println(resultado1);

        String resultado2 = condicao1 || condicao2 ? "verdadeiro" : "falso";

        System.out.println(resultado2);
    }
}