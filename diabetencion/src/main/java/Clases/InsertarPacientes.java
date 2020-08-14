/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.*;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LuisJavier-PC
 */
public class InsertarPacientes extends javax.swing.JFrame {

    /**
     * Creates new form InsertarPacientes
     */
    public InsertarPacientes() {
        initComponents();
        MostrarDatosPacientes("");
        MostrarDatosComplicaciones("");
        MostrarDatosMedicamentos("");
    }
    
    void MostrarDatosPacientes(String valor) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Cedula");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Fecha de Nacimiento");
        modelo.addColumn("Sexo");
        modelo.addColumn("Tipo de Diabetes");
        modelo.addColumn("HTA");
        modelo.addColumn("Dislipidemia");
        modelo.addColumn("Indice de Masa Corporal");
        modelo.addColumn("HBA1C%");
        modelo.addColumn("Glucometro");
        modelo.addColumn("Suma Sensor");
        modelo.addColumn("Inyectadoras");
        modelo.addColumn("Direccion Paciente");
        modelo.addColumn("Tipo de Paciente");
        modelo.addColumn("Fecha DX");
        modelo.addColumn("Enfermedad Asociada");
        modelo.addColumn("Establecimiento de Control");
        modelo.addColumn("Municipio");
        tblPacientes.setModel(modelo);
        String sql = "";
        if(valor.equals("")){
            sql = "SELECT * FROM Pacientes";
        }else{
            sql = "SELECT * FROM Pacientes WHERE cedula ='"+valor+"'";
        }
        String[] datos=new String[19];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0]= rs.getString(1);
                datos[1]= rs.getString(2);
                datos[2]= rs.getString(3);
                datos[3]= rs.getString(4);
                datos[4]= rs.getString(5);
                datos[5]= rs.getString(6);
                datos[6]= rs.getString(7);
                datos[7]= rs.getString(8);
                datos[8]= rs.getString(9);
                datos[9]= rs.getString(10);
                datos[10]= rs.getString(11);
                datos[11]= rs.getString(12);
                datos[12]= rs.getString(13);
                datos[13]= rs.getString(14);
                datos[14]= rs.getString(15);
                datos[15]= rs.getString(16);
                datos[16]= rs.getString(17);
                datos[17]= rs.getString(18);
                datos[18]= rs.getString(19);
                modelo.addRow(datos);
            }
            tblPacientes.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(InsertarPacientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    void MostrarDatosComplicaciones(String valor) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Cedula");
        modelo.addColumn("V");
        modelo.addColumn("R");
        modelo.addColumn("CV");
        modelo.addColumn("N");
        modelo.addColumn("PD");       
        tblComplicaciones.setModel(modelo);
        String sql = "";
        if(valor.equals("")){
            sql = "SELECT * FROM ComplicacionesPacientes";
        }else{
            sql = "SELECT * FROM ComplicacionesPacientes WHERE cedula ='"+valor+"'";
        }
        String[] datos=new String[6];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0]= rs.getString(1);
                datos[1]= rs.getString(2);
                datos[2]= rs.getString(3);
                datos[3]= rs.getString(4);
                datos[4]= rs.getString(5);
                datos[5]= rs.getString(6);
                modelo.addRow(datos);
            }
            tblComplicaciones.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(InsertarPacientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    void MostrarDatosMedicamentos(String valor) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Cedula");
        modelo.addColumn("Ins N");
        modelo.addColumn("Ins R");
        modelo.addColumn("Ins 70/30");
        modelo.addColumn("Analogo de acción corta");
        modelo.addColumn("Analogo de acción larga");
        modelo.addColumn("Analogo 75/25");
        modelo.addColumn("glimenclamida");
        modelo.addColumn("Metformida");
        modelo.addColumn("Enalapril");
        modelo.addColumn("Amlodipina");
        modelo.addColumn("Sivastatina");
        modelo.addColumn("Otros Medicamentos");
        tblMedicamentos.setModel(modelo);
        String sql = "";
        if(valor.equals("")){
            sql = "SELECT * FROM Medicamentos";
        }else{
            sql = "SELECT * FROM Medicamentos WHERE cedula ='"+valor+"'";
        }
        String[] datos=new String[13];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0]= rs.getString(1);
                datos[1]= rs.getString(2);
                datos[2]= rs.getString(3);
                datos[3]= rs.getString(4);
                datos[4]= rs.getString(5);
                datos[5]= rs.getString(6);
                datos[6]= rs.getString(7);
                datos[7]= rs.getString(8);
                datos[8]= rs.getString(9);
                datos[9]= rs.getString(10);
                datos[10]= rs.getString(11);
                datos[11]= rs.getString(12);
                datos[12]= rs.getString(13);
                modelo.addRow(datos);
            }
            tblMedicamentos.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(InsertarPacientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItemModificar = new javax.swing.JMenuItem();
        jMenuItemEliminar = new javax.swing.JMenuItem();
        jScrollPane3 = new javax.swing.JScrollPane();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanelPrincipal = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnEnviar = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        ComboTipoDiabetes = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        txtDireccionPaciente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMasaCorporal = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        DateEdad = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        ComboTipoPaciente = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        DateDX = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        txtSumaSensor = new javax.swing.JTextField();
        txtHBA = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtInyectadoras = new javax.swing.JTextField();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnMostrarTodos = new javax.swing.JButton();
        ComboSexo = new javax.swing.JComboBox<>();
        ComboHTA = new javax.swing.JComboBox<>();
        ComboGlucometro = new javax.swing.JComboBox<>();
        ComboDislipidemia = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        ComboCompliV = new javax.swing.JComboBox<>();
        ComboCompliR = new javax.swing.JComboBox<>();
        ComboCompliCV = new javax.swing.JComboBox<>();
        ComboCompliPD = new javax.swing.JComboBox<>();
        ComboCompliN = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        ComboEnfermedadAso = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        txtInsN = new javax.swing.JTextField();
        txtInsR = new javax.swing.JTextField();
        txtIns7030 = new javax.swing.JTextField();
        txtAnalogo7525 = new javax.swing.JTextField();
        txtAnalogoLarga = new javax.swing.JTextField();
        txtAnalogoCorta = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        txtMetformida = new javax.swing.JTextField();
        txtGlimenclamida = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        txtAmlodipina = new javax.swing.JTextField();
        txtEnalapril = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPacientes = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblComplicaciones = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblMedicamentos = new javax.swing.JTable();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        txtEstablecimientoControl = new javax.swing.JTextField();
        txtEstablecimientoMunicipio = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();

        jMenuItemModificar.setText("Modificar");
        jMenuItemModificar.setComponentPopupMenu(jPopupMenu1);
        jMenuItemModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuItemModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemModificarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItemModificar);

        jMenuItemEliminar.setText("Eliminar");
        jMenuItemEliminar.setComponentPopupMenu(jPopupMenu1);
        jMenuItemEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEliminarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItemEliminar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(824, 600));

        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pacientes", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 3, 24))); // NOI18N

        btnEnviar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        jLabel15.setText("Tipo de Diabetes");

        ComboTipoDiabetes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo 1", "Tipo 2", "Tipo DPG1", "Tipo DPG2", "DG ", "Otros" }));

        jLabel14.setText("Fecha DX");

        txtDireccionPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionPacienteActionPerformed(evt);
            }
        });

        jLabel6.setText("Sexo");

        jLabel16.setText("Tipo de Paciente");

        jLabel2.setText("Nombre");

        jLabel3.setText("Apellido");

        jLabel13.setText("Dirección de el/la Paciente");

        jLabel11.setText("Glucometro");

        jLabel4.setText("Cedula");

        txtMasaCorporal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMasaCorporalActionPerformed(evt);
            }
        });

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jLabel5.setText("Fecha de Nacimiento");

        jLabel1.setText("Hipertension Arterial");

        DateEdad.setDateFormatString("dd/MM/yyyy");

        jLabel9.setText("HB1C%");

        jLabel8.setText("Indice Masa Corporal");

        jLabel12.setText("Suma Sensor");

        ComboTipoPaciente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo ING", "Tipo 1er Año", "Tipo SUC" }));

        jLabel10.setText("Inyectadoras");

        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });

        DateDX.setDateFormatString("dd/MM/yyyy");

        jLabel7.setText("Dislipidemia");

        txtSumaSensor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSumaSensorActionPerformed(evt);
            }
        });

        txtHBA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHBAActionPerformed(evt);
            }
        });

        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnMostrarTodos.setText("Mostrar Todos");
        btnMostrarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarTodosActionPerformed(evt);
            }
        });

        ComboSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hombre", "Mujer" }));

        ComboHTA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));

        ComboGlucometro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));

        ComboDislipidemia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Complicaciones");

        jLabel18.setText("V");

        ComboCompliV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));

        ComboCompliR.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));

        ComboCompliCV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));

        ComboCompliPD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));

        ComboCompliN.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));

        jLabel19.setText("R");

        jLabel20.setText("CV");

        jLabel21.setText("N");

        jLabel22.setText("PD");

        jLabel23.setText("Enfermedad Asociada");

        ComboEnfermedadAso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CA", "TB", "VIH", "FQ", "EC", "TIR", "Otra" }));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setText("Medicamentos");

        jLabel25.setText("Ins N");

        jLabel26.setText("Analogo de Acción Larga");

        jLabel27.setText("Analogo 75/25");

        jLabel28.setText("Enalapril");

        jLabel29.setText("Metformida");

        jLabel30.setText("Glimenclamida");

        jLabel31.setText("Analogo de Acción Corta");

        jLabel32.setText("Ins 70/30");

        jLabel33.setText("Ins R");

        jLabel34.setText("Otros Medicamentos");

        jLabel35.setText("Sivastatina");

        jLabel36.setText("Amlodipina");

        btnActualizar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        tblPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblPacientes.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(tblPacientes);

        tblComplicaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblComplicaciones);

        tblMedicamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(tblMedicamentos);

        jLabel37.setText("Establecimento de Control");

        jLabel38.setText("Municipio");

        btnLimpiar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMostrarTodos))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel31)
                                    .addComponent(jLabel30)
                                    .addComponent(jLabel36))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtInsN)
                                            .addComponent(txtAnalogoCorta, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtGlimenclamida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtAmlodipina, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(536, 536, 536))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel18)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ComboCompliV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel19)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ComboCompliR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel20)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ComboCompliCV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel21)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ComboCompliN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel22)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ComboCompliPD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(229, 229, 229)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel33)
                                        .addComponent(jLabel26)
                                        .addComponent(jLabel29)
                                        .addComponent(jLabel35))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtInsR)
                                        .addComponent(txtAnalogoLarga)
                                        .addComponent(txtMetformida)
                                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel34)
                                        .addComponent(jLabel28)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(1, 1, 1)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel32)
                                                .addComponent(jLabel27))))
                                    .addGap(16, 16, 16)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtAnalogo7525)
                                        .addComponent(txtEnalapril)
                                        .addComponent(txtIns7030, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEstablecimientoControl, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtEstablecimientoMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(jLabel9)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCedula)
                            .addComponent(txtNombre)
                            .addComponent(txtApellido)
                            .addComponent(txtHBA)
                            .addComponent(txtSumaSensor)
                            .addComponent(ComboGlucometro, 0, 100, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DateEdad, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(ComboTipoDiabetes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtInyectadoras, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(txtDireccionPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(ComboTipoPaciente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ComboSexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(jLabel14)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ComboEnfermedadAso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DateDX, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                                    .addComponent(txtMasaCorporal, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(ComboDislipidemia, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ComboHTA, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEnviar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(615, 615, 615))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {ComboDislipidemia, ComboHTA, DateDX, btnActualizar, txtMasaCorporal});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {ComboTipoDiabetes, ComboTipoPaciente, DateEdad, txtDireccionPaciente, txtInyectadoras});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtAnalogo7525, txtEnalapril, txtIns7030});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(DateEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(ComboHTA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(ComboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(ComboDislipidemia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(ComboTipoDiabetes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtMasaCorporal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(txtHBA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtInyectadoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(DateDX, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(ComboGlucometro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(txtDireccionPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(ComboEnfermedadAso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(txtSumaSensor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(ComboTipoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(jLabel38)
                    .addComponent(txtEstablecimientoControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEstablecimientoMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(ComboCompliPD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboCompliN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel21)
                    .addComponent(ComboCompliCV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(ComboCompliR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(ComboCompliV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel24)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(txtInsN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel33)
                            .addComponent(txtInsR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32)
                            .addComponent(txtIns7030, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31)
                            .addComponent(jLabel26)
                            .addComponent(txtAnalogoCorta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAnalogoLarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27)
                            .addComponent(txtAnalogo7525, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(txtGlimenclamida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29)
                            .addComponent(txtMetformida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28)
                            .addComponent(txtEnalapril, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel36)
                            .addComponent(txtAmlodipina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnMostrarTodos)
                                    .addComponent(btnBuscar)
                                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {ComboDislipidemia, ComboEnfermedadAso, ComboGlucometro, ComboHTA, ComboSexo, ComboTipoDiabetes, ComboTipoPaciente, DateDX, DateEdad, txtApellido, txtCedula, txtDireccionPaciente, txtHBA, txtInyectadoras, txtMasaCorporal, txtNombre, txtSumaSensor});

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 848, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        btnCerrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jPanelPrincipal, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnCerrar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(372, 372, 372)
                        .addComponent(btnCerrar)))
                .addContainerGap(1361, Short.MAX_VALUE))
            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDesktopPane1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(954, Short.MAX_VALUE)))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(1011, Short.MAX_VALUE)
                .addComponent(btnCerrar)
                .addGap(451, 451, 451)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(527, 527, 527))
            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDesktopPane1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1022, Short.MAX_VALUE)))
        );

        jScrollPane3.setViewportView(jDesktopPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 971, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1070, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemModificarActionPerformed
        int filaPacientes = tblPacientes.getSelectedRow();
        if (filaPacientes >= 0) {
            String Cedula = tblPacientes.getValueAt(filaPacientes, 0).toString();
            txtCedula.setText(Cedula);
            txtNombre.setText(tblPacientes.getValueAt(filaPacientes, 1).toString());
            txtApellido.setText(tblPacientes.getValueAt(filaPacientes, 2).toString());
            String edad = tblPacientes.getValueAt(filaPacientes, 3).toString();
            java.text.SimpleDateFormat formatoEdad = new java.text.SimpleDateFormat("dd/MM/yyyy");
            java.util.Date fechaEdad = null;
            try {
                fechaEdad = formatoEdad.parse(edad);
            } catch (ParseException ex) {
                Logger.getLogger(InsertarPacientes.class.getName()).log(Level.SEVERE, null, ex);
            }
            DateEdad.setDate(fechaEdad);
            ComboSexo.setSelectedItem(tblPacientes.getValueAt(filaPacientes, 4).toString());
            ComboTipoDiabetes.setSelectedItem(tblPacientes.getValueAt(filaPacientes, 5).toString());
            ComboHTA.setSelectedItem(tblPacientes.getValueAt(filaPacientes, 6).toString());
            ComboDislipidemia.setSelectedItem(tblPacientes.getValueAt(filaPacientes, 7).toString());
            txtMasaCorporal.setText(tblPacientes.getValueAt(filaPacientes, 8).toString());
            txtHBA.setText(tblPacientes.getValueAt(filaPacientes, 9).toString());
            ComboGlucometro.setSelectedItem(tblPacientes.getValueAt(filaPacientes, 10).toString());
            txtSumaSensor.setText(tblPacientes.getValueAt(filaPacientes, 11).toString());
            txtInyectadoras.setText(tblPacientes.getValueAt(filaPacientes, 12).toString());
            txtDireccionPaciente.setText(tblPacientes.getValueAt(filaPacientes, 13).toString());
            ComboTipoPaciente.setSelectedItem(tblPacientes.getValueAt(filaPacientes, 14).toString());
            String fechaDX = tblPacientes.getValueAt(filaPacientes, 15).toString();
            java.text.SimpleDateFormat formatoDX = new java.text.SimpleDateFormat("dd/MM/yyyy");
            java.util.Date dx = null;
            try {
                dx = formatoDX.parse(fechaDX);
            } catch (ParseException ex) {
                Logger.getLogger(InsertarPacientes.class.getName()).log(Level.SEVERE, null, ex);
            }
            DateDX.setDate(dx);
            ComboEnfermedadAso.setSelectedItem(tblPacientes.getValueAt(filaPacientes, 16).toString());
            txtEstablecimientoControl.setText(tblPacientes.getValueAt(filaPacientes, 17).toString());
            txtEstablecimientoMunicipio.setText(tblPacientes.getValueAt(filaPacientes, 18).toString());
            
            MostrarDatosComplicaciones(Cedula);
            tblComplicaciones.selectAll();
            int filaComplicaciones = tblComplicaciones.getSelectedRow();
            if (filaComplicaciones >= 0){
                ComboCompliV.setSelectedItem(tblComplicaciones.getValueAt(filaComplicaciones, 1));
                ComboCompliR.setSelectedItem(tblComplicaciones.getValueAt(filaComplicaciones, 2));
                ComboCompliCV.setSelectedItem(tblComplicaciones.getValueAt(filaComplicaciones, 3));
                ComboCompliN.setSelectedItem(tblComplicaciones.getValueAt(filaComplicaciones, 4));
                ComboCompliPD.setSelectedItem(tblComplicaciones.getValueAt(filaComplicaciones, 5));
            }
            
            MostrarDatosMedicamentos(Cedula);
            tblMedicamentos.selectAll();
            int filaMedicamentos = tblMedicamentos.getSelectedRow();
            if (filaMedicamentos >= 0){
                txtInsN.setText(tblMedicamentos.getValueAt(filaMedicamentos, 1).toString());
                txtInsR.setText(tblMedicamentos.getValueAt(filaMedicamentos, 2).toString());
                txtIns7030.setText(tblMedicamentos.getValueAt(filaMedicamentos, 3).toString());
                txtAnalogoCorta.setText(tblMedicamentos.getValueAt(filaMedicamentos, 4).toString());
                txtAnalogoLarga.setText(tblMedicamentos.getValueAt(filaMedicamentos, 5).toString());
                txtAnalogo7525.setText(tblMedicamentos.getValueAt(filaMedicamentos, 6).toString());
                txtGlimenclamida.setText(tblMedicamentos.getValueAt(filaMedicamentos, 7).toString());
                txtMetformida.setText(tblMedicamentos.getValueAt(filaMedicamentos, 8).toString());
                txtEnalapril.setText(tblMedicamentos.getValueAt(filaMedicamentos, 9).toString());
                txtAmlodipina.setText(tblMedicamentos.getValueAt(filaMedicamentos, 10).toString());
                jTextField7.setText(tblMedicamentos.getValueAt(filaMedicamentos, 11).toString());
                jTextField10.setText(tblMedicamentos.getValueAt(filaMedicamentos, 12).toString());
            }
            
        } else {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila");
        }
    }//GEN-LAST:event_jMenuItemModificarActionPerformed

    private void jMenuItemEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEliminarActionPerformed
        int filaPacientes = tblPacientes.getSelectedRow();
        String cod = "";
        cod = tblPacientes.getValueAt(filaPacientes, 0).toString();
        try {
            PreparedStatement pst = cn.prepareStatement("DELETE FROM ComplicacionesPacientes WHERE Cedula = '"+cod+"'");
            pst.executeUpdate();
            MostrarDatosComplicaciones("");
        } catch (SQLException ex) {
            Logger.getLogger(InsertarPacientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            PreparedStatement pst = cn.prepareStatement("DELETE FROM Medicamentos WHERE Cedula = '"+cod+"'");
            pst.executeUpdate();
            MostrarDatosMedicamentos("");
        } catch (SQLException ex) {
            Logger.getLogger(InsertarPacientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            PreparedStatement pst = cn.prepareStatement("DELETE FROM Pacientes WHERE Cedula = '"+cod+"'");
            pst.executeUpdate();
            MostrarDatosPacientes("");
        } catch (SQLException ex) {
            Logger.getLogger(InsertarPacientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItemEliminarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        FrmLogin frml = new FrmLogin();
        frml.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        try {
            PreparedStatement pst = cn.prepareStatement("UPDATE Pacientes SET"
                + " cedula='"+txtCedula.getText()
                +"',nombre='"+txtNombre.getText()
                +"',apellido='"+txtApellido.getText()
                +"',edad='"+((JTextField)DateEdad.getDateEditor().getUiComponent()).getText()
                +"',sexo='"+ComboSexo.getSelectedItem()
                +"',tipo_diabetes='"+ComboTipoDiabetes.getSelectedItem()
                +"',hta='"+ComboHTA.getSelectedItem()
                +"',Dislipidemia='"+ComboDislipidemia.getSelectedItem()
                +"',masa_corporal='"+txtMasaCorporal.getText()
                +"',hba1c='"+txtHBA.getText()
                +"',glucometro='"+ComboGlucometro.getSelectedItem()
                +"',suma_sensor='"+txtSumaSensor.getText()
                +"',inyectadoras='"+txtInyectadoras.getText()
                +"',direccion_paciente='"+txtDireccionPaciente.getText()
                +"',tipo_paciente='"+ComboTipoPaciente.getSelectedItem()
                +"',fecha_dx='"+((JTextField)DateDX.getDateEditor().getUiComponent()).getText()
                +"',enfermedad_asociada'"+ComboEnfermedadAso.getSelectedItem()
                +"',establecimiento_control'"+txtEstablecimientoControl.getText()
                +"',establecimiento_municipio'"+txtEstablecimientoMunicipio.getText()
                +"' WHERE cedula='"+txtCedula.getText()+"'");
            pst.executeUpdate();
            MostrarDatosPacientes("");
        } catch (SQLException ex) {
            Logger.getLogger(InsertarPacientes.class.getName()).log(Level.SEVERE, null, ex);
        } 

        try {
            PreparedStatement pst = cn.prepareStatement("UPDATE ComplicacionesPacientes SET"
                + " cedula='"+txtCedula.getText()
                +"',V='"+ComboCompliV.getSelectedItem()
                +"',R='"+ComboCompliR.getSelectedItem()
                +"',CV='"+ComboCompliCV.getSelectedItem()
                +"',N='"+ComboCompliN.getSelectedItem()
                +"',PD='"+ComboCompliPD.getSelectedItem()
                +"' WHERE cedula='"+txtCedula.getText()+"'");
            pst.executeUpdate();
            MostrarDatosComplicaciones("");
        } catch (SQLException ex) {
            Logger.getLogger(InsertarPacientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            PreparedStatement pst = cn.prepareStatement("UPDATE Medicamentos SET"
                + " cedula='"+txtCedula.getText()
                +"',ins_n='"+txtInsN.getText()
                +"',ins_r='"+txtInsR.getText()
                +"',ins_7030='"+txtIns7030.getText()
                +"',analogo_corta='"+txtAnalogoCorta.getText()
                +"',analogo_larga='"+txtAnalogoLarga.getText()
                +"',analogo_7525='"+txtAnalogo7525.getText()
                +"',glimenclamida='"+txtGlimenclamida.getText()
                +"',metformina='"+txtMetformida.getText()
                +"',enalapril='"+txtEnalapril.getText()
                +"',amlodipina='"+txtAmlodipina.getText()
                +"',sivastatina='"+jTextField7.getText()
                +"',otros_medicamentos='"+jTextField10.getText()
                +"' WHERE cedula='"+txtCedula.getText()+"'");
            pst.executeUpdate();
            MostrarDatosMedicamentos("");
        } catch (SQLException ex) {
            Logger.getLogger(InsertarPacientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnMostrarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarTodosActionPerformed
        MostrarDatosPacientes("");
        MostrarDatosComplicaciones("");
        MostrarDatosMedicamentos("");
    }//GEN-LAST:event_btnMostrarTodosActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        MostrarDatosPacientes(txtBuscar.getText());
        MostrarDatosComplicaciones(txtBuscar.getText());
        MostrarDatosMedicamentos(txtBuscar.getText());
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void txtHBAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHBAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHBAActionPerformed

    private void txtSumaSensorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSumaSensorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSumaSensorActionPerformed

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtMasaCorporalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMasaCorporalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMasaCorporalActionPerformed

    private void txtDireccionPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionPacienteActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        try {
            PreparedStatement pst = cn.prepareStatement("INSERT INTO pacientes "
                + "(cedula, nombre, apellido, edad, sexo, tipo_diabetes, hta,"
                + "dislipidemia, masa_corporal, hba1c, glucometro,"
                + "suma_sensor, inyectadoras, direccion_paciente,"
                + "tipo_paciente, fecha_dx, enfermedad_asociada, establecimiento_control,"
                + "establecimiento_municipio)"
                + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, txtCedula.getText());
            pst.setString(2, txtNombre.getText());
            pst.setString(3, txtApellido.getText());
            pst.setString(4, ((JTextField)DateEdad.getDateEditor().getUiComponent()).getText());
            pst.setString(5, ComboSexo.getSelectedItem().toString());
            pst.setString(6, ComboTipoDiabetes.getSelectedItem().toString());
            pst.setString(7, ComboHTA.getSelectedItem().toString());
            pst.setString(8, ComboDislipidemia.getSelectedItem().toString());
            pst.setString(9, txtMasaCorporal.getText());
            pst.setString(10, txtHBA.getText());
            pst.setString(11, ComboGlucometro.getSelectedItem().toString());
            pst.setString(12, txtSumaSensor.getText());
            pst.setString(13, txtInyectadoras.getText());
            pst.setString(14, txtDireccionPaciente.getText());
            pst.setString(15, ComboTipoPaciente.getSelectedItem().toString());
            pst.setString(16, ((JTextField)DateDX.getDateEditor().getUiComponent()).getText());
            pst.setString(17, ComboEnfermedadAso.getSelectedItem().toString());
            pst.setString(18, txtEstablecimientoControl.getText());
            pst.setString(19, txtEstablecimientoMunicipio.getText());
            pst.executeUpdate();
            MostrarDatosPacientes("");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
        }

        try {
            PreparedStatement pst = cn.prepareStatement("INSERT INTO ComplicacionesPacientes "
                + "(cedula, V, R, CV, N, PD)"
                + "VALUES (?,?,?,?,?,?)");
            pst.setString(1, txtCedula.getText());
            pst.setString(2, ComboCompliV.getSelectedItem().toString());
            pst.setString(3, ComboCompliR.getSelectedItem().toString());
            pst.setString(4, ComboCompliCV.getSelectedItem().toString());
            pst.setString(5, ComboCompliN.getSelectedItem().toString());
            pst.setString(6, ComboCompliPD.getSelectedItem().toString());
            pst.executeUpdate();
            MostrarDatosComplicaciones("");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
        }
        
        try {
            PreparedStatement pst = cn.prepareStatement("INSERT INTO Medicamentos "
                + "(cedula, ins_n, ins_r, ins_7030, analogo_corta, analogo_larga,"
                + "analogo_7525,  glimenclamida, metformina, enalapril, amlodipina,"
                + "sivastatina, otros_medicamentos)"
                + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, txtCedula.getText());
            pst.setString(2, txtInsN.getText());
            pst.setString(3, txtInsR.getText());
            pst.setString(4, txtIns7030.getText());
            pst.setString(5, txtAnalogoCorta.getText());
            pst.setString(6, txtAnalogoLarga.getText());
            pst.setString(7, txtAnalogo7525.getText());
            pst.setString(8, txtGlimenclamida.getText());
            pst.setString(9, txtMetformida.getText());
            pst.setString(10, txtEnalapril.getText());
            pst.setString(11, txtAmlodipina.getText());
            pst.setString(12, jTextField7.getText());
            pst.setString(13, jTextField10.getText());
            pst.executeUpdate();
            MostrarDatosMedicamentos("");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
        }
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtCedula.setText(null);
        txtNombre.setText(null);
        txtApellido.setText(null);
        DateEdad.setDate(null);
        ComboSexo.setSelectedItem(null);
        ComboTipoDiabetes.setSelectedItem(null);
        ComboHTA.setSelectedItem(null);
        ComboDislipidemia.setSelectedItem(null);
        txtMasaCorporal.setText(null);
        txtHBA.setText(null);
        ComboGlucometro.setSelectedItem(null);
        txtSumaSensor.setText(null);
        txtInyectadoras.setText(null);
        txtDireccionPaciente.setText(null);
        ComboTipoPaciente.setSelectedItem(null);
        DateDX.setDate(null);
        ComboEnfermedadAso.setSelectedItem(null);
        txtEstablecimientoControl.setText(null);
        txtEstablecimientoMunicipio.setText(null);
        ComboCompliV.setSelectedItem(null);
        ComboCompliR.setSelectedItem(null);
        ComboCompliCV.setSelectedItem(null);
        ComboCompliN.setSelectedItem(null);
        ComboCompliPD.setSelectedItem(null);
        txtInsN.setText(null);
        txtInsR.setText(null);
        txtIns7030.setText(null);
        txtAnalogoCorta.setText(null);
        txtAnalogoLarga.setText(null);
        txtAnalogo7525.setText(null);
        txtGlimenclamida.setText(null);
        txtMetformida.setText(null);
        txtEnalapril.setText(null);
        txtAmlodipina.setText(null);
        jTextField7.setText(null);
        jTextField10.setText(null);
    }//GEN-LAST:event_btnLimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(InsertarPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertarPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertarPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertarPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertarPacientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboCompliCV;
    private javax.swing.JComboBox<String> ComboCompliN;
    private javax.swing.JComboBox<String> ComboCompliPD;
    private javax.swing.JComboBox<String> ComboCompliR;
    private javax.swing.JComboBox<String> ComboCompliV;
    private javax.swing.JComboBox<String> ComboDislipidemia;
    private javax.swing.JComboBox<String> ComboEnfermedadAso;
    private javax.swing.JComboBox<String> ComboGlucometro;
    private javax.swing.JComboBox<String> ComboHTA;
    private javax.swing.JComboBox<String> ComboSexo;
    private javax.swing.JComboBox<String> ComboTipoDiabetes;
    private javax.swing.JComboBox<String> ComboTipoPaciente;
    private com.toedter.calendar.JDateChooser DateDX;
    private com.toedter.calendar.JDateChooser DateEdad;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMostrarTodos;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItemEliminar;
    private javax.swing.JMenuItem jMenuItemModificar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTable tblComplicaciones;
    private javax.swing.JTable tblMedicamentos;
    private javax.swing.JTable tblPacientes;
    private javax.swing.JTextField txtAmlodipina;
    private javax.swing.JTextField txtAnalogo7525;
    private javax.swing.JTextField txtAnalogoCorta;
    private javax.swing.JTextField txtAnalogoLarga;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtDireccionPaciente;
    private javax.swing.JTextField txtEnalapril;
    private javax.swing.JTextField txtEstablecimientoControl;
    private javax.swing.JTextField txtEstablecimientoMunicipio;
    private javax.swing.JTextField txtGlimenclamida;
    private javax.swing.JTextField txtHBA;
    private javax.swing.JTextField txtIns7030;
    private javax.swing.JTextField txtInsN;
    private javax.swing.JTextField txtInsR;
    private javax.swing.JTextField txtInyectadoras;
    private javax.swing.JTextField txtMasaCorporal;
    private javax.swing.JTextField txtMetformida;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSumaSensor;
    // End of variables declaration//GEN-END:variables
conexion cc = new conexion();
Connection cn = cc.conectando();
}