import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class PraticaDados extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PraticaDados frame = new PraticaDados();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PraticaDados() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 574, 453);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelEsqueda = new JLabel("");
		labelEsqueda.setBounds(6, 6, 271, 265);
		contentPane.add(labelEsqueda);
		
		JLabel labelDireita = new JLabel("");
		labelDireita.setBounds(297, 6, 271, 265);
		contentPane.add(labelDireita);
		
		JButton botaoRolar = new JButton("Rolar dados!");
		botaoRolar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				int ladoEsquerdo = new Random().nextInt(6)+1;
				int ladoDireito = new Random().nextInt(6)+1;
				
				
				labelEsqueda.setIcon(new ImageIcon(ladoEsquerdo + ".png"));
				labelDireita.setIcon(new ImageIcon(ladoDireito + ".png"));
			}
		});
		
		botaoRolar.setBounds(195, 309, 179, 93);
		contentPane.add(botaoRolar);
	}
}
