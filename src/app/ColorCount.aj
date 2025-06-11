package app;

import java.awt.Color;

public aspect ColorCount {
    private int contador = 0;

    after(Color c): call(void app.Main.changeColor(Color)) && args(c) {
        contador++;
        System.out.println("Total de clicks/cambios: " + contador);
    }
}
