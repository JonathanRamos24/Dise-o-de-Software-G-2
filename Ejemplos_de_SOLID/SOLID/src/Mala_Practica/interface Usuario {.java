interface Usuario {
    void verDatos();
    void crearUsuario();
    void editarUsuario();
    void eliminarUsuario();
}

class Invitado implements Usuario {
    @Override
    public void verDatos() {
        System.out.println("Viendo datos...");
    }

    @Override
    public void crearUsuario() {
        throw new UnsupportedOperationException("No permitido");
    }

    @Override
    public void editarUsuario() {
        throw new UnsupportedOperationException("No permitido");
    }

    @Override
    public void eliminarUsuario() {
        throw new UnsupportedOperationException("No permitido");
    }
}

