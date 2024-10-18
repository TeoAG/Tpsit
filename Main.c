/*
scrivere il programma in c che prende in input almeno due parametri numeri strettamente >0 
il programma genera tanti figli quanti indicati dal primo parametro 
sostituisce ciascun figlio con il processo somma a cui vengono passati gli stessi parametri del padre eccetto il primo e che vengono moltiplicati per l'id del figlio
*/

#include <stdlib.h>
#include <stdio.h>
#include <sys/wait.h>


void eseguiexec();


void eseguiexec(int Num, char **Vett){
	char *args[Num-1];
	for (int i=1; i<Num-1; i++){
		args[i] = Vett[i+1];			
	}
	
	for (int i=1; i<Num-1; i++){
		printf("%s\n", args[i]);
		
	}

}

int main(int argc, char	**argv){
	if (argc<=1){
		printf ("errore");
	}else{
		eseguiexec(argc, argv);
	}
	
	
	

return 0;
}
ahahahah
