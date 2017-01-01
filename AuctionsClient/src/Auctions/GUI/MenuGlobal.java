/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Auctions.GUI;

import javax.swing.JOptionPane;

/**
 *
 * @author Samsung
 */
public class MenuGlobal extends javax.swing.JFrame {

    /**
     * Creates new form MenuGlobal
     * @param User
     */
    
    String User;
    
    public MenuGlobal(String User) {
        initComponents();
        this.User = User;
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
        list_auctions_button = new javax.swing.JButton();
        create_bid_button = new javax.swing.JButton();
        logout_button = new javax.swing.JButton();
        about_button = new javax.swing.JButton();
        create_auction_button = new javax.swing.JButton();
        end_auction_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("\t\t\tGESTÃO DE LEILÕES\n#1 - Duplex T3 - ID 1630263491 - 165.000€ \n#2 - Porsche Cayenne - ID 125035269 - 12.000€\n\n(ordem aleatória)");
        jScrollPane1.setViewportView(jTextArea1);

        list_auctions_button.setText("Listagem geral");
        list_auctions_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                list_auctions_buttonActionPerformed(evt);
            }
        });

        create_bid_button.setText("Licitar");
        create_bid_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                create_bid_buttonActionPerformed(evt);
            }
        });

        logout_button.setText("Terminar sessão");
        logout_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_buttonActionPerformed(evt);
            }
        });

        about_button.setText("Sobre...");
        about_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                about_buttonActionPerformed(evt);
            }
        });

        create_auction_button.setText("Criar leilão");
        create_auction_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                create_auction_buttonActionPerformed(evt);
            }
        });

        end_auction_button.setText("Terminar leilão");
        end_auction_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                end_auction_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(list_auctions_button, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(create_bid_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(about_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logout_button, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                    .addComponent(create_auction_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(end_auction_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(list_auctions_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(create_bid_button)
                        .addGap(93, 93, 93)
                        .addComponent(create_auction_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(end_auction_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                        .addComponent(logout_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(about_button))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void list_auctions_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_list_auctions_buttonActionPerformed
        //printa o result AuctionsManager.listAuctions(this.User)
        //para o painel geral
    }//GEN-LAST:event_list_auctions_buttonActionPerformed

    private void about_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_about_buttonActionPerformed
        javax.swing.JOptionPane.showMessageDialog(this, "Plataforma de gestão de leilões realizada no âmbito da UC de Sistemas Distribuídos.\nTrabalho realizado por:\n- André Diogo, A75505\n- António Silva, A73827\n- Gonçalo Pereira, A74413\n\nAno lectivo de 16/17.", "Gestor de Leilões", 1);
    }//GEN-LAST:event_about_buttonActionPerformed

    private void create_bid_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_create_bid_buttonActionPerformed
        String id = javax.swing.JOptionPane.showInputDialog(this, "Qual o ID do leilão?", null);
        String amount = JOptionPane.showInputDialog(this, "Quanto deseja licitar?", null);
        int result = JOptionPane.showConfirmDialog(this, "Deseja confirmar a licitação do artigo " + id + " com o valor de " + amount + "?");
        if(JOptionPane.YES_OPTION == result){
            long auctionid = Long.parseLong(id);
            float auctionamount = Float.parseFloat(amount);
            //printa o result registerBid(auctionid, auctionamount, this.User)
            //para o painel geral
        }
    }//GEN-LAST:event_create_bid_buttonActionPerformed

    private void logout_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_buttonActionPerformed
        new MenuLogin();
        System.exit(0);
        //gotta figure what's wrong with not creating a new MenuLogin()
    }//GEN-LAST:event_logout_buttonActionPerformed

    private void create_auction_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_create_auction_buttonActionPerformed
        String description = javax.swing.JOptionPane.showInputDialog(this, "Qual a descrição do objeto que vai leiloar?", null);
        //printa o result registerAuction(this.User, description)
        //para o painel geral
    }//GEN-LAST:event_create_auction_buttonActionPerformed

    private void end_auction_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_end_auction_buttonActionPerformed
        String auctionid = javax.swing.JOptionPane.showInputDialog(this, "Qual o ID do leilão?", null);
        //printa o result endAuction(User, auctionid)
        //para o painel geral
    }//GEN-LAST:event_end_auction_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(MenuGlobal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuGlobal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuGlobal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuGlobal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuGlobal(null).setVisible(true);
            }
            //gotta verify if this works nicely! the null shouldn't do much
            //should work like: MenuLogin creates a MenuGlobal(User) after
            //the user successfully logs in.
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton about_button;
    private javax.swing.JButton create_auction_button;
    private javax.swing.JButton create_bid_button;
    private javax.swing.JButton end_auction_button;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton list_auctions_button;
    private javax.swing.JButton logout_button;
    // End of variables declaration//GEN-END:variables
}
