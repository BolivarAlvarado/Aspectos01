package app;

import javax.swing.SwingUtilities;

public aspect ClickCounterAspect {
    private int totalClicks = 0;
    private Main mainInstance;
    
    // Capturar la instancia de Main al crearse
    after() returning (Main instance): execution(Main.new(..)) {
        this.mainInstance = instance;
    }
    
    // Punto de corte para clicks en botones
    pointcut buttonClick(): execution(void app.Main$*.actionPerformed(..));
    
    after(): buttonClick() {
        totalClicks++;
        System.out.println("Click registrado. Total: " + totalClicks);
        
        if (mainInstance != null) {
            SwingUtilities.invokeLater(() -> {
                mainInstance.actualizarContador(totalClicks);
            });
        }
    }
}