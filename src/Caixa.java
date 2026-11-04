import javax.swing.*;

public class Caixa extends JTextField {

    public Caixa(int posX, int posY, boolean ativado) {
        this.setSize(50, 50);
        this.setLocation(posX, posY);
        this.setVisible(true);
        this.setEnabled(ativado);
    }
}
