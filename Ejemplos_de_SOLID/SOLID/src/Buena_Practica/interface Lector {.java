interface Lector {
    void verDatos();
}

interface Creador {
    void crearUsuario();
}

interface Editor {
    void editarUsuario();
}

interface Eliminador {
    void eliminarUsuario();
}
class Invitado implements Lector {
    @Override
    public void verDatos() {
        System.out.println("Viendo datos...");
    }
}
class Administrador implements Lector, Creador, Editor, Eliminador {
    @Override
    public void verDatos() {
        System.out.println("Viendo datos...");
    }

    @Override
    public void crearUsuario() {
        System.out.println("Creando usuario...");
    }

    @Override
    public void editarUsuario() {
        System.out.println("Editando usuario...");
    }

    @Override
    public void eliminarUsuario() {
        System.out.println("Eliminando usuario...");
    }
}
