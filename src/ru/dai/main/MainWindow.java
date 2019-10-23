package ru.dai.main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.TitledBorder;
import javax.swing.JPanel;
import java.awt.Rectangle;

public class MainWindow extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	
	public MainWindow(int width, int heigth) {
		setTitle("Расчет пенсии с недвиги");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		setSize(640,480);
		
		JLabel label = new JLabel("\u041D\u0430\u0447\u0430\u043B\u044C\u043D\u044B\u0439 \u043A\u0430\u043F\u0438\u0442\u0430\u043B:");
		label.setBounds(10, 11, 129, 14);
		getContentPane().add(label);
		
		JLabel label_1 = new JLabel("\u041F\u0440\u043E\u0446\u0435\u043D\u0442 \u043F\u043E \u0432\u043A\u043B\u0430\u0434\u0443:");
		label_1.setBounds(10, 32, 129, 14);
		getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("\u041F\u0440\u0438\u0431\u0430\u0432\u043A\u0430 \u043E\u0442 \u043D\u0435\u0434\u0432\u0438\u0433\u0438:");
		label_2.setBounds(10, 57, 129, 14);
		getContentPane().add(label_2);
		
		textField = new JTextField();
		textField.setText("0");
		textField.setBounds(144, 8, 86, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setText("6");
		textField_1.setBounds(144, 29, 86, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setText("7000");
		textField_2.setBounds(144, 54, 86, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel label_3 = new JLabel("\u0415\u0436\u0435\u043C\u0435\u0441\u044F\u0447\u043D\u043E\u0435 \u043F\u043E\u043F\u043E\u043B\u043D\u0435\u043D\u0438\u0435:");
		label_3.setBounds(240, 11, 140, 14);
		getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("\u0421\u0442\u043E\u0438\u043C\u043E\u0441\u0442\u044C \u043D\u0435\u0434\u0432\u0438\u0433\u0438:");
		label_4.setBounds(240, 32, 140, 14);
		getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("\u041D\u0435\u0434\u0432\u0438\u0433\u0430 \u043D\u0430 \u0441\u0442\u0430\u0440\u0442\u0435:");
		label_5.setBounds(240, 57, 140, 14);
		getContentPane().add(label_5);
		
		textField_3 = new JTextField();
		textField_3.setText("0");
		textField_3.setBounds(384, 8, 86, 20);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setText("900000");
		textField_4.setBounds(384, 29, 86, 20);
		getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setText("3");
		textField_5.setBounds(384, 54, 86, 20);
		getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JButton button = new JButton("\u0420\u0430\u0441\u0447\u0438\u0442\u0430\u0442\u044C");
		
		button.setBounds(480, 53, 104, 23);
		getContentPane().add(button);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 80, 634, 377);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(new Rectangle(0, 76, 634, 376));
		textArea.setBorder(new TitledBorder(null, "\u0420\u0430\u0441\u0447\u0435\u0442\u044B", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		JScrollPane scroll = new JScrollPane(textArea);
		scroll.setSize(634, 376);
		scroll.setLocation(0, 0);
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		panel.add(scroll);
		
		textField_6 = new JTextField();
		textField_6.setText("360");
		textField_6.setBounds(480, 29, 86, 20);
		getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JLabel label_6 = new JLabel("\u041A\u043E\u043B-\u0432\u043E \u043C\u0435\u0441\u044F\u0446\u0435\u0432:");
		label_6.setBounds(477, 8, 89, 14);
		getContentPane().add(label_6);
		//объявление переменных

		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				int mes=Integer.parseInt(textField_6.getText());
				double capitalStart=Double.parseDouble(textField.getText());
				double procent=Double.parseDouble(textField_1.getText());
				double pribavkaNedv=Double.parseDouble(textField_2.getText());
				double pribavkaMes=Double.parseDouble(textField_3.getText());
				double stoimostNedv=Double.parseDouble(textField_4.getText());
				double kolvoNedv=Double.parseDouble(textField_5.getText());
				double schet=0;
				double prProc=0;
				double pribavkaObsch=0;
				String row=""; 
				schet=capitalStart;
				
				for (int i = 0; i < mes; i++) {
					prProc=(schet/100)*procent/12;
					pribavkaObsch=pribavkaMes+pribavkaNedv*kolvoNedv+prProc;
					schet=schet+pribavkaObsch;
					while(schet>=stoimostNedv) {
						schet=schet-stoimostNedv;
						kolvoNedv=kolvoNedv+1;
					}
					row=Integer.toString(i)+"-й месяц "+Integer.toString((int)schet)+ " прибавится "+ Integer.toString((int)pribavkaObsch)+" в собственности "+Integer.toString((int)kolvoNedv);
					textArea.append(row+"\n");
				}
				
				
				
			}
		});
		
		
		setResizable(false);
		setVisible(true);
	}
}
