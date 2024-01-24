package br.com.alura.screenmatch.desafios.testes;


import br.com.alura.screenmatch.desafios.outros.Pessoa;

public class Principal {
    public static void main(String[] args) {
        try {
            Pessoa p = null;
            System.out.println(p.getNome());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception");
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception");
        } catch (Exception e) {
            System.out.println("Exception");
        }
        // a exceção mais genérica deve sempre ser declarada por último, que é o
        // caso do catch (Exception e). Veja acima.
        // Agora este exemplo, vai compilar e na execução vai dar a exceção
        // NullPointerException

    }

}
