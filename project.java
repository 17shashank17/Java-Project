import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class project extends JFrame implements ActionListener{
	JLabel l1,l2,l3;
	JTextField t1,t2,t3;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26,b27,b28,b29,b30,b31,b32,b33,b34,b35,b36;
	public void setComponents(){
		t1=new JTextField();
		t2=new JTextField();
		b1=new JButton("7");
		b2=new JButton("8");
		b3=new JButton("9");
		b4=new JButton("4");
		b5=new JButton("5");
		b6=new JButton("6");
		b7=new JButton("1");
		b8=new JButton("2");
		b9=new JButton("3");
		b10=new JButton("\u03C0");
		b11=new JButton("0");
		b12=new JButton(".");
		b13=new JButton("+");
		b14=new JButton("-");
		b15=new JButton("*");
		b16=new JButton("/");
		b17=new JButton("%");
		b18=new JButton("^");
		b19=new JButton("n!");
		b20=new JButton("log");
		b21=new JButton("ln");
		b22=new JButton("\u207F"+"P"+"\u1D63");
		b23=new JButton("\u207F"+"C"+"\u1D63");
		b24=new JButton("sin");
		b25=new JButton("cos");
		b26=new JButton("tan");
		b27=new JButton("=");
		b28=new JButton("\u221A");
		b29=new JButton("AC 1T");
		b31=new JButton(")");
		b30=new JButton("(");
		b32=new JButton("AC 2T");
		b33=new JButton("sin"+"\u207B"+"\u00B9");
		b34=new JButton("cos"+"\u207B"+"\u00B9");
		b35=new JButton("tan"+"\u207B"+"\u00B9");
		b36=new JButton("\u221B");
		//b32=new JButton("==");

		setLayout(null);
		t1.setBounds(0,0,500,40);
		t2.setBounds(0,40,500,20);
		b1.setBounds(0,60,60,60);
		b2.setBounds(60,60,60,60);
		b3.setBounds(120,60,60,60);
		b4.setBounds(0,120,60,60);
		b5.setBounds(60,120,60,60);
		b6.setBounds(120,120,60,60);
		b7.setBounds(0,180,60,60);
		b8.setBounds(60,180,60,60);
		b9.setBounds(120,180,60,60);
		b10.setBounds(0,240,60,60);
		b11.setBounds(60,240,60,60);
		b12.setBounds(120,240,60,60);
		b13.setBounds(180,60,60,60);
		b14.setBounds(240,60,60,60);
		b15.setBounds(300,60,60,60);
		b16.setBounds(180,120,60,60);
		b17.setBounds(240,120,60,60);
		b18.setBounds(300,120,60,60);
		b19.setBounds(180,180,60,60);
		b20.setBounds(240,180,60,60);
		b21.setBounds(300,180,60,60);
		b22.setBounds(180,240,60,60);
		b23.setBounds(240,240,60,60);
		b24.setBounds(300,240,60,60);
		b25.setBounds(0,300,60,60);
		b26.setBounds(60,300,60,60);
		//b28.setBounds(120,300,80,60);
		//b27.setBounds(200,300,160,60);
		b28.setBounds(360,60,70,60);
		b36.setBounds(430,60,70,60);
		b29.setBounds(360,180,140,60);
		b32.setBounds(360,240,140,60);
		b27.setBounds(330,300,170,60);
		b30.setBounds(360,120,70,60);
		b31.setBounds(430,120,70,60);
		//b29.setBounds(360,60,140,60);
		//b30.setBounds(360,120,70,70);
		//b31.setBounds(430,120,70,70);
		//b32.setBounds(360,190,140,70);
		b33.setBounds(120,300,70,60);
		b34.setBounds(190,300,70,60);
		b35.setBounds(260,300,70,60);
		//b32.setBounds(430,180,70,70);

		//b1.addActionListener(this);
		add(t1);
		add(t2);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(b10);
		add(b12);
		add(b11);
		add(b13);
		add(b14);
		add(b15);		
		add(b16);
		add(b17);
		add(b18);
		add(b19);
		add(b20);
		add(b21);
		add(b22);
		add(b23);
		add(b24);
		add(b25);
		add(b26);
		add(b27);
		add(b28);
		add(b29);
		add(b30);
		add(b31);
		add(b32);
		add(b33);
		add(b34);
		add(b35);
		add(b36);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);
		b12.addActionListener(this);
		b13.addActionListener(this);
		b14.addActionListener(this);
		b15.addActionListener(this);
		b16.addActionListener(this);
		b17.addActionListener(this);
		b18.addActionListener(this);
		b19.addActionListener(this);
		b20.addActionListener(this);
		b21.addActionListener(this);
		b22.addActionListener(this);
		b23.addActionListener(this);
		b24.addActionListener(this);
		b25.addActionListener(this);
		b26.addActionListener(this);
		b27.addActionListener(this);
		b28.addActionListener(this);
		b29.addActionListener(this);
		b30.addActionListener(this);
		b31.addActionListener(this);
		b32.addActionListener(this);
		b33.addActionListener(this);
		b34.addActionListener(this);
		b35.addActionListener(this);
		b36.addActionListener(this);

	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==b1){
			t1.setText(String.valueOf(7));}
		else if(e.getSource()==b2){
			t1.setText(t1.getText() + String.valueOf(8));
		}
		else if(e.getSource()==b3){
			t1.setText(t1.getText() + String.valueOf(9));
		}
		else if(e.getSource()==b4){
			t1.setText(t1.getText() + String.valueOf(4));
		}
		else if(e.getSource()==b5){
			t1.setText(t1.getText() + String.valueOf(5));
		}
		else if(e.getSource()==b6){
			t1.setText(t1.getText() + String.valueOf(6));
		}
		else if(e.getSource()==b7){
			t1.setText(t1.getText() + String.valueOf(1));
		}
		else if(e.getSource()==b8){
			t1.setText(t1.getText() + String.valueOf(2));
		}
		else if(e.getSource()==b9){
			t1.setText(t1.getText() + String.valueOf(3));
		}
		else if(e.getSource()==b10){
			t1.setText(t1.getText() + String.valueOf(3.14));
		}
		else if(e.getSource()==b11){
			t1.setText(t1.getText() + String.valueOf(0));
		}
		else if(e.getSource()==b12){
			t1.setText(t1.getText() + String.valueOf("."));
		}
		else if(e.getSource()==b13){
			t1.setText(t1.getText() + String.valueOf("+"));
		}
		else if(e.getSource()==b14){
			t1.setText(t1.getText() + String.valueOf("-"));
		}
		else if(e.getSource()==b15){
			t1.setText(t1.getText() + String.valueOf("*"));
		}
		else if(e.getSource()==b16){
			t1.setText(t1.getText() + String.valueOf("/"));
		}
		else if(e.getSource()==b17){
			t1.setText(t1.getText() + String.valueOf("%"));
		}
		else if(e.getSource()==b18){
			String a=t2.getText();
			String arr[]=a.split(" ",2);
			double x=Double.parseDouble(arr[0]);
			double y=Double.parseDouble(arr[1]);
			double z=Math.pow(x,y);
			t2.setText(String.valueOf(z));

		}
		else if(e.getSource()==b19){
			int n = Integer.parseInt(t2.getText());
			if(n<0){
				JOptionPane.showMessageDialog(null, "Factorial of Negative!");
			}
			else
			t2.setText(String.valueOf(fact(n)));
			
		}
		else if(e.getSource()==b21){
			int l = Integer.parseInt(t2.getText());
			if(l<0){
				JOptionPane.showMessageDialog(null, "log of Negative!");
			}
			else
			t2.setText(String.valueOf(log(l)));
			
		}
		else if(e.getSource()==b20){

			int l1 = Integer.parseInt(t2.getText());
			if(l1<0){
				JOptionPane.showMessageDialog(null, "Log of Negative!");
			}
			else

			t2.setText(String.valueOf(log10(l1)));
			
		}
		else if(e.getSource()==b22){
			String b=t2.getText();
			String arr[]=b.split("P",2);
			int x1=Integer.parseInt(arr[0]);
			int y1=Integer.parseInt(arr[1]);
			if(x1<=0 || y1<0 || y1>x1){
				JOptionPane.showMessageDialog(null, "Please recheck your entered value");
			}
			else
			t2.setText(String.valueOf(Permutations(x1,y1)));
		}
		else if(e.getSource()==b23){
			String c=t2.getText();
			String arr[]=c.split("C",2);
			int x2=Integer.parseInt(arr[0]);
			int y2=Integer.parseInt(arr[1]);
			if(x2<=0 || y2<0 || y2>x2){
				JOptionPane.showMessageDialog(null, "Please Recheck your entered value");
			}
			else
			t2.setText(String.valueOf(Combinations(x2,y2)));
			}

		else if(e.getSource()==b24){
			String deg=t2.getText();
			double dg=Double.parseDouble(deg);
			double rad=Math.toRadians(dg);
			double sine=Math.sin(rad);
			t2.setText(String.valueOf(sine));
		}
		else if(e.getSource()==b25){
			String deg1=t2.getText();
			double dg1=Double.parseDouble(deg1);
			double rad1=Math.toRadians(dg1);
			double cosine=Math.cos(rad1);
			t2.setText(String.valueOf(cosine));
		}
		else if(e.getSource()==b26){
			String deg2=t2.getText();
			double dg2=Double.parseDouble(deg2);
			double rad2=Math.toRadians(dg2);
			double tangent=Math.tan(rad2);
			t2.setText(String.valueOf(tangent));
		}

		else if(e.getSource()==b27){
			if(t1.getText()==null){
				JOptionPane.showMessageDialog(null, "Enter a value to continue");
			}
			else{
			FullCalculator obj=new FullCalculator();
			double x=obj.processInput(t1.getText());
			t2.setText(String.valueOf(x));
			}
		}

		else if(e.getSource()==b28){
			double x=Double.parseDouble(t2.getText());
			double y=Math.pow(x,0.5);
			if(x<0){
				JOptionPane.showMessageDialog(null, "Square root of negative value!");
			}
			else
			t2.setText(String.valueOf(y));
		}
		else if(e.getSource()==b29){
			t1.setText(null);
		}
		else if(e.getSource()==b30){
			t1.setText(t1.getText() + String.valueOf("("));
		}
		else if(e.getSource()==b31){
			t1.setText(t1.getText() + String.valueOf(")"));
		}
		else if(e.getSource()==b32){
			t2.setText(null);
		}
		else if(e.getSource()==b33){
			double a1=Double.parseDouble(t2.getText());
			if(a1>=-1 && a1<=1){
				double a2=Math.asin(a1);
				double a3=Math.toDegrees(a2);
				t2.setText(String.valueOf(a3));
			}
			else
				JOptionPane.showMessageDialog(null, "Out of Range");
		}
		else if(e.getSource()==b34){
			double k1=Double.parseDouble(t2.getText());
			if(k1>=-1 && k1<=1){
				double k2=Math.acos(k1);
				double k3=Math.toDegrees(k2);
				t2.setText(String.valueOf(k3));
			}
			else
				JOptionPane.showMessageDialog(null, "Out of Range");
		}
		else if(e.getSource()==b35){
			double m1=Double.parseDouble(t2.getText());
				double m2=Math.atan(m1);
				double m3=Math.toDegrees(m2);
				t2.setText(String.valueOf(m3));
		}
		else if(e.getSource()==b36){
			double e1=Double.parseDouble(t2.getText());
			double e2=Math.pow(e1,1/3);
			t2.setText(String.valueOf(e2));

		}


	}

	public double log(double a){
		return Math.log(a);
	}

	public double log10(double a){
		return (Math.log(a)/Math.log(10));
	}

	public int fact(int n){
		if(n==1 || n==0){
			return 1;
		}
		else
			return n*fact(n-1);
	}

	public double Combinations(int x,int y){
		return (fact(x)/(fact(x-y)*fact(y)));
	}

	public double Permutations(int x,int y){
		return (fact(x)/fact(x-y));
	}

	public static void main(String args[]){

		project jf=new project();
		jf.setComponents();
		jf.setSize(500,500);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
}