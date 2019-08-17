import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Color;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Toolkit;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JSeparator;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.JLayeredPane;
import javax.swing.JDesktopPane;
import javax.swing.JSplitPane;
import java.awt.Panel;
import java.awt.RenderingHints;
import javax.swing.SwingConstants;

public class main {

	private JFrame frame;
	JButton b1;
	JLabel Preview;
	JLabel PreviewName;
	JPanel cards; //a panel that uses CardLayout
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main window = new main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 850, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		
		frame.getContentPane().setLayout(new BorderLayout());
		JLabel label = new JLabel(new ImageIcon("C:\\Users\\spara\\Pictures\\background.jpg"));
		frame.setContentPane(label);
		frame.getContentPane().setLayout(new FlowLayout(FlowLayout.LEADING));
        b1=new JButton("I am a button");
        
        Image resized = getScaledImage(new ImageIcon("C:\\Users\\spara\\Pictures\\Wallpaper\\Desktop\\1.Alba.jpg").getImage(), 200, 150);
        ImageIcon i = new ImageIcon(resized);
        Preview = new JLabel(i);
        Preview.setHorizontalAlignment(SwingConstants.LEFT);
        Preview.setPreferredSize(new Dimension(200, 150));
        
        PreviewName = new JLabel("Alba");
        
        frame.getContentPane().add(Preview);
        frame.getContentPane().add(PreviewName);
        frame.getContentPane().add(b1);
        
        
		
		 
	        
	}
	
	private Image getScaledImage(Image srcImg, int w, int h){
	    BufferedImage resizedImg = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
	    Graphics2D g2 = resizedImg.createGraphics();

	    g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
	    g2.drawImage(srcImg, 0, 0, w, h, null);
	    g2.dispose();

	    return resizedImg;
	}
}
