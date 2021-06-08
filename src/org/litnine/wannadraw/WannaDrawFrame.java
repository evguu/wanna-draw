package org.litnine.wannadraw;

import org.litnine.wannadraw.components.ImageButton;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import java.awt.*;

public class WannaDrawFrame extends JFrame {

    public WannaDrawFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("WannaDraw!");
        this.setLayout(new BorderLayout());

        {
            JPanel centerPanel = new JPanel(null);
            centerPanel.setPreferredSize(new Dimension(500, 150));
            this.add(centerPanel, BorderLayout.CENTER);

            {
                JPanel configPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
                configPanel.setBounds(20, 10, 480, 60);
                configPanel.setBorder(
                        BorderFactory.createTitledBorder(
                                BorderFactory.createEmptyBorder(),
                                "Choose configuration"
                        ));
                centerPanel.add(configPanel);

                JComboBox<String> configComboBox = new JComboBox<>(new String[]{
                        "-- NO CONFIGURATION SELECTED --",
                        "Photoshop"
                });
                configComboBox.setFocusable(false);
                configPanel.add(configComboBox);

                ImageButton plusImageButton = new ImageButton("resources/plus-square.png");
                configPanel.add(plusImageButton);

                ImageButton runImageButton = new ImageButton("resources/caret-right-square.png");
                configPanel.add(runImageButton);

                ImageButton folderImageButton = new ImageButton("resources/folder.png");
                configPanel.add(folderImageButton);

                ImageButton editImageButton = new ImageButton("resources/pencil-square.png");
                configPanel.add(editImageButton);

                ImageButton deleteImageButton = new ImageButton("resources/dash-square.png");
                configPanel.add(deleteImageButton);
            }
        }

        {
            JPanel footerPanel = new JPanel(new BorderLayout());
            footerPanel.setBorder(new EtchedBorder());
            this.add(footerPanel, BorderLayout.SOUTH);

            JLabel authorLabel = new JLabel("By github.com/evguu");
            footerPanel.add(authorLabel, BorderLayout.WEST);

            JLabel versionLabel = new JLabel("version 0.1.0");
            footerPanel.add(versionLabel, BorderLayout.EAST);
        }

        this.pack();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
