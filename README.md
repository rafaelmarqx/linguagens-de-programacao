# linguagens-de-programacao

O projeto desenvolvido foi um sistema de loteria chamado “LOTOFÁCIL”, em Java. O sistema deve ser capaz de gerar jogos aleatórios, permitir que os jogadores façam suas apostas, verificar os resultados e calcular prêmios de acordo com as regras da loteria. Este sistema funcionará por meio do terminal, lendo e escrevendo dados.
Regras de negócio/requisitos:
• Foi um menu para a loteria utilizando as estruturas switch case e do while. Enquanto o usuário não digitar 0, para sair, novas apostas serão permitidas.
**************************
Menu LOTOFÁCIL:
1) Apostar de 0 a 100
2) Apostar de A à Z
3) Apostar em par ou ímpar
0) Sair
**************************
As regras para a aposta de 0 a 100, são:
• Utilizando a biblioteca Scanner, será lido um número inteiro via teclado, de 0 a 100, caso o número seja maior que 100 ou menor que 0, será imprimida a seguinte mensagem: “Aposta inválida.”. A biblioteca Random será utilizada para sortear aleatoriamente um número de 0 a 100. Será Comparado o número escolhido pelo usuário apostador com o número sorteado pelo sistema. Caso o usuário acerte a aposta, será imprimida a mensagem “Você ganhou R$ 1.000,00 reais.”. Caso o usuário erre, a mensagem: “Que pena! O número sorteado foi: X.”. 

As regras para a aposta de A à Z, são:
• Utilizando o método System.in.read(), será lido um char via teclado, de A à Z, podendo ser lido como maiúsculo ou minúsculo. Caso não seja uma letra, será imprimida a mensagem: “Aposta inválida.”. Será utilizado o método Character.isLetter() para verificar se a entrada digitada é uma letra válida. Será converrtida a entrada do usuário apostador para maiúsculo, utilizando o método Character.toUpperCase(). Foi escolhida a letra com a inicial do meu nome, “R”, para ser a letra premiada. 
Será comparada a letra lida via teclado, e convertida para maiúsculo, com a letra premiada. Caso o usuário acerte a aposta, será imprimada a mensagem “Você ganhou R$ 500,00 reais.”. Caso o usuário erre, a mensagem: “Que pena! A letra sorteada foi: “X.”.

As regras para a aposta de número par ou ímpar, são:
Será utilizada a biblioteca Scanner para ler um número inteiro via teclado. Exemplo: 600. Será utilizado o operador de módulo (%) para verificar se o número é par ou ímpar, lembrando que, caso o resto da divisão do número por 2 seja 0, o número é par. O prêmio será dado caso o usuário digite um número par, e não irá premiar jogadores que digitarem um número ímpar. Se o número digitado for par, imprima a mensagem: “Você ganhou R$ 100,00 reais.”. Caso o usuário digite um número ímpar, será imprimida a mensagem: “Que pena! O número digitado é ímpar e a premiação foi para números pares.”.

Em resumo, foi utilizada a versão 19.0.2 do Oracle OpenJDK, e às bibliotecas; 
> java.io.IOException;
> java.util.Random;
> java.util.Scanner;

