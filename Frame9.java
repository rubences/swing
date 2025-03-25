class Frame9 extends JFrame implements ActionListener {
    private JPanel panel = new JPanel(); private JButton azul;
    public Frame9() { 
        setTitle("Hola!!!"); 
        setSize(500, 400);
        addWindowListener(new manejador9()); 
        Container contentpane = getContentPane(); 
        panel.setLayout(new BorderLayout());
        azul = new JButton("Azul"); 
        azul.addActionListener(this); 
        Dimension tamano = new Dimension(); 
        tamano.height = 40;
        tamano.width = 100; azul.setPreferredSize(tamano); 
        panel.add(azul, BorderLayout.SOUTH);
        contentpane.add(panel); panel.setBackground(Color.red);
    }
    @Override
    public void actionPerformed(ActionEvent e) { panel.setBackground(Color.blue);
    }
    }