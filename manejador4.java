import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;   

class manejador4 implements WindowListener { 
    
    @Override
    public void windowClosing(WindowEvent e) { 
        System.out.println("Terminando la aplicación"); System.exit(0);
    }
    @Override
    public void windowOpened(WindowEvent e) { 
        System.out.println("Abriendo la ventana");
    }
    @Override
    public void windowClosed(WindowEvent e) { 
        System.out.println("Cerrando la ventana a través dedispose");
    }
    @Override
    public void windowActivated(WindowEvent e) { 
        System.out.println("Ventana activada");
    }
    @Override
    public void windowDeactivated(WindowEvent e) { 
        System.out.println("Ventana desactivada");
    }
    @Override
    public void windowIconified(WindowEvent e) { 
        System.out.println("Ventana hecha un icono");
    }
    @Override
    public void windowDeiconified(WindowEvent e) { 
        System.out.println("Ventana maximizada");
    }
}
