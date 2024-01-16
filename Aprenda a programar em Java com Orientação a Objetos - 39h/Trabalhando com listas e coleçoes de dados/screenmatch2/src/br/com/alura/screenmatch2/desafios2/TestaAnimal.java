package br.com.alura.screenmatch2.desafios2;

/*
Polimorfismo é a capacidade de um objeto assumir diferentes formas, dependendo do
 contexto. No exemplo, temos duas classes: Animal e Cachorro.
 A classe Cachorro é uma subclasse da classe Animal, ou seja, ela herda todos os
 atributos e métodos da classe Animal, mas também pode ter seus próprios atributos
 e métodos específicos.
 */
public class TestaAnimal {
    public static void main(String[] args) {
        //Declarando uma variável do tipo Animal chamada animal
        // e atribuindo a ela um objeto do tipo Cachorro, usando o operador new
        /*
        Essa linha cria um objeto do tipo Cachorro, mas o atribui a uma variável do
        tipo Animal. Isso é possível porque um Cachorro é um Animal, mas o contrário
        não é verdadeiro. Essa é uma forma de polimorfismo chamada de upcasting,
        que consiste em converter um objeto de uma subclasse para uma superclasse.
        No entanto, ao fazer o upcasting, perdemos o acesso aos atributos e métodos
        específicos da subclasse. Por exemplo, se a classe Cachorro tiver um método late,
        não podemos chamá-lo a partir da variável animal, pois ela é do tipo Animal.
        Para resolver isso, podemos fazer o inverso do upcasting, que é o downcasting,
        que consiste em converter um objeto de uma superclasse para uma subclasse.
         */
        Animal animal = new Cachorro();

        //Usando uma estrutura de decisão if-else para verificar se o objeto animal
        // é uma instância da classe Cachorro, usando o operador instanceof
        /*
        Essa estrutura verifica se o objeto animal é uma instância
        da classe Cachorro, usando o operador instanceof. Se for verdadeiro,
        faz o downcasting do objeto animal para a classe Cachorro, usando parênteses.
        Assim, podemos atribuir o resultado a uma variável do tipo Cachorro,
        chamada cachorro, e acessar seus atributos e métodos específicos.
        Se for falso, imprime uma mensagem no console, dizendo que o objeto não é
        um Cachorro.
        Essa é uma forma de polimorfismo chamada de polimorfismo de tempo de
        execução, que permite que o comportamento de um objeto seja determinado
        em tempo de execução, de acordo com o tipo real do objeto. Nesse caso,
        o objeto animal pode se comportar como um Animal ou como um Cachorro,
        dependendo da verificação do instanceof.
         */
        if (animal instanceof Cachorro) {
            //Se o objeto animal for uma instância da classe Cachorro,
            // fazendo um cast explícito de Animal para Cachorro e atribuindo
            // o resultado a uma variável do tipo Cachorro chamada cachorro,
            // usando parênteses
            Cachorro cachorro = (Cachorro) animal;
            System.out.println("caiu no if");
            // Agora você pode usar o objeto 'cachorro' como um Cachorro.
        } else {
            System.out.println("O objeto não é um Cachorro.");
            System.out.println("caiu no else");
        }

    }
}
