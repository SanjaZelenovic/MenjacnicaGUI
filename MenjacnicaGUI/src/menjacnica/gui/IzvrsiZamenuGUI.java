package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Toolkit;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.ButtonGroup;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class IzvrsiZamenuGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblKupovniKrus;
	private JTextField textFieldKupovni;
	private JLabel lblValuta;
	private JComboBox comboBox;
	private JLabel lblProdajniKurs;
	private JTextField textFieldProdajni;
	private JLabel lblIznos;
	private JTextField textFieldIznos;
	private JLabel lblVrstaTransakcija;
	private JRadioButton rdbtnKupovina;
	private JRadioButton rdbtnProdaja;
	private JSlider slider;
	private JButton btnIzvrsiZamenu;
	private JButton btnNewButton;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private int vrednost;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IzvrsiZamenuGUI frame = new IzvrsiZamenuGUI();
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
	public IzvrsiZamenuGUI() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(IzvrsiZamenuGUI.class.getResource("/com/sun/java/swing/plaf/windows/icons/DetailsView.gif")));
		setTitle("Izvrsi zamenu");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 452, 318);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblKupovniKrus());
		contentPane.add(getTextFieldKupovni());
		contentPane.add(getLblValuta());
		contentPane.add(getComboBox());
		contentPane.add(getLblProdajniKurs());
		contentPane.add(getTextFieldProdajni());
		contentPane.add(getLblIznos());
		contentPane.add(getTextField());
		contentPane.add(getLblVrstaTransakcija());
		contentPane.add(getRdbtnKupovina());
		contentPane.add(getRdbtnProdaja());
		contentPane.add(getSlider());
		contentPane.add(getBtnIzvrsiZamenu());
		contentPane.add(getBtnNewButton());
	}

	private JLabel getLblKupovniKrus() {
		if (lblKupovniKrus == null) {
			lblKupovniKrus = new JLabel("Kupovni krus");
			lblKupovniKrus.setBounds(12, 13, 101, 16);
		}
		return lblKupovniKrus;
	}
	private JTextField getTextFieldKupovni() {
		if (textFieldKupovni == null) {
			textFieldKupovni = new JTextField();
			textFieldKupovni.setEditable(false);
			textFieldKupovni.setBounds(12, 34, 142, 22);
			textFieldKupovni.setColumns(10);
		}
		return textFieldKupovni;
	}
	private JLabel getLblValuta() {
		if (lblValuta == null) {
			lblValuta = new JLabel("Valuta");
			lblValuta.setBounds(180, 13, 56, 16);
		}
		return lblValuta;
	}
	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"EUR", "USD", "CHF"}));
			comboBox.setBounds(180, 34, 62, 22);
		}
		return comboBox;
	}
	private JLabel getLblProdajniKurs() {
		if (lblProdajniKurs == null) {
			lblProdajniKurs = new JLabel("Prodajni kurs");
			lblProdajniKurs.setBounds(277, 13, 101, 16);
		}
		return lblProdajniKurs;
	}
	private JTextField getTextFieldProdajni() {
		if (textFieldProdajni == null) {
			textFieldProdajni = new JTextField();
			textFieldProdajni.setEditable(false);
			textFieldProdajni.setBounds(277, 34, 142, 22);
			textFieldProdajni.setColumns(10);
		}
		return textFieldProdajni;
	}
	private JLabel getLblIznos() {
		if (lblIznos == null) {
			lblIznos = new JLabel("Iznos");
			lblIznos.setBounds(12, 86, 56, 16);
		}
		return lblIznos;
	}
	private JTextField getTextField() {
		if (textFieldIznos == null) {
			textFieldIznos = new JTextField();
			textFieldIznos.setBounds(12, 115, 179, 22);
			textFieldIznos.setColumns(10);
		}
		return textFieldIznos;
	}
	private JLabel getLblVrstaTransakcija() {
		if (lblVrstaTransakcija == null) {
			lblVrstaTransakcija = new JLabel("Vrsta transakcija");
			lblVrstaTransakcija.setBounds(249, 86, 101, 16);
		}
		return lblVrstaTransakcija;
	}
	private JRadioButton getRdbtnKupovina() {
		if (rdbtnKupovina == null) {
			rdbtnKupovina = new JRadioButton("Kupovina");
			buttonGroup.add(rdbtnKupovina);
			rdbtnKupovina.setBounds(251, 114, 127, 25);
		}
		return rdbtnKupovina;
	}
	private JRadioButton getRdbtnProdaja() {
		if (rdbtnProdaja == null) {
			rdbtnProdaja = new JRadioButton("Prodaja");
			buttonGroup.add(rdbtnProdaja);
			rdbtnProdaja.setBounds(251, 144, 127, 25);
		}
		return rdbtnProdaja;
	}
	private JSlider getSlider() {
		
		if (slider == null) {
			slider = new JSlider();
			slider.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent ce) {
					int vrednost = slider.getValue();
					textFieldIznos.setText("" + vrednost);
				}
			});
			
			slider.setFont(new Font("Tahoma", Font.PLAIN, 13));
			slider.setMinorTickSpacing(5);
			slider.setMajorTickSpacing(10);
			slider.setSnapToTicks(true);
			slider.setPaintTicks(true);
			slider.setPaintLabels(true);
			slider.setBounds(41, 189, 354, 46);
		}
		return slider;
	}
	
	private String kupovinaProdaja() {
		String p = "Nepoznato";
		if(rdbtnProdaja.isSelected()) {
			p = "Prodaja";
		} 
		if (rdbtnKupovina.isSelected()) {
			p = "Kupovina";
		}
		return p;
	}
	
	private JButton getBtnIzvrsiZamenu() {
		if (btnIzvrsiZamenu == null) {
			btnIzvrsiZamenu = new JButton("Izvrsi zamenu");
			btnIzvrsiZamenu.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						String tekst = "Valuta: " + comboBox.getSelectedItem() + ", Iznos: " + textFieldIznos.getText() + ", Vrsi se: " + 
						kupovinaProdaja();
						
						MenjacnicaGUI.textAreaStatus.append(tekst + "\n");
					} catch (Exception e) {
						JOptionPane.showMessageDialog(contentPane,
								e.getMessage(), "Greska",
								JOptionPane.ERROR_MESSAGE);
					}
				}
			});
			btnIzvrsiZamenu.setBounds(51, 248, 127, 25);
		}
		return btnIzvrsiZamenu;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Odustani");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					dispose();
				}
			});
			btnNewButton.setBounds(251, 248, 127, 25);
		}
		return btnNewButton;
	}
}
