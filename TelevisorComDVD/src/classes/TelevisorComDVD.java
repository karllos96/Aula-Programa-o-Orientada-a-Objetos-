package classes;

public class TelevisorComDVD extends Televisor {
    
    private boolean dvdLigado;
    private boolean dvdCarregado;
    private String dvdTitulo;

    public TelevisorComDVD(String marca, String modelo, int tamanhoDaTela, String cor, String resolucao) {
        super(marca, modelo, tamanhoDaTela, cor, resolucao);
        this.dvdLigado = false; 
        this.dvdCarregado = false;
        this.dvdTitulo = "";
    }
    
    public void ligarDVD() {
        if (!dvdLigado) {
            dvdLigado = true;
            System.out.println("DVD ligado.");
        } else {
            System.out.println("O DVD já está ligado.");
        }
    }

    public void desligarDVD() {
        if (dvdLigado) {
            dvdLigado = false;
            dvdCarregado = false;
            dvdTitulo = "";
            System.out.println("DVD desligado.");
        } else {
            System.out.println("O DVD já está desligado.");
        }
    }

    public void carregarDVD(String titulo) {
        if (dvdLigado) {
            dvdCarregado = true;
            dvdTitulo = titulo;
            System.out.println("DVD '" + titulo + "' carregado.");
        } else {
            System.out.println("Primeiro ligue o DVD para carregar um disco.");
        }
    }

    public void reproduzirDVD() {
        if (dvdLigado && dvdCarregado) {
            System.out.println("Reproduzindo DVD: " + dvdTitulo);
        } else if (!dvdLigado) {
            System.out.println("Ligue o DVD primeiro.");
        } else {
            System.out.println("Nenhum DVD carregado para reprodução.");
        }
    }

    public void ejetarDVD() {
        if (dvdCarregado) {
            System.out.println("Ejetando DVD: " + dvdTitulo);
            dvdCarregado = false;
            dvdTitulo = "";
        } else {
            System.out.println("Nenhum DVD para ejetar.");
        }
    }
    
    public void imprimirInfoCompleta() {
    	
        super.ImprimirInfoTV();
        System.out.println("DVD Player: " + (dvdLigado ? "Ligado" : "Desligado"));
        if (dvdCarregado) {
            System.out.println("DVD Carregado: " + dvdTitulo);
        } else {
            System.out.println("Nenhum DVD carregado.");
        }
    }
    
    public static void main(String[] args) {
 
        TelevisorComDVD tvComDVD = new TelevisorComDVD("Sony", "Bravia 55X900", 55, "Preto", "4K");
        TelevisorComDVD tvComDVD2 = new TelevisorComDVD("LG", "OLED65CX", 65, "Cinzento", "4K HDR");

        System.out.println("\n--- Exemplo 1: Exibir informações da TV sem DVD ligado ---");
        tvComDVD.imprimirInfoCompleta();
        tvComDVD2.imprimirInfoCompleta();
    }
}
