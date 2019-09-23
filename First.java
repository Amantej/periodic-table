import java.awt.*;
import javax.swing.*;
import java.awt.event.*;   
class First extends Frame {  
First(){  
Button b1=new Button("H");  
b1.setBounds(0,100,75,75);// setting button position
b1.setBackground(Color.yellow);
b1.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Hydrogen\nAtomic number-1\nAtomic Mass-1.008\nDensity-0.0899*10^-3 g.cm^-3 at 20 °C\nMelting point- 259.2 °C\nBoiling point- 252.8 °C\nDiscovered by Henry Cavendish in 1766*";
             JOptionPane.showMessageDialog(null, message);
    }    
    });  
Button b2=new Button("He");  
b2.setBounds(1275,100,75,75);// setting button position 
b2.setBackground(Color.blue);
b2.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Helium\nAtomic number-2\nAtomic Mass-4.002\nDensity-0.178*10 -3 g.cm^-3 at 20 °C\nMelting point- 272.2 (26 atm) °C\nBoiling point- 268.9 °C\nDiscovered by Sir Ramsey in 1895";
             JOptionPane.showMessageDialog(null, message);
    }  
    });  
Button b3=new Button("Li");  
b3.setBounds(0,175,75,75);// setting button position
b3.setBackground(Color.red); 
b3.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Lithium\nAtomic number-3\nAtomic Mass-6.94\nDensity-0.53 g.cm^-3 at 20 °C\nMelting point-180.5 °C\nBoiling point-1342 °C\nDiscovered by Johann Arfvedson in 1817";
             JOptionPane.showMessageDialog(null, message);
    }  
    }); 
Button b4=new Button("Be");  
b4.setBounds(75,175,75,75);// setting button position
b4.setBackground(Color.green);  
b4.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Beryllium\nAtomic number-4\nAtomic Mass-9.0121\nDensity-1.86 g.cm-3\nMelting point-1280 °C\nBoiling point-2970 °C\nDiscovered by Abbé René-Just Hauy in 1798";
             JOptionPane.showMessageDialog(null, message);
    }  
    }); 
Button b5=new Button("B");  
b5.setBounds(900,175,75,75);// setting button position
b5.setBackground(Color.gray);  
b5.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Boron\nAtomic number-5\nAtomic Mass-10.81\nDensity-2.3 g.cm-3 at 20°C\nMelting point-2076 °C\nBoiling point-3927 °C\nDiscovered by Sir Humphry Davy and J.L Gay-Lussac in 1808";
             JOptionPane.showMessageDialog(null, message);
    }  
    }); 
Button b6=new Button("C");  
b6.setBounds(975,175,75,75);// setting button position
b6.setBackground(Color.yellow);
b6.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "carbon\nAtomic number-6\nAtomic Mass-12.011\nDensity-2.2 g.cm-3 at 20°C\nMelting point-3652 °C\nBoiling point-4827 °C\nDiscovered by The ancients";
             JOptionPane.showMessageDialog(null, message);
    }  
    });  
Button b7=new Button("N");   
b7.setBounds(1050,175,75,75);// setting button position
b7.setBackground(Color.yellow);
b7.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Nitrogen\nAtomic number-7\nAtomic Mass-14.007\nDensity-1.25*10-3 g.cm-3 at 20°C\nMelting point-210 °C\nBoiling point-195.8 °C\nDiscovered by Rutherford in 1772";
             JOptionPane.showMessageDialog(null, message);
    }  
    }); 
Button b8=new Button("O");   
b8.setBounds(1125,175,75,75);// setting button position
b8.setBackground(Color.yellow);
b8.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Oxygen\nAtomic number-8\nAtomic Mass-15.999\nDensity-1.429 kg/m3 at 20°C\nMelting point-219 °C\nBoiling point-183 °C\nDiscovered by Joseph Priestly in 1774";
             JOptionPane.showMessageDialog(null, message);
    }  
    });  
Button b9=new Button("F");   
b9.setBounds(1200,175,75,75);// setting button position
b9.setBackground(Color.yellow);
b9.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Fluorine\nAtomic number-9\nAtomic Mass-18.9984\nDensity-1.8*10-3 g.cm-3 at 20°C\nMelting point-219.6 °C\nBoiling point-188 °C\nDiscovered by Moissan in 1886";
             JOptionPane.showMessageDialog(null, message);
    }  
    });  
Button b10=new Button("Ne"); 
b10.setBounds(1275,175,75,75);// setting button position
b10.setBackground(Color.blue);
b10.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Neon\nAtomic number-10\nAtomic Mass-20.1797\nDensity-0.9*10 -3 g.cm-3 at 20°C\nMelting point-249 °C\nBoiling point-246 °C\nDiscovered by Sir Ramsay in 1898";
             JOptionPane.showMessageDialog(null, message);
    }  
    });
Button b11=new Button("Na");   
b11.setBounds(0,250,75,75);// setting button position
b11.setBackground(Color.red);
b11.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Sodium\nAtomic number-11\nAtomic Mass-22.9897\nDensity-0.97 g.cm -3 at 20 °C\nMelting point-97.5 °C\nBoiling point-883 °C\nDiscovered by Sir Humphrey Davy in 1807";
             JOptionPane.showMessageDialog(null, message);
    }  
    }); 
Button b12=new Button("Mg");   
b12.setBounds(75,250,75,75);// setting button position
b12.setBackground(Color.green);
b12.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Magnesium\nAtomic number-12\nAtomic Mass-24.305\nDensity-1.74 g.cm -3 at 20 °C\nMelting point-650 °C\nBoiling point-1107 °C\nDiscovered by Sir Humphrey Davy in 1808";
             JOptionPane.showMessageDialog(null, message);
    }  
    }); 
Button b13=new Button("Al");   
b13.setBounds(900,250,75,75);// setting button position
b13.setBackground(Color.lightGray);
b13.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Aluminum\nAtomic number-13\nAtomic Mass-26.9815\nDensity-2.7 g.cm -3 at 20 °C\nMelting point-660.4 °C\nBoiling point-2467 °C\nDiscovered by Hans Christian Oersted in 1825";
             JOptionPane.showMessageDialog(null, message);
    }  
    }); 
Button b14=new Button("Si");   
b14.setBounds(975,250,75,75);// setting button position
b14.setBackground(Color.gray); 
b14.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Silicon\nAtomic number-14\nAtomic Mass-28.085\nDensity-2.33 g.cm -3 at 20 °C\nMelting point-1410 °C\nBoiling point-3265 °C\nDiscovered by Jons Berzelius in 1823";
             JOptionPane.showMessageDialog(null, message);
    }  
    });
Button b15=new Button("P");  
b15.setBounds(1050,250,75,75);// setting button position
b15.setBackground(Color.yellow); 
b15.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Phosphorus\nAtomic number-15\nAtomic Mass-30.9737\nDensity-1,82 g/ml at 20°C\nMelting point-44,2 °C\nBoiling point-280 °C\nDiscovered by Hennig Brandt in 1669";
             JOptionPane.showMessageDialog(null, message);
    }  
    });
Button b16=new Button("S");  
b16.setBounds(1125,250,75,75);// setting button position
b16.setBackground(Color.yellow);
b16.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Sulfur\nAtomic number-16\nAtomic Mass-32.06\nDensity-2.07 g.cm -3 at 20 °C\nMelting point-113 °C\nBoiling point-445 °C\nDiscovered by The ancients";
             JOptionPane.showMessageDialog(null, message);
    }  
    }); 
Button b17=new Button("Cl");  
b17.setBounds(1200,250,75,75);// setting button position
b17.setBackground(Color.yellow); 
b17.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Chlorine\nAtomic number-17\nAtomic Mass-35.45\nDensity-3.21*10 -3 g.cm -3 at 20 °C\nMelting point-101 °C\nBoiling point-34.6 °C\nDiscovered by Carl Wilhelm Scheele in 1774";
             JOptionPane.showMessageDialog(null, message);
    }  
    });
Button b18=new Button("Ar");  
b18.setBounds(1275,250,75,75);// setting button position
b18.setBackground(Color.blue);
b18.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Argon\nAtomic number-18\nAtomic Mass-39.948\nDensity-1.78.10 -3 g.cm -3 at 0 °C\nMelting point-189 °C\nBoiling point-185.7 °C\nDiscovered by Sir Ramsay in 1894";
             JOptionPane.showMessageDialog(null, message);
    }  
    }); 
Button b19=new Button("K");  
b19.setBounds(0,325,75,75);// setting button position
b19.setBackground(Color.red);
b19.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Potassium\nAtomic number-19\nAtomic Mass-39.0983\nDensity-0.86 g.cm -3 at 0 °C\nMelting point-63.2 °C\nBoiling point-760 °C\nDiscovered by Sir Davy in 1808";
             JOptionPane.showMessageDialog(null, message);
    }  
    }); 
Button b20=new Button("Ca");  
b20.setBounds(75,325,75,75);// setting button position
b20.setBackground(Color.green);
b20.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Calcium\nAtomic number-20\nAtomic Mass-40.078\nMass volume-1.6 g.cm-3 at 20°C\nMelting point-840 °C\nBoiling point-1484 °C\nDiscovered Sir Humphrey Davy in 1808";
             JOptionPane.showMessageDialog(null, message);
    }  
    }); 
Button b21=new Button("Sc");  
b21.setBounds(150,325,75,75);// setting button position
b21.setBackground(Color.pink);
b21.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Scandium\nAtomic number-21\nAtomic Mass-44.9559\nAtomicDensity-3.0 g.cm-3 at 20°C\nMelting point-1541 °C\nBoiling point-2836 °C\nDiscovered by Lars Nilson in 1879";
             JOptionPane.showMessageDialog(null, message);
    }  
    });  
Button b22=new Button("Ti");  
b22.setBounds(225,325,75,75);// setting button position
b22.setBackground(Color.pink);
b22.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Titanium\nAtomic number-22\nAtomic Mass-47.867\nDensity-4.51 g.cm-3 at 20°C\nMelting point-1660 °C\nBoiling point-3287 °C\nDiscovered by William Gregor in 1791";
             JOptionPane.showMessageDialog(null, message);
    }  
    });  
Button b23=new Button("V");  
b23.setBounds(300,325,75,75);// setting button position
b23.setBackground(Color.pink);
b23.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Vanadium\nAtomic number-23\nAtomic Mass-50.9415\nDensity-6.1 g.cm-3 at 20°C\nMelting point-1910 °C\nBoiling point-3407 °C\nDiscovered by Nils Sefstrom in 1830";
             JOptionPane.showMessageDialog(null, message);
    }  
    });  
Button b24=new Button("Cr");  
b24.setBounds(375,325,75,75);// setting button position
b24.setBackground(Color.pink);
b24.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Chromium\nAtomic number-24\nAtomic Mass-51.9961\nDensity-7.19 g.cm-3 at 20°C\nMelting point-1907 °C\nBoiling point-2672 °C\nDiscovered by Vaughlin in 1797";
             JOptionPane.showMessageDialog(null, message);
    }  
    });  
Button b25=new Button("Mn");  
b25.setBounds(450,325,75,75);// setting button position
b25.setBackground(Color.pink); 
b25.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Manganese\nAtomic number-25\nAtomic Mass-54.9380\nDensity-7.43 g.cm-3 at 20°C\nMelting point-1247 °C\nBoiling point-2061 °C\nDiscovered Johann Gahn in 1774";
             JOptionPane.showMessageDialog(null, message);
    }  
    }); 
Button b26=new Button("Fe");  
b26.setBounds(525,325,75,75);// setting button position
b26.setBackground(Color.pink); 
b26.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Iron\nAtomic number-26\nAtomic Mass-55.845\nDensity-7.8 g.cm-3 at 20°C\nMelting point-1536 °C\nBoiling point-2861 °C\nDiscovered by The ancients";
             JOptionPane.showMessageDialog(null, message);
    }  
    }); 
Button b27=new Button("Co");  
b27.setBounds(600,325,75,75);// setting button position
b27.setBackground(Color.pink); 
b27.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Cobalt\nAtomic number-27\nAtomic Mass-58.9331\nDensity-8.9 g.cm-3 at 20°C\nMelting point-1495°C\nBoiling point-2927°C\nDiscovered by George Brandt in 1737";
             JOptionPane.showMessageDialog(null, message);
    }  
    }); 
