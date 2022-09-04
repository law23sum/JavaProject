import javax.swing.*;

JFrame window = new JFrame("law23sum's window");
JPanel panel = new JPanel();
JButton button = new JButton("click here.");
panel.add(button);
window.add(panel);
window.setSize(230,230);
button.addActionListener(e -> System.out.println("oh no. its been clicked."));
window.setVisible(true);
window.setSize(23,23);
window.setSize(230,230);