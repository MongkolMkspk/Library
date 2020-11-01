package com.example.library2.DB;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.library2.model.User;

@Dao
public interface UserDao {
    @Query("SELECT * FROM users")
    User[] selectAllData();
    @Query("SELECT * FROM users where :id = id")
    User getDataById(int id);
    @Insert
    void insertData(User... users);

}
