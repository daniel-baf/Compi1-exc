/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontend.GUI;

import Backend.Utilities.NumberToken;
import Backend.VowelAnalyzer;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jefemayoneso
 */
public class MainView extends javax.swing.JFrame {

    /**
     * Creates new form MainView
     */
    public MainView() {
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

        ContainerPanel = new javax.swing.JPanel();
        ResultsPanel = new javax.swing.JPanel();
        resultsJLabel = new javax.swing.JLabel();
        wordsWithLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        vowelWordResultJList = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        numbersInfoTable = new javax.swing.JTable();
        EntryPanel = new javax.swing.JPanel();
        entryTextScroll = new javax.swing.JScrollPane();
        entryTextJTextArea = new javax.swing.JTextArea();
        ActionsPanel = new javax.swing.JPanel();
        getResulsJButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ContainerPanel.setBackground(new java.awt.Color(255, 102, 102));

        ResultsPanel.setBackground(new java.awt.Color(255, 102, 102));

        resultsJLabel.setText("Resultados:");

        wordsWithLabel.setText("Palabras con vocales");

        jScrollPane1.setViewportView(vowelWordResultJList);

        jLabel1.setText("Info. numeros");

        numbersInfoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero", "Fila", "Columna"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(numbersInfoTable);

        javax.swing.GroupLayout ResultsPanelLayout = new javax.swing.GroupLayout(ResultsPanel);
        ResultsPanel.setLayout(ResultsPanelLayout);
        ResultsPanelLayout.setHorizontalGroup(
            ResultsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ResultsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ResultsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(ResultsPanelLayout.createSequentialGroup()
                        .addGroup(ResultsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(resultsJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(ResultsPanelLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(wordsWithLabel)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(ResultsPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );
        ResultsPanelLayout.setVerticalGroup(
            ResultsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ResultsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(resultsJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(wordsWithLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        entryTextJTextArea.setColumns(20);
        entryTextJTextArea.setRows(5);
        entryTextScroll.setViewportView(entryTextJTextArea);

        javax.swing.GroupLayout EntryPanelLayout = new javax.swing.GroupLayout(EntryPanel);
        EntryPanel.setLayout(EntryPanelLayout);
        EntryPanelLayout.setHorizontalGroup(
            EntryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EntryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(entryTextScroll)
                .addContainerGap())
        );
        EntryPanelLayout.setVerticalGroup(
            EntryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EntryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(entryTextScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getResulsJButton.setText("Analizar");
        getResulsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getResulsJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ActionsPanelLayout = new javax.swing.GroupLayout(ActionsPanel);
        ActionsPanel.setLayout(ActionsPanelLayout);
        ActionsPanelLayout.setHorizontalGroup(
            ActionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ActionsPanelLayout.createSequentialGroup()
                .addGap(265, 265, 265)
                .addComponent(getResulsJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(230, Short.MAX_VALUE))
        );
        ActionsPanelLayout.setVerticalGroup(
            ActionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ActionsPanelLayout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addComponent(getResulsJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout ContainerPanelLayout = new javax.swing.GroupLayout(ContainerPanel);
        ContainerPanel.setLayout(ContainerPanelLayout);
        ContainerPanelLayout.setHorizontalGroup(
            ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ResultsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EntryPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ActionsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        ContainerPanelLayout.setVerticalGroup(
            ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ResultsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(ContainerPanelLayout.createSequentialGroup()
                        .addComponent(EntryPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ActionsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ContainerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ContainerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void getResulsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getResulsJButtonActionPerformed
        // get the text and send
        Reader reader = new StringReader(this.entryTextJTextArea.getText());
        VowelAnalyzer analyzer = new VowelAnalyzer();
        if (analyzer.getWords(reader)) {
            // receive data
            int[] valuesVocal = analyzer.getWordsCounterWithVowels();
            ArrayList<NumberToken> numbersInfo = analyzer.getNumberInfo();
            // show info on GUI
            addVowelInfo(valuesVocal);
            addNumbersInfo(numbersInfo);
        }

    }//GEN-LAST:event_getResulsJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ActionsPanel;
    private javax.swing.JPanel ContainerPanel;
    private javax.swing.JPanel EntryPanel;
    private javax.swing.JPanel ResultsPanel;
    private javax.swing.JTextArea entryTextJTextArea;
    private javax.swing.JScrollPane entryTextScroll;
    private javax.swing.JButton getResulsJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable numbersInfoTable;
    private javax.swing.JLabel resultsJLabel;
    private javax.swing.JList<String> vowelWordResultJList;
    private javax.swing.JLabel wordsWithLabel;
    // End of variables declaration//GEN-END:variables

    private void addVowelInfo(int[] valuesVocal) {
        DefaultListModel listModel = new DefaultListModel();
        for (int i = 0; i < valuesVocal.length - 1; i++) {
            listModel.addElement((i + 1) + " vocal(es): " + valuesVocal[i]); // add items
        }
        // add the 0 vowels
        listModel.addElement("0 o 6+ vocales: " + valuesVocal[5]);
        // set new model
        this.vowelWordResultJList.setModel(listModel);
    }

    private void addNumbersInfo(ArrayList<NumberToken> numbersInfo) {
        // clear table
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("Numero");
        tableModel.addColumn("Fila");
        tableModel.addColumn("Columna");
        for (NumberToken numberToken : numbersInfo) {
            tableModel.insertRow(0, new Object[]{numberToken.getValue(), numberToken.getLine(), numberToken.getColumn()});
        }
        // set new model
        this.numbersInfoTable.setModel(tableModel);
    }

}
