import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;

public class MainFrame extends JFrame {
    //Πεδία εισαγωγής για στοιχεία μαθητων
    private JTextField firstNameField, lastNameField, ageField, gradeField, searchField;
    //Πεδία εμφάνισης για στοιχεία μαθητών
    private JTextArea studentArea;
    //Λιστα μαθητών στη μνήμη
    private ArrayList<student> studentList = new ArrayList<>();
    //Όνομα αρχείου για αποθήκευση/φόρτωση
    private final String FILE_NAME = "students.dat";

    public MainFrame() {
        setTitle("Διαχείριση Μαθητών");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 600);
        setLocationRelativeTo(null);

        // Πάνελ εισαγωγής στοιχείων μαθητή
        JPanel inputPanel = new JPanel(new GridLayout(5, 2));
        inputPanel.add(new JLabel("Όνομα:"));
        firstNameField = new JTextField();
        inputPanel.add(firstNameField);

        inputPanel.add(new JLabel("Επώνυμο:"));
        lastNameField = new JTextField();
        inputPanel.add(lastNameField);

        inputPanel.add(new JLabel("Ηλικία:"));
        ageField = new JTextField();
        inputPanel.add(ageField);

        inputPanel.add(new JLabel("Βαθμός:"));
        gradeField = new JTextField();
        inputPanel.add(gradeField);

        inputPanel.add(new JLabel("Αναζήτηση (Επώνυμο):"));
        searchField = new JTextField();
        inputPanel.add(searchField);

        // Πάνελ κουμπιών
        JPanel buttonPanel = new JPanel();
        JButton addBtn = new JButton("Προσθήκη");
        JButton saveBtn = new JButton("Αποθήκευση");
        JButton loadBtn = new JButton("Φόρτωση");
        JButton searchBtn = new JButton("Αναζήτηση");
        buttonPanel.add(addBtn);
        buttonPanel.add(saveBtn);
        buttonPanel.add(loadBtn);
        buttonPanel.add(searchBtn);

        // Περιοχή εμφάνισης μαθητών (JTextArea)
        studentArea = new JTextArea();
        studentArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(studentArea);

        // Τοποθέτηση πάνελ στο παράθυρο
        setLayout(new BorderLayout());
        add(inputPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
        add(scrollPane, BorderLayout.SOUTH);

        // Ενέργειες κουμπιών
        addBtn.addActionListener(e -> addStudent());
        saveBtn.addActionListener(e -> saveStudents());
        loadBtn.addActionListener(e -> loadStudents());
        searchBtn.addActionListener(e -> searchStudent());
        //Εμφάνιση λίστας μαθητών στην αρχή (αν υπάρχει)
        refreshStudentArea();
    }
    
    //Προσθήκη μαθητή στη λίστα με έλεγχο τιμών
    private void addStudent() {
        try {
            String firstName = firstNameField.getText().trim();
            String lastName = lastNameField.getText().trim();
            int age;
            double grade;
            
            //Έλεγχος αν η ηλικία είναι ακέραιος
            try {
                age = Integer.parseInt(ageField.getText().trim());
            } catch (NumberFormatException ex) {
                throw new InvalidAgeException("Η ηλικία πρέπει να είναι ακέραιος αριθμός.");
            }
            
            //Έλεγχος αν ο βαθμός είναι αριθμός
            try {
                grade = Double.parseDouble(gradeField.getText().trim());
            } catch (NumberFormatException ex) {
                throw new InvalidGradeException("Ο βαθμός πρέπει να είναι αριθμός.");
            }

            //Έλεγχος ορίων ηλικίας
            if (age < 5 || age > 100)
                throw new InvalidAgeException("Η ηλικία πρέπει να είναι μεταξύ 5 και 100.");
            //Έλεγχος ορίων βαθμού
            if (grade < 0.0 || grade > 10.0)
                throw new InvalidGradeException("Ο βαθμός πρέπει να είναι μεταξύ 0.0 και 10.0.");

            //Δημιουργία και προσθήκη μαθητή στη λίστα
            student s = new student(firstName, lastName, age, grade);
            studentList.add(s);
            refreshStudentArea();   //Ενημέρωση περιοχής εμφάνισης
            clearFields();          //Καθαρισμός πεδίων εισαγωγής
        } catch (InvalidAgeException | InvalidGradeException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    //Αποθήκευση λίστας μαθητών σε αρχείο
    private void saveStudents() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            out.writeObject(studentList);
            JOptionPane.showMessageDialog(this, "Αποθήκευση επιτυχής!");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Σφάλμα αποθήκευσης: " + ex.getMessage());
        }
    }
    
    //Φόρτωση λίστας μαθητών από αρχείο
    private void loadStudents() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            studentList = (ArrayList<student>) in.readObject();
            refreshStudentArea();
            JOptionPane.showMessageDialog(this, "Φόρτωση επιτυχής!");
        } catch (IOException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Σφάλμα φόρτωσης: " + ex.getMessage());
        }
    }

    //Αναζήτηση μαθητή βάσει επωνύμου και εμφάνιση αποτελεσμάτων
    private void searchStudent() {
        String searchLastName = searchField.getText().trim();
        StringBuilder sb = new StringBuilder();
        for (student s : studentList) {
            if (s.getLastName().equalsIgnoreCase(searchLastName)) {
                sb.append(s.toString()).append("\n");
            }
        }
        if (sb.length() == 0) {
            studentArea.setText("Δεν βρέθηκε μαθητής με αυτό το επώνυμο.");
        } else {
            studentArea.setText(sb.toString());
        }
    }

    //Ενημέρωση της περιοχής εμφάνισης με όλους τους μαθητές
    private void refreshStudentArea() {
        StringBuilder sb = new StringBuilder();
        for (student s : studentList) {
            sb.append(s.toString()).append("\n");
        }
        studentArea.setText(sb.toString());
    }

    //Καθαρισμός πεδίων εισαγωγής
    private void clearFields() {
        firstNameField.setText("");
        lastNameField.setText("");
        ageField.setText("");
        gradeField.setText("");
    }

    //Εκκίνηση εφαρμογής
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MainFrame().setVisible(true));
    }
}