Button b28=new Button("Ni");  
b28.setBounds(675,325,75,75);// setting button position
b28.setBackground(Color.pink);
b28.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Nickel\nAtomic number-28\nAtomic Mass-58.6934\nDensity8.9 g.cm-3 at 20°C\nMelting point1453 °C\nBoiling point 2913 °C\nDiscovered by Alex Constedt 1751";
             JOptionPane.showMessageDialog(null, message);
    }  
    }); 
Button b29=new Button("Cu");  
b29.setBounds(750,325,75,75);// setting button position
b29.setBackground(Color.pink); 
b29.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Copper\nAtomic number-29\nAtomic Mass-63.546\nDensity8.9 g.cm-3 at 20°C\nMelting point1083 °C\nBoiling point2595 °C\nDiscovered by The ancients";
             JOptionPane.showMessageDialog(null, message);
    }  
    }); 
Button b30=new Button("Zn");  
b30.setBounds(825,325,75,75);// setting button position
b30.setBackground(Color.lightGray);
b30.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Zinc\nAtomic number-30\nAtomic Mass-65.38\nDensity7.11 g.cm-3 at 20°C\nMelting point420 °C\nBoiling point907 °C\nDiscovered Andreas Marggraf in 1746";
             JOptionPane.showMessageDialog(null, message);
    }  
    });  
Button b31=new Button("Ga");  
b31.setBounds(900,325,75,75);// setting button position
b31.setBackground(Color.lightGray); 
b31.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Gallium\nAtomic number-31\nAtomic Mass-69.723\nDensity5.1 g.cm-3 at 20°C\nMelting point29.8 °C\nBoiling point 2204 °C";
             JOptionPane.showMessageDialog(null, message);
    }  
    }); 
Button b32=new Button("Ge");  
b32.setBounds(975,325,75,75);// setting button position
b32.setBackground(Color.gray);  
b32.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Germanium\nAtomic number-32\nAtomic Mass-72.63\nDensity5.3 g.cm-3 at 20°C\nMelting point937 °C\nBoiling point2830 °C\nDiscovered by Clemens Winkler in 1886";
             JOptionPane.showMessageDialog(null, message);
    }  
    }); 
Button b33=new Button("As");  
b33.setBounds(1050,325,75,75);// setting button position
b33.setBackground(Color.gray);
b33.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Arsenic\nAtomic number-33\nAtomic Mass-74.9215\nDensity5.7 g.cm-3 at 14°C\nMelting point814 °C (36 atm)\nBoiling point615 °C (sublimation)\nDiscovered by The ancients";
             JOptionPane.showMessageDialog(null, message);
    }  
    }); 
Button b34=new Button("Se");  
b34.setBounds(1125,325,75,75);// setting button position
b34.setBackground(Color.yellow);
b34.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Selenium\nAtomic number-34\nAtomic Mass-78.971\nDensity4.79 g.cm-3 at 20°C\nMelting point217 °C\nBoiling point688 °C\nDiscovered by Jons Berzelius 1817";
             JOptionPane.showMessageDialog(null, message);
    }  
    }); 
Button b35=new Button("Br");  
b35.setBounds(1200,325,75,75);// setting button position
b35.setBackground(Color.yellow);
b35.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Bromine\nAtomic number-35\nAtomic Mass-79.904\nDensity3.1 g.cm-3 at 20°C\nMelting point- 7.2 °C\nBoiling point58.8 °C\nDiscovered by Anthoine Balard in 1826";
             JOptionPane.showMessageDialog(null, message);
    }  
    }); 
Button b36=new Button("Kr");  
b36.setBounds(1275,325,75,75);// setting button position
b36.setBackground(Color.blue);
b36.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Krypton\nAtomic number-36\nAtomic Mass-83.798\nDensity3.73 10-3 g.cm-3 at 20°C\nMelting point- 157 °C\nBoiling point- 153° C\nDiscovered by Sir Ramsay in 1898";
             JOptionPane.showMessageDialog(null, message);
    }  
    }); 
Button b37=new Button("Rb");  
b37.setBounds(0,400,75,75);// setting button position
b37.setBackground(Color.red); 
b37.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Rubidium\nAtomic number-37\nAtomic Mass-85.4678\nDensity-1.53 g.cm-3 at 20°C\nMelting point-39 °C\nBoiling point-696 °C\nDiscovered by Robert Wilhem Bunsen and Gustav Robert Kirchhoff in 1861";
             JOptionPane.showMessageDialog(null, message);
    }  
    }); 
Button b38=new Button("Sr");  
b38.setBounds(75,400,75,75);// setting button position
b38.setBackground(Color.green);
b38.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Strontium\nAtomic number-38\nAtomic Mass-87.62\nDensity-2.6 g.cm-3 at 20°C\nMelting point-769 °C\n-Boiling point-1384 °C\nDiscovered by A.Crawford in 1790";
             JOptionPane.showMessageDialog(null, message);
    }  
    });  
Button b39=new Button("Y");  
b39.setBounds(150,400,75,75);// setting button position
b39.setBackground(Color.pink);
b39.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Yttrium\nAtomic number-39\nAtomic Mass-88.9058\nDensity-4.47 g.cm-3 at 20°C\nMelting point-1500 °C\nBoiling point-3336 °C\nDiscovered by Johann Gadolin in 1794";
             JOptionPane.showMessageDialog(null, message);
    }  
    });  
Button b40=new Button("Zr");  
b40.setBounds(225,400,75,75);// setting button position
b40.setBackground(Color.pink);
b40.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Zirconium\nAtomic number-40\nAtomic Mass-91.224\nDensity-6.49 g.cm-3 at 20°C\nMelting point-1852 °C\nBoiling point-4400 °C\nDiscovered by Martin Klaproth in 1789";
             JOptionPane.showMessageDialog(null, message);
    }  
    });  
Button b41=new Button("Nb");  
b41.setBounds(300,400,75,75);// setting button position
b41.setBackground(Color.pink); 
b41.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Niobium\nAtomic number-41\nAtomic Mass-92.9063\nDensity-8.4 g.cm-3 at 20°C\nMelting point-2410 °C\nBoiling point-5100 °C\nDiscovered by Charles Hatchett 1801";
             JOptionPane.showMessageDialog(null, message);
    }  
    }); 
Button b42=new Button("Mo");  
b42.setBounds(375,400,75,75);// setting button position
b42.setBackground(Color.pink);
b42.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Molybdenum\nAtomic number-42\nAtomic Mass-95.95\nDensity-10.2 g.cm-3 at 20°C\nMelting point-2610 °C\nBoiling point-4825 °C\nDiscovered by Carl Wilhelm Scheele in 1778";
             JOptionPane.showMessageDialog(null, message);
    }  
    });  
Button b43=new Button("Tc");  
b43.setBounds(450,400,75,75);// setting button position
b43.setBackground(Color.pink);
b43.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Technetium\nAtomic number-43\nAtomic Mass-97\nDensity-11.5 g.cm-3 at 20°C\nMelting point-2200 oC\nBoiling point-4877 oC\nDiscovered by Carlo Perrier in 1937";
             JOptionPane.showMessageDialog(null, message);
    }  
    });  
Button b44=new Button("Ru");  
b44.setBounds(525,400,75,75);// setting button position
b44.setBackground(Color.pink); 
b44.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Ruthenium\nAtomic number-44\nAtomic Mass-101.07\nDensity-12.2 g.cm-3 at 20°C\nMelting point-2250 °C\nBoiling point-4150 °C\nDiscovered by Karl Klaus in 1844";
             JOptionPane.showMessageDialog(null, message);
    }  
    }); 
Button b45=new Button("Rh");  
b45.setBounds(600,400,75,75);// setting button position
b45.setBackground(Color.pink);
b45.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Rhodium\nAtomic number-45\nAtomic Mass-102.9055\nDensity-12.4 g.cm-3 at 20°C\nMelting point-1970 °C\nBoiling point3727 °C\nDiscovered by William Wollaston in 1803";
             JOptionPane.showMessageDialog(null, message);
    }  
    });  
Button b46=new Button("Pd");  
b46.setBounds(675,400,75,75);// setting button position
b46.setBackground(Color.pink);
b46.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Palladium\nAtomic number-46\nAtomic Mass-106.42\nDensity-11.9 g.cm-3 at 20°C\nMelting point-1560 °C\nBoiling point-2927 °C\nDiscovered by William Wollaston in 1803";
             JOptionPane.showMessageDialog(null, message);
    }  
    }); 
Button b47=new Button("Ag");  
b47.setBounds(750,400,75,75);// setting button position
b47.setBackground(Color.pink); 
b47.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Silver\nAtomic number-47\nAtomic Mass-107.8682\nDensity-10.5 g.cm-3 at 20°C\nMelting point-962 °C\nBoiling point-2212 °C\nDiscovered by The ancients";
             JOptionPane.showMessageDialog(null, message);
    }  
    }); 
Button b48=new Button("Cd");  
b48.setBounds(825,400,75,75);// setting button position
b48.setBackground(Color.lightGray);
b48.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Cadmium\nAtomic number-48\nAtomic Mass-112.414\nDensity-8.7 g.cm-3 at 20°CM\nelting point-321 °C\nBoiling point-767 °C\nDiscovered Fredrich Stromeyer in 1817";
             JOptionPane.showMessageDialog(null, message);
    }  
    });  
Button b49=new Button("In");  
b49.setBounds(900,400,75,75);// setting button position
b49.setBackground(Color.lightGray); 
b49.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Indium\nAtomic number-49\nAtomic Mass-114.818\nDensity7.31 g.cm-3 at 20°C\nMelting point-156 °C\nBoiling point-2000 °C\nDiscovered by Ferdinand Reich 1863";
             JOptionPane.showMessageDialog(null, message);
    }  
    }); 
Button b50=new Button("Sn");  
b50.setBounds(975,400,75,75);// setting button position
b50.setBackground(Color.lightGray);
b50.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Tin\nAtomic number-50\nAtomic Mass-118.71\nDensity-5.77g.cm-3 (alpha) and 7.3 g.cm-3 at 20°C (beta)\nMelting point-232 °C\nBoiling point-2270 °CD\niscovered by The ancients";
             JOptionPane.showMessageDialog(null, message);
    }  
    });   
Button b51=new Button("Sb");  
b51.setBounds(1050,400,75,75);// setting button position
b51.setBackground(Color.gray);
b51.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Antimony\nAtomic number-51\nAtomic Mass-121.76\nDensity-6.684 g.cm-3\nMelting point 631 °C\nBoiling point 1587 °C\nDiscovered by The ancients";
             JOptionPane.showMessageDialog(null, message);
    }  
    });
Button b52=new Button("Te");  
b52.setBounds(1125,400,75,75);// setting button position
b52.setBackground(Color.gray);
b52.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Tellurium\nAtomic number-52\nAtomic Mass-127.6\nDensity-6.24 g.cm-3\nMelting point-450 °C\nBoiling point-988 °C\nDiscovered by Franz Muller von Reichenstein in 1782";
             JOptionPane.showMessageDialog(null, message);
    }  
    });
Button b53=new Button("I");  
b53.setBounds(1200,400,75,75);// setting button position
b53.setBackground(Color.yellow);
b53.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Iodine\nAtomic number-53\nAtomic Mass-126.9044\nDensity-4.93 g.cm-3 at 20°C\nMelting point-114 °C\nBoiling point-184 °C\nDiscovered Bernard Courtois in 1811";
             JOptionPane.showMessageDialog(null, message);
    }  
    });
Button b54=new Button("Xe");  
b54.setBounds(1275,400,75,75);// setting button position
b54.setBackground(Color.blue);
b54.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Xenon\nAtomic number-54\nAtomic Mass-131.293\nDensity-5.9*10-3g.cm-3 at 20°C\nMelting point- 112 °C\nBoiling point- 107 °C\nDiscovered by Sir Ramsay 1898";
             JOptionPane.showMessageDialog(null, message);
    }  
    });
Button b55=new Button("Cs");  
b55.setBounds(0,475,75,75);// setting button position
b55.setBackground(Color.red);
b55.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Cesium\nAtomic number-55\nAtomic Mass-132.9054\nDensity-1.9 g.cm-3 at 20°C\nMelting point 28.4 °C\nBoiling point 669 °C\nDiscovered by Fustov Kirchhoff in 1860";
             JOptionPane.showMessageDialog(null, message);
    }  
    });
Button b56=new Button("Ba");  
b56.setBounds(75,475,75,75);// setting button position
b56.setBackground(Color.green);
b56.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Barium\nAtomic number-56\nAtomic Mass-137.327\nDensity-3.5 g.cm-3 at 20°C\nMelting point 725 °C\nBoiling point 1640 °C\nDiscovered by Sir Humphrey Davy in 1808";
             JOptionPane.showMessageDialog(null, message);
    }  
    });
