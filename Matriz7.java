/*Leia uma matriz 10 X 10 que se refere como resposta de 10 questões de multipla
 escolha de uma turma de 10 alunos. Leia também um vetor de 10 perguntas contendo
gabarito das respostas(por exemplo, que armazena a, b, c, d ou e). O programa deve
 comparar as respostas de cada aluno com o gabaríto e aramazenar em um vetor o 
 resultado coma pontuação correspondente a cada aluno.*/





import java.util.Scanner;

public class Matriz7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       

        char[][] M1 = new char[5][5];

        char[] V1 = new char[]{'a','b','c','d','e'};

        int[] Resp = new int [5];


        M1[0] = new char[]{'a','b', 'd', 'e', 'c'};

        M1[1] = new char[]{'c','d', 'e', 'a', 'b'};

        M1[2] = new char[]{'e','b', 'c', 'e', 'c'};

        M1[3] = new char[]{'d','b', 'a', 'e', 'c'};

        M1[4] = new char[]{'a','b', 'c', 'd', 'e'};


        for (int i = 0; i < M1.length; i++) {
            for (int j = 0; j < M1[i].length; j++) {
                
                if (M1[i][j]==V1[j]) {
                    
                    Resp[i]++;
                }

            }
        }
       
        for (int i = 0; i < Resp.length; i++) {
            System.out.println("Aluno " + i + ": Pontuacao = " + Resp[i]);
        }
    }





}
