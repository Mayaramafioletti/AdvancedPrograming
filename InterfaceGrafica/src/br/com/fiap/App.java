package br.com.fiap;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class App {
	
	public static void main(String[] args) {
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		JFrame jFrame = new JFrame("Meu app");
		jFrame.setLayout(new FlowLayout());
		
		MeuLabel label = new MeuLabel("OLÁAAAAAAAA");
		InputText inputText = new InputText();
		MeuTextArea meuTextArea = new MeuTextArea();
		JCheckBox jCheckBox = new JCheckBox();
		JRadioButton radio1 = new JRadioButton("PIX");
		JRadioButton radio2 = new JRadioButton("Cartão");
		ButtonGroup formaDePagamento = new ButtonGroup();
		
		formaDePagamento.add(radio1);
		formaDePagamento.add(radio2);
		
		String[] cidades = {"São Paulo", "Santos", "Osasco"};
		JComboBox<String> comboBox = new JComboBox<String>(cidades);
		
		JPanel busca = new JPanel();
		busca.add(inputText);
		busca.add(new JButton("Buscar"));
				
		
		jFrame.add(label, BorderLayout.PAGE_END);
		jFrame.add(inputText, BorderLayout.LINE_START);
		jFrame.add(meuTextArea);
		jFrame.add(jCheckBox);
		jFrame.add(busca, BorderLayout.PAGE_START);
		jFrame.add(radio1);
		jFrame.add(radio2);
		jFrame.add(comboBox);
		
		
		jFrame.setSize(400, 500);
		jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		jFrame.setVisible(true);
	}

}
