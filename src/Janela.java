import javax.swing.*;

public class Janela extends JFrame {

    Botao b1 = new Botao(200, 400, "Limpar");
    Botao b2 = new Botao(600, 400, "Resolver");

    Label l1 = new Label(200, 50, "A");
    Label l2 = new Label(200, 150, "B");
    Label l3 = new Label(200, 250, "C");
    Label l4 = new Label(600, 50, "R1");
    Label l5 = new Label(600, 150, "R2");

    Caixa c1 = new Caixa(225, 50);
    Caixa c2 = new Caixa(225, 150);
    Caixa c3 = new Caixa(225, 250);
    Caixa c4 = new Caixa(625, 50);
    Caixa c5 = new Caixa(625, 150);


    public Janela(int x, int y) {
        this.setSize(x, y);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(false);
        this.setLayout(null);


        this.add(b1);
        this.add(b2);

        this.add(l1);
        this.add(l2);
        this.add(l3);
        this.add(l4);
        this.add(l5);

        this.add(c1);
        this.add(c2);
        this.add(c3);
        this.add(c4);
        this.add(c5);
    }
}
