package day37_interface.language;
public class Turkish implements Language{

    @Override
    public void hi(){
        System.out.println("Merhaba");
    }

    @Override
    public void bye(){
        System.out.println("Gule Gule");
    }

}
