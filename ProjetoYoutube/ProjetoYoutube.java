package projetoyoutube;
/**
 *
 * @author ramon
 */
public class ProjetoYoutube {
    public static void main(String[] args) {
        Video v[] = new Video[4];
        v[0] = new Video("Aula 10 de MySQL");
        v[1] = new Video("Aula 15 de Java POO");
        v[2] = new Video("Aula 3 de WordPress");
        v[3] = new Video("Aula 20 de Python");
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto ("Júlia", 25, "F", "10", "Julinha");
        g[1] = new Gafanhoto ("Arthur", 18, "M", "8","Thur");
        
        Visualizacao vis[] = new Visualizacao[5]; //Júlia assite WordPress
        vis[0] = new Visualizacao(g[0], v[2]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());
        
        vis[1] = new Visualizacao(g[0], v[1]); //Júlia assite Java POO
        vis[1].avaliar(60.0f);
        System.out.println(vis[1].toString());
        
        vis[2] = new Visualizacao(g[0], v[0]); //Júlia assite MySQL
        vis[2].avaliar(7);
        System.out.println(vis[2].toString());
        
        vis[3] = new Visualizacao(g[1], v[3]); //Arthur assite Python
        vis[3].avaliar(90.0f);
        System.out.println(vis[3].toString());
        
        vis[4] = new Visualizacao(g[1], v[0]); //Arthur assite MySQL
        vis[4].avaliar(5);
        System.out.println(vis[4].toString());
    }
    
}
