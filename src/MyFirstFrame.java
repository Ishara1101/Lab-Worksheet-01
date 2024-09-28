import javax.swing.JFrame;

public class MyFirstFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My First Frame");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(100, 50); // 100 pixels from the left, 50 pixels from the top
        frame.setVisible(true);
    }
}
