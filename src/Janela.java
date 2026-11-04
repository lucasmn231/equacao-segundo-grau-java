import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Janela extends JFrame {

    Botao b1 = new Botao(200, 400, "Resolver");
    Botao b2 = new Botao(600, 400, "Limpar");

    Label l1 = new Label(200, 50, "A");
    Label l2 = new Label(200, 150, "B");
    Label l3 = new Label(200, 250, "C");
    Label l4 = new Label(600, 50, "R1");
    Label l5 = new Label(600, 150, "R2");

    Caixa c1 = new Caixa(225, 50, true);
    Caixa c2 = new Caixa(225, 150, true);
    Caixa c3 = new Caixa(225, 250, true);
    Caixa c4 = new Caixa(625, 50, false);
    Caixa c5 = new Caixa(625, 150, false);


    public Janela(int x, int y) {
        this.setSize(x, y);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
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

        this.setVisible(true);

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                c1.setText("");
                c2.setText("");
                c3.setText("");
                c4.setText("");
                c5.setText("");
            }
        });

        b1.addActionListener(e ->{
            double a, b, c;
            a = Double.parseDouble(c1.getText());
            b = Double.parseDouble(c2.getText());
            c = Double.parseDouble(c3.getText());

            Equacao eq = new Equacao(a, b, c);
            double raizes[] = new double[2];
            raizes = eq.resolver();

            c4.setText(String.valueOf(raizes[0]));
            c5.setText(String.valueOf(raizes[1]));
        });
    }
}
