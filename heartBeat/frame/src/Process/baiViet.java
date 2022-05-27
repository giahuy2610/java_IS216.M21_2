/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Process;

import ConnectDB.OracleConnUtils;
import Views.global.user;
import java.sql.*;

/**
 *
 * @author giahu
 */
public class baiViet {
    public static void themBaiViet(String postTitle, String postContent, String postCategoryId, String postPurposeId) throws SQLException, ClassNotFoundException {
        Connection conn = OracleConnUtils.getOracleConnection();
        String firstName = "Trịnh Gia";
        String query = "{call P_INSERT_POST(?,?,?,?,?)}";
        System.out.println(user.getCurrentUserId());
        CallableStatement caSt = conn.prepareCall(query);
        caSt.setString(1, user.getCurrentUserId());
        caSt.setString(2, postTitle);
        caSt.setString(3, postContent);
        caSt.setString(4, postCategoryId);
        caSt.setString(5, postPurposeId);
        caSt.execute();       
    }

}