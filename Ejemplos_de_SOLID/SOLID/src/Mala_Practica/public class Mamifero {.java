public class Mamifero {
    public void correr(){
        System.out.println("Corriendo");
    }
    public void dormir(){
        System.out.println("Durmiendo");
    }
    public void comer(){
        System.out.println("Comiendo");
    }
    public void amamantar(){
        System.out.println("Amamantando");
    }
}

public class Perro extends Mamifero {
    public void ladrar(){
        System.out.println("Ladrando");
    }
}
piblic class Ballena extends Mamifero {
    @override
    public void correr(){
         throw new Exception("¡Los Ballenas no corren!");
        
    }
}

//////////////////////////////////////////////////////////

