import javax.swing.*;
import java.awt.event.ActionEvent;

public class GUI extends javax.swing.JFrame {

    private Controller controller;

    public GUI() {
        initController();
        initComponents();
    }
    private void initController(){
        controller = new Controller();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCanteenSettingsFrame = new javax.swing.JFrame();
        jCanteenSettingsPanel = new javax.swing.JPanel();
        jCanteenBudgetPanel = new javax.swing.JPanel();
        jTotalBudgetLabel = new javax.swing.JLabel();
        jTotalBudgetPriceField = new javax.swing.JTextField();
        jTotalBudgetDollarLabel = new javax.swing.JLabel();
        jTotalBudgetPriceLabel = new javax.swing.JLabel();
        jDoorWindowPanel = new javax.swing.JPanel();
        jSingleWindowLabel = new javax.swing.JLabel();
        jDoubleWindowLabel = new javax.swing.JLabel();
        jDoorsLabel = new javax.swing.JLabel();
        jDoorsTextPriceField = new javax.swing.JTextField();
        jDoorDollarLabel = new javax.swing.JLabel();
        jSingleWindowPriceField = new javax.swing.JTextField();
        jSingleWindowDollarLabel = new javax.swing.JLabel();
        jDoubleWindowPriceField = new javax.swing.JTextField();
        jDoubleWindowDollarLabel = new javax.swing.JLabel();
        jDoorsPriceLabel = new javax.swing.JLabel();
        jSingleWindowPriceLabel = new javax.swing.JLabel();
        jDoubleWindowPriceLabel = new javax.swing.JLabel();
        jTablePanel = new javax.swing.JPanel();
        jEightPersonTableLabel = new javax.swing.JLabel();
        /*jTwoPersonTableLabel = new javax.swing.JLabel();*/
        jFourPersonTableLabel = new javax.swing.JLabel();
        jSixPersonTableLabel = new javax.swing.JLabel();
        jEightPersonTablePriceField = new javax.swing.JTextField();
        jEightPersonTableDollarLabel = new javax.swing.JLabel();
/*        jTwoPersonTablePriceField = new javax.swing.JTextField();
        jTwoPersonTableDollarLabel = new javax.swing.JLabel();*/
        jFourPersonTablePriceField = new javax.swing.JTextField();
        jFourPersonTableDollarLabel = new javax.swing.JLabel();
        jSixPersonTablePriceField = new javax.swing.JTextField();
        jSixPersonTableDollarLabel = new javax.swing.JLabel();
        jEightPersonTablePriceLabel = new javax.swing.JLabel();
/*        jTwoPersonPriceLabel = new javax.swing.JLabel();*/
        jFourPersonPriceLabel = new javax.swing.JLabel();
        jSixPersonPriceLabel = new javax.swing.JLabel();
        jChairPanel = new javax.swing.JPanel();
        jchairLabel = new javax.swing.JLabel();
        jBigChairLabel = new javax.swing.JLabel();
        jchairPriceField = new javax.swing.JTextField();
        jchairDollarLabel = new javax.swing.JLabel();
        jBigChairPriceField = new javax.swing.JTextField();
        jBigChairDollarLabel = new javax.swing.JLabel();
        jchairPriceLabel = new javax.swing.JLabel();
        jBigCairPriceLabel = new javax.swing.JLabel();
        jIluminationPanel = new javax.swing.JPanel();
        jLowIlluminationLabel = new javax.swing.JLabel();
        jMediumIlluminationLabel = new javax.swing.JLabel();
        jLowIlluminationPriceLabel = new javax.swing.JLabel();
        jLowIllumiantionPriceField = new javax.swing.JTextField();
        jLowIllumiantionDollarLabel = new javax.swing.JLabel();
        jMediumIlluminationPriceLabel = new javax.swing.JLabel();
        jMediumIllumiantionPriceField = new javax.swing.JTextField();
        jMediumIllumiantionDollarLabel = new javax.swing.JLabel();
        jStrongIlluminationLabel = new javax.swing.JLabel();
        jStrongIlluminationPriceLabel = new javax.swing.JLabel();
        jStrongIllumiantionPriceField = new javax.swing.JTextField();
        jStrongIllumiantionDollarLabel = new javax.swing.JLabel();
        jCanteenSizePanel = new javax.swing.JPanel();
        jLeftWallLabel = new javax.swing.JLabel();
        jBottomWallLabel = new javax.swing.JLabel();
        jRightWallLabel = new javax.swing.JLabel();
        jTopWallLabel = new javax.swing.JLabel();
        jLeftWallField = new javax.swing.JTextField();
        jLeftWallMeterLabel = new javax.swing.JLabel();
        jBottomWallField = new javax.swing.JTextField();
        jBottomWallMeterLabel = new javax.swing.JLabel();
        jRightWallField = new javax.swing.JTextField();
        jRightWallMeterLabel = new javax.swing.JLabel();
        jTopWallField = new javax.swing.JTextField();
        jTopWallMeterLabel = new javax.swing.JLabel();
        jBottomWallSizeLabel = new javax.swing.JLabel();
        jLeftWallSizeLabel = new javax.swing.JLabel();
        jRightWallSizeLabel = new javax.swing.JLabel();
        jTopWallSizeLabel = new javax.swing.JLabel();
        jCanteenSettingsLabel = new javax.swing.JLabel();
        jCanteenSettingsSaveButton = new javax.swing.JButton();
        jBenchPanel = new javax.swing.JPanel();
        jSmallBenchLabel = new javax.swing.JLabel();
        jBigBenchLabel = new javax.swing.JLabel();
        jSmallBenchPriceLabel = new javax.swing.JLabel();
        jSmallBenchPriceField = new javax.swing.JTextField();
        jSmallBenchDollarLabel = new javax.swing.JLabel();
        jBigBenchPriceLabel = new javax.swing.JLabel();
        jBigBenchPriceField = new javax.swing.JTextField();
        jBigBenchDollarLabel = new javax.swing.JLabel();
        //jDisplayPanel = new javax.swing.JPanel();
        jDisplayPanel = new Graphics2D();
        jStopButton = new javax.swing.JButton();
        jStartButton = new javax.swing.JButton();
        jAlgorithmSettingsLabel = new javax.swing.JLabel();
        jAlgorithmSettingsPanel = new javax.swing.JPanel();
        jGenerationQuantityLabel = new javax.swing.JLabel();
        jSizeOfOneGenerationLabel = new javax.swing.JLabel();
        jMutationRatioPanel = new javax.swing.JLabel();
        jCrossbreadRatioLabel = new javax.swing.JLabel();
        jGenerationQuantityField = new javax.swing.JTextField();
        jSizeOfOneGenerationField = new javax.swing.JTextField();
        jMutationRatioField = new javax.swing.JTextField();
        jCrossbreadRatioField = new javax.swing.JTextField();
        jCrossbreadRatioSlider = new javax.swing.JSlider();
        jIterationSpeedLabel = new javax.swing.JLabel();
        jIterationSpeedField = new javax.swing.JTextField();
        jIterationSpeedSlider = new javax.swing.JSlider();
        jMutationRatioSlider = new javax.swing.JSlider();
        jMenuBar = new javax.swing.JMenuBar();
        jBarFile = new javax.swing.JMenu();
        jItemSavePNG = new javax.swing.JMenuItem();
        jItemExit = new javax.swing.JMenuItem();
        jBarSettings = new javax.swing.JMenu();
        jItemAlgorithmSettings = new javax.swing.JMenuItem();
        jItemCanteenSettings = new javax.swing.JMenuItem();
        jBarHelp = new javax.swing.JMenu();
        jItemHelp = new javax.swing.JMenuItem();

        jCanteenSettingsFrame.setTitle("Canteen settings");

        jCanteenSettingsPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jCanteenBudgetPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTotalBudgetLabel.setText("Total budget:");

        jTotalBudgetPriceField.setText("100");
        jTotalBudgetPriceField.setToolTipText("");
        jTotalBudgetPriceField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTotalBudgetPriceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTotalBudgetPriceFieldActionPerformed(evt);
            }
        });

        jTotalBudgetDollarLabel.setText("$");

        jTotalBudgetPriceLabel.setText("Price:");

        javax.swing.GroupLayout jCanteenBudgetPanelLayout = new javax.swing.GroupLayout(jCanteenBudgetPanel);
        jCanteenBudgetPanel.setLayout(jCanteenBudgetPanelLayout);
        jCanteenBudgetPanelLayout.setHorizontalGroup(
                jCanteenBudgetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jCanteenBudgetPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jTotalBudgetLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTotalBudgetPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTotalBudgetPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTotalBudgetDollarLabel)
                                .addContainerGap())
        );
        jCanteenBudgetPanelLayout.setVerticalGroup(
                jCanteenBudgetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jCanteenBudgetPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jCanteenBudgetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTotalBudgetLabel)
                                        .addComponent(jTotalBudgetPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTotalBudgetDollarLabel)
                                        .addComponent(jTotalBudgetPriceLabel))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jDoorWindowPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jSingleWindowLabel.setText("Single Window:");

        jDoubleWindowLabel.setText("Double window:");

        jDoorsLabel.setText("Doors:");

        jDoorsTextPriceField.setText("100");
        jDoorsTextPriceField.setToolTipText("");
        jDoorsTextPriceField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jDoorsTextPriceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDoorsTextPriceFieldActionPerformed(evt);
            }
        });

        jDoorDollarLabel.setText("$");

        jSingleWindowPriceField.setText("100");
        jSingleWindowPriceField.setToolTipText("");
        jSingleWindowPriceField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jSingleWindowPriceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSingleWindowPriceFieldActionPerformed(evt);
            }
        });

        jSingleWindowDollarLabel.setText("$");

        jDoubleWindowPriceField.setText("100");
        jDoubleWindowPriceField.setToolTipText("");
        jDoubleWindowPriceField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jDoubleWindowPriceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDoubleWindowPriceFieldActionPerformed(evt);
            }
        });

        jDoubleWindowDollarLabel.setText("$");

        jDoorsPriceLabel.setText("Price:");

        jSingleWindowPriceLabel.setText("Price:");

        jDoubleWindowPriceLabel.setText("Price:");

        javax.swing.GroupLayout jDoorWindowPanelLayout = new javax.swing.GroupLayout(jDoorWindowPanel);
        jDoorWindowPanel.setLayout(jDoorWindowPanelLayout);
        jDoorWindowPanelLayout.setHorizontalGroup(
                jDoorWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jDoorWindowPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jDoorWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jDoorWindowPanelLayout.createSequentialGroup()
                                                .addComponent(jDoorsLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jDoorsPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jDoorsTextPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jDoorDollarLabel))
                                        .addGroup(jDoorWindowPanelLayout.createSequentialGroup()
                                                .addGroup(jDoorWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jDoorWindowPanelLayout.createSequentialGroup()
                                                                .addComponent(jSingleWindowLabel)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jSingleWindowPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jSingleWindowPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jDoorWindowPanelLayout.createSequentialGroup()
                                                                .addComponent(jDoubleWindowLabel)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jDoubleWindowPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jDoubleWindowPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jDoorWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jSingleWindowDollarLabel)
                                                        .addComponent(jDoubleWindowDollarLabel))))
                                .addContainerGap())
        );
        jDoorWindowPanelLayout.setVerticalGroup(
                jDoorWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jDoorWindowPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jDoorWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jDoorsLabel)
                                        .addComponent(jDoorsTextPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jDoorDollarLabel)
                                        .addComponent(jDoorsPriceLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jDoorWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jSingleWindowLabel)
                                        .addComponent(jSingleWindowPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jSingleWindowDollarLabel)
                                        .addComponent(jSingleWindowPriceLabel))
                                .addGap(7, 7, 7)
                                .addGroup(jDoorWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jDoubleWindowLabel)
                                        .addComponent(jDoubleWindowPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jDoubleWindowDollarLabel)
                                        .addComponent(jDoubleWindowPriceLabel))
                                .addContainerGap(16, Short.MAX_VALUE))
        );

        jTablePanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jEightPersonTableLabel.setText("Eight-Person table:");

        /*jTwoPersonTableLabel.setText("Two-person table:");*/

        jFourPersonTableLabel.setText("Four-person table:");

        jSixPersonTableLabel.setText("Six-person table:");

        jEightPersonTablePriceField.setText("100");
        jEightPersonTablePriceField.setToolTipText("");
        jEightPersonTablePriceField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jEightPersonTablePriceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEightPersonTablePriceFieldActionPerformed(evt);
            }
        });

        jEightPersonTableDollarLabel.setText("$");

        /*jTwoPersonTablePriceField.setText("100");
        jTwoPersonTablePriceField.setToolTipText("");
        jTwoPersonTablePriceField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTwoPersonTablePriceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTwoPersonTablePriceFieldActionPerformed(evt);
            }
        });

        jTwoPersonTableDollarLabel.setText("$");*/

        jFourPersonTablePriceField.setText("100");
        jFourPersonTablePriceField.setToolTipText("");
        jFourPersonTablePriceField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jFourPersonTablePriceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFourPersonTablePriceFieldActionPerformed(evt);
            }
        });

        jFourPersonTableDollarLabel.setText("$");

        jSixPersonTablePriceField.setText("100");
        jSixPersonTablePriceField.setToolTipText("");
        jSixPersonTablePriceField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jSixPersonTablePriceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSixPersonTablePriceFieldActionPerformed(evt);
            }
        });

        jSixPersonTableDollarLabel.setText("$");

        jEightPersonTablePriceLabel.setText("Price:");

       /* jTwoPersonPriceLabel.setText("Price:");*/

        jFourPersonPriceLabel.setText("Price:");

        jSixPersonPriceLabel.setText("Price:");

        javax.swing.GroupLayout jTablePanelLayout = new javax.swing.GroupLayout(jTablePanel);
        jTablePanel.setLayout(jTablePanelLayout);
        jTablePanelLayout.setHorizontalGroup(
                jTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jTablePanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jTablePanelLayout.createSequentialGroup()
                                                .addComponent(jEightPersonTableLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jEightPersonTablePriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jEightPersonTablePriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jEightPersonTableDollarLabel))
                                        .addGroup(jTablePanelLayout.createSequentialGroup()
                                                .addComponent(jSixPersonTableLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jSixPersonPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jSixPersonTablePriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jSixPersonTableDollarLabel))
                                        /*.addGroup(jTablePanelLayout.createSequentialGroup()
                                                .addComponent(jTwoPersonTableLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jTwoPersonPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTwoPersonTablePriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTwoPersonTableDollarLabel))*/
                                        .addGroup(jTablePanelLayout.createSequentialGroup()
                                                .addComponent(jFourPersonTableLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                                                .addComponent(jFourPersonPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jFourPersonTablePriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jFourPersonTableDollarLabel)))
                                .addContainerGap())
        );
        jTablePanelLayout.setVerticalGroup(
                jTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jTablePanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jTablePanelLayout.createSequentialGroup()
                                                .addGroup(jTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(jTablePanelLayout.createSequentialGroup()
                                                                        .addGroup(jTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jEightPersonTableLabel)
                                                                                .addComponent(jEightPersonTablePriceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jEightPersonTableDollarLabel)
                                                                                .addComponent(jEightPersonTablePriceLabel))
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                /*.addComponent(jTwoPersonTableLabel))
                                                        .addGroup(jTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jTwoPersonTablePriceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jTwoPersonTableDollarLabel)
                                                                .addComponent(jTwoPersonPriceLabel)))*/))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jFourPersonTableLabel))
                                        .addGroup(jTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jFourPersonTablePriceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jFourPersonTableDollarLabel)
                                                .addComponent(jFourPersonPriceLabel)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                                .addGroup(jTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jSixPersonTablePriceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jSixPersonTableDollarLabel)
                                                .addComponent(jSixPersonPriceLabel))
                                        .addComponent(jSixPersonTableLabel))
                                .addContainerGap())
        );

        jChairPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jchairLabel.setText("Small chair:");

        jBigChairLabel.setText("Big chair:");

        jchairPriceField.setText("100");
        jchairPriceField.setToolTipText("");
        jchairPriceField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jchairPriceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jchairPriceFieldActionPerformed(evt);
            }
        });

        jchairDollarLabel.setText("$");

        jBigChairPriceField.setText("100");
        jBigChairPriceField.setToolTipText("");
        jBigChairPriceField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jBigChairPriceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBigChairPriceFieldActionPerformed(evt);
            }
        });

        jBigChairDollarLabel.setText("$");

        jchairPriceLabel.setText("Price:");

        jBigCairPriceLabel.setText("Price:");

        javax.swing.GroupLayout jChairPanelLayout = new javax.swing.GroupLayout(jChairPanel);
        jChairPanel.setLayout(jChairPanelLayout);
        jChairPanelLayout.setHorizontalGroup(
                jChairPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jChairPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jChairPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jChairPanelLayout.createSequentialGroup()
                                                .addComponent(jBigChairLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jBigCairPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jBigChairPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jBigChairDollarLabel))
                                        .addGroup(jChairPanelLayout.createSequentialGroup()
                                                .addComponent(jchairLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jchairPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jchairPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jchairDollarLabel)))
                                .addContainerGap())
        );
        jChairPanelLayout.setVerticalGroup(
                jChairPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jChairPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jChairPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jchairLabel)
                                        .addComponent(jchairPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jchairDollarLabel)
                                        .addComponent(jchairPriceLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jChairPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jChairPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jBigChairPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jBigChairDollarLabel)
                                                .addComponent(jBigCairPriceLabel))
                                        .addComponent(jBigChairLabel))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jIluminationPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLowIlluminationLabel.setText("Low illumination (20W):");

        jMediumIlluminationLabel.setText("Medium illumination (50W):");

        jLowIlluminationPriceLabel.setText("Price:");

        jLowIllumiantionPriceField.setText("100");
        jLowIllumiantionPriceField.setToolTipText("");
        jLowIllumiantionPriceField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jLowIllumiantionPriceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLowIllumiantionPriceFieldActionPerformed(evt);
            }
        });

        jLowIllumiantionDollarLabel.setText("$");

        jMediumIlluminationPriceLabel.setText("Price:");

        jMediumIllumiantionPriceField.setText("100");
        jMediumIllumiantionPriceField.setToolTipText("");
        jMediumIllumiantionPriceField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jMediumIllumiantionPriceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMediumIllumiantionPriceFieldActionPerformed(evt);
            }
        });

        jMediumIllumiantionDollarLabel.setText("$");

        jStrongIlluminationLabel.setText("Strong  illumination (80W):");

        jStrongIlluminationPriceLabel.setText("Price:");

        jStrongIllumiantionPriceField.setText("100");
        jStrongIllumiantionPriceField.setToolTipText("");
        jStrongIllumiantionPriceField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jStrongIllumiantionPriceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jStrongIllumiantionPriceFieldActionPerformed(evt);
            }
        });

        jStrongIllumiantionDollarLabel.setText("$");

        javax.swing.GroupLayout jIluminationPanelLayout = new javax.swing.GroupLayout(jIluminationPanel);
        jIluminationPanel.setLayout(jIluminationPanelLayout);
        jIluminationPanelLayout.setHorizontalGroup(
                jIluminationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jIluminationPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jIluminationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jIluminationPanelLayout.createSequentialGroup()
                                                .addComponent(jLowIlluminationLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLowIlluminationPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLowIllumiantionPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLowIllumiantionDollarLabel))
                                        .addGroup(jIluminationPanelLayout.createSequentialGroup()
                                                .addComponent(jMediumIlluminationLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                                                .addComponent(jMediumIlluminationPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jMediumIllumiantionPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jMediumIllumiantionDollarLabel))
                                        .addGroup(jIluminationPanelLayout.createSequentialGroup()
                                                .addComponent(jStrongIlluminationLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                                                .addComponent(jStrongIlluminationPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jStrongIllumiantionPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jStrongIllumiantionDollarLabel)))
                                .addContainerGap())
        );
        jIluminationPanelLayout.setVerticalGroup(
                jIluminationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jIluminationPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jIluminationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLowIlluminationLabel)
                                        .addComponent(jLowIllumiantionPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLowIllumiantionDollarLabel)
                                        .addComponent(jLowIlluminationPriceLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jIluminationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jMediumIlluminationLabel)
                                        .addGroup(jIluminationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jMediumIllumiantionPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jMediumIllumiantionDollarLabel)
                                                .addComponent(jMediumIlluminationPriceLabel)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jIluminationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jStrongIlluminationLabel)
                                        .addGroup(jIluminationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jStrongIllumiantionPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jStrongIllumiantionDollarLabel)
                                                .addComponent(jStrongIlluminationPriceLabel)))
                                .addContainerGap())
        );

        jCanteenSizePanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLeftWallLabel.setText("Left wall:");

        jBottomWallLabel.setText("Bottom wall:");

        jRightWallLabel.setText("Right wall:");

        jTopWallLabel.setText("Top wall:");

        jLeftWallField.setText("6");
        jLeftWallField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLeftWallFieldActionPerformed(evt);
            }
        });

        jLeftWallMeterLabel.setText("m");

        jBottomWallField.setText("6");
        jBottomWallField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBottomWallFieldActionPerformed(evt);
            }
        });

        jBottomWallMeterLabel.setText("m");

        jRightWallField.setText("6");
        jRightWallField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRightWallFieldActionPerformed(evt);
            }
        });

        jRightWallMeterLabel.setText("m");

        jTopWallField.setText("6");
        jTopWallField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTopWallFieldActionPerformed(evt);
            }
        });

        jTopWallMeterLabel.setText("m");

        jBottomWallSizeLabel.setText("Size:");

        jLeftWallSizeLabel.setText("Size:");

        jRightWallSizeLabel.setText("Size:");

        jTopWallSizeLabel.setText("Size:");

        javax.swing.GroupLayout jCanteenSizePanelLayout = new javax.swing.GroupLayout(jCanteenSizePanel);
        jCanteenSizePanel.setLayout(jCanteenSizePanelLayout);
        jCanteenSizePanelLayout.setHorizontalGroup(
                jCanteenSizePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jCanteenSizePanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jCanteenSizePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jCanteenSizePanelLayout.createSequentialGroup()
                                                .addComponent(jBottomWallLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jCanteenSizePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLeftWallSizeLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jBottomWallSizeLabel, javax.swing.GroupLayout.Alignment.TRAILING)))
                                        .addGroup(jCanteenSizePanelLayout.createSequentialGroup()
                                                .addComponent(jLeftWallLabel)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(jCanteenSizePanelLayout.createSequentialGroup()
                                                .addComponent(jRightWallLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jRightWallSizeLabel))
                                        .addGroup(jCanteenSizePanelLayout.createSequentialGroup()
                                                .addComponent(jTopWallLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jTopWallSizeLabel)))
                                .addGap(18, 18, 18)
                                .addGroup(jCanteenSizePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jCanteenSizePanelLayout.createSequentialGroup()
                                                .addComponent(jTopWallField)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTopWallMeterLabel))
                                        .addGroup(jCanteenSizePanelLayout.createSequentialGroup()
                                                .addComponent(jRightWallField)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jRightWallMeterLabel))
                                        .addGroup(jCanteenSizePanelLayout.createSequentialGroup()
                                                .addComponent(jBottomWallField)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jBottomWallMeterLabel))
                                        .addGroup(jCanteenSizePanelLayout.createSequentialGroup()
                                                .addComponent(jLeftWallField, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLeftWallMeterLabel)))
                                .addContainerGap())
        );
        jCanteenSizePanelLayout.setVerticalGroup(
                jCanteenSizePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jCanteenSizePanelLayout.createSequentialGroup()
                                .addGroup(jCanteenSizePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jCanteenSizePanelLayout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addGroup(jCanteenSizePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLeftWallLabel)
                                                        .addComponent(jLeftWallField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLeftWallMeterLabel))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jCanteenSizePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jBottomWallLabel)
                                                        .addComponent(jBottomWallField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jBottomWallMeterLabel)
                                                        .addComponent(jBottomWallSizeLabel)))
                                        .addGroup(jCanteenSizePanelLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLeftWallSizeLabel)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jCanteenSizePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jRightWallLabel)
                                        .addComponent(jRightWallField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jRightWallMeterLabel)
                                        .addComponent(jRightWallSizeLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jCanteenSizePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jCanteenSizePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jTopWallLabel)
                                                .addComponent(jTopWallField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTopWallMeterLabel))
                                        .addComponent(jTopWallSizeLabel))
                                .addContainerGap(12, Short.MAX_VALUE))
        );

        jCanteenSettingsLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jCanteenSettingsLabel.setText("Canteen settings");

        jCanteenSettingsSaveButton.setText("Save settings");
        jCanteenSettingsSaveButton.setToolTipText("");
        jCanteenSettingsSaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCanteenSettingsSaveButtonActionPerformed(evt);
            }
        });

        jBenchPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jSmallBenchLabel.setText("Small bench:");

        jBigBenchLabel.setText("Big bench:");

        jSmallBenchPriceLabel.setText("Price:");

        jSmallBenchPriceField.setText("100");
        jSmallBenchPriceField.setToolTipText("");
        jSmallBenchPriceField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jSmallBenchPriceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSmallBenchPriceFieldActionPerformed(evt);
            }
        });

        jSmallBenchDollarLabel.setText("$");

        jBigBenchPriceLabel.setText("Price:");

        jBigBenchPriceField.setText("100");
        jBigBenchPriceField.setToolTipText("");
        jBigBenchPriceField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jBigBenchPriceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBigBenchPriceFieldActionPerformed(evt);
            }
        });

        jBigBenchDollarLabel.setText("$");

        javax.swing.GroupLayout jBenchPanelLayout = new javax.swing.GroupLayout(jBenchPanel);
        jBenchPanel.setLayout(jBenchPanelLayout);
        jBenchPanelLayout.setHorizontalGroup(
                jBenchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jBenchPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jBenchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jBenchPanelLayout.createSequentialGroup()
                                                .addComponent(jSmallBenchLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jSmallBenchPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jSmallBenchPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jSmallBenchDollarLabel))
                                        .addGroup(jBenchPanelLayout.createSequentialGroup()
                                                .addComponent(jBigBenchLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 201, Short.MAX_VALUE)
                                                .addComponent(jBigBenchPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jBigBenchPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jBigBenchDollarLabel)))
                                .addContainerGap())
        );
        jBenchPanelLayout.setVerticalGroup(
                jBenchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jBenchPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jBenchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jSmallBenchLabel)
                                        .addComponent(jSmallBenchPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jSmallBenchDollarLabel)
                                        .addComponent(jSmallBenchPriceLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jBenchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jBigBenchLabel)
                                        .addGroup(jBenchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jBigBenchPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jBigBenchDollarLabel)
                                                .addComponent(jBigBenchPriceLabel)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jCanteenSettingsPanelLayout = new javax.swing.GroupLayout(jCanteenSettingsPanel);
        jCanteenSettingsPanel.setLayout(jCanteenSettingsPanelLayout);
        jCanteenSettingsPanelLayout.setHorizontalGroup(
                jCanteenSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jCanteenSettingsPanelLayout.createSequentialGroup()
                                .addGroup(jCanteenSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jCanteenSettingsPanelLayout.createSequentialGroup()
                                                .addGap(127, 127, 127)
                                                .addComponent(jCanteenSettingsLabel)
                                                .addGap(0, 116, Short.MAX_VALUE))
                                        .addComponent(jDoorWindowPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTablePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jCanteenSizePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jCanteenBudgetPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jChairPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jIluminationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jBenchPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
                        .addGroup(jCanteenSettingsPanelLayout.createSequentialGroup()
                                .addGap(153, 153, 153)
                                .addComponent(jCanteenSettingsSaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jCanteenSettingsPanelLayout.setVerticalGroup(
                jCanteenSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jCanteenSettingsPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jCanteenSettingsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCanteenBudgetPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCanteenSizePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDoorWindowPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jChairPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBenchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jIluminationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCanteenSettingsSaveButton)
                                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout jCanteenSettingsFrameLayout = new javax.swing.GroupLayout(jCanteenSettingsFrame.getContentPane());
        jCanteenSettingsFrame.getContentPane().setLayout(jCanteenSettingsFrameLayout);
        jCanteenSettingsFrameLayout.setHorizontalGroup(
                jCanteenSettingsFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jCanteenSettingsFrameLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jCanteenSettingsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        jCanteenSettingsFrameLayout.setVerticalGroup(
                jCanteenSettingsFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jCanteenSettingsFrameLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jCanteenSettingsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Time2Dine");

        jStopButton.setText("Stop");
        jStopButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jStopButtonActionPerformed(evt);
            }
        });

        jStartButton.setText("Start");
        jStartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jStartButtonActionPerformed(evt);
            }
        });

        jAlgorithmSettingsLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jAlgorithmSettingsLabel.setText("Algorithm settings");

        jAlgorithmSettingsPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jGenerationQuantityLabel.setText("Generation quantity:");

        jSizeOfOneGenerationLabel.setText("Size of one generation:");

        jMutationRatioPanel.setText("Mutation ratio:");

        jCrossbreadRatioLabel.setText("Crossbread ratio:");

        jGenerationQuantityField.setText("1000");
        jGenerationQuantityField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGenerationQuantityFieldActionPerformed(evt);
            }
        });

        jSizeOfOneGenerationField.setText("100");
        jSizeOfOneGenerationField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSizeOfOneGenerationFieldActionPerformed(evt);
            }
        });

        jMutationRatioField.setText("0.1");
        jMutationRatioField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMutationRatioFieldActionPerformed(evt);
            }
        });

        jCrossbreadRatioField.setText("0.3");
        jCrossbreadRatioField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCrossbreadRatioFieldActionPerformed(evt);
            }
        });

        jIterationSpeedLabel.setText("Iteration speed:");

        jIterationSpeedField.setText("1");

        javax.swing.GroupLayout jAlgorithmSettingsPanelLayout = new javax.swing.GroupLayout(jAlgorithmSettingsPanel);
        jAlgorithmSettingsPanel.setLayout(jAlgorithmSettingsPanelLayout);
        jAlgorithmSettingsPanelLayout.setHorizontalGroup(
                jAlgorithmSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jAlgorithmSettingsPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jAlgorithmSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jAlgorithmSettingsPanelLayout.createSequentialGroup()
                                                .addGroup(jAlgorithmSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jGenerationQuantityLabel)
                                                        .addComponent(jSizeOfOneGenerationLabel)
                                                        .addComponent(jMutationRatioPanel))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                                                .addGroup(jAlgorithmSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(jGenerationQuantityField, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                                        .addComponent(jSizeOfOneGenerationField)
                                                        .addComponent(jMutationRatioField)))
                                        .addGroup(jAlgorithmSettingsPanelLayout.createSequentialGroup()
                                                .addComponent(jCrossbreadRatioLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jCrossbreadRatioField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jAlgorithmSettingsPanelLayout.createSequentialGroup()
                                                .addComponent(jIterationSpeedLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jIterationSpeedField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jAlgorithmSettingsPanelLayout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addGroup(jAlgorithmSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jCrossbreadRatioSlider, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jIterationSpeedSlider, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jMutationRatioSlider, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap())
        );
        jAlgorithmSettingsPanelLayout.setVerticalGroup(
                jAlgorithmSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jAlgorithmSettingsPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jAlgorithmSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jGenerationQuantityLabel)
                                        .addComponent(jGenerationQuantityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jAlgorithmSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jSizeOfOneGenerationLabel)
                                        .addComponent(jSizeOfOneGenerationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jAlgorithmSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jMutationRatioPanel)
                                        .addComponent(jMutationRatioField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jMutationRatioSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addGroup(jAlgorithmSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jCrossbreadRatioLabel)
                                        .addComponent(jCrossbreadRatioField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jCrossbreadRatioSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jAlgorithmSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jIterationSpeedLabel)
                                        .addComponent(jIterationSpeedField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jIterationSpeedSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jBarFile.setText("File");

        jItemSavePNG.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jItemSavePNG.setText("Save to png...");
        /*jItemSavePNG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItemSavePNG(evt);
            }
        });*/
        jBarFile.add(jItemSavePNG);

        jItemExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jItemExit.setText("Exit");
        jItemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItemExiActionPerformed(evt);
            }
        });
        jBarFile.add(jItemExit);

        jMenuBar.add(jBarFile);

        jBarSettings.setText("Settings");

/*        ItemAlgorithmSettings.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        jItemAlgorithmSettings.setText("Algorithm settings");
        jItemAlgorithmSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItemAlgorithmSettingsActionPerformed(evt);
            }
        });*/
        //jBarSettings.add(jItemAlgorithmSettings);

        jItemCanteenSettings.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        jItemCanteenSettings.setText("Canteen settings");
        jItemCanteenSettings.setToolTipText("");
        jItemCanteenSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItemAlgorithmSettingsActionPerformed(evt);
            }
        });
        jBarSettings.add(jItemCanteenSettings);

        jMenuBar.add(jBarSettings);

        jBarHelp.setText("Help");

        jItemHelp.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jItemHelp.setText("Help...");
        jItemHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItemHelpActionPerformed(evt);
            }
        });
        jBarHelp.add(jItemHelp);

        jMenuBar.add(jBarHelp);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jDisplayPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jStartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jStopButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jAlgorithmSettingsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jAlgorithmSettingsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(55, 55, 55)))
                                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jAlgorithmSettingsLabel)
                                                .addGap(18, 18, 18)
                                                .addComponent(jAlgorithmSettingsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(30, 30, 30)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jStopButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jStartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(70, 70, 70))
                                        .addComponent(jDisplayPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void errorMessage (String msg){
        JOptionPane.showMessageDialog(new JFrame(), msg, "Data input", JOptionPane.ERROR_MESSAGE);
    }

    /* private void jItemSavePNG(ActionEvent evt) {
         JFrame parentFrame = new JFrame();

         JFileChooser fileChooser = new JFileChooser();
         fileChooser.setDialogTitle("Save as PNG...");

         int userSelection = fileChooser.showSaveDialog(parentFrame);

         if (userSelection == JFileChooser.APPROVE_OPTION) {
             File fileToSave = fileChooser.getSelectedFile();
             if(fileToSave.getName().toLowerCase().endsWith(".png")) {
                 try {
                     ImageIO.write(jDisplayPanel.getSavePicture(), "png", fileToSave);
                 } catch (Exception e) {
                     JOptionPane.showMessageDialog(new JFrame(),
                             "Can't save picture!",
                             "Inane error",
                             JOptionPane.ERROR_MESSAGE);
                 };
                 JOptionPane.showMessageDialog(new JFrame(),
                         "Picture saved.");
             } else {
                 JOptionPane.showMessageDialog(new JFrame(),
                         "File format must be png!",
                         "Inane error",
                         JOptionPane.ERROR_MESSAGE);
             }

         }
     }
 */
    private void jItemExiActionPerformed(ActionEvent evt) {
        System.exit(0);
    }

    private void jItemAlgorithmSettingsActionPerformed(ActionEvent evt) {
        jCanteenSettingsFrame.setSize(454, 880);
        jCanteenSettingsFrame.setVisible(true);
    }

    private void jItemHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemHelpActionPerformed
    }//GEN-LAST:event_jItemHelpActionPerformed

    private void jAlgorithSettingsLabel(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemHelpActionPerformed

    }//GEN-LAST:event_jItemHelpActionPerformed

    private void jStartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jStartButtonActionPerformed
        controller = new Controller();
        loadCanteen();
        loadSettings();
        controller.createPopulation();
        int iterNumber = (int) controller.getIterNumber();
        for(int i=0; i<iterNumber; i++) {
            jDisplayPanel.setCanteen((controller.getCanteen()));
            jDisplayPanel.setChromosome((controller.getBestChromosome()));
            jDisplayPanel.repaint();
            jDisplayPanel.setVisible(true);
            controller.nextGeneration();
        }

    }//GEN-LAST:event_jStartButtonActionPerformed
    private void loadCanteen() {
        try {
            int budget = Integer.parseInt(jTotalBudgetPriceField.getText());
            double leftWall = Double.parseDouble(jLeftWallField.getText());
            double rightWall = Double.parseDouble(jRightWallField.getText());
            double botWall = Double.parseDouble(jBottomWallField.getText());
            double topWall = Double.parseDouble(jTopWallField.getText());
            System.out.println(budget + " " + leftWall + " " + rightWall + " " + topWall);
            if (leftWall < 0 || rightWall < 0 || botWall < 0 || topWall < 0 || budget < 0) {
                errorMessage("Parameters cannot be negative.");
                return;
            }
            controller.createCanteen(botWall, topWall, rightWall, leftWall, budget);
            if (!loadFurnitureCosts()) {
                return;
            }
        } catch (NullPointerException e) {
            errorMessage("You need to input all data in correct fields");
            return;
        } catch (NumberFormatException e) {
            errorMessage("Illegal data type. Numbers expected");
            return;
        }
    }

    private boolean loadFurnitureCosts() {
        try {
            int door = Integer.parseInt(jDoorsTextPriceField.getText());
            int sWindow = Integer.parseInt(jSingleWindowPriceField.getText());
            int dWindow = Integer.parseInt(jDoubleWindowPriceField.getText());
            int fourPTable = Integer.parseInt(jFourPersonTablePriceField.getText());
            int sixPTable = Integer.parseInt(jSixPersonTablePriceField.getText());
            int eigthPTable = Integer.parseInt(jEightPersonTablePriceField.getText());
            int chair = Integer.parseInt(jchairPriceField.getText());
            int smallBench = Integer.parseInt(jSmallBenchPriceField.getText());
            int bigBench = Integer.parseInt(jBigBenchPriceField.getText());
            int lowIlu = Integer.parseInt(jLowIllumiantionPriceField.getText());
            int medIlu = Integer.parseInt(jMediumIllumiantionPriceField.getText());
            int highIlu = Integer.parseInt(jStrongIllumiantionPriceField.getText());
            controller.setCanteenCosts(FurnitureEnum.DOOR, door);
            controller.setCanteenCosts(FurnitureEnum.SWINDOW, sWindow);
            controller.setCanteenCosts(FurnitureEnum.DWINDOW, dWindow);
            controller.setCanteenCosts(FurnitureEnum.FOURPTABLE, fourPTable);
            controller.setCanteenCosts(FurnitureEnum.SIXPTABLE, sixPTable);
            controller.setCanteenCosts(FurnitureEnum.EIGHTPTABLE, eigthPTable);
            controller.setCanteenCosts(FurnitureEnum.CHAIR, chair);
            controller.setCanteenCosts(FurnitureEnum.SMALLBENCH, smallBench);
            controller.setCanteenCosts(FurnitureEnum.BIGBENCH, bigBench);
            controller.setCanteenCosts(FurnitureEnum.LOWILUM, lowIlu);
            controller.setCanteenCosts(FurnitureEnum.MEDILUM, medIlu);
            controller.setCanteenCosts(FurnitureEnum.STRONGILUM, highIlu);
            if (door < 0 || sWindow < 0 || dWindow < 0 || fourPTable < 0 || sixPTable < 0 || eigthPTable < 0 || chair < 0 || smallBench < 0
                    || bigBench < 0 || lowIlu < 0 || medIlu < 0 || highIlu < 0) {
                errorMessage("Parameters cannot be negative.");
                return false;
            }
        } catch (NullPointerException e) {
            errorMessage("You need to input all data in correct fields");
            return false;
        } catch (NumberFormatException e) {
            errorMessage("Illegal data type. Numbers expected");
            return false;
        }
        return true;
    }
    private void loadSettings() {
        try {
            double genQuan = Double.parseDouble(jGenerationQuantityField.getText());
            double iterSpeed = Double.parseDouble(jIterationSpeedField.getText());
            double mutationRatio = Double.parseDouble(jMutationRatioField.getText());
            double sizeOfGen = Double.parseDouble(jSizeOfOneGenerationField.getText());
            double crossRatio = Double.parseDouble(jCrossbreadRatioField.getText());

            if (genQuan < 0 || iterSpeed < 0 || mutationRatio < 0 || sizeOfGen < 0) {
                errorMessage("Parameters cannot be negative.");
                return;
            }
            controller.setAlgorithmSettings("genQuan",genQuan);
            controller.setAlgorithmSettings("iterSpeed",iterSpeed);
            controller.setAlgorithmSettings("mutationRatio",mutationRatio);
            controller.setAlgorithmSettings("sizeOfOneGen",sizeOfGen);
            controller.setAlgorithmSettings("crossRatio",crossRatio);
        } catch (NullPointerException e) {
            errorMessage("You need to input all data in correct fields");
            return;
        } catch (NumberFormatException e) {
            errorMessage("Illegal data type. Numbers expected");
            return;
        }
        return;
    }
    private void jTotalBudgetPriceFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTotalBudgetPriceFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTotalBudgetPriceFieldActionPerformed

    private void jDoorsTextPriceFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDoorsTextPriceFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDoorsTextPriceFieldActionPerformed

    private void jSingleWindowPriceFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSingleWindowPriceFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSingleWindowPriceFieldActionPerformed

    private void jDoubleWindowPriceFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDoubleWindowPriceFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDoubleWindowPriceFieldActionPerformed

    private void jEightPersonTablePriceFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEightPersonTablePriceFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jEightPersonTablePriceFieldActionPerformed

/*    private void jTwoPersonTablePriceFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTwoPersonTablePriceFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTwoPersonTablePriceFieldActionPerformed*/

    private void jFourPersonTablePriceFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFourPersonTablePriceFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFourPersonTablePriceFieldActionPerformed

    private void jSixPersonTablePriceFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSixPersonTablePriceFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSixPersonTablePriceFieldActionPerformed

    private void jchairPriceFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jchairPriceFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jchairPriceFieldActionPerformed

    private void jBigChairPriceFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBigChairPriceFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBigChairPriceFieldActionPerformed

    private void jLeftWallFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLeftWallFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLeftWallFieldActionPerformed

    private void jBottomWallFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBottomWallFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBottomWallFieldActionPerformed

    private void jRightWallFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRightWallFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRightWallFieldActionPerformed

    private void jTopWallFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTopWallFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTopWallFieldActionPerformed

    private void jLowIllumiantionPriceFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLowIllumiantionPriceFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLowIllumiantionPriceFieldActionPerformed

    private void jMediumIllumiantionPriceFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMediumIllumiantionPriceFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMediumIllumiantionPriceFieldActionPerformed

    private void jCanteenSettingsSaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCanteenSettingsSaveButtonActionPerformed
        loadCanteen();
    }//GEN-LAST:event_jCanteenSettingsSaveButtonActionPerformed

    private void jCrossbreadRatioFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCrossbreadRatioFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCrossbreadRatioFieldActionPerformed

    private void jMutationRatioFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMutationRatioFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMutationRatioFieldActionPerformed

    private void jSizeOfOneGenerationFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSizeOfOneGenerationFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSizeOfOneGenerationFieldActionPerformed

    private void jGenerationQuantityFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGenerationQuantityFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jGenerationQuantityFieldActionPerformed

    private void jSmallBenchPriceFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSmallBenchPriceFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSmallBenchPriceFieldActionPerformed

    private void jBigBenchPriceFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBigBenchPriceFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBigBenchPriceFieldActionPerformed

    private void jStrongIllumiantionPriceFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jStrongIllumiantionPriceFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jStrongIllumiantionPriceFieldActionPerformed

    private void jStopButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jStopButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jStopButtonActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jAlgorithmSettingsLabel;
    private javax.swing.JPanel jAlgorithmSettingsPanel;
    private javax.swing.JMenu jBarFile;
    private javax.swing.JMenu jBarHelp;
    private javax.swing.JMenu jBarSettings;
    private javax.swing.JPanel jBenchPanel;
    private javax.swing.JLabel jBigBenchDollarLabel;
    private javax.swing.JLabel jBigBenchLabel;
    private javax.swing.JTextField jBigBenchPriceField;
    private javax.swing.JLabel jBigBenchPriceLabel;
    private javax.swing.JLabel jBigCairPriceLabel;
    private javax.swing.JLabel jBigChairDollarLabel;
    private javax.swing.JLabel jBigChairLabel;
    private javax.swing.JTextField jBigChairPriceField;
    private javax.swing.JTextField jBottomWallField;
    private javax.swing.JLabel jBottomWallLabel;
    private javax.swing.JLabel jBottomWallMeterLabel;
    private javax.swing.JLabel jBottomWallSizeLabel;
    private javax.swing.JPanel jCanteenBudgetPanel;
    private javax.swing.JFrame jCanteenSettingsFrame;
    private javax.swing.JLabel jCanteenSettingsLabel;
    private javax.swing.JPanel jCanteenSettingsPanel;
    private javax.swing.JButton jCanteenSettingsSaveButton;
    private javax.swing.JPanel jCanteenSizePanel;
    private javax.swing.JPanel jChairPanel;
    private javax.swing.JTextField jCrossbreadRatioField;
    private javax.swing.JLabel jCrossbreadRatioLabel;
    private javax.swing.JSlider jCrossbreadRatioSlider;
    private Graphics2D jDisplayPanel;
    private javax.swing.JLabel jDoorDollarLabel;
    private javax.swing.JPanel jDoorWindowPanel;
    private javax.swing.JLabel jDoorsLabel;
    private javax.swing.JLabel jDoorsPriceLabel;
    private javax.swing.JTextField jDoorsTextPriceField;
    private javax.swing.JLabel jDoubleWindowDollarLabel;
    private javax.swing.JLabel jDoubleWindowLabel;
    private javax.swing.JTextField jDoubleWindowPriceField;
    private javax.swing.JLabel jDoubleWindowPriceLabel;
    private javax.swing.JLabel jFourPersonPriceLabel;
    private javax.swing.JLabel jFourPersonTableDollarLabel;
    private javax.swing.JLabel jFourPersonTableLabel;
    private javax.swing.JTextField jFourPersonTablePriceField;
    private javax.swing.JTextField jGenerationQuantityField;
    private javax.swing.JLabel jGenerationQuantityLabel;
    private javax.swing.JPanel jIluminationPanel;
    private javax.swing.JMenuItem jItemAlgorithmSettings;
    private javax.swing.JMenuItem jItemCanteenSettings;
    private javax.swing.JMenuItem jItemExit;
    private javax.swing.JMenuItem jItemHelp;
    private javax.swing.JMenuItem jItemSavePNG;
    private javax.swing.JTextField jIterationSpeedField;
    private javax.swing.JLabel jIterationSpeedLabel;
    private javax.swing.JSlider jIterationSpeedSlider;
    private javax.swing.JTextField jLeftWallField;
    private javax.swing.JLabel jLeftWallLabel;
    private javax.swing.JLabel jLeftWallMeterLabel;
    private javax.swing.JLabel jLeftWallSizeLabel;
    private javax.swing.JLabel jLowIllumiantionDollarLabel;
    private javax.swing.JTextField jLowIllumiantionPriceField;
    private javax.swing.JLabel jLowIlluminationLabel;
    private javax.swing.JLabel jLowIlluminationPriceLabel;
    private javax.swing.JLabel jMediumIllumiantionDollarLabel;
    private javax.swing.JTextField jMediumIllumiantionPriceField;
    private javax.swing.JLabel jMediumIlluminationLabel;
    private javax.swing.JLabel jMediumIlluminationPriceLabel;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JTextField jMutationRatioField;
    private javax.swing.JLabel jMutationRatioPanel;
    private javax.swing.JSlider jMutationRatioSlider;
    private javax.swing.JLabel jEightPersonTableDollarLabel;
    private javax.swing.JLabel jEightPersonTableLabel;
    private javax.swing.JTextField jEightPersonTablePriceField;
    private javax.swing.JLabel jEightPersonTablePriceLabel;
    private javax.swing.JTextField jRightWallField;
    private javax.swing.JLabel jRightWallLabel;
    private javax.swing.JLabel jRightWallMeterLabel;
    private javax.swing.JLabel jRightWallSizeLabel;
    private javax.swing.JLabel jSingleWindowDollarLabel;
    private javax.swing.JLabel jSingleWindowLabel;
    private javax.swing.JTextField jSingleWindowPriceField;
    private javax.swing.JLabel jSingleWindowPriceLabel;
    private javax.swing.JLabel jSixPersonPriceLabel;
    private javax.swing.JLabel jSixPersonTableDollarLabel;
    private javax.swing.JLabel jSixPersonTableLabel;
    private javax.swing.JTextField jSixPersonTablePriceField;
    private javax.swing.JTextField jSizeOfOneGenerationField;
    private javax.swing.JLabel jSizeOfOneGenerationLabel;
    private javax.swing.JLabel jSmallBenchDollarLabel;
    private javax.swing.JLabel jSmallBenchLabel;
    private javax.swing.JTextField jSmallBenchPriceField;
    private javax.swing.JLabel jSmallBenchPriceLabel;
    private javax.swing.JLabel jchairDollarLabel;
    private javax.swing.JLabel jchairLabel;
    private javax.swing.JTextField jchairPriceField;
    private javax.swing.JLabel jchairPriceLabel;
    private javax.swing.JButton jStartButton;
    private javax.swing.JButton jStopButton;
    private javax.swing.JLabel jStrongIllumiantionDollarLabel;
    private javax.swing.JTextField jStrongIllumiantionPriceField;
    private javax.swing.JLabel jStrongIlluminationLabel;
    private javax.swing.JLabel jStrongIlluminationPriceLabel;
    private javax.swing.JPanel jTablePanel;
    private javax.swing.JTextField jTopWallField;
    private javax.swing.JLabel jTopWallLabel;
    private javax.swing.JLabel jTopWallMeterLabel;
    private javax.swing.JLabel jTopWallSizeLabel;
    private javax.swing.JLabel jTotalBudgetDollarLabel;
    private javax.swing.JLabel jTotalBudgetLabel;
    private javax.swing.JTextField jTotalBudgetPriceField;
    private javax.swing.JLabel jTotalBudgetPriceLabel;
/*    private javax.swing.JLabel jTwoPersonPriceLabel;
    private javax.swing.JLabel jTwoPersonTableDollarLabel;
    private javax.swing.JLabel jTwoPersonTableLabel;
    private javax.swing.JTextField jTwoPersonTablePriceField;*/
    // End of variables declaration//GEN-END:variables
}