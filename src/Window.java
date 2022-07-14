import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window implements ActionListener {
    public static void main(String[] args) {
        new Window();
    }

    private JFrame window;
    private JTextField tf_cant;
    private JLabel lbl_cant;
    private JButton btn_retirar;

    Window(){
        window = new JFrame();
        window.setSize(380, 150);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.setResizable(false);
        window.setLayout(null);

        lbl_cant = new JLabel("Introduzca la cantidad a retirar");
        lbl_cant.setBounds(10, 10, 300, 25);
        lbl_cant.setFont(new Font("arial", Font.PLAIN, 20));
        window.add(lbl_cant);

        tf_cant = new JTextField();
        tf_cant.setBounds(290, 10, 50, 30);
        window.add(tf_cant);

        btn_retirar = new JButton("Retirar");
        btn_retirar.setBounds(10, 50, 330, 50);
        btn_retirar.addActionListener(this);
        window.add(btn_retirar);

        window.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == btn_retirar){
            new Cambio().vuelto(Integer.parseInt(tf_cant.getText()));
        }
    }



}