Button b57=new Button("La");  
b57.setBounds(150,475,75,75);// setting button position
b57.setBackground(Color.magenta);
b57.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Lanthanum\nAtomic number-57\nAtomic Mass-138.9054\nDensity-6.18 g.cm-3 at 20°C\nMelting point 826 °C\nBoiling point 0.186 °C\nDiscovered by Carl Mosander in 1839";
             JOptionPane.showMessageDialog(null, message);
    }  
    });
Button b72=new Button("Hf");  
b72.setBounds(225,475,75,75);// setting button position
b72.setBackground(Color.pink);
b72.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Hafnium\nAtomic number-72\nAtomic Mass-178.49\nDensity-13.07 g.cm-3 at 20°C\nMelting point 2200 °C\nBoiling point 5200 °C\nDiscovered by Dirk Coster in 1923";
             JOptionPane.showMessageDialog(null, message);
    }  
    });
Button b73=new Button("Ta");  
b73.setBounds(300,475,75,75);// setting button position
b73.setBackground(Color.pink);
b73.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Tantalum\nAtomic number-73\nAtomic Mass-180.9479\nDensity-16.69 g.cm-3 at 20°C\nMelting point 2850 °C\nBoiling point 6000 °C\nDiscovered by Anders Ekeberg in 1802";
             JOptionPane.showMessageDialog(null, message);
    }  
    });
Button b74=new Button("W");  
b74.setBounds(375,475,75,75);// setting button position
b74.setBackground(Color.pink);
b74.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Tungsten\nAtomic number-74\nAtomic Mass-183.84\nDensity-19.3 g.cm-3 at 20°C\nMelting point 3410 °C\nBoiling point 5660 °C\nDiscovered by Fausto and Juan Jose de Elhuyar in 1783";
             JOptionPane.showMessageDialog(null, message);
    }  
    });
Button b75=new Button("Re");  
b75.setBounds(450,475,75,75);// setting button position
b75.setBackground(Color.pink);
b75.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Rhenium\nAtomic number-75\nAtomic Mass-186.207\nDensity-20.5 g.cm-3 at 20°C\nMelting point 3170 °C\nBoiling point 5627 °C\niscovDered by Walter Noddack in 1925";
             JOptionPane.showMessageDialog(null, message);
    }  
    });
Button b76=new Button("Os");  
b76.setBounds(525,475,75,75);// setting button position
b76.setBackground(Color.pink);
b76.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Osmium\nAtomic number-76\nAtomic Mass-190.23\nDensity-22.5 g.cm-3 at 20°C\nMelting point 3045 °C\nBoiling point 5027 °C\nDiscovered by Smithson Tennant in 1803";
             JOptionPane.showMessageDialog(null, message);
    }  
    });
Button b77=new Button("Ir");  
b77.setBounds(600,475,75,75);// setting button position
b77.setBackground(Color.pink);
b77.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Iridium\nAtomic number-77\nAtomic Mass-196.9665\nDensity-22.4 g.cm-3 at 20°C\nMelting point 2450 °C\nBoiling point 4527 °C\nDiscovered by Smithson Tennant in 1804";
             JOptionPane.showMessageDialog(null, message);
    }  
    });
Button b78=new Button("Pt");  
b78.setBounds(675,475,75,75);// setting button position
b78.setBackground(Color.pink);
b78.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Platinum\nAtomic number-78\nAtomic Mass-192.217\nDensity-21.4 g.cm-3 at 20°C\nMelting point 1772 °C\nBoiling point 3800 °CD\niscovered by Julius Scaliger in 1735";
             JOptionPane.showMessageDialog(null, message);
    }  
    });
Button b79=new Button("Au");  
b79.setBounds(750,475,75,75);// setting button position
b79.setBackground(Color.pink);
b79.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Gold\nAtomic number-79\nAtomic Mass-195.078\nDensity-19.3 g.cm-3 at 20°C\nMelting point 1062 °C\nBoiling point 2000 °C\nDiscoveredc.a. 3000 BC";
             JOptionPane.showMessageDialog(null, message);
    }  
    });
Button b80=new Button("Hg");  
b80.setBounds(825,475,75,75);// setting button position
b80.setBackground(Color.lightGray);
b80.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Mercury\nAtomic number-80\nAtomic Mass-200.59\nDensity-13.6 g.cm-3 at 20°C\nMelting point -38.9 °C\nBoiling point 356.6 °C\nDiscovered by The ancients";
             JOptionPane.showMessageDialog(null, message);
    }  
    });
Button b81=new Button("Tl");  
b81.setBounds(900,475,75,75);// setting button position
b81.setBackground(Color.lightGray);
b81.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Thallium\nAtomic number-81\nAtomic Mass-204.3833\nDensity-11.71 g.cm-3 at 20°C\nMelting point 304 °C\nBoiling point 1473 °C\nDiscovered by Sir William Crookes in 1861";
             JOptionPane.showMessageDialog(null, message);
    }  
    });
Button b82=new Button("Pb");  
b82.setBounds(975,475,75,75);// setting button position
b82.setBackground(Color.lightGray);
b82.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Lead\nAtomic number-82\nAtomic Mass-207.2\nDensity-11.34 g.cm-3 at 20°C\nMelting point327 °C\nBoiling point1755 °C\nDiscovered by The ancients";
             JOptionPane.showMessageDialog(null, message);
    }  
    });
Button b83=new Button("Bi");  
b83.setBounds(1050,475,75,75);// setting button position
b83.setBackground(Color.lightGray);
b83.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Bismuth\nAtomic number-83\nAtomic Mass-208.9804\nDensity-9.80 g.cm-3 at 20°C\nMelting point 271 °C\nBoiling point1420 °C\nDiscovered by The ancients";
             JOptionPane.showMessageDialog(null, message);
    }  
    });
Button b84=new Button("Po");  
b84.setBounds(1125,475,75,75);// setting button position
b84.setBackground(Color.lightGray);
b84.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Polonium\nAtomic number-84\nAtomic Mass-209\nDensity-9.51 g.cm-3 at 20°C\nMelting point254 °C\nBoiling point962 °C\nDiscovered by Pierre and Marie Curie in 1898";
             JOptionPane.showMessageDialog(null, message);
    }  
    });
Button b85=new Button("At");  
b85.setBounds(1200,475,75,75);// setting button position
b85.setBackground(Color.gray);
b85.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Astatine\nAtomic number-85\nAtomic Mass-210\nDensity-unknown\nMelting point302 °C\nBoiling point337 °C (estimation)\nDiscovered by D.R. Corson 1940";
             JOptionPane.showMessageDialog(null, message);
    }  
    });
Button b86=new Button("Rn");  
b86.setBounds(1275,475,75,75);// setting button position
b86.setBackground(Color.blue);
b86.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Radon\nAtomic number-86\nAtomic Mass-222\nDensity-9.96*10-3g.cm3 at 20°C\nMelting point- 71 °C\nBoiling point- 62 °C\nDiscovered Fredrich Ernst Dorn in 1898";
             JOptionPane.showMessageDialog(null, message);
    }  
    });
Button b87=new Button("Fr"); 
b87.setBounds(0,550,75,75);// setting button position
b87.setBackground(Color.red);
b87.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Francium\nAtomic number-87\nAtomic Mass-223\nDensity-unknown\nMelting point27 °C\nBoiling point677 °C\nDiscovered by Marguerite Perey in 1939";
             JOptionPane.showMessageDialog(null, message);
    }  
    });
Button b88=new Button("Ra");  
b88.setBounds(75,550,75,75);// setting button position
b88.setBackground(Color.green);
b88.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Radium\nAtomic number-88\nAtomic Mass-226\nDensity-5 g.cm-3 at 20°C\nMelting point700 °C\nBoiling point1140 °C\nDiscovered by	Pierre and Marie Curie 1898";
             JOptionPane.showMessageDialog(null, message);
    }  
    });
Button b89=new Button("Ac");  
b89.setBounds(150,550,75,75);// setting button position
b89.setBackground(Color.orange);
b89.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Actinium\nAtomic number-89\nAtomic Mass-227\nDensity-10.07 g.cm-3 at 20°C\nMelting point1050 °C\nBoiling point3250 °C\nDiscovered by André Debierne in 1899";
             JOptionPane.showMessageDialog(null, message);
    }  
    });
Button b104=new Button("Rf");  
b104.setBounds(225,550,75,75);// setting button position
b104.setBackground(Color.pink);
b104.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Rutherfordium\nAtomic number-104\nAtomic Mass-261\nDensity-unknown\nMelting point unknown\nBoiling point unknown\nDiscovered by Lord Rutherford of Nelson";
             JOptionPane.showMessageDialog(null, message);
    }  
    });
Button b105=new Button("Db");  
b105.setBounds(300,550,75,75);// setting button position
b105.setBackground(Color.pink);
b105.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Dubnium\nAtomic number-105\nAtomic Mass-262\nDensity-unknown\nMelting point unknown\nBoiling point unknown\nDiscovered Albert Ghiorso in 1970";
             JOptionPane.showMessageDialog(null, message);
    }  
    });
Button b106=new Button("Sg");  
b106.setBounds(375,550,75,75);// setting button position
b106.setBackground(Color.pink);
b106.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Seaborgium\nAtomic number-106\nAtomic Mass-266\nDensity-unknown\nMelting point unknown\nBoiling point unknown\nDiscovered by Albert Ghiorso in 1974";
             JOptionPane.showMessageDialog(null, message);
    }  
    });
Button b107=new Button("Bh");  
b107.setBounds(450,550,75,75);// setting button position
b107.setBackground(Color.pink);
b107.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Bohrium\nAtomic number-107\nAtomic Mass-264\nDensity-unknown\nMelting point unknown\nBoiling point unknown\nDiscovered Peter Armbruster and Gottfried Munzenber in 1976";
             JOptionPane.showMessageDialog(null, message);
    }  
    });
Button b108=new Button("Hs");  
b108.setBounds(525,550,75,75);// setting button position
b108.setBackground(Color.pink);
b108.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Hassium\nAtomic number-108\nAtomic Mass-277\nDensity-unknown\nMelting point unknown\nBoiling point unknown\nDiscovered Peter Armbruster and Gottfried Munzenber in 1984";
             JOptionPane.showMessageDialog(null, message);
    }  
    });
Button b109=new Button("Mt");  
b109.setBounds(600,550,75,75);// setting button position
b109.setBackground(Color.white);
b109.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Meitnerium\nAtomic number-109\nAtomic Mass-268\nDensity-unknown\nMelting point unknown\nBoiling point unknown\nDiscovered by Heavy Ion Research Laboratory in 1982";
             JOptionPane.showMessageDialog(null, message);
    }  
    });
Button b110=new Button("Ds");  
b110.setBounds(675,550,75,75);// setting button position
b110.setBackground(Color.white);
b110.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Darmstadtium\nAtomic number-110\nAtomic Mass-268\nDensity-unknown\nMelting point unknown\nBoiling point unknown\nDiscovered Albert Ghiorso in 1970";
             JOptionPane.showMessageDialog(null, message);
    }  
    });
Button b111=new Button("Rg");  
b111.setBounds(750,550,75,75);// setting button position
b111.setBackground(Color.white);
b111.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Roentgenium\nAtomic number-111\nAtomic Mass-271.8\nDensity-unknown\nMelting point unknown\nBoiling point unknown\nDiscovered	Hofmann, Sigurd 1994";
             JOptionPane.showMessageDialog(null, message);
    }  
    });
Button b112=new Button("Cn");  
b112.setBounds(825,550,75,75);// setting button position
b112.setBackground(Color.lightGray);
b112.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Copernicium\nAtomic number-112\nAtomic Mass-285\nDensity-unknown\nMelting point unknown\nBoiling point unknown\nDiscovered by S. Hofmann, V. Ninov and F.P. Hessbuger in 1996";
             JOptionPane.showMessageDialog(null, message);
    }  
    });
Button b113=new Button("Nh");  
b113.setBounds(900,550,75,75);// setting button position
b113.setBackground(Color.white);
b113.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Nihonium\nAtomic number-113\nAtomic Mass-286\nDensity-unknown\nMelting point unknown\nBoiling point unknown\nDiscovered	Scientists from the Joint Institute for Nuclear Research in Dubna, Russia, and Lawrence Livermore National Laboratory in California in 2003";
             JOptionPane.showMessageDialog(null, message);
    }  
    });
