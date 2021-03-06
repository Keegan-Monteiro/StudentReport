package studentreport;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Paint;
import javax.swing.JFileChooser;
import java.io.File;  
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Map;
import javax.swing.DefaultComboBoxModel;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.annotations.CategoryTextAnnotation;
import org.jfree.chart.axis.CategoryAnchor;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.labels.ItemLabelAnchor;
import org.jfree.chart.labels.ItemLabelPosition;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.ValueMarker;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.chart.renderer.category.BarRenderer3D;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.Layer;
import org.jfree.ui.TextAnchor;
import org.json.simple.parser.ParseException;


public class StudentReportUI extends javax.swing.JFrame {
    private final DefaultComboBoxModel modelStudents = new DefaultComboBoxModel();
    private final DefaultComboBoxModel modelSubjects = new DefaultComboBoxModel();
    private final Map<String, Student> StudentList = new HashMap<String, Student>();
    private final Map<String, Test> Tests = new HashMap<String, Test>();
    //private List<Test> Tests = new ArrayList<Test>();
    
    public StudentReportUI() {
        initComponents();
        buttonGroup1.add(radioSubject);
        buttonGroup1.add(radioStudent);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btnLoadReport = new javax.swing.JButton();
        jCB = new javax.swing.JComboBox<>();
        radioSubject = new javax.swing.JRadioButton();
        radioStudent = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Options"));

        btnLoadReport.setText("Load Report");
        btnLoadReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadReportActionPerformed(evt);
            }
        });

        jCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Load report to get data" }));
        jCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBActionPerformed(evt);
            }
        });

        radioSubject.setSelected(true);
        radioSubject.setText("Subject");
        radioSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioSubjectActionPerformed(evt);
            }
        });

        radioStudent.setText("Student");
        radioStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioStudentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnLoadReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCB, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(radioSubject)
                        .addGap(18, 18, 18)
                        .addComponent(radioStudent)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnLoadReport, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioSubject)
                    .addComponent(radioStudent))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 678, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 429, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private PieDataset createPieDataset( ) 
    {
        DefaultPieDataset dataset = new DefaultPieDataset( );
        String ChartData = jCB.getSelectedItem().toString();

        for (Map.Entry<String, Integer> entry : StudentList.get(ChartData).getGradeCount().entrySet()) {
            String Key = entry.getKey();
            Integer Value = entry.getValue();
            dataset.setValue(Key, new Double( Value ) );
        }
        
        return dataset;         
    }
    
    private JFreeChart createPieChart( PieDataset dataset )
    {
        JFreeChart chart = ChartFactory.createPieChart(      
            jCB.getSelectedItem().toString(),  // chart title 
            dataset,        // data    
            true,           // include legend   
            true, 
            true);

        return chart;
    }
    
    private CategoryDataset createBarDataset()
    {
        DefaultCategoryDataset Dataset = new DefaultCategoryDataset();
        String ChartData = jCB.getSelectedItem().toString();
        
        for (Map.Entry<Student, Score> Tentry : Tests.get(ChartData).getStudents().entrySet())
        {
            Student Key = Tentry.getKey();
            Score Value = Tentry.getValue();
            int gScore = Value.getScore();
            float score = gScore/100.0f;
            Dataset.addValue(score, "Series 1", Key.getStudent());
        }
        
        return Dataset;
    }

    private JFreeChart createBarChart(CategoryDataset Dataset)
    {
        JFreeChart Chart = ChartFactory.createBarChart3D(jCB.getSelectedItem().toString(), "Students", "Grade", Dataset, PlotOrientation.VERTICAL, false, true, false);
        CategoryPlot Plot = (CategoryPlot)Chart.getPlot();
        CustomBarRenderer3D BarRenderer3D = new CustomBarRenderer3D();
        BarRenderer3D.setBaseItemLabelGenerator(new StandardCategoryItemLabelGenerator());
        BarRenderer3D.setBaseItemLabelsVisible(true);
        BarRenderer3D.setItemLabelAnchorOffset(10.0D);
        BarRenderer3D.setBasePositiveItemLabelPosition(new ItemLabelPosition(ItemLabelAnchor.OUTSIDE12, TextAnchor.BASELINE_LEFT));
        Plot.setRenderer(BarRenderer3D);
        ValueMarker ValueMarker = new ValueMarker(0.4D, new Color(200, 200, 255), new BasicStroke(1.0F), new Color(200, 200, 255), new BasicStroke(1.0F), 1.0F);
        Plot.addRangeMarker(ValueMarker, Layer.BACKGROUND);
        BarRenderer3D.setBaseItemLabelsVisible(true);
        BarRenderer3D.setMaximumBarWidth(0.05D);
        CategoryTextAnnotation TextAnnotation = new CategoryTextAnnotation("Minimum grade to pass", Dataset.getColumnKey(0), 0.41D);
        TextAnnotation.setCategoryAnchor(CategoryAnchor.START);
        TextAnnotation.setFont(new Font("SansSerif", 0, 12));
        TextAnnotation.setTextAnchor(TextAnchor.BOTTOM_LEFT);
        Plot.addAnnotation(TextAnnotation);
        NumberAxis localNumberAxis = (NumberAxis)Plot.getRangeAxis();
        localNumberAxis.setNumberFormatOverride(NumberFormat.getPercentInstance());
        localNumberAxis.setUpperMargin(0.1D);
        ChartUtilities.applyCurrentTheme(Chart);
        return Chart;
    }
    
    static class CustomBarRenderer3D extends BarRenderer3D
    {
        public Paint getItemPaint(int paramInt1, int paramInt2)
        {
            CategoryDataset localCategoryDataset = getPlot().getDataset();
            double d = localCategoryDataset.getValue(paramInt1, paramInt2).doubleValue();
            if (d >= 0.4D)
                return Color.green;
            return Color.red;
        }
    }
    
    private JPanel createDemoPanel( )
    {
        JFreeChart chart = null;
        
        if (radioStudent.isSelected())
            chart = createPieChart(createPieDataset() );  
        else if (radioSubject.isSelected())
            chart = createBarChart(createBarDataset() );  
        
        ChartPanel cp = new ChartPanel(chart);
        return cp; 
    }
    
    private void btnLoadReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadReportActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        fileChooser.setFileFilter(new FileNameExtensionFilter("json","json"));
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION)
        {
            File selectedFile = fileChooser.getSelectedFile();
            System.out.println("Selected file: " + selectedFile.getAbsolutePath());
            
            JSONParser parser = new JSONParser();
            try {
                Object obj = parser.parse(new FileReader(selectedFile));
                JSONObject jsonTests = (JSONObject)obj;
                JSONArray JTests = (JSONArray) jsonTests.get("Tests");
                for (int i = 0 ; i < JTests.size(); i++) {
                    JSONObject Test = (JSONObject)JTests.get(i);
                    String Subject = (String)Test.get("Subject");
                    modelSubjects.addElement(Subject);
                    Tests.put(Subject, new Test(Subject));
                    
                    JSONArray Students = (JSONArray)Test.get("Student");
                    for (int p = 0; p < Students.size(); p++)
                    {
                        JSONObject Student = (JSONObject)Students.get(p);
                        String studentName = (String)Student.get("Name");
                        int studentScore = Integer.parseInt(Student.get("Score").toString());
                        if (!StudentList.containsKey(studentName))
                        {
                            StudentList.put(studentName, new Student (studentName));
                            modelStudents.addElement(studentName);
                        }
                        
                        StudentList.get(studentName).setSubjectGrade(Subject, studentScore);
                        Tests.get(Subject).setStudentGrade(StudentList.get(studentName), studentScore);
                    }
                }
                
                if (radioSubject.isSelected())
                    jCB.setModel(modelSubjects);
                else
                    jCB.setModel(modelStudents);
                
            } catch (IOException | ParseException | NumberFormatException e) {
                System.out.println(e.toString());
            }
            
//            System.out.println("StudentList Size = " + StudentList.size());
//            System.out.println("Tests Size = " + Tests.size());
//            System.out.println("Printing Subject Test Results");
//            for (Map.Entry<String, Test> Tentry : Tests.entrySet())
//            {
//                String Key = Tentry.getKey();
//                Test Value = Tentry.getValue();
//                System.out.println(Value.getSubject() + ":");
//                for (Map.Entry<Student, Score> entry2 : Value.getStudents().entrySet()) {
//                    Student Key2 = entry2.getKey();
//                    Score Value2 = entry2.getValue();
//                    System.out.println(Key2.getStudent() + " has got: " + Value2.getScore());
//                }
//            }
//            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//            System.out.println("Printing Student Test Results");
//            for (Map.Entry<String, Student> entry : StudentList.entrySet()) {
//                String Key = entry.getKey();
//                Student Value = entry.getValue();
//                System.out.println("Student: " + Value.getStudent());
//                for (Map.Entry<Subject, Score> entry2 : Value.getGrades().entrySet()) {
//                    Subject Key2 = entry2.getKey();
//                    Score Value2 = entry2.getValue();
//                    System.out.println(Value2.ScoreToGrade() + " in " + Key2);
//                }
//                for (Map.Entry<String, Integer> entry2 : Value.getGradeCount().entrySet()) {
//                    String Key2 = entry2.getKey();
//                    Integer Value2 = entry2.getValue();
//                    System.out.println(Key2 + ": " + Value2);
//                }
//            }
            
        }
    }//GEN-LAST:event_btnLoadReportActionPerformed

    private void jCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBActionPerformed
        jPanel2.removeAll();
        jPanel2.setLayout(new FlowLayout(FlowLayout.LEFT));
        jPanel2.add(createDemoPanel());
        jPanel2.updateUI();
    }//GEN-LAST:event_jCBActionPerformed

    private void radioSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioSubjectActionPerformed
        jCB.setModel(modelSubjects);
    }//GEN-LAST:event_radioSubjectActionPerformed

    private void radioStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioStudentActionPerformed
        jCB.setModel(modelStudents);
    }//GEN-LAST:event_radioStudentActionPerformed

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
            java.util.logging.Logger.getLogger(StudentReportUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentReportUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentReportUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentReportUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentReportUI().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoadReport;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> jCB;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton radioStudent;
    private javax.swing.JRadioButton radioSubject;
    // End of variables declaration//GEN-END:variables
}
