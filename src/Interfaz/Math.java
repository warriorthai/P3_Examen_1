/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interfaz;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class Math {
    Scanner sc = new Scanner(System.in);
    
    
       public static boolean esNumero (String valor){
        try{
            Integer.parseInt(valor);
            return true;
        }catch(NumberFormatException e){
        return false;
        }
    }
       
      public static void CargarLista(FrmLista Formulario, ArrayList List) {
        DefaultListModel modelo = new DefaultListModel();
        for(int i=0;i<List.size();i++){
        modelo.addElement(List.get(i));
        }
        Formulario.Lista.setModel(modelo);  
    }
        
      
public static String cuantasApariciones (ArrayList List){
    
    StringBuffer sb = new StringBuffer();
    Map<Integer,Integer> Lista = new HashMap<Integer,Integer>();
    String resultado="";
    
    for(int i=0;i<List.size();i++){
        Integer num=Lista.get(List.get(i));
        if(num==null){
        Lista.put((Integer) List.get(i), 1);
        }else{
        Lista.put((Integer) List.get(i), ++num);
        }
    }
   
    Set<Entry<Integer, Integer>> entrySet = Lista.entrySet();
    for(Entry<Integer, Integer> entry : entrySet){
    if(entry.getValue()>=1){
  resultado = sb.append("Valor " +entry.getKey()+ " tiene " +entry.getValue()+ " aparicion/es.\n").toString();
    }
    }
    return resultado; 
}

public static void elimRepetidos(ArrayList List){
    
       Set<ArrayList> hashSet = new HashSet<>(List);
           List.clear();
           List.addAll(hashSet);

}
    


}
