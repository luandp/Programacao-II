/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstratas;

/**
 *
 * @author Luan Paulo
 */
public class ControleRemotoArCondicionado implements ControleRemoto {
    
    private int temperatura;
    
    public ControleRemotoArCondicionado(){
       this.temperatura = 25;
    }
    @Override
    public void aumentar(){
        if(this.temperatura>26){
        System.out.println(this.temperatura+"º");        
        }else{
        this.temperatura = this.temperatura++;
        System.out.println(this.temperatura+"º");
        }
    }
    @Override
    public void diminuir(){
        if(this.temperatura<19){
        System.out.println(this.temperatura+"º");                    
        }else{
        this.temperatura = this.temperatura--;
        System.out.println(this.temperatura+"º");   
            
        }
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }
    
    
    
    
}
