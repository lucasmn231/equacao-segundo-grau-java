import javax.swing.*;

public class Botao extends JButton {

    public Botao(int posX, int posY, String texto) {
        this.setSize(100, 80);
        this.setLocation(posX, posY);
        this.setText(texto);
        this.setVisible(true);
    }
}
