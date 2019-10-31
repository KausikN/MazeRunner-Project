import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kausik N
 */
public class Maze_UpdateParameters_Frame extends javax.swing.JFrame {

    /**
     * Creates new form Maze_BasicGen_BasicGUI
     */
    public Maze_UpdateParameters_Frame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        Background_Panel = new javax.swing.JPanel();
        Title_Label = new javax.swing.JLabel();
        UpdateParams_Button = new javax.swing.JButton();
        TreeDepth_Label = new javax.swing.JLabel();
        MaxBranches_Label = new javax.swing.JLabel();
        BranchForm_Label = new javax.swing.JLabel();
        DeadEnd_Label = new javax.swing.JLabel();
        CycleForm_Label = new javax.swing.JLabel();
        FinalNode_Label = new javax.swing.JLabel();
        MaxDepth_TextField = new javax.swing.JTextField();
        DeadEnd_TextField = new javax.swing.JTextField();
        MaxBranches_TextField = new javax.swing.JTextField();
        BranchForm_TextField = new javax.swing.JTextField();
        CycleForm_TextField = new javax.swing.JTextField();
        FinalNode_TextField = new javax.swing.JTextField();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Background_Panel.setBackground(new java.awt.Color(0, 0, 0));
        Background_Panel.setFocusable(false);

        Title_Label.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        Title_Label.setForeground(new java.awt.Color(0, 255, 204));
        Title_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title_Label.setText("MAZE RUNNER");

        UpdateParams_Button.setBackground(new java.awt.Color(0, 0, 0));
        UpdateParams_Button.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        UpdateParams_Button.setForeground(new java.awt.Color(0, 204, 204));
        UpdateParams_Button.setText("Update Parameters");
        UpdateParams_Button.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 204, 204)));
        UpdateParams_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateParams_ButtonActionPerformed(evt);
            }
        });

        TreeDepth_Label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TreeDepth_Label.setForeground(new java.awt.Color(0, 255, 204));
        TreeDepth_Label.setText("Max Maze Depth");

        MaxBranches_Label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        MaxBranches_Label.setForeground(new java.awt.Color(0, 255, 204));
        MaxBranches_Label.setText("Max number of Doors");

        BranchForm_Label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BranchForm_Label.setForeground(new java.awt.Color(0, 255, 204));
        BranchForm_Label.setText("Probability of Open Door");

        DeadEnd_Label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DeadEnd_Label.setForeground(new java.awt.Color(0, 255, 204));
        DeadEnd_Label.setText("Dead End Probability");

        CycleForm_Label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CycleForm_Label.setForeground(new java.awt.Color(0, 255, 204));
        CycleForm_Label.setText("Probability of Looping Back Paths");

        FinalNode_Label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        FinalNode_Label.setForeground(new java.awt.Color(0, 255, 204));
        FinalNode_Label.setText("Number of Win Locations");

        javax.swing.GroupLayout Background_PanelLayout = new javax.swing.GroupLayout(Background_Panel);
        Background_Panel.setLayout(Background_PanelLayout);
        Background_PanelLayout.setHorizontalGroup(
            Background_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Background_PanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Title_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(356, 356, 356))
            .addGroup(Background_PanelLayout.createSequentialGroup()
                .addGroup(Background_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Background_PanelLayout.createSequentialGroup()
                        .addGap(359, 359, 359)
                        .addComponent(UpdateParams_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Background_PanelLayout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(Background_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Background_PanelLayout.createSequentialGroup()
                                .addComponent(MaxBranches_Label)
                                .addGap(140, 140, 140)
                                .addComponent(MaxBranches_TextField))
                            .addGroup(Background_PanelLayout.createSequentialGroup()
                                .addComponent(TreeDepth_Label)
                                .addGap(181, 181, 181)
                                .addComponent(MaxDepth_TextField, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE))
                            .addGroup(Background_PanelLayout.createSequentialGroup()
                                .addComponent(BranchForm_Label)
                                .addGap(114, 114, 114)
                                .addComponent(BranchForm_TextField))
                            .addGroup(Background_PanelLayout.createSequentialGroup()
                                .addComponent(DeadEnd_Label)
                                .addGap(147, 147, 147)
                                .addComponent(DeadEnd_TextField))
                            .addGroup(Background_PanelLayout.createSequentialGroup()
                                .addComponent(CycleForm_Label)
                                .addGap(41, 41, 41)
                                .addComponent(CycleForm_TextField))
                            .addGroup(Background_PanelLayout.createSequentialGroup()
                                .addComponent(FinalNode_Label)
                                .addGap(110, 110, 110)
                                .addComponent(FinalNode_TextField)))))
                .addGap(103, 103, 103))
        );
        Background_PanelLayout.setVerticalGroup(
            Background_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Background_PanelLayout.createSequentialGroup()
                .addComponent(Title_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addGroup(Background_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TreeDepth_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MaxDepth_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Background_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DeadEnd_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeadEnd_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Background_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MaxBranches_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MaxBranches_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Background_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BranchForm_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BranchForm_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Background_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CycleForm_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CycleForm_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Background_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FinalNode_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FinalNode_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 203, Short.MAX_VALUE)
                .addComponent(UpdateParams_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Background_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Background_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    Random random = new Random();
    Maze_BasicThreadedGen_BasicGUI game = null;
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    
    }//GEN-LAST:event_formWindowOpened

    private void UpdateParams_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateParams_ButtonActionPerformed
    if(game == null)
    {
        game = new Maze_BasicThreadedGen_BasicGUI();
        game.setVisible(true);
    }
    if(game != null)
    {
        game.MAIN_max_tree_depth = Integer.parseInt(MaxDepth_TextField.getText());
        game.MAIN_dead_end_probability = Float.parseFloat(DeadEnd_TextField.getText());
        game.MAIN_max_branches = Integer.parseInt(MaxBranches_TextField.getText());
        game.MAIN_branch_formation_probability = Float.parseFloat(BranchForm_TextField.getText());
        game.MAIN_cycle_formation_probability = Float.parseFloat(CycleForm_TextField.getText());
        game.MAIN_no_of_final_nodes = Integer.parseInt(FinalNode_TextField.getText());
    }
    }//GEN-LAST:event_UpdateParams_ButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Maze_BasicGen_BasicGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Maze_BasicGen_BasicGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Maze_BasicGen_BasicGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Maze_BasicGen_BasicGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Maze_UpdateParameters_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background_Panel;
    private javax.swing.JLabel BranchForm_Label;
    private javax.swing.JTextField BranchForm_TextField;
    private javax.swing.JLabel CycleForm_Label;
    private javax.swing.JTextField CycleForm_TextField;
    private javax.swing.JLabel DeadEnd_Label;
    private javax.swing.JTextField DeadEnd_TextField;
    private javax.swing.JLabel FinalNode_Label;
    private javax.swing.JTextField FinalNode_TextField;
    private javax.swing.JLabel MaxBranches_Label;
    private javax.swing.JTextField MaxBranches_TextField;
    private javax.swing.JTextField MaxDepth_TextField;
    private javax.swing.JLabel Title_Label;
    private javax.swing.JLabel TreeDepth_Label;
    private javax.swing.JButton UpdateParams_Button;
    private javax.swing.JDialog jDialog1;
    // End of variables declaration//GEN-END:variables
}