Button b114=new Button("Fl");  
b114.setBounds(975,550,75,75);// setting button position
b114.setBackground(Color.white);
b114.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Flerovium\nAtomic number-114\nAtomic Mass-289\nDensity-unknown\nMelting point unknown\nBoiling point unknown\nDiscovered	Dubna (Joint Institute for Nuclear Research) in Russia, jan 1999";
             JOptionPane.showMessageDialog(null, message);
    }  
    });
Button b115=new Button("Mc");  
b115.setBounds(1050,550,75,75);// setting button position
b115.setBackground(Color.white);
b115.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Moscovium\nAtomic number-115\nAtomic Mass-288\nDensity-unknown\nMelting point unknown\nBoiling point unknown\nDiscovered by	Scientists from the Joint Institute for Nuclear Research in Dubna, Russia, and Lawrence Livermore National Laboratory in California in 2003";
             JOptionPane.showMessageDialog(null, message);
    }  
    });
Button b116=new Button("Lv");  
b116.setBounds(1125,550,75,75);// setting button position
b116.setBackground(Color.white);
b116.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Livermorium\nAtomic number-116\nAtomic Mass-293\nDensity-unknown\nMelting point unknown\nBoiling point unknown\nDiscoveredThe  Lawrence Berkeley National Laboratory";
             JOptionPane.showMessageDialog(null, message);
    }  
    });
Button b117=new Button("Ts");  
b117.setBounds(1200,550,75,75);// setting button position
b117.setBackground(Color.white);
b117.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Tennessine\nAtomic number-117\nAtomic Mass-260.9\nDensity-unknown\nMelting point unknown\nBoiling point unknown\nDiscovered	Undiscovered";
             JOptionPane.showMessageDialog(null, message);
    }  
    });
Button b118=new Button("Og");  
b118.setBounds(1275,550,75,75);// setting button position
b118.setBackground(Color.white);
b118.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Oganesson\nAtomic number-118\nAtomic Mass-294\nDensity-unknown\nMelting point unknown\nBoiling point unknown\nDiscovered by	Team of Berkeley Lab scientists, 1999";
             JOptionPane.showMessageDialog(null, message);
    }  
    });
Button b58=new Button("Ce");  
b58.setBounds(225,650,75,75);// setting button position
b58.setBackground(Color.magenta);
b58.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Cerium\nAtomic number-58\nAtomic Mass-140.116\nDensity-6.76 g.cm-3 at 20°C\nMelting point799 °C\nBoiling point3426 °C\nDiscovered by W. von Hisinger in 1903";
             JOptionPane.showMessageDialog(null, message);
    }  
    });
Button b59=new Button("Pr");  
b59.setBounds(300,650,75,75);// setting button position
b59.setBackground(Color.magenta);
b59.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Praseodymium\nAtomic number-59\nAtomic Mass-140.9077\nDensity-6.8 g.cm-3 at 20°C\nMelting point	931 °C\nBoiling point	3512 °C\nDiscovered by	von Welsbach in 1885";
             JOptionPane.showMessageDialog(null, message);
    }  
    });
Button b60=new Button("Nd");  
b60.setBounds(375,650,75,75);// setting button position
b60.setBackground(Color.magenta);
b60.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Neodymium\nAtomic number-60\nAtomic Mass-144.24\nDensity-7.0 g cm-3\nMelting point1024 °C\nBoiling point3074 °C\nDiscovered by Carl Auer von Welsbach in 1885";
             JOptionPane.showMessageDialog(null, message);
    }  
    });
Button b61=new Button("Pm");  
b61.setBounds(450,650,75,75);// setting button position
b61.setBackground(Color.magenta);
b61.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
		String message = "Promethium\nAtomic number-61\nAtomic Mass-145\nDensity-6.475 g.cm-3 at 20°C\nMelting point1168 °C\nBoiling point2460 °C\nDiscovered by Marinsky 1945";
             JOptionPane.showMessageDialog(null, message);
    }  
    });
Button b62=new Button("Sm");  
b62.setBounds(525,650,75,75);// setting button position
b62.setBackground(Color.magenta);
b62.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Samarium\nAtomic number-62\nAtomic Mass-150.36\nDensity-6.9 g.cm-3 at 20°C\nMelting point1072 °C\nBoiling point1790 °C\nDiscovered by Paul Emile Lecoq de Boisbaudran in 1879";
             JOptionPane.showMessageDialog(null, message);
    }  
    });
Button b63=new Button("Eu");  
b63.setBounds(600,650,75,75);// setting button position
b63.setBackground(Color.magenta);
b63.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Europium\nAtomic number-63\nAtomic Mass-151.964\nDensity-9.2 g.cm-3 at 20°C\nMelting point1522 °C\nBoiling point2510 °C\nDiscovered by Carl Mosander in 1843";
             JOptionPane.showMessageDialog(null, message);
    }  
    });
Button b64=new Button("Gd");  
b64.setBounds(675,650,75,75);// setting button position
b64.setBackground(Color.magenta);
b64.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Gadolinium\nAtomic number-64\nAtomic Mass-157.25\nDensity-7.9 g.cm-3 at 20°C\nMelting point1313 °C\nBoiling point3266 °C\nDiscovered by Jean de Marignac in 1880";
             JOptionPane.showMessageDialog(null, message);
    }  
    });
Button b65=new Button("Tb");  
b65.setBounds(750,650,75,75);// setting button position
b65.setBackground(Color.magenta);
b65.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Terbium\nAtomic number-65\nAtomic Mass-158.9253\nDensity-8.3 g.cm-3 at 20°C\nMelting point1360 °C\nBoiling point3041 °C\nDiscovered Carl Mosander in 1843";
             JOptionPane.showMessageDialog(null, message);
    }  
    });
Button b66=new Button("Dy");  
b66.setBounds(825,650,75,75);// setting button position
b66.setBackground(Color.magenta);
b66.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Dysprosium\nAtomic number-66\nAtomic Mass-162.5\nDensity-8.6 g.cm-3 at 20°C\nMelting point1412 °C\nBoiling point2562 °C\nDiscovered by Paul Emile Lecoq de Boisbaudran in 1886";
             JOptionPane.showMessageDialog(null, message);
    }  
    });
Button b67=new Button("Ho");  
b67.setBounds(900,650,75,75);// setting button position
b67.setBackground(Color.magenta);
b67.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Holmium\nAtomic number-67\nAtomic Mass-164.9303\nDensity-8.8 g.cm-3 at 20°C\nMelting point1474 °C\nBoiling point2695 °C\nDiscovered J.L. Soret in 1878";
             JOptionPane.showMessageDialog(null, message);
    }  
    });
Button b68=new Button("Er");  
b68.setBounds(975,650,75,75);// setting button position
b68.setBackground(Color.magenta);
b68.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Erbium\nAtomic number-68\nAtomic Mass-167.259\nDensity-9.2 g.cm-3 at 20°C\nMelting point1522 °C\nBoiling point2510 °C\nDiscovered by Carl Mosander in 1843";
             JOptionPane.showMessageDialog(null, message);
    }  
    });
Button b69=new Button("Tm");  
b69.setBounds(1050,650,75,75);// setting button position
b69.setBackground(Color.magenta);
b69.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Thulium\nAtomic number-69\nAtomic Mass-168.9342\nDensity-9.3 g.cm-3 at 20°C\nMelting point1545 °C\nBoiling point1947 °C\nDiscovered by Theodore Cleve 1879";
             JOptionPane.showMessageDialog(null, message);
    }  
    });
Button b70=new Button("Yb");  
b70.setBounds(1125,650,75,75);// setting button position
b70.setBackground(Color.magenta);
b70.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Ytterbium\nAtomic number-70\nAtomic Mass-173.04\nDensity-7 g.cm-3 at 20°C\nMelting point824 °C\nBoiling point1466 °C\nDiscovered by Jean de Marignac in 1878";
             JOptionPane.showMessageDialog(null, message);
    }  
    });
Button b71=new Button("Lu");  
b71.setBounds(1200,650,75,75);// setting button position
b71.setBackground(Color.magenta);
b71.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Lutetium\nAtomic number-71\nAtomic Mass-174.967\nDensity-9.7 g.cm-3 at 20°C\nMelting point1663 °C\nBoiling point3395 °C\nDiscovered by George Urbain in 1907";
             JOptionPane.showMessageDialog(null, message);
    }  
    });
Button b90=new Button("Th");  
b90.setBounds(225,725,75,75);// setting button position
b90.setBackground(Color.orange);
b90.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Thorium\nAtomic number-90\nAtomic Mass-232.0381\nDensity-11.72 g.cm-3 at 20°C\nMelting point 1750 °C\nBoiling point 4790 °C\nDiscovered by Jons Berzelius in 1828";
             JOptionPane.showMessageDialog(null, message);
    }  
    });
Button b91=new Button("Pa");  
b91.setBounds(300,725,75,75);// setting button position
b91.setBackground(Color.orange);
b91.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Protactinium\nAtomic number-91\nAtomic Mass-231.0359\nDensity-15.37 g.cm-3 at 20°C\nMelting point 1600 °C\nBoiling point unknown\nDiscovered by K. Kajans and O.H. Gohring in 1913";
             JOptionPane.showMessageDialog(null, message);
    }  
    });
Button b92=new Button("U");  
b92.setBounds(375,725,75,75);// setting button position
b92.setBackground(Color.orange);
b92.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Uranium\nAtomic number-92\nAtomic Mass-238.0289\nDensity-18.95 g.cm-3 at 20°C\nMelting point 1132 °C\nBoiling point 3818 °C\nDiscovered by Martin Klaproth 1789";
             JOptionPane.showMessageDialog(null, message);
    }  
    });
Button b93=new Button("Np");  
b93.setBounds(450,725,75,75);// setting button position
b93.setBackground(Color.orange);
b93.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
		String message = "Neptunium\nAtomic number-93\nAtomic Mass-237\nDensity-20.25 g.cm-3 at 20°C\nMelting point 640 °C\nBoiling point 3902 °C\nDiscovered by McMillan in 1940";
             JOptionPane.showMessageDialog(null, message);
    }  
    });
Button b94=new Button("Pu");  
b94.setBounds(525,725,75,75);// setting button position
b94.setBackground(Color.orange);
b94.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Plutonium\nAtomic number-94\nAtomic Mass=244\nDensity-19.84 g.cm-3 at 20°C\nMelting point 641 °C\nBoiling point 3232 °C\nDiscovered by G.T. Seaborg in 1940";
             JOptionPane.showMessageDialog(null, message);
    }  
    });
Button b95=new Button("Am");  
b95.setBounds(600,725,75,75);// setting button position
b95.setBackground(Color.orange);
b95.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Americium\nAtomic number-95\nAtomic Mass-243\nDensity-13.67 g.cm-3 at 20°C\nMelting point 994 °C\nBoiling point 2607 °C\nDiscovered by G.T. Seaborg in 1945";
             JOptionPane.showMessageDialog(null, message);
    }  
    });
Button b96=new Button("Cm");  
b96.setBounds(675,725,75,75);// setting button position
b96.setBackground(Color.orange);
b96.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Curium\nAtomic number-96\nAtomic Mass-247\nDensity-13.51 g.cm-3 at 20°C\nMelting point 1340 °C\nBoiling point unknown\nDiscovered by G.T. Seaborg in 1944";
             JOptionPane.showMessageDialog(null, message);
    }  
    });
Button b97=new Button("Bk");  
b97.setBounds(750,725,75,75);// setting button position
b97.setBackground(Color.orange);
b97.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Berkelium\nAtomic number-97\nAtomic Mass-247\nDensity-14 g.cm3 at 20°C\nMelting point unknown\nBoiling point unknown\nDiscovered by G.T. Seaborg 1949.";
             JOptionPane.showMessageDialog(null, message);
    }  
    });
Button b98=new Button("Cf");  
b98.setBounds(825,725,75,75);// setting button position
b98.setBackground(Color.orange);
b98.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Californium\nAtomic number-98\nAtomic Mass-251\nDensity-unknown\nMelting point unknown\nBoiling point unknown\nDiscovered by G.T. Seaborg in 1950";
             JOptionPane.showMessageDialog(null, message);
    }  
    });
Button b99=new Button("Es");  
b99.setBounds(900,725,75,75);// setting button position
b99.setBackground(Color.orange);
b99.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Einsteinium\nAtomic number-99\nAtomic Mass-252\nDensity-unknown\nMelting point unknown\nBoiling point unknown\nDiscovered by Argonne at the University of California in 1952";
             JOptionPane.showMessageDialog(null, message);
    }  
    });
