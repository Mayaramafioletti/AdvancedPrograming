package br.com.fiap.movies.view;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.util.Enumeration;
import java.util.List;

import javax.swing.AbstractButton;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import br.com.fiap.movies.controller.BotaoListener;
import br.com.fiap.movies.controller.TableListener;
import br.com.fiap.movies.dao.FilmeDao;
import br.com.fiap.movies.model.Filme;

public class Janela extends JFrame{

	private JPanel painelCadastro = new JPanel();
	
	private JLabel titleLabel = new JLabel("Titulo");
	private JTextField titleField = new JTextField("");
	
	private JLabel sinopseLabel = new JLabel("Sinopse");
	private JTextField sinopseField = new JTextField("");

	private JCheckBox assistido = new JCheckBox("Assistido");
    
	private JLabel starRatingLabel = new JLabel("Avaliação");
	private StarRater starRatingField = new StarRater(5);

    JLabel OndeAssLabel = new JLabel("Onde assistir");
    JRadioButton jRadioOndeAssistir1 = new JRadioButton();
    JRadioButton jRadioOndeAssistir2 = new JRadioButton();
    JRadioButton jRadioOndeAssistir3 = new JRadioButton();
    ButtonGroup OndeAssistirGroup = new ButtonGroup();
    
	private JLabel generoLabel = new JLabel("Genero");
	private String[] generoOptions = { "Terror", "Ação", "Ficção" };
    private JComboBox<String> jComboBoxGenero = new JComboBox<>(generoOptions);
	
    private String[] colunas = {"id", "Titulo", "Sinopse", "Genero", "Onde assistir", "Assistir", "Avaliação" };
    private DefaultTableModel tableModel = new DefaultTableModel(colunas , 0);
    private JTable tabela = new JTable(tableModel);
	
	public Janela() {
		setSize(330, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public void init() {
		JFrame jFrame = new JFrame("Fiap Movies");
		jFrame.setLayout(null);

	    //Create the tab container
	    JTabbedPane tabs = new JTabbedPane();
	    //Set tab container position
	    tabs.setBounds(20,20,450,250);
	    
	    //Create panel 1
	    painelCadastro.setLayout(new BorderLayout());
	    painelCadastro.setBorder(new EmptyBorder(10,10,10,10));
	    painelCadastro.setBounds(50, 50, 200, 200);
	    
	    JLabel pic = new JLabel(new ImageIcon("src/img/legiao_i3rmedDwbP9p.jpg"), JLabel.LEFT);
	    pic.setBounds(pic.getX(), pic.getY(), 100, 150);
		ImageIcon myImage = (ImageIcon) pic.getIcon();
        Image img = myImage.getImage();
        Image newImg = img.getScaledInstance(pic.getWidth(), pic.getHeight(),Image.SCALE_SMOOTH);
        pic.setIcon( new ImageIcon(newImg) );
        
        pic.setBorder(new EmptyBorder(0,0,30,0));
        pic.setPreferredSize(new Dimension(120,300));
                
	    pic.setVisible(true);
	    
	    //Add text box in panel 1
	    painelCadastro.add(pic, BorderLayout.LINE_START);

	    JPanel formularios1 = new JPanel();
	    formularios1.setLayout(new BoxLayout(formularios1, BoxLayout.Y_AXIS));
	    formularios1.setSize(400, 400);
	    
        
        titleLabel.setHorizontalAlignment(JLabel.LEFT);        
        titleField.setMaximumSize(new Dimension(150,30));

        formularios1.add(titleLabel);
        formularios1.add(titleField);
        
        formularios1.setAlignmentX(Component.LEFT_ALIGNMENT);
        
        sinopseField.setMaximumSize(new Dimension(150,30));

        formularios1.add(sinopseLabel);
        formularios1.add(sinopseField);
        
        jComboBoxGenero.setBounds(80, 50, 140, 20);
        jComboBoxGenero.setMaximumSize(new Dimension(150,30));

        formularios1.add(generoLabel);
        formularios1.add(jComboBoxGenero);
        
        JPanel panelButton = new JPanel();
        panelButton.setLayout(new FlowLayout());
        
        JButton buttonSave = new JButton("Salvar");
        BotaoListener listener = new BotaoListener(this);
        buttonSave.addActionListener(listener);
        
        JButton buttonCancel = new JButton("Cancelar");
        buttonSave.setMaximumSize(new Dimension(50,30));
        buttonCancel.setMaximumSize(new Dimension(50,30));
        panelButton.add(buttonSave);
        panelButton.add(buttonCancel);
        
        formularios1.add(panelButton);
        
        painelCadastro.add(formularios1);

	    JPanel formularios2 = new JPanel();
	    formularios2.setLayout(new BoxLayout(formularios2, BoxLayout.Y_AXIS));
	    formularios2.setSize(100, 100);   

        jRadioOndeAssistir1.setText("Netflix");     
        jRadioOndeAssistir2.setText("PrimeVideo"); 
        jRadioOndeAssistir3.setText("Pirate Bay");

        OndeAssistirGroup.add(jRadioOndeAssistir1);
        OndeAssistirGroup.add(jRadioOndeAssistir2);
        OndeAssistirGroup.add(jRadioOndeAssistir3);
        
        formularios2.add(OndeAssLabel);
        formularios2.add(jRadioOndeAssistir1);
        formularios2.add(jRadioOndeAssistir2);
        formularios2.add(jRadioOndeAssistir3);
        
        formularios2.add(assistido);

        formularios2.add(starRatingLabel);
        formularios2.add(starRatingField);
        
        painelCadastro.add(formularios2, BorderLayout.LINE_END);        
        
	    jFrame.add(tabs);
		jFrame.setSize(600,400);
		jFrame.setVisible(true);	    
		
		carregarDados();
		
		TableListener tableListener = new TableListener();
		tabela.addMouseListener(tableListener );
		tabela.setDefaultEditor(Object.class, null);

		tabs.add("Cadastro", painelCadastro);
		tabs.add("Lista", new JScrollPane(tabela));
	}
	
	public void carregarDados() {
		tableModel.setRowCount(0);
		List<Filme> lista = new FilmeDao().listarTodos();
		lista.forEach(produto -> tableModel.addRow(produto.getData()));
	}

	public String getTxtTitulo() {
		return titleField.getText();
	}

	public String getTxtSinopse() {
		return sinopseField.getText();
	}

	public String getTxtGenero() {
		return jComboBoxGenero.getSelectedItem().toString();
	}

	public String getTxtOndeAssistir() {
		String result = "";
		
		for (Enumeration<AbstractButton> buttons = OndeAssistirGroup.getElements(); buttons.hasMoreElements();) 
		{
	        AbstractButton button = buttons.nextElement();
	        if (button.isSelected()) {
	        	result =  button.getText();
	        }
	    }
		
		return result;
	}

	public String getTxtAssitido() {
		return assistido.isSelected() ? "Sim" : "Não";
	}

	public String getTxtAvaliacao() {
		return Integer.toString(starRatingField.getSelection()) + " Estrelas";
	}
	

}