package guis;

import javax.swing.*;

public abstract class BaseFrame extends JFrame {
    public BaseFrame(String title) {
        initialize(title);
    }

    private void initialize(String title) {
        setTitle(title);

        setSize(500, 600);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(null);

        setResizable(false);

        setLocationRelativeTo(null);

        addGuiComponents();
    }

    protected absctract void addGuiComponents();
}
