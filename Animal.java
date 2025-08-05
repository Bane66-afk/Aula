public class Animal { 
    // Atributos da classe
    String nomeAnimal;
    int numeroDePatas;
    boolean temRabo;
    String cor;
    int idade;
    double peso;
    String tipoAlimentacao;
    char genero;
    
    //Método para imprimir os atributos do animal
    public void printStatus(){
        System.out.println("Nome: " + nomeAnimal);
        System.out.println("Número de patas: " +numeroDePatas);
        System.out.println("Tem rabo? " +temRabo);
        System.out.println("Cor: " + cor);
        System.out.println("Idade: " + idade);
        System.out.println("Tipo de alimentação: " + tipoAlimentacao);
        System.out.println("Genero: " + genero);
        System.out.println("------------------------------------------------");
    }
    
    //Método principal main
    public static void main(String[] args){
        //Criando o primeiro animal
        Animal Lobo = new Animal();
        Lobo.nomeAnimal = "Sif";
        Lobo.numeroDePatas = 4;
        Lobo.temRabo = true;
        Lobo.cor = "Cinzento";
        Lobo.idade = 4;
        Lobo.tipoAlimentacao = "Carnivoro";
        Lobo.genero = 'M';
        //Chamando os métodos para imprimir os atributos
        Lobo.printStatus();
    
        //Criando o segundo animal
        Animal Cachorro = new Animal();
        Cachorro.nomeAnimal = "Bolt";
        Cachorro.numeroDePatas = 4;
        Cachorro.temRabo = true;
        Cachorro.cor = "Branco";
        Cachorro.idade = 2;
        Cachorro.tipoAlimentacao = "Herbivoro";
        Cachorro.genero = 'M';
        //Chamando os métodos para imprimir os atributos
        Cachorro.printStatus();
    
    }
    
}


