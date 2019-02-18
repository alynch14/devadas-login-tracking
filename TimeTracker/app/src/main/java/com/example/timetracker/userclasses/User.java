package com.example.timetracker.userclasses;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;
import io.objectbox.query.QueryBuilder;

@Entity
public  class User {
    @Id
    private String username;
//    private QueryBuilder builder = userBox

    public User(){
        username = null;
    }

    public User(String username) {
        this.username = username;
    }

    /**
     * 
     * @return
     */
    public boolean checkUser() {
        if(username == null){
            return false;
        } else{
            return true;
        }
    }
}
