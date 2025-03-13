//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        VIP vip = new VIP(50, 10);
        Normal normal = new Normal(50);

        normal.escreverPreco();
        vip.escreverPreco();
    }
}