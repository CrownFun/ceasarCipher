package main;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

import static main.Logic.checkString;
import static main.Logic.encryptTextUsingExtendSymbols;
import static main.Logic.decryptTextUsingBasicSymbols;
import static main.Logic.encryptTextUsingBasicSymbols;
import static main.Logic.decryptTextUsingExtendSymbols;

public class CaesarCipherGui extends javax.swing.JFrame {

    public CaesarCipherGui() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        DialogHistory = new javax.swing.JDialog();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextAreaOutput = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextAreaInput = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        labelInfo = new javax.swing.JLabel();
        labelAlphabet = new javax.swing.JLabel();
        radioButtonSimpleCode = new javax.swing.JRadioButton();
        radioButtonExtendedCode = new javax.swing.JRadioButton();
        buttonEncryptText = new javax.swing.JToggleButton();
        buttonDecryptText = new javax.swing.JToggleButton();
        buttonClear = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        buttonExit = new javax.swing.JToggleButton();
        buttonAbout = new javax.swing.JButton();

        DialogHistory.getContentPane().setLayout(null);

        jTextArea1.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setForeground(new java.awt.Color(0, 0, 0));
        jTextArea1.setRows(5);
        jTextArea1.setText("yofuofgogggiglgh\nbjjbjklbob;\nbjkbknklbk");
        jScrollPane3.setViewportView(jTextArea1);

