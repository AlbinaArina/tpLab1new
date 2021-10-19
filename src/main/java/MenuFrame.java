import javax.swing.*;

public class MenuFrame extends JFrame {

    private static final long serialVersionUID = 1L;

    private JMenu menu;
    private JMenuItem menuItem;
    private JMenuBar menuBar;
    private JRadioButtonMenuItem rbMenuItem;
    private MyPanel panel = new MyPanel();

    @SuppressWarnings("unchecked")
    public MenuFrame()
    {

        super("DateBase");
        this.setJMenuBar(menuBar);
        this.setContentPane(panel);
        this.setSize(1000,1000);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);


    }
}
