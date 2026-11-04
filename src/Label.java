import javax.swing.*;

public class Label extends JLabel {

    public Label(int posX, int posY, String texto) {
        this.setVisible(true);
        this.setText(texto);
        this.setSize(50, 50);
        this.setLocation(posX, posY);
    }
}
