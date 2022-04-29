package br.com.fiap;

import java.awt.Color;

import javax.swing.JLabel;

public class MeuLabel extends JLabel {
	private static final long serialVersionUID = 1L;

	public MeuLabel() {
		init();
	}
	
	public MeuLabel(String text) {
		this.setText(text);
		init();
	}
	
	private void init() {
		this.setForeground(new Color(255, 0, 150));
	}
}


//package br.com.fiap;
//
//import java.awt.BorderLayout;
//import java.awt.FlowLayout;
//import java.awt.Image;
//import java.awt.image.BufferedImage;
//import java.io.File;
//import java.util.ArrayList;
//
//import javax.imageio.ImageIO;
//import javax.swing.BoxLayout;
//import javax.swing.ButtonGroup;
//import javax.swing.ImageIcon;
//import javax.swing.JButton;
//import javax.swing.JCheckBox;
//import javax.swing.JComboBox;
//import javax.swing.JComponent;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JPanel;
//import javax.swing.JRadioButton;
//import javax.swing.JTabbedPane;
//import javax.swing.JTextField;
//import javax.swing.UIManager;
//import javax.swing.UnsupportedLookAndFeelException;
//import javax.swing.border.EmptyBorder;
//
//public class App {
//	
//	public static void main(String[] args) {
//		
//		
//		try {
//			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (InstantiationException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IllegalAccessException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (UnsupportedLookAndFeelException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		JFrame jFrame = new JFrame("Meu App");
//		jFrame.setLayout(null);
//
//	    //Create the tab container
//	    JTabbedPane tabs = new JTabbedPane();
//	    //Set tab container position
//	    tabs.setBounds(40,20,300,200);
//	    
//	    //Create panel 1
//	    JPanel p1 = new JPanel();
//	    p1.setLayout(new BorderLayout());
//	    p1.setBorder(new EmptyBorder(10,25,10,25));
//	    p1.setBounds(50, 50, 250, 250);
//	    
//	    JLabel pic = new JLabel(new ImageIcon("src/img/legiao_i3rmedDwbP9p.jpg"), JLabel.LEFT);
//	    pic.setBounds(pic.getX(), pic.getY(), 90, 120);
//		ImageIcon myImage = (ImageIcon) pic.getIcon();
//        Image img = myImage.getImage();
//        Image newImg = img.getScaledInstance(pic.getWidth(), pic.getHeight(),Image.SCALE_SMOOTH);
//        pic.setIcon( new ImageIcon(newImg) );
//                
//	    pic.setVisible(true);
//	    
//	    //Add text box in panel 1
//	    p1.add(pic, BorderLayout.LINE_START);
//
//	    JPanel formularios1 = new JPanel();
//	    formularios1.setLayout(new BoxLayout(formularios1, BoxLayout.Y_AXIS));
//	    formularios1.setSize(80, 80);
//	    
//        JLabel titleLabel = new JLabel("Titulo");
//        JTextField titleField = new JTextField("Titulo");
//
//        formularios1.add(titleLabel);
//        formularios1.add(titleField);
//        
//        JLabel sinopseLabel = new JLabel("Sinopse");
//        JTextField sinopseField = new JTextField("Sinopse");
//
//        formularios1.add(sinopseLabel);
//        formularios1.add(sinopseField);
//	    
//        p1.add(formularios1, BorderLayout.CENTER);
//
//	    JPanel formularios2 = new JPanel();
//	    formularios2.setLayout(new BoxLayout(formularios2, BoxLayout.Y_AXIS));
//	    formularios2.setSize(100, 100);   
//
//        
//        JLabel OndeAssLabel = new JLabel("Onde assistir");
//        ButtonGroup generoGroup = new ButtonGroup();
//
//        JButton checkButton1 = new JButton("Netflix");
//        JButton checkButton2 = new JButton("PrimeVideo");
//        JButton checkButton3 = new JButton("Pirate Bay");
//        
//        generoGroup.add(checkButton1);
//        generoGroup.add(checkButton2);
//        generoGroup.add(checkButton3);
//        
//        formularios2.add(OndeAssLabel);
//        formularios2.add(checkButton2);
//	    
//        p1.add(formularios2, BorderLayout.LINE_END);
//        
//        
//	    jFrame.add(tabs);
//		jFrame.setSize(400,600);
//		jFrame.setVisible(true);
//	    
//	    
//	    
//	    
//	    
//	    
//		tabs.add("Cadastro", p1);
//	    
////		InitText inputText = new InitText();
////		MeuTextArea meuTextArea = new MeuTextArea();
////		JCheckBox checkBox = new JCheckBox();
////		checkBox.setText("CheckBox");
////		
////		JPanel busca = new JPanel();
////		busca.add(inputText, BorderLayout.LINE_START);
////		busca.add(new JButton("Buscar"));
////		
////		JRadioButton radioButtonPix = new JRadioButton("Pix");
////		JRadioButton radioButtonCartao = new JRadioButton("Cartao");
////		ButtonGroup formaPagamento = new ButtonGroup();
////		formaPagamento.add(radioButtonCartao);
////		formaPagamento.add(radioButtonPix);
////		
////		String[] cidadesList = {"São Paulo", "Santos", "Osasco"};
////		
////		MeuLabel label = new MeuLabel("Olá mundo");			
////		jFrame.add(label, BorderLayout.PAGE_END);	
////		jFrame.add(busca, BorderLayout.PAGE_START);
////		jFrame.add(meuTextArea);
////		jFrame.add(checkBox);
////		
////		jFrame.add(radioButtonPix);
////		jFrame.add(radioButtonCartao);
//		
////		jFrame.add(new JComboBox<String>(cidadesList));
//		
//		//jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		
//		
//		
//	}
//}
