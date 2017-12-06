package ge.edu.sangu.lesson08;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.*;

public class Main extends JFrame {
    private JTextArea area;

    public Main() {
        initUI();
    }

    private void initUI() {

        createMenuBar();
        createPanel();

        setTitle("Simple menu");
        setSize(300, 280);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void createFileOpenerItem(JMenu menu) {
        JMenuItem openItem = new JMenuItem("Open");
        openItem.addActionListener((ActionEvent event) -> {


            JFileChooser chooser = new JFileChooser();
            if (chooser.showOpenDialog(this) != JFileChooser.APPROVE_OPTION)
                return;
            File file = chooser.getSelectedFile();
            if (file == null)
                return;

            FileReader reader = null;
            try {
                reader = new FileReader(file);
                area.read(reader, null);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this,
                        "File Not Found", "ERROR", JOptionPane.ERROR_MESSAGE);
            } finally {
                if (reader != null) {
                    try {
                        reader.close();
                    } catch (IOException x) {
                    }
                }
            }
        });
        menu.add(openItem);
    }

    private void createFileSaverItem(JMenu menu) {
        JMenuItem saveItem = new JMenuItem("Save");
        saveItem.addActionListener((ActionEvent event) -> {
            JFileChooser chooser = new JFileChooser();
            chooser.setCurrentDirectory(new File("C:/"));
            if (chooser.showSaveDialog(this) != JFileChooser.APPROVE_OPTION)
                return;
            File file = chooser.getSelectedFile();
            if (file == null)
                return;

            FileWriter writer = null;
            try {
                writer = new FileWriter(file);
                area.write(writer);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this,
                        "Problem With saving a file", "ERROR", JOptionPane.ERROR_MESSAGE);
            } finally {
                if (writer != null) {
                    try {
                        writer.close();
                    } catch (IOException x) {
                    }
                }
            }
        });
        menu.add(saveItem);
    }

    private void createMenuBar() {

        JMenuBar menubar = new JMenuBar();

        JMenu file = new JMenu("File");

        createFileOpenerItem(file);
        createFileSaverItem(file);

        JMenuItem eMenuItem = new JMenuItem("Exit");
        eMenuItem.setMnemonic(KeyEvent.VK_E);
        eMenuItem.setToolTipText("Exit application");
        eMenuItem.addActionListener((ActionEvent event) -> {
            System.exit(0);
        });

        file.add(eMenuItem);

        menubar.add(file);

        setJMenuBar(menubar);
    }

    private void createPanel() {
        JPanel panel = new JPanel();
        getContentPane().add(panel, "North");
        JTextArea area = new JTextArea();
        JScrollPane areaScrollPane = new JScrollPane(area);
        areaScrollPane.setVerticalScrollBarPolicy(
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        areaScrollPane.setPreferredSize(new Dimension(280, 200));

        this.area = area;
        panel.add(areaScrollPane);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            Main ex = new Main();
            ex.setVisible(true);
        });
    }
}
