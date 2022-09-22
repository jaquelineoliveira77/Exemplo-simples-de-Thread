/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minhathread;

/**
 *
 * @author Jaqueline Oliveira
 */
public class MinhaThread extends Thread {

    private String nome;

    public MinhaThread(String nome) {
        this.nome = nome;
        //start()
    }

    public void run() {

        System.out.println(" Executando a Thread! ");

        try {
            for (int i = 0; i < 5; i++) {

                System.out.println(nome + " Contador ");
                Thread.sleep(1000);
                //thread vai dormir po 1 segundo
                //depois volta e imprime o próximo, um contador a cada segundo
            }

        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        System.out.println(" Terminou a execução! ");

    }

}
