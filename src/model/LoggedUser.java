/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Laky
 */
public class LoggedUser {
    private static String userEmail;
    private static String userFirstName;
    private static String userMobile;
    private static String userType;

    public static String getUserEmail() {
        return userEmail;
    }

    public static void setUserEmail(String aUserEmail) {
        userEmail = aUserEmail;
    }

    public static String getUserFirstName() {
        return userFirstName;
    }

    public static void setUserFirstName(String aUserFirstName) {
        userFirstName = aUserFirstName;
    }


    public static String getUserMobile() {
        return userMobile;
    }

    public static void setUserMobile(String aUserMobile) {
        userMobile = aUserMobile;
    }

    public static String getUserType() {
        return userType;
    }

    public static void setUserType(String aUserType) {
        userType = aUserType;
    }
    
    
    
}
