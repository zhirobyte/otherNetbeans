/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectakhir;

/**
 *
 * @author zhirobyte
 */
  public class NodeUser {
        final String user;
        final String gender;
        final int usia;
        
        NodeUser prev;
        NodeUser next;
        
        
        private NodeUser (String new_user, int new_usia, String new_gender){
            this.user = new_user;
            this.usia = new_usia;
            this.gender = new_gender;
        }
    }