Button b100=new Button("Fm");  
b100.setBounds(975,725,75,75);// setting button position
b100.setBackground(Color.orange);
b100.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Fermium\nAtomic number-100\nAtomic Mass-257\nDensity-unknown\nMelting point unknown\nBoiling point unknown\nDiscovered by Ghiorso in 1952";
             JOptionPane.showMessageDialog(null, message);
    }  
    });
Button b101=new Button("Md");  
b101.setBounds(1050,725,75,75);// setting button position
b101.setBackground(Color.orange);
b101.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Mendelevium\nAtomic number-101\nAtomic Mass-258\nDensity-unknown\nMelting point unknown\nBoiling point unknown\nDiscovered by G.T. Seaborg in 1955";
             JOptionPane.showMessageDialog(null, message);
    }  
    });
Button b102=new Button("No");  
b102.setBounds(1125,725,75,75);// setting button position
b102.setBackground(Color.orange);
b102.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Nobelium\nAtomic number-102\nAtomic Mass-259\nDensity-unknown\nMelting point unknown\nBoiling point unknown\nDiscovered by Nobel Institute for Physics in 1957";
             JOptionPane.showMessageDialog(null, message);
    }  
    });
Button b103=new Button("Lr");  
b103.setBounds(1200,725,75,75);// setting button position
b103.setBackground(Color.orange);
b103.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		String message = "Lawrencium\nAtomic number-103\nAtomic Mass-262\nDensity-unknown\nMelting point unknown\nBoiling point unknown\nDiscovered by Albert Ghiorso in 1961";
             JOptionPane.showMessageDialog(null, message);
    }  
    });
Button b119=new Button("Alikali metals");
b119.setBounds(160,215,100,40);// setting button position
b119.setBackground(Color.red);
b119.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
      b1.setBackground(Color.white);
b2.setBackground(Color.white);
b3.setBackground(Color.red);
b4.setBackground(Color.white);  
b5.setBackground(Color.white);  
b6.setBackground(Color.white);  
b7.setBackground(Color.white); 
b8.setBackground(Color.white);  
b9.setBackground(Color.white);  
b10.setBackground(Color.white);
b11.setBackground(Color.red); 
b12.setBackground(Color.white); 
b13.setBackground(Color.white); 
b14.setBackground(Color.white); 
b15.setBackground(Color.white);   
b16.setBackground(Color.white);  
b17.setBackground(Color.white); 
b18.setBackground(Color.white); 
b19.setBackground(Color.red); 
b20.setBackground(Color.white); 
b21.setBackground(Color.white); 
b22.setBackground(Color.white); 
b23.setBackground(Color.white); 
b24.setBackground(Color.white); 
b25.setBackground(Color.white); 
b26.setBackground(Color.white); 
b27.setBackground(Color.white); 
b28.setBackground(Color.white);
b29.setBackground(Color.white); 
b30.setBackground(Color.white);  
b31.setBackground(Color.white); 
b32.setBackground(Color.white);  
b33.setBackground(Color.white);
b34.setBackground(Color.white);
b35.setBackground(Color.white);
b36.setBackground(Color.white);
b37.setBackground(Color.red); 
b38.setBackground(Color.white); 
b39.setBackground(Color.white); 
b40.setBackground(Color.white); 
b41.setBackground(Color.white); 
b42.setBackground(Color.white); 
b43.setBackground(Color.white); 
b44.setBackground(Color.white); 
b45.setBackground(Color.white); 
b46.setBackground(Color.white);
b47.setBackground(Color.white); 
b48.setBackground(Color.white);
b49.setBackground(Color.white); 
b50.setBackground(Color.white);  
b51.setBackground(Color.white);
b52.setBackground(Color.white);
b53.setBackground(Color.white);
b54.setBackground(Color.white);
b55.setBackground(Color.red);
b56.setBackground(Color.white);
b57.setBackground(Color.white);
b72.setBackground(Color.white);
b73.setBackground(Color.white);
b74.setBackground(Color.white);
b75.setBackground(Color.white);
b76.setBackground(Color.white);
b77.setBackground(Color.white);
b78.setBackground(Color.white);
b79.setBackground(Color.white);
b80.setBackground(Color.white);
b81.setBackground(Color.white);
b82.setBackground(Color.white);
b83.setBackground(Color.white);
b84.setBackground(Color.white);
b85.setBackground(Color.white);
b86.setBackground(Color.white);
b87.setBackground(Color.red);
b88.setBackground(Color.white);
b89.setBackground(Color.white);
b104.setBackground(Color.white);
b105.setBackground(Color.white);
b106.setBackground(Color.white);
b107.setBackground(Color.white);
b108.setBackground(Color.white);
b109.setBackground(Color.white);
b110.setBackground(Color.white);
b111.setBackground(Color.white);
b112.setBackground(Color.white);
b113.setBackground(Color.white);
b114.setBackground(Color.white);
b115.setBackground(Color.white);
b116.setBackground(Color.white);
b117.setBackground(Color.white);
b118.setBackground(Color.white);
b58.setBackground(Color.white);
b59.setBackground(Color.white);
b60.setBackground(Color.white);
b61.setBackground(Color.white);
b62.setBackground(Color.white);
b63.setBackground(Color.white);
b64.setBackground(Color.white);  
b65.setBackground(Color.white);
b66.setBackground(Color.white);
b67.setBackground(Color.white);
b68.setBackground(Color.white);
b69.setBackground(Color.white);
b70.setBackground(Color.white);
b71.setBackground(Color.white);
b90.setBackground(Color.white);
b91.setBackground(Color.white);
b92.setBackground(Color.white);
b93.setBackground(Color.white);
b94.setBackground(Color.white);
b95.setBackground(Color.white);
b96.setBackground(Color.white);
b97.setBackground(Color.white);
b98.setBackground(Color.white);
b99.setBackground(Color.white);
b100.setBackground(Color.white);
b101.setBackground(Color.white);
b102.setBackground(Color.white);
b103.setBackground(Color.white);
    }  
    });
Button b120=new Button("Alkaline earth metal");
b120.setBounds(260,215,150,40);// setting button position
b120.setBackground(Color.green);
b120.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){
b1.setBackground(Color.white);
b2.setBackground(Color.white);
b3.setBackground(Color.white); 
b4.setBackground(Color.green);
b5.setBackground(Color.white);  
b6.setBackground(Color.white);  
b7.setBackground(Color.white); 
b8.setBackground(Color.white);  
b9.setBackground(Color.white);  
b10.setBackground(Color.white);
b11.setBackground(Color.white); 
b12.setBackground(Color.green); 
b13.setBackground(Color.white); 
b14.setBackground(Color.white); 
b15.setBackground(Color.white);   
b16.setBackground(Color.white);  
b17.setBackground(Color.white); 
b18.setBackground(Color.white); 
b19.setBackground(Color.white); 
b20.setBackground(Color.green); 
b21.setBackground(Color.white); 
b22.setBackground(Color.white); 
b23.setBackground(Color.white); 
b24.setBackground(Color.white); 
b25.setBackground(Color.white); 
b26.setBackground(Color.white); 
b27.setBackground(Color.white); 
b28.setBackground(Color.white);
b29.setBackground(Color.white); 
b30.setBackground(Color.white);  
b31.setBackground(Color.white); 
b32.setBackground(Color.white);  
b33.setBackground(Color.white);
b34.setBackground(Color.white);
b35.setBackground(Color.white);
b36.setBackground(Color.white);
b37.setBackground(Color.white); 
b38.setBackground(Color.green); 
b39.setBackground(Color.white); 
b40.setBackground(Color.white); 
b41.setBackground(Color.white); 
b42.setBackground(Color.white); 
b43.setBackground(Color.white); 
b44.setBackground(Color.white); 
b45.setBackground(Color.white); 
b46.setBackground(Color.white);
b47.setBackground(Color.white); 
b48.setBackground(Color.white);
b49.setBackground(Color.white); 
b50.setBackground(Color.white);  
b51.setBackground(Color.white);
b52.setBackground(Color.white);
b53.setBackground(Color.white);
b54.setBackground(Color.white);
b55.setBackground(Color.white);
b56.setBackground(Color.green);
b57.setBackground(Color.white);
b72.setBackground(Color.white);
b73.setBackground(Color.white);
b74.setBackground(Color.white);
b75.setBackground(Color.white);
b76.setBackground(Color.white);
b77.setBackground(Color.white);
b78.setBackground(Color.white);
b79.setBackground(Color.white);
b80.setBackground(Color.white);
b81.setBackground(Color.white);
b82.setBackground(Color.white);
b83.setBackground(Color.white);
b84.setBackground(Color.white);
b85.setBackground(Color.white);
b86.setBackground(Color.white);
b87.setBackground(Color.white);
b88.setBackground(Color.green);
b89.setBackground(Color.white);
b104.setBackground(Color.white);
b105.setBackground(Color.white);
b106.setBackground(Color.white);
b107.setBackground(Color.white);
b108.setBackground(Color.white);
b109.setBackground(Color.white);
b110.setBackground(Color.white);
b111.setBackground(Color.white);
b112.setBackground(Color.white);
b113.setBackground(Color.white);
b114.setBackground(Color.white);
b115.setBackground(Color.white);
b116.setBackground(Color.white);
b117.setBackground(Color.white);
b118.setBackground(Color.white);
b58.setBackground(Color.white);
b59.setBackground(Color.white);
b60.setBackground(Color.white);
b61.setBackground(Color.white);
b62.setBackground(Color.white);
b63.setBackground(Color.white);
b64.setBackground(Color.white);  
b65.setBackground(Color.white); 
b66.setBackground(Color.white);
b67.setBackground(Color.white);
b68.setBackground(Color.white);
b69.setBackground(Color.white);
b70.setBackground(Color.white);
b71.setBackground(Color.white);
b90.setBackground(Color.white);
b91.setBackground(Color.white);
b92.setBackground(Color.white);
b93.setBackground(Color.white);
b94.setBackground(Color.white);
b95.setBackground(Color.white);
b96.setBackground(Color.white);
b97.setBackground(Color.white);
b98.setBackground(Color.white);
b99.setBackground(Color.white);
b100.setBackground(Color.white);
b101.setBackground(Color.white);
b102.setBackground(Color.white);
b103.setBackground(Color.white);
	}
});
Button b121=new Button("Lanthanide");
b121.setBounds(410,215,100,40);// setting button position
b121.setBackground(Color.magenta);
b121.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){
b1.setBackground(Color.white);
b2.setBackground(Color.white);
b3.setBackground(Color.white); 
b4.setBackground(Color.white);  
b5.setBackground(Color.white);  
b6.setBackground(Color.white);  
b7.setBackground(Color.white); 
b8.setBackground(Color.white);  
b9.setBackground(Color.white);  
b10.setBackground(Color.white);
b11.setBackground(Color.white); 
b12.setBackground(Color.white); 
b13.setBackground(Color.white); 
b14.setBackground(Color.white); 
b15.setBackground(Color.white);   
b16.setBackground(Color.white);  
b17.setBackground(Color.white); 
b18.setBackground(Color.white); 
b19.setBackground(Color.white); 
b20.setBackground(Color.white); 
b21.setBackground(Color.white); 
b22.setBackground(Color.white); 
b23.setBackground(Color.white); 
b24.setBackground(Color.white); 
b25.setBackground(Color.white); 
b26.setBackground(Color.white); 
b27.setBackground(Color.white); 
b28.setBackground(Color.white);
b29.setBackground(Color.white); 
b30.setBackground(Color.white);  
b31.setBackground(Color.white); 
b32.setBackground(Color.white);  
b33.setBackground(Color.white);
b34.setBackground(Color.white);
b35.setBackground(Color.white);
b36.setBackground(Color.white);
b37.setBackground(Color.white); 
b38.setBackground(Color.white); 
b39.setBackground(Color.white); 
b40.setBackground(Color.white); 
b41.setBackground(Color.white); 
b42.setBackground(Color.white); 
b43.setBackground(Color.white); 
b44.setBackground(Color.white); 
b45.setBackground(Color.white); 
b46.setBackground(Color.white);
b47.setBackground(Color.white); 
b48.setBackground(Color.white);
b49.setBackground(Color.white); 
b50.setBackground(Color.white);  
b51.setBackground(Color.white);
b52.setBackground(Color.white);
b53.setBackground(Color.white);
b54.setBackground(Color.white);
b55.setBackground(Color.white);
b56.setBackground(Color.white);
b57.setBackground(Color.magenta);
b72.setBackground(Color.white);
b73.setBackground(Color.white);
b74.setBackground(Color.white);
b75.setBackground(Color.white);
b76.setBackground(Color.white);
b77.setBackground(Color.white);
b78.setBackground(Color.white);
b79.setBackground(Color.white);
b80.setBackground(Color.white);
b81.setBackground(Color.white);
b82.setBackground(Color.white);
b83.setBackground(Color.white);
b84.setBackground(Color.white);
b85.setBackground(Color.white);
b86.setBackground(Color.white);
b87.setBackground(Color.white);
b88.setBackground(Color.white);
b89.setBackground(Color.white);
b104.setBackground(Color.white);
b105.setBackground(Color.white);
b106.setBackground(Color.white);
b107.setBackground(Color.white);
b108.setBackground(Color.white);
b109.setBackground(Color.white);
b110.setBackground(Color.white);
b111.setBackground(Color.white);
b112.setBackground(Color.white);
b113.setBackground(Color.white);
b114.setBackground(Color.white);
b115.setBackground(Color.white);
b116.setBackground(Color.white);
b117.setBackground(Color.white);
b118.setBackground(Color.white);
b58.setBackground(Color.magenta);
b59.setBackground(Color.magenta);
b60.setBackground(Color.magenta);
b61.setBackground(Color.magenta);
b62.setBackground(Color.magenta);
b63.setBackground(Color.magenta);
b64.setBackground(Color.magenta);  
b65.setBackground(Color.magenta); 
b66.setBackground(Color.magenta);
b67.setBackground(Color.magenta);
b68.setBackground(Color.magenta);
b69.setBackground(Color.magenta);
b70.setBackground(Color.magenta);
b71.setBackground(Color.magenta);
b90.setBackground(Color.white);
b91.setBackground(Color.white);
b92.setBackground(Color.white);
b93.setBackground(Color.white);
b94.setBackground(Color.white);
b95.setBackground(Color.white);
b96.setBackground(Color.white);
b97.setBackground(Color.white);
b98.setBackground(Color.white);
b99.setBackground(Color.white);
b100.setBackground(Color.white);
b101.setBackground(Color.white);
b102.setBackground(Color.white);
b103.setBackground(Color.white);
	}
     });
