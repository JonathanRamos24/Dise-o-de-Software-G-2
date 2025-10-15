public interface Mamifero_Acuatico {
    void nadar();
    
}

public interface Mamifero_Terrestre {
    void correr();
    
}

class Delfin implements Mamifero acuatico {
    @Override
    public void nadar() {
        System.out.println("El delfín está nadando.");
    }
}
class Leon implements Mamifero terrestre {
    @Override
    public void correr() {
        System.out.println("El león está corriendo.");
    }
}



