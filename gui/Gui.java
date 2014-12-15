import javax.swing.*;
import java.awt.*;

public class Gui extends JFrame {

	public Gui() {
		setTitle("ASDF");
		setSize(600 , 400);
		setLocation(100 , 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args){

		Gui f = new Gui();
		f.setVisible(true);

	}

}
