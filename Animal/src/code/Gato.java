public class Gato extends Animal{

    //constructo

    public Gato(String c, String n, int e){

        super(c, n, e);

    }

    //methods

    @Override
    public String emitirSonido(){

        return "Miau!";
    }

    @Override
    public String comer(){

        return "comiendo pescado";
    }
    



}
