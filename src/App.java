import java.net.*;
import java.net.http.*;
import java.net.http.HttpResponse.*;
import java.util.*;
import javax.swing.JOptionPane;


public class App {

    public static void main(String[] args) throws Exception {


        //Instanciar a classe usuário
        Usuario user = new Usuario();

        String idade = "";

        // fazer uma conexão HTTP e buscar os filmes mais populares
        String url = "https://api.mocki.io/v2/549a5d8b/MostPopularMovies";
        URI endereco = URI.create(url);
        var client = HttpClient.newHttpClient();
        var request = HttpRequest.newBuilder(endereco).GET().build();
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
        String body = response.body();

        // extrair só os dados que interessam (titulo, poster, classificação)
        var parser = new JsonParse();
        List<Map<String, String>> listaDeFilmes = parser.parse(body);


        String zero = "Ø";
        String star = "*";
        
        //System.out.print("Tamanho do array: " + listaDeFilmes.size());


        user.setNome(JOptionPane.showInputDialog("Seu nome? "));
        user.setSobrenome(JOptionPane.showInputDialog("Seu sobrenome? "));
        user.setFormacao(JOptionPane.showInputDialog("Sua formação? "));
        user.setIdade(JOptionPane.showInputDialog("Sua idade? "));
        user.setNomeImersao(JOptionPane.showInputDialog("Nome da imersão?"));
        
        

        
        if(user.getNome().equals("") || user.getSobrenome().equals("") || user.getFormacao().equals("") || user.getIdade().equals("") || user.getNomeImersao().equals("")){

            JOptionPane.showMessageDialog(null, "Preencha todas as caixas de diálogo");

        }else{

        idade = user.getIdade() + " anos";
        
        System.out.println("Nome do usuário: " + user.getNome());
        System.out.println("Sobrenome do usuário: " + user.getSobrenome());
        System.out.println("Formação do usuário: " + user.getFormacao());
        System.out.println("Idade do usuário: " + idade);
        System.out.println("Nome do imersão: " + user.getNomeImersao());
        System.out.println();


        // exibir e manipular os dados 
        for (Map<String,String> filme : listaDeFilmes) {

            

            //Convertendo a String para Double
            double estrela = Double.parseDouble(filme.get("imDbRating"));
 
            if(estrela <= 0){
                estrela = 0;
            }



            if(estrela > 0 && estrela < 2){


                if(estrela < 1.5){
                    estrela = Math.floor(estrela);
                }else {
                    estrela = Math.round(estrela);
                }

                
            } 

           
            if(estrela >= 2 && estrela < 3){

                if(estrela < 2.5){
                    estrela = Math.floor(estrela);
                }else {
                    estrela = Math.round(estrela);
                }
                
            } 



            if(estrela >= 3 && estrela < 4){

                if(estrela < 3.5){
                    estrela = Math.floor(estrela);
                }else {
                    estrela = Math.round(estrela);
                }
                
            } 


            if(estrela >= 4 && estrela < 5){

                if(estrela < 4.5){
                    estrela = Math.floor(estrela);
                }else {
                    estrela = Math.round(estrela);
                }
                
            } 

            if(estrela >= 5 && estrela < 6){

                if(estrela < 5.5){
                    estrela = Math.floor(estrela);
                }else {
                    estrela = Math.round(estrela);
                }
                
            } 


            
            if(estrela >= 6 && estrela < 7){

                if(estrela < 6.5){
                    estrela = Math.floor(estrela);
                }else {
                    estrela = Math.round(estrela);
                }
                
            } 

            
            if(estrela >= 7 && estrela < 8){

                if(estrela < 7.5){
                    estrela = Math.floor(estrela);
                }else {
                    estrela = Math.round(estrela);
                }
                
            } 


            
            if(estrela >= 8 && estrela < 9){

                if(estrela < 8.5){
                    estrela = Math.floor(estrela);
                }else {
                    estrela = Math.round(estrela);
                }
                
            } 




            
            if(estrela >= 9 && estrela < 10){

                if(estrela < 9.5){
                    estrela = Math.floor(estrela);
                }else {
                    estrela = Math.round(estrela);
                }
                
            } 

            
            if(estrela >= 10){

               estrela = 10;
               
                
            } 









                if(estrela <= 0) {
                        
                    System.out.println("*************************");
                    System.out.println(filme.get("title"));
                    System.out.println(filme.get("image"));
                    System.out.print(zero + " ");
                    System.out.println(estrela);
                    System.out.println(filme.get("rank"));
                    System.out.println();
                    
                }

                    if(estrela > 0 && estrela < 2) {
                    
                    estrela = 1;
                    System.out.print("Filme: ");
                    System.out.println(filme.get("title"));
                    System.out.println(filme.get("image"));
                    System.out.print(star + " ");
                    System.out.println(estrela);
                    System.out.println(filme.get("rank"));
                    System.out.println();
                }
                
                    if(estrela >= 2 && estrela < 3) {
                    
                    System.out.print("Filme: ");
                    System.out.println(filme.get("title"));
                    System.out.println(filme.get("image"));
                    System.out.print(star + "* ");
                    System.out.println(estrela);
                    System.out.println(filme.get("rank"));
                    System.out.println();
                }

                    if(estrela >= 3 && estrela < 4) {
                  
                    System.out.print("Filme: ");
                    System.out.println(filme.get("title"));
                    System.out.println(filme.get("image"));
                    System.out.print(star + "** ");
                    System.out.println(estrela);
                    System.out.println(filme.get("rank"));
                    System.out.println();
                }
                

                    if(estrela >= 4 && estrela < 5) {
                   
                    System.out.print("Filme: ");
                    System.out.println(filme.get("title"));
                    System.out.println(filme.get("image"));
                    System.out.print(star + "*** ");
                    System.out.println(estrela);
                    System.out.println(filme.get("rank"));
                    System.out.println();
                }
              
                    if(estrela >= 5 && estrela < 6) {
                    
                    System.out.print("Filme: ");
                    System.out.println(filme.get("title"));
                    System.out.println(filme.get("image"));
                    System.out.print(star + "**** ");
                    System.out.println(estrela);
                    System.out.println(filme.get("rank"));
                    System.out.println();
                }
               

                    if(estrela >= 6 && estrela < 7) {
                
                    System.out.print("Filme: ");
                    System.out.println(filme.get("title"));
                    System.out.println(filme.get("image"));
                    System.out.print(star + "***** ");
                    System.out.println(estrela);
                    System.out.println(filme.get("rank"));
                    System.out.println();
                }


                    if(estrela >= 7 && estrela < 8) {
                    
                    System.out.println(filme.get("title"));
                    System.out.println(filme.get("image"));
                    System.out.print(star + "****** ");
                    System.out.println(estrela);
                    System.out.println(filme.get("rank"));
                    System.out.println();
                }


                   if(estrela >= 8 && estrela < 9) {
                
                    System.out.print("Filme: ");
                    System.out.println(filme.get("title"));
                    System.out.println(filme.get("image"));
                    System.out.print(star + "******* ");
                    System.out.println(estrela);
                    System.out.println(filme.get("rank"));
                    System.out.println();
                }

                
                 if(estrela >= 9 && estrela < 10) {
                  
                    System.out.println(filme.get("title"));
                    System.out.println(filme.get("image"));
                    System.out.print(star + "******** ");
                    System.out.println(estrela);
                    System.out.println(filme.get("rank"));
                    System.out.println();
                }


                 
                   if(estrela == 10) {
                    
                    System.out.print("Filme: ");
                    System.out.println(filme.get("title"));
                    System.out.println(filme.get("image"));
                    System.out.print(star + "********* ");
                    System.out.println(estrela);
                    System.out.println(filme.get("rank"));
                    System.out.println();
                }

                    

            }

                    
           
        }
    }
}

