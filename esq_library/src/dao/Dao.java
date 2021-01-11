/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;



import java.util.List;

/**
 *
 * @author faiz hanafi
 */
public interface Dao<T> {
     
    List<T> getAll();
      
    void save(T t);
     
    void update(T t);
     
    void delete(T t);
   
}
