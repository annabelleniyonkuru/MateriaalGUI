import javax.swing.*;


public class MateriaalGUI extends JFrame{
    private JPanel mainpanel;
    private JTextField textField1;
    private JTextField textField2;
    private JCheckBox checkBox1;
    private JCheckBox checkBox2;
    private JTextField textField3;
    private JTextField textField4;
    private JLabel naam;
    private JLabel hoeveelheid;


    public MateriaalGUI(String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainpanel);
        this.pack();

    }

    public static void main(String[] args) {
JFrame frame= new MateriaalGUI("camprep");
        frame.setVisible(true);
        frame.setResizable(false);
       // frame.setSize(550,200);

    }



}



