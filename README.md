# Lógica de programação em Java

Registro da minha evolução no estudo de lógica de programação com Java. O repositório reúne soluções produzidas durante a aprendizagem, incluindo abordagens simples e exercícios que ainda poderão ser refatorados conforme meu conhecimento avançar.

## Objetivo

Praticar resolução de problemas, transformar enunciados em etapas lógicas e melhorar gradualmente a organização, a legibilidade e a validação dos programas.

## Progresso atual

- Exercícios desenvolvidos: até o Exercício 50
- Linguagem: Java
- Ambiente utilizado: IntelliJ IDEA
- Status: em andamento

## Conceitos praticados

- Entrada e saída com `Scanner`
- Variáveis e tipos primitivos
- Operadores aritméticos, relacionais e lógicos
- Estruturas condicionais
- Estruturas de repetição
- Métodos
- Arrays
- Conversão e validação de dados
- Uso de constantes
- Organização de responsabilidades em métodos menores
- Tratamento de entradas inválidas

## Estrutura

~~~text
src/
└── exercicios/
    ├── Exercicio01.java
    ├── Exercicio02.java
    └── ...
~~~

Cada classe corresponde a um exercício. O enunciado normalmente está registrado como comentário no próprio arquivo.

## Como executar

Com o JDK instalado, compile um exercício a partir da raiz do repositório:

~~~bash
javac -d out src/exercicios/Exercicio37.java
java -cp out exercicios.Exercicio37
~~~

Também é possível abrir o projeto no IntelliJ IDEA e executar o método `main` da classe desejada.

## Aprendizados registrados

Durante os exercícios, venho trabalhando principalmente na correção de:

- Retornos executados antes da conclusão de um laço
- Diferenças entre `break`, `continue` e `return`
- Validação de números antes da leitura com `Scanner`
- Escolha correta entre `int` e `double`
- Separação da leitura, validação e regra de negócio
- Nomes de métodos e variáveis mais claros
- Redução de código repetido
- Organização de condições booleanas

## Observação sobre as soluções

Este repositório preserva meu processo de aprendizagem. Algumas soluções foram feitas da maneira mais simples para consolidar o conceito do exercício. Outras já utilizam métodos e validações adicionais.

Nem todos os arquivos representam uma versão final ou a solução mais otimizada. Eles poderão ser refatorados futuramente sem apagar o histórico da evolução.

## Próximos passos

- Concluir a lista de exercícios
- Revisar soluções com problemas recorrentes
- Praticar Collections
- Adicionar testes aos exercícios mais relevantes
- Aplicar os fundamentos em projetos Java maiores
