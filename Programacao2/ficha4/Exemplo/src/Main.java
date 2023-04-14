
public class Main {
    public static void main(String[] args) {
        ContaCash conta = new ContaCash(65, "dsds", 200);
        ContaCash destino = new ContaCash(65, "dsds", 200);

        System.out.println("Saldo da conta Principal " + conta.getSaldo()
        );
        System.out.println(conta.getSaldo());
    }
}
