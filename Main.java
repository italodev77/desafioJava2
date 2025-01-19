package NivelIntermediario.Desafio;

public class Main {
    public static void main(String[] args) {
        Uchiha Sasuke = new Uchiha();
        Sasuke.idade = 18;
        Sasuke.nome = "Sasuke";
        Sasuke.missao = "Resgatar aldeões";
        Sasuke.nivelDificuldade = "SS";
        Sasuke.statusMissao = "Não concluída";
        Sasuke.habilidadeEspecial = "Chidori";

        Sasuke.MostrarInformacoes();
    }
}
