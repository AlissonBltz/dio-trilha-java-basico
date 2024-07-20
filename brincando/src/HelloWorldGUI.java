import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloWorldGUI {
    public static void main(String[] args) {
        // Cria um novo frame
        JFrame frame = new JFrame("Hello World App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Cria um painel para adicionar componentes
        JPanel panel = new JPanel();

        // Cria um botão com o texto "Press me"
        JButton button = new JButton("Press me");

        // Adiciona um listener ao botão
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Exibe a mensagem "Hello World" quando o botão é pressionado
                JOptionPane.showMessageDialog(frame, "Hello World");
            }
        });

        // Adiciona o botão ao painel
        panel.add(button);

        // Adiciona o painel ao frame
        frame.add(panel);

        // Torna o frame visível
        frame.setVisible(true);
    }
}
