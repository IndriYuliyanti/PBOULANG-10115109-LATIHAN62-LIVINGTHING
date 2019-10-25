/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang.pkg10115109.lat62.livingthing;

/**
 *
 * @author nama : indri yuliyanti
 *          nim : 10115109
 *          kls : pbo ulang 
 *      tugas pert 6 living thing
 */
public class Livingthing implements  Breath, Eat , Walk{
    private final String nama;
    
    public Livingthing(String nama){
        this.nama = nama;
       
    }

    @Override
    public void bernafas() {
        System.out.println(nama+" sedang bernafas");
    }

    @Override
    public void makan() {
        System.out.println(nama+" sedang makan");
    }

    @Override
    public void berjalan() {
        System.out.println(nama+" sedang berjalan");
    }
    
        
    }
    
    

