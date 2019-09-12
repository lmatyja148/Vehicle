package vehicle2;







import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
@SuppressWarnings("serial")
public class logo extends JFrame 
{

	
		JPanel pnl = new JPanel();

		ClassLoader ldr = this.getClass().getClassLoader();

		ImageIcon logo = new ImageIcon( ldr.getResource("dodgelogo.jpg"));

		//ImageIcon duke = new ImageIcon( "duke.png" );
		
		JLabel lbl1 = new JLabel( "ram" ) ;
		JLabel lbl2 = new JLabel( "Duke is the friendly mascot of Java technology." ) ;
		//JLabel lbl3 = new JLabel( "dodge", dodge, JLabel.CENTER ) ;

		public logo()
		{
			super("Swing Window");
			setSize( 500,200 );
			setDefaultCloseOperation( EXIT_ON_CLOSE );
			add(pnl);

			//lbl3.setHorizontalTextPosition(JLabel.CENTER);
			//lbl3.setVerticalTextPosition(JLabel.BOTTOM);
			

			lbl1.setToolTipText( "Mopar" ) ;
			
			pnl.add( lbl1 ) ;
			pnl.add( lbl2 ) ;
			//pnl.add( lbl3 ) ;

			setVisible( true );
		}

		
		
		
		 
	}