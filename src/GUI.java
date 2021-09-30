import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
//������� & ��� ����������� ������ Papadopouloudionisia.txt 
public class GUI extends JFrame{
	
	private JPanel panel; //������ �����
	private JTextField textField;
	private JButton calcAutonomy;
	private JButton makefile;
	private JTextField townName,taxiSum,sumAutonomy;
	
	private JList<Fleet> list; 
	DefaultListModel<Fleet> model;
	private ArrayList<Fleet> fleet;
	private ArrayList<Taxi> taxi;
	
	
	public GUI(ArrayList<Fleet>f ) {
		fleet=f;
		
		panel= new JPanel(); //���������� ������� �����
		textField= new JTextField("����� �����-������");
		calcAutonomy=new JButton("����������� ����������");
		makefile= new JButton("���������� �������");
		townName= new JTextField("         ");
		taxiSum= new JTextField("           ");
		sumAutonomy= new JTextField("          ");
		
		panel.add(textField);
		panel.add(calcAutonomy);
		panel.add(makefile);
		panel.add(townName);
		panel.add(taxiSum);
		panel.add(sumAutonomy);

		this.setContentPane(panel);
		
		
//���� ������ �� ������ ����������� ����������	
	calcAutonomy.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			String town= textField.getText(); //������ �� ����� ��� ������������ � �������
			for(Fleet f: fleet) {
				if(f.getTownName().equals(town)) {
					String x= String.valueOf(f.getTownName()); //��������� �� string ��� ��� �������� ���
					townName.setText(x);
					int sumOftaxi= fleet.size(); //�� ������ ��� ����
					String sumOfTaxi= String.valueOf(sumOftaxi);
					taxiSum.setText(sumOfTaxi);
					int sumaut=0;
					taxi=f.getTaxi();
					for(Taxi t: taxi) {
						sumaut+=t.calcAutonomy();
					}
					String autonomy= String.valueOf(sumaut);
					sumAutonomy.setText(autonomy);
				}			
				
			}	
		}
		
		
	});
//���� ������ �� ������ ����������� �������
	makefile.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String town= textField.getText(); //������ �� ����� ��� ������������ � �������
			File file = new File("dai16094.txt"); //dimiourgia arxeiou
			for(Fleet f:fleet) {
				if(f.getTownName().equals(town)) {
					try {
						 FileWriter writer = new FileWriter(file);
						
						 //�������� ��� ARRAYLIST ��� ������
						 writer.write(town); //����� ��� ���� ���� 1� ������
						 writer.write(System.lineSeparator());//
						 for(Taxi t: taxi) { //��� �� ���������� ��� ���� �����
								writer.write(t.getArithmosK());
								 writer.write(System.lineSeparator());
								 String autonomy= String.valueOf(t.calcAutonomy());
								 writer.write(autonomy);
								 writer.write(System.lineSeparator());
							}
						 double totalAutonomy=0; //� �������� ��������� ��� �� ���� ���� �����
						 for(Taxi t:taxi) {
							 totalAutonomy+=t.calcAutonomy();
						 }
						 String TotalAutonomy=String.valueOf(totalAutonomy);
						 writer.write(TotalAutonomy);
						 
							
						 
						
						 
						 //K������� �������:
						 writer.close();
						 } catch (IOException e1) {
						 // TODO Auto-generated catch block
						 e1.printStackTrace();
				 }
					
				
					
					
				}
				
				
				
				
				
				
			}
			
			 
			

			
			
		}
		
		
		
	});
		
		
		this.setVisible(true);
		this.setSize(400,400);
		this.setTitle(" ");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	
	
	
	
}