Button b122=new Button("Actinide");
b122.setBounds(510,215,100,40);// setting button position
b122.setBackground(Color.orange);
b122.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){
b1.setBackground(Color.white);
b2.setBackground(Color.white);
b3.setBackground(Color.white); 
b4.setBackground(Color.white);  
b5.setBackground(Color.white);  
b6.setBackground(Color.white);  
b7.setBackground(Color.white); 
b8.setBackground(Color.white);  
b9.setBackground(Color.white);  
b10.setBackground(Color.white);
b11.setBackground(Color.white); 
b12.setBackground(Color.white); 
b13.setBackground(Color.white); 
b14.setBackground(Color.white); 
b15.setBackground(Color.white);   
b16.setBackground(Color.white);  
b17.setBackground(Color.white); 
b18.setBackground(Color.white); 
b19.setBackground(Color.white); 
b20.setBackground(Color.white); 
b21.setBackground(Color.white); 
b22.setBackground(Color.white); 
b23.setBackground(Color.white); 
b24.setBackground(Color.white); 
b25.setBackground(Color.white); 
b26.setBackground(Color.white); 
b27.setBackground(Color.white); 
b28.setBackground(Color.white);
b29.setBackground(Color.white); 
b30.setBackground(Color.white);  
b31.setBackground(Color.white); 
b32.setBackground(Color.white);  
b33.setBackground(Color.white);
b34.setBackground(Color.white);
b35.setBackground(Color.white);
b36.setBackground(Color.white);
b37.setBackground(Color.white); 
b38.setBackground(Color.white); 
b39.setBackground(Color.white); 
b40.setBackground(Color.white); 
b41.setBackground(Color.white); 
b42.setBackground(Color.white); 
b43.setBackground(Color.white); 
b44.setBackground(Color.white); 
b45.setBackground(Color.white); 
b46.setBackground(Color.white);
b47.setBackground(Color.white); 
b48.setBackground(Color.white);
b49.setBackground(Color.white); 
b50.setBackground(Color.white);  
b51.setBackground(Color.white);
b52.setBackground(Color.white);
b53.setBackground(Color.white);
b54.setBackground(Color.white);
b55.setBackground(Color.white);
b56.setBackground(Color.white);
b57.setBackground(Color.white);
b72.setBackground(Color.white);
b73.setBackground(Color.white);
b74.setBackground(Color.white);
b75.setBackground(Color.white);
b76.setBackground(Color.white);
b77.setBackground(Color.white);
b78.setBackground(Color.white);
b79.setBackground(Color.white);
b80.setBackground(Color.white);
b81.setBackground(Color.white);
b82.setBackground(Color.white);
b83.setBackground(Color.white);
b84.setBackground(Color.white);
b85.setBackground(Color.white);
b86.setBackground(Color.white);
b87.setBackground(Color.white);
b88.setBackground(Color.white);
b89.setBackground(Color.orange);
b104.setBackground(Color.white);
b105.setBackground(Color.white);
b106.setBackground(Color.white);
b107.setBackground(Color.white);
b108.setBackground(Color.white);
b109.setBackground(Color.white);
b110.setBackground(Color.white);
b111.setBackground(Color.white);
b112.setBackground(Color.white);
b113.setBackground(Color.white);
b114.setBackground(Color.white);
b115.setBackground(Color.white);
b116.setBackground(Color.white);
b117.setBackground(Color.white);
b118.setBackground(Color.white);
b58.setBackground(Color.white);
b59.setBackground(Color.white);
b60.setBackground(Color.white);
b61.setBackground(Color.white);
b62.setBackground(Color.white);
b63.setBackground(Color.white);
b64.setBackground(Color.white);  
b65.setBackground(Color.white); 
b66.setBackground(Color.white);
b67.setBackground(Color.white);
b68.setBackground(Color.white);
b69.setBackground(Color.white);
b70.setBackground(Color.white);
b71.setBackground(Color.white);
b90.setBackground(Color.orange);
b91.setBackground(Color.orange);
b92.setBackground(Color.orange);
b93.setBackground(Color.orange);
b94.setBackground(Color.orange);
b95.setBackground(Color.orange);
b96.setBackground(Color.orange);
b97.setBackground(Color.orange);
b98.setBackground(Color.orange);
b99.setBackground(Color.orange);
b100.setBackground(Color.orange);
b101.setBackground(Color.orange);
b102.setBackground(Color.orange);
b103.setBackground(Color.orange);
	}
});
Button b123=new Button("Transition metal");
b123.setBounds(610,215,100,40);// setting button position
b123.setBackground(Color.pink);
b123.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){
b1.setBackground(Color.white);
b2.setBackground(Color.white);
b3.setBackground(Color.white); 
b4.setBackground(Color.white);  
b5.setBackground(Color.white);  
b6.setBackground(Color.white);  
b7.setBackground(Color.white); 
b8.setBackground(Color.white);  
b9.setBackground(Color.white);  
b10.setBackground(Color.white);
b11.setBackground(Color.white); 
b12.setBackground(Color.white); 
b13.setBackground(Color.white); 
b14.setBackground(Color.white); 
b15.setBackground(Color.white);   
b16.setBackground(Color.white);  
b17.setBackground(Color.white); 
b18.setBackground(Color.white); 
b19.setBackground(Color.white); 
b20.setBackground(Color.white); 
b21.setBackground(Color.pink); 
b22.setBackground(Color.pink); 
b23.setBackground(Color.pink); 
b24.setBackground(Color.pink); 
b25.setBackground(Color.pink); 
b26.setBackground(Color.pink); 
b27.setBackground(Color.pink); 
b28.setBackground(Color.pink);
b29.setBackground(Color.pink); 
b30.setBackground(Color.white);  
b31.setBackground(Color.white); 
b32.setBackground(Color.white);  
b33.setBackground(Color.white);
b34.setBackground(Color.white);
b35.setBackground(Color.white);
b36.setBackground(Color.white);
b37.setBackground(Color.white); 
b38.setBackground(Color.white); 
b39.setBackground(Color.pink); 
b40.setBackground(Color.pink); 
b41.setBackground(Color.pink); 
b42.setBackground(Color.pink); 
b43.setBackground(Color.pink); 
b44.setBackground(Color.pink); 
b45.setBackground(Color.pink); 
b46.setBackground(Color.pink);
b47.setBackground(Color.pink); 
b48.setBackground(Color.white);
b49.setBackground(Color.white); 
b50.setBackground(Color.white);  
b51.setBackground(Color.white);
b52.setBackground(Color.white);
b53.setBackground(Color.white);
b54.setBackground(Color.white);
b55.setBackground(Color.white);
b56.setBackground(Color.white);
b57.setBackground(Color.white);
b72.setBackground(Color.pink);
b73.setBackground(Color.pink);
b74.setBackground(Color.pink);
b75.setBackground(Color.pink);
b76.setBackground(Color.pink);
b77.setBackground(Color.pink);
b78.setBackground(Color.pink);
b79.setBackground(Color.pink);
b80.setBackground(Color.white);
b81.setBackground(Color.white);
b82.setBackground(Color.white);
b83.setBackground(Color.white);
b84.setBackground(Color.white);
b85.setBackground(Color.white);
b86.setBackground(Color.white);
b87.setBackground(Color.white);
b88.setBackground(Color.white);
b89.setBackground(Color.white);
b104.setBackground(Color.pink);
b105.setBackground(Color.pink);
b106.setBackground(Color.pink);
b107.setBackground(Color.pink);
b108.setBackground(Color.white);
b109.setBackground(Color.white);
b110.setBackground(Color.white);
b111.setBackground(Color.white);
b112.setBackground(Color.white);
b113.setBackground(Color.white);
b114.setBackground(Color.white);
b115.setBackground(Color.white);
b116.setBackground(Color.white);
b117.setBackground(Color.white);
b118.setBackground(Color.white);
b58.setBackground(Color.white);
b59.setBackground(Color.white);
b60.setBackground(Color.white);
b61.setBackground(Color.white);
b62.setBackground(Color.white);
b63.setBackground(Color.white);
b64.setBackground(Color.white);  
b65.setBackground(Color.white); 
b66.setBackground(Color.white);
b67.setBackground(Color.white);
b68.setBackground(Color.white);
b69.setBackground(Color.white);
b70.setBackground(Color.white);
b71.setBackground(Color.white);
b90.setBackground(Color.white);
b91.setBackground(Color.white);
b92.setBackground(Color.white);
b93.setBackground(Color.white);
b94.setBackground(Color.white);
b95.setBackground(Color.white);
b96.setBackground(Color.white);
b97.setBackground(Color.white);
b98.setBackground(Color.white);
b99.setBackground(Color.white);
b100.setBackground(Color.white);
b101.setBackground(Color.white);
b102.setBackground(Color.white);
b103.setBackground(Color.white);
	}
});
Button b124=new Button("Post-transition metal");
b124.setBounds(710,215,180,40);// setting button position
b124.setBackground(Color.lightGray);
b124.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){
b1.setBackground(Color.white);
b2.setBackground(Color.white);
b3.setBackground(Color.white); 
b4.setBackground(Color.white);  
b5.setBackground(Color.white);  
b6.setBackground(Color.white);  
b7.setBackground(Color.white); 
b8.setBackground(Color.white);  
b9.setBackground(Color.white);  
b10.setBackground(Color.white);
b11.setBackground(Color.white); 
b12.setBackground(Color.white); 
b13.setBackground(Color.lightGray); 
b14.setBackground(Color.white); 
b15.setBackground(Color.white);   
b16.setBackground(Color.white);  
b17.setBackground(Color.white); 
b18.setBackground(Color.white); 
b19.setBackground(Color.white); 
b20.setBackground(Color.white); 
b21.setBackground(Color.white); 
b22.setBackground(Color.white); 
b23.setBackground(Color.white); 
b24.setBackground(Color.white); 
b25.setBackground(Color.white); 
b26.setBackground(Color.white); 
b27.setBackground(Color.white); 
b28.setBackground(Color.white);
b29.setBackground(Color.white); 
b30.setBackground(Color.lightGray);  
b31.setBackground(Color.lightGray); 
b32.setBackground(Color.white);  
b33.setBackground(Color.white);
b34.setBackground(Color.white);
b35.setBackground(Color.white);
b36.setBackground(Color.white);
b37.setBackground(Color.white); 
b38.setBackground(Color.white); 
b39.setBackground(Color.white); 
b40.setBackground(Color.white); 
b41.setBackground(Color.white); 
b42.setBackground(Color.white); 
b43.setBackground(Color.white); 
b44.setBackground(Color.white); 
b45.setBackground(Color.white); 
b46.setBackground(Color.white);
b47.setBackground(Color.white); 
b48.setBackground(Color.lightGray);
b49.setBackground(Color.lightGray); 
b50.setBackground(Color.lightGray);  
b51.setBackground(Color.white);
b52.setBackground(Color.white);
b53.setBackground(Color.white);
b54.setBackground(Color.white);
b55.setBackground(Color.white);
b56.setBackground(Color.white);
b57.setBackground(Color.white);
b72.setBackground(Color.white);
b73.setBackground(Color.white);
b74.setBackground(Color.white);
b75.setBackground(Color.white);
b76.setBackground(Color.white);
b77.setBackground(Color.white);
b78.setBackground(Color.white);
b79.setBackground(Color.white);
b80.setBackground(Color.lightGray);
b81.setBackground(Color.lightGray);
b82.setBackground(Color.lightGray);
b83.setBackground(Color.lightGray);
b84.setBackground(Color.lightGray);
b85.setBackground(Color.white);
b86.setBackground(Color.white);
b87.setBackground(Color.white);
b88.setBackground(Color.white);
b89.setBackground(Color.white);
b104.setBackground(Color.white);
b105.setBackground(Color.white);
b106.setBackground(Color.white);
b107.setBackground(Color.white);
b108.setBackground(Color.white);
b109.setBackground(Color.white);
b110.setBackground(Color.white);
b111.setBackground(Color.white);
b112.setBackground(Color.lightGray);
b113.setBackground(Color.white);
b114.setBackground(Color.white);
b115.setBackground(Color.white);
b116.setBackground(Color.white);
b117.setBackground(Color.white);
b118.setBackground(Color.white);
b58.setBackground(Color.white);
b59.setBackground(Color.white);
b60.setBackground(Color.white);
b61.setBackground(Color.white);
b62.setBackground(Color.white);
b63.setBackground(Color.white);
b64.setBackground(Color.white);  
b65.setBackground(Color.white); 
b66.setBackground(Color.white);
b67.setBackground(Color.white);
b68.setBackground(Color.white);
b69.setBackground(Color.white);
b70.setBackground(Color.white);
b71.setBackground(Color.white);
b90.setBackground(Color.white);
b91.setBackground(Color.white);
b92.setBackground(Color.white);
b93.setBackground(Color.white);
b94.setBackground(Color.white);
b95.setBackground(Color.white);
b96.setBackground(Color.white);
b97.setBackground(Color.white);
b98.setBackground(Color.white);
b99.setBackground(Color.white);
b100.setBackground(Color.white);
b101.setBackground(Color.white);
b102.setBackground(Color.white);
b103.setBackground(Color.white);
	}
});
Button b125=new Button("Metalloid");
b125.setBounds(160,255,100,40);// setting button position
b125.setBackground(Color.gray);
b125.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){
b1.setBackground(Color.white);
b2.setBackground(Color.white);
b3.setBackground(Color.white); 
b4.setBackground(Color.white);  
b5.setBackground(Color.gray);  
b6.setBackground(Color.white);  
b7.setBackground(Color.white); 
b8.setBackground(Color.white);  
b9.setBackground(Color.white);  
b10.setBackground(Color.white);
b11.setBackground(Color.white); 
b12.setBackground(Color.white); 
b13.setBackground(Color.white); 
b14.setBackground(Color.gray); 
b15.setBackground(Color.white);   
b16.setBackground(Color.white);  
b17.setBackground(Color.white); 
b18.setBackground(Color.white); 
b19.setBackground(Color.white); 
b20.setBackground(Color.white); 
b21.setBackground(Color.white); 
b22.setBackground(Color.white); 
b23.setBackground(Color.white); 
b24.setBackground(Color.white); 
b25.setBackground(Color.white); 
b26.setBackground(Color.white); 
b27.setBackground(Color.white); 
b28.setBackground(Color.white);
b29.setBackground(Color.white); 
b30.setBackground(Color.white);  
b31.setBackground(Color.white); 
b32.setBackground(Color.gray);  
b33.setBackground(Color.gray);
b34.setBackground(Color.white);
b35.setBackground(Color.white);
b36.setBackground(Color.white);
b37.setBackground(Color.white); 
b38.setBackground(Color.white); 
b39.setBackground(Color.white); 
b40.setBackground(Color.white); 
b41.setBackground(Color.white); 
b42.setBackground(Color.white); 
b43.setBackground(Color.white); 
b44.setBackground(Color.white); 
b45.setBackground(Color.white); 
b46.setBackground(Color.white);
b47.setBackground(Color.white); 
b48.setBackground(Color.white);
b49.setBackground(Color.white); 
b50.setBackground(Color.white);  
b51.setBackground(Color.gray);
b52.setBackground(Color.gray);
b53.setBackground(Color.white);
b54.setBackground(Color.white);
b55.setBackground(Color.white);
b56.setBackground(Color.white);
b57.setBackground(Color.white);
b72.setBackground(Color.white);
b73.setBackground(Color.white);
b74.setBackground(Color.white);
b75.setBackground(Color.white);
b76.setBackground(Color.white);
b77.setBackground(Color.white);
b78.setBackground(Color.white);
b79.setBackground(Color.white);
b80.setBackground(Color.white);
b81.setBackground(Color.white);
b82.setBackground(Color.white);
b83.setBackground(Color.white);
b84.setBackground(Color.white);
b85.setBackground(Color.gray);
b86.setBackground(Color.white);
b87.setBackground(Color.white);
b88.setBackground(Color.white);
b89.setBackground(Color.white);
b104.setBackground(Color.white);
b105.setBackground(Color.white);
b106.setBackground(Color.white);
b107.setBackground(Color.white);
b108.setBackground(Color.white);
b109.setBackground(Color.white);
b110.setBackground(Color.white);
b111.setBackground(Color.white);
b112.setBackground(Color.white);
b113.setBackground(Color.white);
b114.setBackground(Color.white);
b115.setBackground(Color.white);
b116.setBackground(Color.white);
b117.setBackground(Color.white);
b118.setBackground(Color.white);
b58.setBackground(Color.white);
b59.setBackground(Color.white);
b60.setBackground(Color.white);
b61.setBackground(Color.white);
b62.setBackground(Color.white);
b63.setBackground(Color.white);
b64.setBackground(Color.white);  
b65.setBackground(Color.white); 
b66.setBackground(Color.white);
b67.setBackground(Color.white);
b68.setBackground(Color.white);
b69.setBackground(Color.white);
b70.setBackground(Color.white);
b71.setBackground(Color.white);
b90.setBackground(Color.white);
b91.setBackground(Color.white);
b92.setBackground(Color.white);
b93.setBackground(Color.white);
b94.setBackground(Color.white);
b95.setBackground(Color.white);
b96.setBackground(Color.white);
b97.setBackground(Color.white);
b98.setBackground(Color.white);
b99.setBackground(Color.white);
b100.setBackground(Color.white);
b101.setBackground(Color.white);
b102.setBackground(Color.white);
b103.setBackground(Color.white);
	}
});
Button b126=new Button("Reactive nonmetal");
b126.setBounds(260,255,100,40);// setting button position
b126.setBackground(Color.yellow);
b126.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){
b1.setBackground(Color.yellow);
b2.setBackground(Color.white);
b3.setBackground(Color.white); 
b4.setBackground(Color.white);  
b5.setBackground(Color.white);  
b6.setBackground(Color.yellow);  
b7.setBackground(Color.yellow); 
b8.setBackground(Color.yellow);  
b9.setBackground(Color.yellow);  
b10.setBackground(Color.white);
b11.setBackground(Color.white); 
b12.setBackground(Color.white); 
b13.setBackground(Color.white); 
b14.setBackground(Color.white); 
b15.setBackground(Color.yellow);   
b16.setBackground(Color.yellow);  
b17.setBackground(Color.yellow); 
b18.setBackground(Color.white); 
b19.setBackground(Color.white); 
b20.setBackground(Color.white); 
b21.setBackground(Color.white); 
b22.setBackground(Color.white); 
b23.setBackground(Color.white); 
b24.setBackground(Color.white); 
b25.setBackground(Color.white); 
b26.setBackground(Color.white); 
b27.setBackground(Color.white); 
b28.setBackground(Color.white);
b29.setBackground(Color.white); 
b30.setBackground(Color.white);  
b31.setBackground(Color.white); 
b32.setBackground(Color.white);  
b33.setBackground(Color.white);
b34.setBackground(Color.yellow);
b35.setBackground(Color.yellow);
b36.setBackground(Color.white);
b37.setBackground(Color.white); 
b38.setBackground(Color.white); 
b39.setBackground(Color.white); 
b40.setBackground(Color.white); 
b41.setBackground(Color.white); 
b42.setBackground(Color.white); 
b43.setBackground(Color.white); 
b44.setBackground(Color.white); 
b45.setBackground(Color.white); 
b46.setBackground(Color.white);
b47.setBackground(Color.white); 
b48.setBackground(Color.white);
b49.setBackground(Color.white); 
b50.setBackground(Color.white);  
b51.setBackground(Color.white);
b52.setBackground(Color.white);
b53.setBackground(Color.yellow);
b54.setBackground(Color.white);
b55.setBackground(Color.white);
b56.setBackground(Color.white);
b57.setBackground(Color.white);
b72.setBackground(Color.white);
b73.setBackground(Color.white);
b74.setBackground(Color.white);
b75.setBackground(Color.white);
b76.setBackground(Color.white);
b77.setBackground(Color.white);
b78.setBackground(Color.white);
b79.setBackground(Color.white);
b80.setBackground(Color.white);
b81.setBackground(Color.white);
b82.setBackground(Color.white);
b83.setBackground(Color.white);
b84.setBackground(Color.white);
b85.setBackground(Color.white);
b86.setBackground(Color.white);
b87.setBackground(Color.white);
b88.setBackground(Color.white);
b89.setBackground(Color.white);
b104.setBackground(Color.white);
b105.setBackground(Color.white);
b106.setBackground(Color.white);
b107.setBackground(Color.white);
b108.setBackground(Color.white);
b109.setBackground(Color.white);
b110.setBackground(Color.white);
b111.setBackground(Color.white);
b112.setBackground(Color.white);
b113.setBackground(Color.white);
b114.setBackground(Color.white);
b115.setBackground(Color.white);
b116.setBackground(Color.white);
b117.setBackground(Color.white);
b118.setBackground(Color.white);
b58.setBackground(Color.white);
b59.setBackground(Color.white);
b60.setBackground(Color.white);
b61.setBackground(Color.white);
b62.setBackground(Color.white);
b63.setBackground(Color.white);
b64.setBackground(Color.white);  
b65.setBackground(Color.white); 
b66.setBackground(Color.white);
b67.setBackground(Color.white);
b68.setBackground(Color.white);
b69.setBackground(Color.white);
b70.setBackground(Color.white);
b71.setBackground(Color.white);
b90.setBackground(Color.white);
b91.setBackground(Color.white);
b92.setBackground(Color.white);
b93.setBackground(Color.white);
b94.setBackground(Color.white);
b95.setBackground(Color.white);
b96.setBackground(Color.white);
b97.setBackground(Color.white);
b98.setBackground(Color.white);
b99.setBackground(Color.white);
b100.setBackground(Color.white);
b101.setBackground(Color.white);
b102.setBackground(Color.white);
b103.setBackground(Color.white);
	}
});
Button b127=new Button("Noble gas");
b127.setBounds(360,255,100,40);// setting button position
b127.setBackground(Color.blue);
b127.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){
b1.setBackground(Color.white);
b2.setBackground(Color.blue);
b3.setBackground(Color.white); 
b4.setBackground(Color.white);  
b5.setBackground(Color.white);  
b6.setBackground(Color.white);  
b7.setBackground(Color.white); 
b8.setBackground(Color.white);  
b9.setBackground(Color.white);  
b10.setBackground(Color.blue);
b11.setBackground(Color.white); 
b12.setBackground(Color.white); 
b13.setBackground(Color.white); 
b14.setBackground(Color.white); 
b15.setBackground(Color.white);   
b16.setBackground(Color.white);  
b17.setBackground(Color.white); 
b18.setBackground(Color.blue); 
b19.setBackground(Color.white); 
b20.setBackground(Color.white); 
b21.setBackground(Color.white); 
b22.setBackground(Color.white); 
b23.setBackground(Color.white); 
b24.setBackground(Color.white); 
b25.setBackground(Color.white); 
b26.setBackground(Color.white); 
b27.setBackground(Color.white); 
b28.setBackground(Color.white);
b29.setBackground(Color.white); 
b30.setBackground(Color.white);  
b31.setBackground(Color.white); 
b32.setBackground(Color.white);  
b33.setBackground(Color.white);
b34.setBackground(Color.white);
b35.setBackground(Color.white);
b36.setBackground(Color.blue);
b37.setBackground(Color.white); 
b38.setBackground(Color.white); 
b39.setBackground(Color.white); 
b40.setBackground(Color.white); 
b41.setBackground(Color.white); 
b42.setBackground(Color.white); 
b43.setBackground(Color.white); 
b44.setBackground(Color.white); 
b45.setBackground(Color.white); 
b46.setBackground(Color.white);
b47.setBackground(Color.white); 
b48.setBackground(Color.white);
b49.setBackground(Color.white); 
b50.setBackground(Color.white);  
b51.setBackground(Color.white);
b52.setBackground(Color.white);
b53.setBackground(Color.white);
b54.setBackground(Color.blue);
b55.setBackground(Color.white);
b56.setBackground(Color.white);
b57.setBackground(Color.white);
b72.setBackground(Color.white);
b73.setBackground(Color.white);
b74.setBackground(Color.white);
b75.setBackground(Color.white);
b76.setBackground(Color.white);
b77.setBackground(Color.white);
b78.setBackground(Color.white);
b79.setBackground(Color.white);
b80.setBackground(Color.white);
b81.setBackground(Color.white);
b82.setBackground(Color.white);
b83.setBackground(Color.white);
b84.setBackground(Color.white);
b85.setBackground(Color.white);
b86.setBackground(Color.blue);
b87.setBackground(Color.white);
b88.setBackground(Color.white);
b89.setBackground(Color.white);
b104.setBackground(Color.white);
b105.setBackground(Color.white);
b106.setBackground(Color.white);
b107.setBackground(Color.white);
b108.setBackground(Color.white);
b109.setBackground(Color.white);
b110.setBackground(Color.white);
b111.setBackground(Color.white);
b112.setBackground(Color.white);
b113.setBackground(Color.white);
b114.setBackground(Color.white);
b115.setBackground(Color.white);
b116.setBackground(Color.white);
b117.setBackground(Color.white);
b118.setBackground(Color.white);
b58.setBackground(Color.white);
b59.setBackground(Color.white);
b60.setBackground(Color.white);
b61.setBackground(Color.white);
b62.setBackground(Color.white);
b63.setBackground(Color.white);
b64.setBackground(Color.white);  
b65.setBackground(Color.white); 
b66.setBackground(Color.white);
b67.setBackground(Color.white);
b68.setBackground(Color.white);
b69.setBackground(Color.white);
b70.setBackground(Color.white);
b71.setBackground(Color.white);
b90.setBackground(Color.white);
b91.setBackground(Color.white);
b92.setBackground(Color.white);
b93.setBackground(Color.white);
b94.setBackground(Color.white);
b95.setBackground(Color.white);
b96.setBackground(Color.white);
b97.setBackground(Color.white);
b98.setBackground(Color.white);
b99.setBackground(Color.white);
b100.setBackground(Color.white);
b101.setBackground(Color.white);
b102.setBackground(Color.white);
b103.setBackground(Color.white);
	}
});
Button b128=new Button("Unknown chemical properties");
b128.setBounds(460,255,200,40);// setting button position
b128.setBackground(Color.white);
b128.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){
b1.setBackground(Color.yellow);
b2.setBackground(Color.blue);
b3.setBackground(Color.red); 
b4.setBackground(Color.green);  
b5.setBackground(Color.gray);  
b6.setBackground(Color.yellow);  
b7.setBackground(Color.yellow); 
 b8.setBackground(Color.yellow);  
  b9.setBackground(Color.yellow);  
 b10.setBackground(Color.blue);
  b11.setBackground(Color.red); 
b12.setBackground(Color.green); 
  b13.setBackground(Color.lightGray); 
  b14.setBackground(Color.gray); 
  b15.setBackground(Color.yellow);   
b16.setBackground(Color.yellow);  
b17.setBackground(Color.yellow); 
  b18.setBackground(Color.blue); 
b19.setBackground(Color.red); 
 b20.setBackground(Color.green); 
 b21.setBackground(Color.pink); 
 b22.setBackground(Color.pink); 
  b23.setBackground(Color.pink); 
  b24.setBackground(Color.pink); 
b25.setBackground(Color.pink); 
b26.setBackground(Color.pink); 
b27.setBackground(Color.pink); 
b28.setBackground(Color.pink);
b29.setBackground(Color.pink); 
b30.setBackground(Color.lightGray);  
b31.setBackground(Color.lightGray); 
b32.setBackground(Color.gray);  
  b33.setBackground(Color.gray);
 b34.setBackground(Color.yellow);
b35.setBackground(Color.yellow);
  b36.setBackground(Color.blue);
b37.setBackground(Color.red); 
 b38.setBackground(Color.green); 
b39.setBackground(Color.pink); 
 b40.setBackground(Color.pink); 
b41.setBackground(Color.pink); 
b42.setBackground(Color.pink); 
b43.setBackground(Color.pink); 
  b44.setBackground(Color.pink); 
  b45.setBackground(Color.pink); 
  b46.setBackground(Color.pink);
 b47.setBackground(Color.pink); 
b48.setBackground(Color.lightGray);
 b49.setBackground(Color.lightGray); 
b50.setBackground(Color.lightGray);  
b51.setBackground(Color.gray);
b52.setBackground(Color.gray);
b53.setBackground(Color.yellow);
b54.setBackground(Color.blue);
b55.setBackground(Color.red);
b56.setBackground(Color.green);
b57.setBackground(Color.magenta);
b72.setBackground(Color.pink);
b73.setBackground(Color.pink);
b74.setBackground(Color.pink);
b75.setBackground(Color.pink);
b76.setBackground(Color.pink);
b77.setBackground(Color.pink);
b78.setBackground(Color.pink);
b79.setBackground(Color.pink);
b80.setBackground(Color.lightGray);
b81.setBackground(Color.lightGray);
b82.setBackground(Color.lightGray);
b83.setBackground(Color.lightGray);
b84.setBackground(Color.lightGray);
b85.setBackground(Color.gray);
b86.setBackground(Color.blue);
b87.setBackground(Color.red);
b88.setBackground(Color.green);
 b89.setBackground(Color.orange);
b104.setBackground(Color.pink);
 b105.setBackground(Color.pink);
b106.setBackground(Color.pink);
b107.setBackground(Color.pink);
b108.setBackground(Color.pink);
b109.setBackground(Color.white);
b110.setBackground(Color.white);
b111.setBackground(Color.white);
b112.setBackground(Color.lightGray);
b113.setBackground(Color.white);
b114.setBackground(Color.white);
b115.setBackground(Color.white);
  b116.setBackground(Color.white);
  b117.setBackground(Color.white);
b118.setBackground(Color.white);
  b58.setBackground(Color.magenta);
b59.setBackground(Color.magenta);
 b60.setBackground(Color.magenta);
b61.setBackground(Color.magenta);
b62.setBackground(Color.magenta);
b63.setBackground(Color.magenta);
b64.setBackground(Color.magenta);  
b65.setBackground(Color.magenta);
 b66.setBackground(Color.magenta);
b67.setBackground(Color.magenta);
b68.setBackground(Color.magenta);
b69.setBackground(Color.magenta);
b70.setBackground(Color.magenta);
b71.setBackground(Color.magenta);
b90.setBackground(Color.orange);
b91.setBackground(Color.orange);
b92.setBackground(Color.orange);
b93.setBackground(Color.orange);
b94.setBackground(Color.orange);
b95.setBackground(Color.orange);
b96.setBackground(Color.orange);
 b97.setBackground(Color.orange);
b98.setBackground(Color.orange);
  b99.setBackground(Color.orange);
  b100.setBackground(Color.orange);
  b101.setBackground(Color.orange);
b102.setBackground(Color.orange);
b103.setBackground(Color.orange);
	}
});

