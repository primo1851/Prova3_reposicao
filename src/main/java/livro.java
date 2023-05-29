public class livro implements Comparable<livro> {
     String nome;
     String autor;
     String editora;
     Double qtdPaginas;

    @Override
    public int compareTo(livro o) {
        return qtdPaginas.compareTo(o.qtdPaginas);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public Double getQtdPaginas() {
        return qtdPaginas;
    }

    public void setQtdPaginas(Double qtdPaginas) {
        this.qtdPaginas = qtdPaginas;
    }


}
