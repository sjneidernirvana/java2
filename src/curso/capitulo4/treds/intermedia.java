/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package curso.capitulo4.treds;

/**
 *
 * @author T107
 */
public class intermedia implements Runnable{
    public static void main(String args[]){
    // paso1 crear el tred
    Runnable r=new intermedia();
    Thread t1=new Thread(r); //impresion
     Thread t2=new Thread(r);//conexion
      Thread t3=new Thread(r);//guardar
      //inizializacion
      t1.start();
        t2.start();
          t3.start();
          
    }

    @Override
    public void run() {
        try{
            if(Thread.currentThread().getName().equals("Thread-1"))Thread.sleep(8000);
             if(Thread.currentThread().getName().equals("Thread-2"))Thread.sleep(10000);
              if(Thread.currentThread().getName().equals("Thread-3"))Thread.sleep(12000);
            
                
//ejecutarse
        System.out.println(Thread.currentThread().getName());
        System.out.println("soy medio thred");
        } catch(Exception e){}
    }
    
}
