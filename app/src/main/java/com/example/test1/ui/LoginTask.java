package com.example.test1.ui;

import android.os.AsyncTask;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class LoginTask extends AsyncTask<String, Void, String> {
    String res = "";
    @Override
    protected String doInBackground(String... params) {
        String url = "jdbc:mysql://mysql-douirimehdi.alwaysdata.net:3306/douirimehdi_mehdi";
        String user = "302381_test";
        String pass = "321654987mido";
        String login = params[0];
        String pd = params[1];
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, pass);
            System.out.println("Databaseection success");

            String result = "Database Connection Successful\n";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from Utilisateurs where login like '"+login+"'");
            ResultSetMetaData rsmd = rs.getMetaData();

            while (rs.next()) {
                result += rs.getString(1).toString()+"/"+rs.getString(2).toString() + "\n";
            }

            res = result;
        } catch (Exception e) {
            e.printStackTrace();
            res = e.toString();
        }
        return res;
    }
}
