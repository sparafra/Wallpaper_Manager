package wallpaperManager.wallpaperManager;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Main {

	private JFrame frame;
	JButton b1;
	JLabel Preview;
	JLabel PreviewName;
	JLabel PathImage;
	JLabel SizeImage;

	JPanel cards; //a panel that uses CardLayout
	
	JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
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
	public Main() {
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
		JLabel label = new JLabel(new ImageIcon(System.getProperty("user.dir")+"\\Images\\background.jpg"));
		frame.setContentPane(label);
		frame.getContentPane().setLayout(null);
        b1=new JButton("I am a button");
        
        Image resized = getScaledImage(new ImageIcon("C:\\Users\\spara\\Pictures\\Wallpaper\\Desktop\\1.Alba.jpg").getImage(), 200, 150);
        ImageIcon i = new ImageIcon(resized);
        Preview = new JLabel(i);
        Preview.setHorizontalAlignment(SwingConstants.LEFT);
        Preview.setBounds(50, 100, 200, 150);
        
        PreviewName = new JLabel("Alba");
        PreviewName.setBounds(280, 100, 150, 20);

        PathImage = new JLabel("C:\\User\\Francesco\\Desktop\\image.jpg");
        PathImage.setBounds(280, 120, 200, 20);
        
        SizeImage = new JLabel("1920x1080");
        SizeImage.setBounds(280, 140, 150, 20);
        
        
        textField = new JTextField();
        textField.setBounds(50, 50, 200, 20);
        
        

        frame.getContentPane().add(Preview);
        frame.getContentPane().add(PreviewName);
        frame.getContentPane().add(PathImage);
        frame.getContentPane().add(SizeImage);

        frame.getContentPane().add(b1);
        frame.getContentPane().add(textField);

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
