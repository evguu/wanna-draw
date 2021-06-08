package org.litnine.wannadraw.components;

import javax.swing.*;
import java.awt.*;

public class ImageButton extends JButton {
    private static final int BUTTON_SIZE = 25;

    public ImageButton(String filename) {
        super(new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(BUTTON_SIZE, BUTTON_SIZE, Image.SCALE_REPLICATE)));
        this.setMargin(new Insets(0, 0, 0, 0));
        this.setFocusable(false);
    }
}