JLabel l=new JLabel("    MODERN PERIODIC TABLE    ");
l.setFont(new Font("Serif", Font.BOLD, 30));
l.setBounds(450,75,500,65);
add(b1);//adding button into frame
add(b2);//adding button into frame
add(b3);//adding button into frame
add(b4);//adding button into frame
add(b5);//adding button into frame
add(b6);//adding button into frame
add(b7);//adding button into frame
add(b8);//adding button into frame
add(b9);//adding button into frame
add(b10);//adding button into frame
add(b11);//adding button into frame
add(b12);//adding button into frame
add(b13);//adding button into frame
add(b14);//adding button into frame
add(b15);//adding button into frame
add(b16);//adding button into frame
add(b17);//adding button into frame
add(b18);//adding button into frame
add(b19);//adding button into frame
add(b20);//adding button into frame
add(b21);//adding button into frame
add(b22);//adding button into frame
add(b23);//adding button into frame
add(b24);//adding button into frame
add(b25);//adding button into frame
add(b26);//adding button into frame
add(b27);//adding button into frame
add(b28);//adding button into frame
add(b29);//adding button into frame
add(b30);//adding button into frame
add(b31);//adding button into frame
add(b32);//adding button into frame
add(b33);//adding button into frame
add(b34);//adding button into frame
add(b35);//adding button into frame
add(b36);//adding button into frame
add(b37);//adding button into frame
add(b38);//adding button into frame
add(b39);//adding button into frame
add(b40);//adding button into frame
add(b41);//adding button into frame
add(b42);//adding button into frame
add(b43);//adding button into frame
add(b44);//adding button into frame
add(b45);//adding button into frame
add(b46);//adding button into frame
add(b47);//adding button into frame
add(b48);//adding button into frame
add(b49);//adding button into frame
add(b50);//adding button into frame
add(b51);//adding button into frame
add(b52);//adding button into frame
add(b53);//adding button into frame
add(b54);//adding button into frame
add(b55);//adding button into frame
add(b56);//adding button into frame
add(b57);//adding button into frame
add(b58);//adding button into frame
add(b59);//adding button into frame
add(b60);//adding button into frame
add(b61);//adding button into frame
add(b62);//adding button into frame
add(b63);//adding button into frame
add(b64);//adding button into frame
add(b65);//adding button into frame
add(b66);//adding button into frame
add(b67);//adding button into frame
add(b68);//adding button into frame
add(b69);//adding button into frame
add(b70);//adding button into frame
add(b71);//adding button into frame
add(b72);//adding button into frame
add(b73);//adding button into frame
add(b74);//adding button into frame
add(b75);//adding button into frame
add(b76);//adding button into frame
add(b77);//adding button into frame
add(b78);//adding button into frame
add(b79);//adding button into frame
add(b80);//adding button into frame
add(b81);//adding button into frame
add(b82);//adding button into frame
add(b83);//adding button into frame
add(b84);//adding button into frame
add(b85);//adding button into frame
add(b86);//adding button into frame
add(b87);//adding button into frame
add(b88);//adding button into frame
add(b89);//adding button into frame
add(b90);//adding button into frame
add(b91);//adding button into frame
add(b92);//adding button into frame
add(b92);//adding button into frame
add(b93);//adding button into frame
add(b94);//adding button into frame
add(b95);//adding button into frame
add(b96);//adding button into frame
add(b97);//adding button into frame
add(b98);//adding button into frame
add(b99);//adding button into frame
add(b100);//adding button into frame
add(b101);//adding button into frame
add(b102);//adding button into frame
add(b103);//adding button into frame
add(b104);//adding button into frame
add(b105);//adding button into frame
add(b106);//adding button into frame
add(b107);//adding button into frame
add(b108);//adding button into frame
add(b109);//adding button into frame
add(b110);//adding button into frame
add(b111);//adding button into frame
add(b112);//adding button into frame
add(b113);//adding button into frame
add(b114);//adding button into frame
add(b115);//adding button into frame
add(b116);//adding button into frame
add(b117);//adding button into frame
add(b118);//adding button into frame
add(b119);
add(b120);
add(b121);
add(b122);
add(b123);
add(b124);
add(b125);
add(b126);
add(b127);
add(b128);
add(l);
 addWindowListener(new WindowAdapter(){  
            public void windowClosing(WindowEvent e) {  
                dispose();  
            }  
        }); 
setSize(1400,1200);//frame size 300 width and 300 height  
setLayout(null);//no layout manager  
setVisible(true);//now frame will be visible, by default not visible  
} 
public static void main(String args[]){  
First f=new First();
}
}  