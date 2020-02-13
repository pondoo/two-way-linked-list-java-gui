/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twowaylinkedlist;

/**
 *
 * @author pondo
 */
public class main extends javax.swing.JFrame {
    twoWayList list=new twoWayList();
    Long data;
    public main() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        tFdata = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnaddFirst = new javax.swing.JButton();
        btnAddLast = new javax.swing.JButton();
        deleteFirst = new javax.swing.JButton();
        deleteLast = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setText("Sayi");

        btnaddFirst.setText("add first");
        btnaddFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddFirstActionPerformed(evt);
            }
        });

        btnAddLast.setText("add last");
        btnAddLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddLastActionPerformed(evt);
            }
        });

        deleteFirst.setText("delete First");
        deleteFirst.setActionCommand("Delete First");
        deleteFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteFirstActionPerformed(evt);
            }
        });

        deleteLast.setText("delete Last");
        deleteLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteLastActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 137, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tFdata, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnaddFirst)
                        .addGap(18, 18, 18)
                        .addComponent(btnAddLast))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(deleteFirst)
                        .addGap(18, 18, 18)
                        .addComponent(deleteLast)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tFdata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnaddFirst)
                    .addComponent(btnAddLast))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteFirst)
                    .addComponent(deleteLast))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddFirstActionPerformed
        
        String strdata=tFdata.getText();
        data=Long.parseLong(strdata);
        list.addtoFirst(data);
        jTextArea1.setText(list.print());
    }//GEN-LAST:event_btnaddFirstActionPerformed

    private void btnAddLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddLastActionPerformed
        
        String strdata=tFdata.getText();
        data=Long.parseLong(strdata);
        list.addtoLast(data);
        jTextArea1.setText(list.print());
    }//GEN-LAST:event_btnAddLastActionPerformed

    private void deleteFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteFirstActionPerformed
        list.deleteFirstdata();
        jTextArea1.setText(list.print());
    }//GEN-LAST:event_deleteFirstActionPerformed

    private void deleteLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteLastActionPerformed
        
        list.deleteLastData();
        jTextArea1.setText(list.print());
    }//GEN-LAST:event_deleteLastActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        
        
        
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddLast;
    private javax.swing.JButton btnaddFirst;
    private javax.swing.JButton deleteFirst;
    private javax.swing.JButton deleteLast;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField tFdata;
    // End of variables declaration//GEN-END:variables
}
