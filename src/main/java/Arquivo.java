import java.io.*;
import java.util.ArrayList;

public class Arquivo {

    public void escrever(livro livro){

        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;
        String linhaEscrever;

        try{

            os = new FileOutputStream("Arquivo.txt", true);
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);

            bw.write("Livros");
            bw.newLine();
            bw.write(livro.nome + "\n");
            bw.write(livro.autor + "\n");
            bw.write(livro.editora + "\n");
            bw.write(livro.qtdPaginas + "\n");
        }catch(Exception e){

            System.out.println(e);

        }finally {

            try {
                bw.close();
            }catch (Exception e){
                System.out.println(e);
            }

        }

    }

    public ArrayList<livro> ler(){

        ArrayList<livro> livros = new ArrayList<>();

        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        String linhaLer;

        try{

            is = new FileInputStream("Arquivo.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            linhaLer = br.readLine();
            while(linhaLer != null){
                if(linhaLer.contains("Livros")){
                    livro li = new livro();
                    li.nome = br.readLine();
                    li.autor = br.readLine();
                    li.editora = br.readLine();
                    li.qtdPaginas = Double.valueOf(br.readLine());
                    livros.add(li);
                }
                linhaLer = br.readLine();
            }

        }catch (Exception e){
            System.out.println(e);
        }finally {
            try{
                br.close();
            }catch (Exception e){
                System.out.println(e);
            }
        }


        return livros;
    }

}