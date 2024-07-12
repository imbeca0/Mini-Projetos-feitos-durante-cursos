/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nutriClasses;

import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author rebec
 */
public class ListaConsultas {
    private static final List<consultas> lista = new ArrayList<>();
    
    public static List<consultas> Listar(){
        
        return lista;
        
    }
    public static void Adicionar(consultas consultas){
        lista.add(consultas);
        
    }
    
}
