import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by joschinc on 12/8/16.
 */
public class PrincipalDemo {
    private JFrame principalFrame;
    private JPanel principalPanel;
    private JTextField company;
    private JComboBox country;
    private JTextArea address;
    private JLabel companyLabel;
    private JLabel countryLabel;
    private JLabel addressLabel;
    private JButton btnAdditionalInformation;
    private JScrollPane addressScroll;

    public void setPrincipalFrame(String title){
        principalFrame = new JFrame(title);
        principalFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension screenSize = tk.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        principalFrame.setSize(screenWidth / 2 , screenHeight / 2 );
        principalFrame.setLocation(screenWidth / 4, screenHeight / 4);

    }

    public void startPrincipalFrame(){
        //principalFrame.pack();
        principalFrame.setVisible(true);
    }

    public void setPrincipalPanel(String description){
        principalPanel = new JPanel();
        principalPanel.setBorder(BorderFactory.createTitledBorder(description));
        principalPanel.setLayout(new MigLayout("","[][]", "grow"));
        principalFrame.add(principalPanel);
    }

    public void initComponents(){
        companyLabel = new JLabel("Company");
        countryLabel = new JLabel("Country");
        addressLabel = new JLabel("Address");

        company = new JTextField(20);
        String[] listCountry = {"Costa Rica","Colombia","Unit States","India"};
        country = new JComboBox(listCountry);
        country.setSelectedIndex(2);

        address = new JTextArea(5,20);
        addressScroll = new JScrollPane(address);
        address.setBorder(BorderFactory.createEtchedBorder());

        btnAdditionalInformation = new JButton("Additional Information");

    }

    public void addComponents(){
        principalPanel.add(companyLabel,"left, sg 1, split");
        principalPanel.add(company,"pushx, growx, wrap");

        principalPanel.add(countryLabel,"left, sg 1, split");
        principalPanel.add(country,"pushx, growx, wrap");

        principalPanel.add(addressLabel,"left, sg 1, wrap");
        principalPanel.add(addressScroll,"push, grow,wrap");

        principalPanel.add(btnAdditionalInformation,"center");

    }
    private void btnAdditionalInformationEvent(){
        btnAdditionalInformation.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                initAdditionalInformation();
            }
        });
    }
    private void initAdditionalInformation(){
        EmployeeRegister employeeRegister = new EmployeeRegister();
        employeeRegister.start();
    }

    public void start(){
        setPrincipalFrame("Register Form");
        setPrincipalPanel("Company Information");
        initComponents();
        addComponents();
        btnAdditionalInformationEvent();
        startPrincipalFrame();

    }

}
