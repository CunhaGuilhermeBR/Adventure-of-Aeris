# Adventure-of-Aeris
Just a game for test and practice
#include <stdio.h>
#include <stdlib.h>
#include <locale.h>



int main()
{
    int classe, vida, FOR, DES, dano, escolha;
    classe=0;
    vida=0;
    FOR=0;
    DES=0;
    dano=0;
    escolha=0;

    setlocale(LC_ALL, "Portuguese");

    printf("Bem vindo a Luskan, cidade dos piratas!!\nVocê é só um jovem, seu nome é Aeris Stormwind. Esse é apenas o começo de sua jornada nesse mundo...\n");
    printf("Você vai preferir se tornar um BARDO(1) ou um GUERREIRO(2)?\n");
    scanf("%d", &classe);

    if (classe>2){
        printf("Número errado, digite 1 para Bardo e 2 para Guerreiro.\n");
         scanf("%d", &classe);
    } else if (classe<1){
        printf("Número errado, digite 1 para Bardo e 2 para Guerreiro.\n");
         scanf("%d", &classe);
    } else if (classe==1){

     printf("Você é um menestrel agora, ágil e mortal... talvez nem tanto quanto o ladino.\n\n");
     FOR=1;
     DES=4;
     vida=8;
    }
    else if (classe==2){
     printf("Você é um guerreiro agora, forte e mortal... talvez nem tanto quanto o bárbaro.\n\n");
     FOR=2;
     DES=1;
     vida=10;
    }

   printf("Você está no caminho da cidade, dois homens estão batendo em um mendigo na rua. O que vai fazer?\n 1-Ajudar o pobre homem ou 2-Ema ema ema cada um com seus problemas\n");
   scanf("%d", &escolha);
      if (escolha>2){
        printf("Número errado, digite 1 para Bardo e 2 para Guerreiro.\n");
         scanf("%d", &escolha);
    } else if (escolha<1){
        printf("Número errado, digite 1 para Bardo e 2 para Guerreiro.\n");
         scanf("%d", &escolha);
    } else if (escolha==1){

     printf("Os foras da lei não gostaram muito de você ter acabado com a diversão deles.\n");
    }
    else if (escolha==2){
     printf("Você é um guerreiro agora, forte e mortal... talvez nem tanto quanto o bárbaro.\n\n");
     FOR=2;
     DES=1;
     vida=10;
    }
    return 0;
}
