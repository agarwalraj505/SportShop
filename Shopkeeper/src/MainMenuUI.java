
import java.awt.Toolkit;

public class MainMenuUI extends javax.swing.JFrame {

    /** Creates new form MainMenuUI */
    public MainMenuUI() {
        initComponents();
        setIcon();
        
    }

   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuCustAdd = new javax.swing.JMenuItem();
        mnuItemAdd = new javax.swing.JMenuItem();
        mnuOrder = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        ListCust = new javax.swing.JMenuItem();
        ListItem = new javax.swing.JMenuItem();
        ListOrder = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SPORT SHOP");

        jLabel1.setFont(new java.awt.Font("EnviroD", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setText(" SPORTS SHOP");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon.jpeg"))); // NOI18N

        jMenu1.setText("Sports Club");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        mnuCustAdd.setText("Cusomer Entry");
        mnuCustAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCustAddActionPerformed(evt);
            }
        });
        jMenu1.add(mnuCustAdd);

        mnuItemAdd.setText("Item Entry");
        mnuItemAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItemAddActionPerformed(evt);
            }
        });
        jMenu1.add(mnuItemAdd);

        mnuOrder.setText("Order Entry");
        mnuOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuOrderActionPerformed(evt);
            }
        });
        jMenu1.add(mnuOrder);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("View/Edit");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        ListCust.setText("Customer List");
        ListCust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListCustActionPerformed(evt);
            }
        });
        jMenu2.add(ListCust);

        ListItem.setText("Item List");
        ListItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListItemActionPerformed(evt);
            }
        });
        jMenu2.add(ListItem);

        ListOrder.setText("Order List");
        ListOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListOrderActionPerformed(evt);
            }
        });
        jMenu2.add(ListOrder);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Quit");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("quit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(57, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuCustAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCustAddActionPerformed
        this.setVisible(false);
        new ShopINUI().setVisible(true);
}//GEN-LAST:event_mnuCustAddActionPerformed

    private void mnuItemAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItemAddActionPerformed
        this.setVisible(false);
        new ItemINUI().setVisible(true);
}//GEN-LAST:event_mnuItemAddActionPerformed

    private void mnuOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuOrderActionPerformed
        this.setVisible(false);
        new OrderINUI().setVisible(true);
}//GEN-LAST:event_mnuOrderActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        
}//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        
}//GEN-LAST:event_jMenu2ActionPerformed

    private void ListCustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListCustActionPerformed
        this.setVisible(false);
        new CustListUI().setVisible(true);
    }//GEN-LAST:event_ListCustActionPerformed

    private void ListItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListItemActionPerformed
        this.setVisible(false);
        new ItemListUI().setVisible(true);

    }//GEN-LAST:event_ListItemActionPerformed

    private void ListOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListOrderActionPerformed
        this.setVisible(false);
        new OrdListUI().setVisible(true);

    }//GEN-LAST:event_ListOrderActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
     
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
   System.exit(0);   
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenuUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ListCust;
    private javax.swing.JMenuItem ListItem;
    private javax.swing.JMenuItem ListOrder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem mnuCustAdd;
    private javax.swing.JMenuItem mnuItemAdd;
    private javax.swing.JMenuItem mnuOrder;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.jpeg")));
    }

}
