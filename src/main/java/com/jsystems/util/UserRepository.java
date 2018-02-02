package com.jsystems.util;

import com.jsystems.models.UserMock;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    public List<UserMock> getAll(){
        List<UserMock> users =  new ArrayList<>();
        try {
            Statement statement = DatabaseConnector.getConnection().createStatement();
            String sql = "Select * from usermock";
            ResultSet resultSet = statement.executeQuery(sql);
            users = ladujDane(resultSet);
            resultSet.close();
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }

    public List<UserMock> ladujDane(ResultSet wynik){
        List<UserMock> userMocks =  new ArrayList<>();
        try{
            while (wynik.next()) {
                UserMock userMock = new UserMock();
                userMock.setId(wynik.getLong(1));
                userMock.setName(wynik.getString(2));
                userMock.setSurname(wynik.getString(3));
                userMocks.add(userMock);
            }
        } catch (Exception e){
                e.printStackTrace();
        }
        return userMocks;

    }
 }
