package app;

import java.awt.Color;

public aspect ColorAspect {
    pointcut colorChanged(Color c): 
        call(void app.Main.changeColor(Color)) && args(c);

    after(Color c): colorChanged(c) {
        System.out.println("Color cambiado a: " + c.toString());
    }
}