package serial;

import com.fazecast.jSerialComm.SerialPort;
import com.fazecast.jSerialComm.SerialPortDataListener;
import com.fazecast.jSerialComm.SerialPortEvent;
import java.awt.Color;
import java.io.FileWriter;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

public class Serial extends javax.swing.JFrame {

    private SerialPort[] portlist = null;
    private SerialPort Serialport;
    private OutputStream outputStream = null;
    private String DataReceived = "";
    private String filename = "History.txt";
    private boolean Autosrcoll = true;
    private boolean Timeline = true;
    private boolean FileHistory = false;
    private boolean newLine = true;
    private long bytecount = 0;

    public Serial() {
        initComponents();
        setinit();
        setIconImage(new ImageIcon("lib\\icon.png").getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPSETTING = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxport = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxrate = new javax.swing.JComboBox<>();
        jComboBoxdata = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxstop = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxparity = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        BtnClose = new javax.swing.JButton();
        BtnOpen = new javax.swing.JButton();
        JTStatus = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        JRECEIVED = new javax.swing.JLabel();
        JDDISPLAY = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Display = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        Line = new javax.swing.JComboBox<>();
        BtnSend = new javax.swing.JButton();
        ClearDP = new javax.swing.JButton();
        Textinput = new javax.swing.JTextField();
        JPTOOL = new javax.swing.JPanel();
        AutoScroll = new javax.swing.JCheckBox();
        JTimeline = new javax.swing.JCheckBox();
        JHistory = new javax.swing.JCheckBox();
        JBMENU = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Serial");
        setMaximumSize(new java.awt.Dimension(500000, 25000));
        setMinimumSize(new java.awt.Dimension(600, 320));
        setPreferredSize(new java.awt.Dimension(900, 340));
        setSize(new java.awt.Dimension(937, 345));

        JPSETTING.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SETTING", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));
        JPSETTING.setPreferredSize(new java.awt.Dimension(189, 218));

        jLabel1.setText("COM PORT");
        jLabel1.setMaximumSize(new java.awt.Dimension(53, 16));
        jLabel1.setMinimumSize(new java.awt.Dimension(53, 16));
        jLabel1.setPreferredSize(new java.awt.Dimension(53, 16));

        jComboBoxport.setMaximumSize(new java.awt.Dimension(71, 16));
        jComboBoxport.setMinimumSize(new java.awt.Dimension(71, 16));
        jComboBoxport.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBoxportPopupMenuWillBecomeVisible(evt);
            }
        });

        jLabel2.setText("BAUD RATE");
        jLabel2.setMaximumSize(new java.awt.Dimension(53, 16));
        jLabel2.setMinimumSize(new java.awt.Dimension(53, 16));
        jLabel2.setPreferredSize(new java.awt.Dimension(53, 16));

        jComboBoxrate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "50", "110", "300", "1200", "2400", "4800", "9600", "19200", "38400", "57600", "74800", "115200", "230400", "250000" }));
        jComboBoxrate.setMaximumSize(new java.awt.Dimension(71, 16));
        jComboBoxrate.setMinimumSize(new java.awt.Dimension(71, 16));

        jComboBoxdata.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6", "7", "8" }));
        jComboBoxdata.setToolTipText("");
        jComboBoxdata.setMaximumSize(new java.awt.Dimension(71, 16));
        jComboBoxdata.setMinimumSize(new java.awt.Dimension(71, 16));

        jLabel3.setText("DATA BITS");
        jLabel3.setMaximumSize(new java.awt.Dimension(53, 16));
        jLabel3.setMinimumSize(new java.awt.Dimension(53, 16));
        jLabel3.setPreferredSize(new java.awt.Dimension(53, 16));

        jComboBoxstop.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "1.5", "2" }));
        jComboBoxstop.setMaximumSize(new java.awt.Dimension(71, 16));
        jComboBoxstop.setMinimumSize(new java.awt.Dimension(71, 16));

        jLabel4.setText("STOP BITS");

        jComboBoxparity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NONE", "EVEN", "COD", "MARK", "SPACE" }));
        jComboBoxparity.setMaximumSize(new java.awt.Dimension(71, 16));
        jComboBoxparity.setMinimumSize(new java.awt.Dimension(71, 16));

        jLabel5.setText("PARITY ");
        jLabel5.setMaximumSize(new java.awt.Dimension(53, 16));
        jLabel5.setMinimumSize(new java.awt.Dimension(53, 16));
        jLabel5.setPreferredSize(new java.awt.Dimension(53, 16));

        jLabel6.setText("STATUS");
        jLabel6.setMaximumSize(new java.awt.Dimension(53, 16));
        jLabel6.setMinimumSize(new java.awt.Dimension(53, 16));
        jLabel6.setPreferredSize(new java.awt.Dimension(53, 16));

        BtnClose.setText("CLOSE");
        BtnClose.setMaximumSize(new java.awt.Dimension(71, 16));
        BtnClose.setMinimumSize(new java.awt.Dimension(71, 16));
        BtnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCloseActionPerformed(evt);
            }
        });

        BtnOpen.setText("OPEN");

        BtnOpen.setMaximumSize(new java.awt.Dimension(71, 16));

        BtnOpen.setMinimumSize(new java.awt.Dimension(71, 16));
        BtnOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnOpenActionPerformed(evt);
            }
        });

        JTStatus.setMaximumSize(new java.awt.Dimension(71, 16));
        JTStatus.setMinimumSize(new java.awt.Dimension(71, 16));
        JTStatus.setPreferredSize(new java.awt.Dimension(40, 16));

        jLabel8.setText("RECEIVED");
        jLabel8.setMaximumSize(new java.awt.Dimension(53, 16));
        jLabel8.setMinimumSize(new java.awt.Dimension(53, 16));
        jLabel8.setPreferredSize(new java.awt.Dimension(53, 16));

        JRECEIVED.setMaximumSize(new java.awt.Dimension(71, 16));
        JRECEIVED.setMinimumSize(new java.awt.Dimension(71, 16));
        JRECEIVED.setPreferredSize(new java.awt.Dimension(40, 16));

        javax.swing.GroupLayout JPSETTINGLayout = new javax.swing.GroupLayout(JPSETTING);
        JPSETTING.setLayout(JPSETTINGLayout);
        JPSETTINGLayout.setHorizontalGroup(
            JPSETTINGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPSETTINGLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(JPSETTINGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnOpen, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPSETTINGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnClose, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JRECEIVED, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JTStatus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBoxparity, javax.swing.GroupLayout.Alignment.TRAILING, 0, 83, Short.MAX_VALUE)
                    .addComponent(jComboBoxstop, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBoxdata, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBoxrate, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBoxport, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(2, 2, 2))
        );
        JPSETTINGLayout.setVerticalGroup(
            JPSETTINGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPSETTINGLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(JPSETTINGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBoxport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(2, 2, 2)
                .addGroup(JPSETTINGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBoxrate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(2, 2, 2)
                .addGroup(JPSETTINGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBoxdata, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(2, 2, 2)
                .addGroup(JPSETTINGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBoxstop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(2, 2, 2)
                .addGroup(JPSETTINGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBoxparity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(2, 2, 2)
                .addGroup(JPSETTINGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(JPSETTINGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JRECEIVED, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(JPSETTINGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnOpen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        jLabel1.getAccessibleContext().setAccessibleName("");
        jComboBoxport.getAccessibleContext().setAccessibleName("");
        jLabel2.getAccessibleContext().setAccessibleName("");
        jComboBoxrate.getAccessibleContext().setAccessibleName("");
        jComboBoxdata.getAccessibleContext().setAccessibleName("");
        jLabel3.getAccessibleContext().setAccessibleName("");
        jComboBoxstop.getAccessibleContext().setAccessibleName("");
        jLabel4.getAccessibleContext().setAccessibleName("");
        jComboBoxparity.getAccessibleContext().setAccessibleName("");
        jLabel5.getAccessibleContext().setAccessibleName("");
        jLabel6.getAccessibleContext().setAccessibleName("");
        jLabel8.getAccessibleContext().setAccessibleName("");

        JDDISPLAY.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DISPLAY", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));
        JDDISPLAY.setPreferredSize(new java.awt.Dimension(727, 218));

        Display.setColumns(20);
        Display.setRows(5);
        Display.setToolTipText("");
        Display.setWrapStyleWord(true);
        jScrollPane1.setViewportView(Display);

        jLabel7.setText("LINE :");
        jLabel7.setMaximumSize(new java.awt.Dimension(71, 16));

        Line.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "New Line", "Carriage", "Both" }));

        BtnSend.setText("SEND");
        BtnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSendActionPerformed(evt);
            }
        });

        ClearDP.setText("Clear");
        ClearDP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearDPActionPerformed(evt);
            }
        });

        Textinput.setMinimumSize(new java.awt.Dimension(64, 23));
        Textinput.setPreferredSize(new java.awt.Dimension(64, 23));

        javax.swing.GroupLayout JDDISPLAYLayout = new javax.swing.GroupLayout(JDDISPLAY);
        JDDISPLAY.setLayout(JDDISPLAYLayout);
        JDDISPLAYLayout.setHorizontalGroup(
            JDDISPLAYLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JDDISPLAYLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JDDISPLAYLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
                    .addGroup(JDDISPLAYLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Line, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ClearDP, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JDDISPLAYLayout.createSequentialGroup()
                        .addComponent(Textinput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        JDDISPLAYLayout.setVerticalGroup(
            JDDISPLAYLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JDDISPLAYLayout.createSequentialGroup()
                .addGroup(JDDISPLAYLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnSend, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Textinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JDDISPLAYLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Line, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ClearDP, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        AutoScroll.setText("AutoScroll");
        AutoScroll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AutoScrollActionPerformed(evt);
            }
        });

        JTimeline.setText("Timeline");
        JTimeline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTimelineActionPerformed(evt);
            }
        });

        JHistory.setText("FileHistory");
        JHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JHistoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPTOOLLayout = new javax.swing.GroupLayout(JPTOOL);
        JPTOOL.setLayout(JPTOOLLayout);
        JPTOOLLayout.setHorizontalGroup(
            JPTOOLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPTOOLLayout.createSequentialGroup()
                .addComponent(AutoScroll)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTimeline)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JHistory)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JPTOOLLayout.setVerticalGroup(
            JPTOOLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPTOOLLayout.createSequentialGroup()
                .addGroup(JPTOOLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AutoScroll)
                    .addComponent(JTimeline)
                    .addComponent(JHistory))
                .addGap(1, 1, 1))
        );

        setJMenuBar(JBMENU);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JPTOOL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JPSETTING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(JDDISPLAY, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JPSETTING, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                    .addComponent(JDDISPLAY, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE))
                .addGap(8, 8, 8)
                .addComponent(JPTOOL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleDescription("nxhsvn");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnOpenActionPerformed
        try {
            Serialport = portlist[jComboBoxport.getSelectedIndex()];

            Serialport.setBaudRate(Integer.parseInt(jComboBoxrate.getSelectedItem().toString()));
            Serialport.setNumDataBits(Integer.parseInt(jComboBoxdata.getSelectedItem().toString()));
            Serialport.setNumStopBits(Integer.parseInt(jComboBoxstop.getSelectedItem().toString()));
            Serialport.setParity(jComboBoxparity.getSelectedIndex());
            Serialport.openPort();
            if (Serialport.isOpen()) {
                jComboBoxport.setEnabled(false);
                BtnOpen.setEnabled(false);
                BtnClose.setEnabled(true);
                BtnSend.setEnabled(true);
                JTStatus.setForeground(Color.GREEN);
                JTStatus.setText("SUCCESS");
                Textinput.setEnabled(true);
                SerinalEventReading(Serialport);
            } else {
                JTStatus.setForeground(Color.RED);
                JTStatus.setText("FAIL");
            }
        } catch (ArrayIndexOutOfBoundsException a) {
            JTStatus.setForeground(Color.RED);
            JTStatus.setText("CHOSE PORT");
        } catch (Exception e) {
            JTStatus.setForeground(Color.RED);
            JTStatus.setText("ERROR");
        }
    }//GEN-LAST:event_BtnOpenActionPerformed

    private void BtnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCloseActionPerformed

        if (Serialport.isOpen()) {
            Serialport.removeDataListener();
            Serialport.closePort();
            jComboBoxport.setEnabled(true);
            BtnOpen.setEnabled(true);
            BtnClose.setEnabled(false);
            BtnSend.setEnabled(false);
            Textinput.setEnabled(false);
            JTStatus.setForeground(Color.ORANGE);
            JTStatus.setText("NOT CONNECT");

        }

    }//GEN-LAST:event_BtnCloseActionPerformed

    private void jComboBoxportPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxportPopupMenuWillBecomeVisible
        jComboBoxport.removeAllItems();
        portlist = SerialPort.getCommPorts();
        for (SerialPort serialPort : portlist) {
            jComboBoxport.addItem(serialPort.getSystemPortName());
        }
    }//GEN-LAST:event_jComboBoxportPopupMenuWillBecomeVisible

    private void BtnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSendActionPerformed
        SendData();
    }//GEN-LAST:event_BtnSendActionPerformed

    private void AutoScrollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AutoScrollActionPerformed
        if (Autosrcoll) {
            Autosrcoll = false;
        } else {
            Autosrcoll = true;
        }
    }//GEN-LAST:event_AutoScrollActionPerformed

    private void JTimelineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTimelineActionPerformed
        if (Timeline) {
            Timeline = false;
        } else {
            Timeline = true;
        }
    }//GEN-LAST:event_JTimelineActionPerformed

    private void ClearDPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearDPActionPerformed
        Display.setText("");
    }//GEN-LAST:event_ClearDPActionPerformed

    private void JHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JHistoryActionPerformed
        try {
            if (FileHistory) {
                FileHistory = false;
            } else {
                JFileChooser jf = new JFileChooser();
                jf.showSaveDialog(null);
                jf.setVisible(true);
                filename = jf.getSelectedFile().getPath();
                if (!filename.endsWith(".txt")) {
                    filename += ".txt";
                }
                FileHistory = true;
            }
        } catch (Exception e) {
        }
        JHistory.setSelected(FileHistory);
    }//GEN-LAST:event_JHistoryActionPerformed

    private void SerinalEventReading(SerialPort port) {
        port.addDataListener(new SerialPortDataListener() {
            @Override
            public int getListeningEvents() {
                return SerialPort.LISTENING_EVENT_DATA_RECEIVED;
            }

            @Override
            public void serialEvent(SerialPortEvent spe) {
                if (newLine) {
                    Display.append(Datetime());
                    newLine = false;
                }
                for (byte Byte : spe.getReceivedData()) {
                    bytecount++;
                    if (Timeline && Byte == 10) {
                        DataReceived = (char) Byte + Datetime();
                    } else {
                        DataReceived = "" + (char) Byte;
                    }
                    Display.append(DataReceived);
                    if (FileHistory) {
                        FileHistory(DataReceived);
                    }
                }
                if (Autosrcoll) {
                    Display.setCaretPosition(Display.getDocument().getLength());
                }
                JRECEIVED.setForeground(Color.GREEN);
                JRECEIVED.setText((bytecount < 1e+4 ) ? (bytecount + " Byte") : ((bytecount <1e+6 ) ? ( (float)(bytecount / 1e+4) + " KByte"): ((float)(bytecount /1e+6) + " MByte")));
            }
        });
    }

    private String Datetime() {
        return new SimpleDateFormat("hh:mm:ss:SSS -> ").format(new Date());
    }

    private void SendData() {

        try {
            outputStream = Serialport.getOutputStream();
            String send = Textinput.getText();
            switch (Line.getSelectedIndex()) {
                case 0:
                    outputStream.write(send.getBytes());
                    break;
                case 1:
                    outputStream.write((send + "\n").getBytes());
                    break;
                case 2:
                    outputStream.write((send + "\r").getBytes());
                    break;
                case 3:
                    outputStream.write((send + "\r\n").getBytes());
                    break;
                default:
                    System.err.println("Error");
                    break;
            }
            Textinput.setText("");
        } catch (Exception e) {
            Textinput.setForeground(Color.RED);
            Textinput.setText("ERROR");
        }
    }

    private void FileHistory(String a) {
        try {
            FileWriter File = new FileWriter(filename, true);
            File.write(a);
            File.close();
        } catch (Exception e) {
        }
    }

    private void setinit() {
        Display.setEditable(false);
        jComboBoxport.setEnabled(true);
        jComboBoxrate.setSelectedItem("9600");
        jComboBoxparity.setSelectedItem("NONE");
        jComboBoxstop.setSelectedItem("1");
        jComboBoxdata.setSelectedItem("8");
        Line.setSelectedItem("New Line");
        BtnOpen.setEnabled(true);
        BtnOpen.setForeground(Color.GREEN);
        BtnClose.setForeground(Color.RED);
        BtnClose.setEnabled(false);
        BtnSend.setEnabled(false);
        JHistory.setSelected(FileHistory);
        AutoScroll.setSelected(Autosrcoll);
        JTimeline.setSelected(Timeline);
        Textinput.setEnabled(false);
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {

        }
        java.awt.EventQueue.invokeLater(() -> {
            new Serial().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox AutoScroll;
    private javax.swing.JButton BtnClose;
    private javax.swing.JButton BtnOpen;
    private javax.swing.JButton BtnSend;
    private javax.swing.JButton ClearDP;
    private javax.swing.JTextArea Display;
    private javax.swing.JMenuBar JBMENU;
    private javax.swing.JPanel JDDISPLAY;
    private javax.swing.JCheckBox JHistory;
    private javax.swing.JPanel JPSETTING;
    private javax.swing.JPanel JPTOOL;
    private javax.swing.JLabel JRECEIVED;
    private javax.swing.JLabel JTStatus;
    private javax.swing.JCheckBox JTimeline;
    private javax.swing.JComboBox<String> Line;
    private javax.swing.JTextField Textinput;
    private javax.swing.JComboBox<String> jComboBoxdata;
    private javax.swing.JComboBox<String> jComboBoxparity;
    private javax.swing.JComboBox<String> jComboBoxport;
    private javax.swing.JComboBox<String> jComboBoxrate;
    private javax.swing.JComboBox<String> jComboBoxstop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
