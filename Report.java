
//Principio de diseño SRP
//Antes

public class Report {
    private String title;
    private String content;

    public Report(String title, String content) {
        this.title = title;
        this.content = content;
    }

    // Lógica del reporte
    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    // Esta clase también imprime el reporte (violación de SRP)
    public void printReport() {
        System.out.println("Title: " + title);
        System.out.println("Content: " + content);
    }

    // También guarda el reporte en un archivo (violación de SRP)
    public void saveToFile(String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("Title: " + title + "\n");
            writer.write("Content: " + content + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
//Podemos observar que la clase Report tiene multiples responsabilidades de esta manera incumpliendo el SRP, como la impresion y guardado del reporte.


//Despues

// Clase que solo representa el reporte
public class Report {
    private String title;
    private String content;

    public Report(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}
// Clase que se encarga de imprimir reportes
public class ReportPrinter {
    public void print(Report report) {
        System.out.println("Title: " + report.getTitle());
        System.out.println("Content: " + report.getContent());
    }
}
// Clase que se encarga de guardar reportes en archivos
public class ReportSaver {
    public void saveToFile(Report report, String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("Title: " + report.getTitle() + "\n");
            writer.write("Content: " + report.getContent() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
//Ahora podemos observar que cada clase tiene una unica responsabilidad haciendo el cdigo mas limpio y manejable.



