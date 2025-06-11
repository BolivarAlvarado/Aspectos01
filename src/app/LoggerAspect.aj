package app;

public aspect LoggerAspect {
    // Pointcut para la ejecución del programa
    pointcut appExecution(): execution(public static void Main.main(String[]));
    
    // Advice para registrar inicio/fin
    before(): appExecution() {
        System.out.println("=== Aplicación iniciada ===");
    }
    
    after(): appExecution() {
        System.out.println("=== Aplicación finalizada ===");
    }
}