# Java-POO

POO (Programação orientada a objetos)

# Objetivo

Aproximar o mundo digital do mundo real

# Como era?

1° Programação de baixo nível. (Maís físico com instruções)

2° Programação linear (Primeiras linguagens de alto nível)

3° Programação Estruturada (Surge os primeiros sistemas mais complexos)

4° Programação Modular (Valorizava dados e funcionalidades e era alocado em pequenas capsulas protegidas que poderiam compor sistemas maiores)

5° Programação POO 

# 6 principais vantagens da POO

COMERNada

-Confiável (Insolamento entre as partes gera software seguro. Ao alterar uma parte, nenhuma outra é afetada)

-Oportuno (Ao dividir tudo em partes, várias delas podem ser desenvolvidas em paralelo)

-Manutenível (Atualizar um software é mais fácil. Uma pequena modificação vai beneficiar todas as partes que usarem o objeto)

-Extensível (O software não é estático. Ele deve crescer e permanecer útil)

-Reutilizável (Podemos usar objetos de um sistema que criamos em outro sistema futuro)

-Natural (Mais fácil de entender. Você se preocupa mais na funcionalidade do que os detalhes de implementação)

### O que foi aplicado no projeto

1. Conceito de encapsulamento, manter a visibilidade e getters and setters.
2. Conceito de Herança no momento em que implementamos pessoa, usuario e video
3. Conceito de polimorfismo no momento que implementamos com toString o retorno do usuário com a Herança de pessoa.

### Getter and Setters

Getters = Retorna o valor da função 
  ```
    get cpf () {
        return this.data.cpf
    }
  ```

Setters = Atribuí um valor 
  ```
    set cpf (value) {
          this.data[ 'cpf' ] = value
    }
  ```
  
### Herança

Utilizar "extends", dessa forma conseguimos herdas os valores.
```
public class Usuario extends Pessoa
```

### Implements

Utilizado quando uma classe implementa uma interface

```
 public class Video implements AcoesVideo
```

### Polimorfismo

Utilizamos to.String() para herdar os dados de Pessoa com modificações. Essa é a diferença do Polimorfismo, pois permite herdarmos dados e modificar o resultado final!

### POO

#### Utilizando objeto

Objeto é a classe utilizado para definir um conjunto de métodos e atributos. Exemplo: 

```
public class notebook {
}
```

#### Utilizado atributos

Atributos são caracteristicas, exemplo: um nootebook possuí teclado, monitor, processador, touch, etc... Então podemos criar uma classe notebook com esses atributos...

```
  public class notebook {
     public String teclado;
     public String monitor;
     public String processador;
     public String touch;
  }
```