        DialogHistory.getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(30, 20, 350, 250);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Szyfr Cezara");
        setMinimumSize(new java.awt.Dimension(900, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(1, 34, 101));
        jPanel2.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel2.setMinimumSize(new java.awt.Dimension(1500, 1500));
        jPanel2.setPreferredSize(new java.awt.Dimension(3000, 3000));
        jPanel2.setLayout(null);

        TextAreaOutput.setColumns(20);
        TextAreaOutput.setLineWrap(true);
        TextAreaOutput.setRows(5);
        jScrollPane2.setViewportView(TextAreaOutput);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(60, 360, 410, 100);

        TextAreaInput.setColumns(20);
        TextAreaInput.setLineWrap(true);
        TextAreaInput.setRows(5);
        jScrollPane1.setViewportView(TextAreaInput);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(60, 200, 410, 110);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TEKST:");
        jLabel1.setToolTipText("");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(250, 170, 50, 15);

        labelInfo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelInfo.setForeground(new java.awt.Color(255, 255, 255));
        labelInfo.setText("Dostępne znaki kodowania:  ");
        jPanel2.add(labelInfo);
        labelInfo.setBounds(40, 20, 161, 22);

        labelAlphabet.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelAlphabet.setForeground(new java.awt.Color(255, 255, 0));
        labelAlphabet.setText("!\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}");
        jPanel2.add(labelAlphabet);
        labelAlphabet.setBounds(40, 50, 604, 24);

        radioButtonSimpleCode.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(radioButtonSimpleCode);
        radioButtonSimpleCode.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        radioButtonSimpleCode.setForeground(new java.awt.Color(255, 255, 255));
        radioButtonSimpleCode.setText("Uproszczony");
        radioButtonSimpleCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonSimpleCodeActionPerformed(evt);
            }
        });
        jPanel2.add(radioButtonSimpleCode);
        radioButtonSimpleCode.setBounds(100, 110, 114, 28);
        radioButtonSimpleCode.setOpaque(false);

        radioButtonExtendedCode.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(radioButtonExtendedCode);
        radioButtonExtendedCode.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        radioButtonExtendedCode.setForeground(new java.awt.Color(255, 255, 255));
        radioButtonExtendedCode.setSelected(true);
        radioButtonExtendedCode.setText("Rozszerzony");
        radioButtonExtendedCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonExtendedCodeActionPerformed(evt);
            }
        });
        jPanel2.add(radioButtonExtendedCode);
        radioButtonExtendedCode.setBounds(270, 110, 114, 28);

        buttonEncryptText.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        buttonEncryptText.setForeground(new java.awt.Color(0, 0, 0));
        buttonEncryptText.setText("Zaszyfruj");
        buttonEncryptText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEncryptTextActionPerformed(evt);
            }
        });
        jPanel2.add(buttonEncryptText);
        buttonEncryptText.setBounds(530, 210, 120, 31);

        buttonDecryptText.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        buttonDecryptText.setForeground(new java.awt.Color(0, 0, 0));
        buttonDecryptText.setText("Odszyfruj");
        buttonDecryptText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDecryptTextActionPerformed(evt);
            }
        });
        jPanel2.add(buttonDecryptText);
        buttonDecryptText.setBounds(530, 270, 120, 31);

        buttonClear.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        buttonClear.setForeground(new java.awt.Color(0, 0, 0));
        buttonClear.setText("Czyść");
        buttonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonClearActionPerformed(evt);
            }
        });
        jPanel2.add(buttonClear);
        buttonClear.setBounds(210, 480, 120, 30);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("WYNIK:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(250, 330, 41, 15);

        buttonExit.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        buttonExit.setForeground(new java.awt.Color(0, 0, 0));
        buttonExit.setText("Wyjście");
        buttonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExitActionPerformed(evt);
            }
        });
        jPanel2.add(buttonExit);
        buttonExit.setBounds(740, 470, 100, 31);

        buttonAbout.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        buttonAbout.setForeground(new java.awt.Color(0, 0, 0));
        buttonAbout.setText("O Programie");
        buttonAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAboutActionPerformed(evt);
            }
        });
        jPanel2.add(buttonAbout);
        buttonAbout.setBounds(610, 470, 110, 31);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 3000, 3000);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private final String BASIC_CIPHER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private final String EXTEND_CIPHER = "!\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}";

    private void decryptText() throws HeadlessException {
        if (!TextAreaOutput.getText().equals("")) {
            alertWrongCipherField();
            TextAreaOutput.setText("");
        } else if (radioButtonExtendedCode.isSelected()) {
            TextAreaOutput.setText(decryptTextUsingExtendSymbols(TextAreaInput.getText()));
        } else if (radioButtonSimpleCode.isSelected()) {
            TextAreaOutput.setText(decryptTextUsingBasicSymbols(TextAreaInput.getText()));
        }
    }

    private void encryptText() throws HeadlessException {
        if (radioButtonSimpleCode.isSelected()) {
            main.Logic.checkString(TextAreaInput.getText());
            if (checkString==true) {
                TextAreaOutput.setText(encryptTextUsingBasicSymbols(TextAreaInput.getText()));
            } else {
                alertIncorrectData();
                clearAll();
            }
        } else if (radioButtonExtendedCode.isSelected()) {
            TextAreaOutput.setText(encryptTextUsingExtendSymbols(TextAreaInput.getText()));
        }
    }

    private void alertIncorrectData() throws HeadlessException {
        JOptionPane.showMessageDialog(null, "Niepoprawne dane wejściowe - Dozwolone tylko wielke litery oraz spacja!", "Błąd", JOptionPane.WARNING_MESSAGE);
    }

    private void exitProgram() {
        this.dispose();
    }

    public void clearAll() {
        TextAreaInput.setText("");
        TextAreaOutput.setText("");
    }

    private void alertWrongCipherField() throws HeadlessException {
        JOptionPane.showMessageDialog(null, "Podaj tekst do odszyfrowania w polu \"Text\"!", "Błąd", JOptionPane.WARNING_MESSAGE);
    }

    private void aboutProgram() throws HeadlessException {
        JOptionPane.showMessageDialog(null, "Program: \"Szyfr Cezara\" służący do szyfrowania oraz odszyfrowywania tekstu. \nLegendarna technika w której każda litera zastępowana jest inną, \noddalną od niej o stałą liczbę pozycji w alfabecie.\nAutor : Grzegorz Filewicz \nLublin 18.12.2017r.");
    }

    private void buttonEncryptTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEncryptTextActionPerformed
        encryptText();
    }//GEN-LAST:event_buttonEncryptTextActionPerformed


    private void buttonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonClearActionPerformed
        clearAll();
    }//GEN-LAST:event_buttonClearActionPerformed

    private void buttonDecryptTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDecryptTextActionPerformed
        decryptText();
    }//GEN-LAST:event_buttonDecryptTextActionPerformed


    private void radioButtonExtendedCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonExtendedCodeActionPerformed
        clearAll();
        labelAlphabet.setText(EXTEND_CIPHER);
    }//GEN-LAST:event_radioButtonExtendedCodeActionPerformed

    private void radioButtonSimpleCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonSimpleCodeActionPerformed
        clearAll();
        labelAlphabet.setText(BASIC_CIPHER);
    }//GEN-LAST:event_radioButtonSimpleCodeActionPerformed

    private void buttonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExitActionPerformed
        exitProgram();
    }//GEN-LAST:event_buttonExitActionPerformed

    private void buttonAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAboutActionPerformed
        aboutProgram();
    }//GEN-LAST:event_buttonAboutActionPerformed

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
            java.util.logging.Logger.getLogger(CaesarCipherGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CaesarCipherGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CaesarCipherGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CaesarCipherGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new CaesarCipherGui().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog DialogHistory;
    private javax.swing.JTextArea TextAreaInput;
    private javax.swing.JTextArea TextAreaOutput;
    private javax.swing.JButton buttonAbout;
    private javax.swing.JToggleButton buttonClear;
    private javax.swing.JToggleButton buttonDecryptText;
    private javax.swing.JToggleButton buttonEncryptText;
    private javax.swing.JToggleButton buttonExit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel labelAlphabet;
    private javax.swing.JLabel labelInfo;
    private javax.swing.JRadioButton radioButtonExtendedCode;
    private javax.swing.JRadioButton radioButtonSimpleCode;
    // End of variables declaration//GEN-END:variables
}
