package br.com.fiap;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;

public class App {
	
	public static void main(String[] args) {
		
		
		
		
		JFrame jFrame = new JFrame("Fiap Movies");
		jFrame.setLayout(null);

	    //Create the tab container
	    JTabbedPane tabs = new JTabbedPane();
	    //Set tab container position
	    tabs.setBounds(20,20,450,250);
	    
	    //Create panel 1
	    JPanel p1 = new JPanel();
	    p1.setLayout(new BorderLayout());
	    p1.setBorder(new EmptyBorder(10,10,10,10));
	    p1.setBounds(50, 50, 200, 200);
	    
	    JLabel pic = new JLabel(new ImageIcon("src/img/legiao_i3rmedDwbP9p.jpg"), JLabel.LEFT);
	    pic.setBounds(pic.getX(), pic.getY(), 100, 150);
		ImageIcon myImage = (ImageIcon) pic.getIcon();
        Image img = myImage.getImage();
        Image newImg = img.getScaledInstance(pic.getWidth(), pic.getHeight(),Image.SCALE_SMOOTH);
        pic.setIcon( new ImageIcon(newImg) );
        pic.setBorder(new EmptyBorder(0,10,50,0));
		pic.setPreferredSize(new Dimension(120,300));
                
	    pic.setVisible(true);
	    
	    p1.add(pic, BorderLayout.LINE_START);

	    JPanel painel = new JPanel();
	    painel.setLayout(new BoxLayout(painel, BoxLayout.Y_AXIS));
	    painel.setSize(400, 400);
	    
        JLabel tituloLabel = new JLabel("Titulo");
        JTextField tituloField = new JTextField();
        tituloField.setMaximumSize(new Dimension(150,30));

        painel.add(tituloLabel);
        painel.add(tituloField);
        
        JLabel sinopseLabel = new JLabel("Sinopse");
        JTextField sinopseField = new JTextField();
        sinopseField.setMaximumSize(new Dimension(150,30));

        painel.add(sinopseLabel);
        painel.add(sinopseField);

        JLabel generoLabel = new JLabel("Genero");
        String[] generoOptions = {};
        JComboBox<String> jComboBoxGenero = new JComboBox<>(generoOptions);
        jComboBoxGenero.setBounds(80, 50, 140, 20);
        jComboBoxGenero.setMaximumSize(new Dimension(150,30));

        painel.add(generoLabel);
        painel.add(jComboBoxGenero);
        
        JPanel panelButton = new JPanel();
        panelButton.setLayout(new FlowLayout());
        
        JButton buttonSave = new JButton("Salvar");
        JButton buttonCancel = new JButton("Cancelar");
        panelButton.add(buttonSave);
        panelButton.add(buttonCancel);
        
        painel.add(panelButton);
        
        p1.add(painel);

	    JPanel sinopse = new JPanel();
	    sinopse.setLayout(new BoxLayout(sinopse, BoxLayout.Y_AXIS));
	    sinopse.setSize(100, 100);   

        
        JLabel OndeAssLabel = new JLabel("Onde assistir");
        JRadioButton jRadioGenero1 = new JRadioButton();
        jRadioGenero1.setText("Netflix");
        JRadioButton jRadioGenero2 = new JRadioButton();
        jRadioGenero2.setText("PrimeVideo");
        JRadioButton jRadioGenero3 = new JRadioButton();
        jRadioGenero3.setText("Pirate Bay");
        ButtonGroup generoGroup = new ButtonGroup();

        generoGroup.add(jRadioGenero1);
        generoGroup.add(jRadioGenero2);
        generoGroup.add(jRadioGenero3);
        
        sinopse.add(OndeAssLabel);
        sinopse.add(jRadioGenero1);
        sinopse.add(jRadioGenero2);
        sinopse.add(jRadioGenero3);
        
        JCheckBox assistido = new JCheckBox("Assistido");
        sinopse.add(assistido);
        
        
        
        JLabel starRatingLabel = new JLabel("Avaliação");
        StarRater starRatingField = new StarRater(5);

        sinopse.add(starRatingLabel);
        sinopse.add(starRatingField);
        p1.add(sinopse, BorderLayout.LINE_END);
        
	    jFrame.add(tabs);
		jFrame.setSize(600,400);
		jFrame.setVisible(true);
	    
	    
	    
	    
	    
	    
		tabs.add("Cadastro", p1);
		tabs.add("Lista", null);
		
		
	}
}
