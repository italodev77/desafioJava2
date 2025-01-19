package NivelIntermediario.Desafio;

public class Uchiha extends Ninja{

    String habilidadeEspecial;

    public void MostrarHabilidade(){

        System.out.println("Habilidade Especial: " + habilidadeEspecial);
    }
    @Override
    public void MostrarInformacoes(){
        super.MostrarInformacoes();
        MostrarHabilidade();
    }
}
