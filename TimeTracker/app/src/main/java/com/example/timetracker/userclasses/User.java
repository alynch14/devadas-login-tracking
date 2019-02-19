package com.example.timetracker.userclasses;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;
import io.objectbox.query.QueryBuilder;

@Entity
public  class User {
    @Id
    long myId;
    private String username;
//    private QueryBuilder builder = userBox

    public User(){
        username = null;
        myId = 0L;
    }

    public User(String username, long id) {
        this.username = username;
        myId = id;
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

    protected String getUsername(){
        return username;
    }

    public void setUsername(String username){
        this.username = username;
    }
}
