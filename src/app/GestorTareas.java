package app;
import java.util.ArrayList;
/**
 * Clase que gestiona todas las operaciones sobre las tareas.
 */
public class GestorTareas {
    // Lista donde guardamos todas las tareas
    private ArrayList<Tarea> tareas;
    /**
     * Constructor: inicializa la lista vacía.
     */
    public GestorTareas() {
        this.tareas = new ArrayList<>();
    }
    // ============================================
    // MÉTODO PARA MIEMBRO 1: Agregar tarea
    // ============================================
    /**
     * Agrega una nueva tarea a la lista.
     */
    public void agregarTarea(Tarea tarea) {
        // TODO: Implementar por Miembro 1
        System.out.println("⚠️ Método agregarTarea() pendiente de implementación");
    }
    // ============================================
    // MÉTODO PARA MIEMBRO 2: Listar tareas
    // ============================================
    /**
     * Muestra todas las tareas en pantalla.
     */
    public void listarTareas() {
        // Verificar si hay tareas
        if (tareas.isEmpty()) {
            System.out.println("\n📭 No hay tareas registradas");
            return;
        }

        // Mostrar encabezado
        System.out.println("\n📋 LISTA DE TAREAS");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");

                // Recorrer y mostrar cada tarea con su índice
        for (int i = 0; i < tareas.size(); i++) {
            System.out.println("[" + i + "] " + tareas.get(i).toString());
        }

        // Mostrar pie
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━ ");
                System.out.println("Total: " + tareas.size() + " tarea(s)");
    }
    // ============================================
    // MÉTODO PARA MIEMBRO 3: Marcar completada
    // ============================================
    /**
     * Marca una tarea como completada usando su índice.
     */
    public void marcarCompletada(int indice) {
        // TODO: Implementar por Miembro 3
        System.out.println("⚠️ Método marcarCompletada() pendiente de implementación");
    }
    // ============================================
    // MÉTODOS PARA MIEMBRO 4: Eliminar y persistencia
    // ============================================
    /**
     * Elimina una tarea de la lista usando su índice.
     */
    public void eliminarTarea(int indice) {
        // TODO: Implementar por Miembro 4
        System.out.println("⚠️ Método eliminarTarea() pendiente de implementación");
    }
    /**
     * Carga las tareas desde el archivo tareas.txt.
     */
    public void cargarDesdeArchivo() {
        // TODO: Implementar por Miembro 4
        System.out.println("📂 Intentando cargar tareas desde archivo...");
    }
    /**
     * Guarda las tareas en el archivo tareas.txt.
     */
    public void guardarEnArchivo() {
        // TODO: Implementar por Miembro 4
        System.out.println("💾 Intentando guardar tareas en archivo...");
    }
    // Método auxiliar para obtener la lista (útil para validaciones)
    public ArrayList<Tarea> getTareas() {
        return tareas;
    }
}

