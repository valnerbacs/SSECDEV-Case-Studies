/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.User;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author esteb
 */
public class SessionManager {
    private static SessionManager instance;
    private Map<String, Object> sessionData;
    
    private SessionManager(){
        sessionData = new HashMap<>();
    }
    
    public static SessionManager getInstance(){
        if(instance == null){
            instance = new SessionManager();
        }
        return instance;
    }
    
    public void put(String key, Object value){
        sessionData.put(key, value);
    }
    
    public Object get(String key){
        return sessionData.get(key);
    }
    
    public void clear(){
        sessionData.clear();
    }
    
}
