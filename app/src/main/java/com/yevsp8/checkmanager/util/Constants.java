package com.yevsp8.checkmanager.util;

/**
 * Created by Gergo on 2018. 03. 10..
 */

public class Constants {

    public static final String DateTimePattern = "yyyy/MM/dd";
    public static int NotificationRequestCode = 111;
    public static int Max_Notification_Day_Interval = 30;
    private static double height = 10.6;
    public static double Check_Amount_Top_DistFrom_Top = 0.88 / height;
    public static double Check_Amount_Bottom_DistFrom_Top = 1.28 / height;
    public static double Check_PaidTo_Top_DistFrom_Top = 8.45 / height;
    public static double Check_PaidTo_Bottom_DistFrom_Top = 9.58 / height;
    public static double Check_ID_Top_DistFrom_Top = 9.7 / height;
    public static double Check_ID_Bottom_DistFrom_Top = 10.3 / height;
    private static double width = 6.0;
    public static double Check_Amount_Left_DistFrom_Left = 0.5 / width;
    public static double Check_Amount_Right_DistFrom_Left = 3.8 / width;
    public static double Check_ID_Left_DistFrom_Left = 5.8 / width;
    public static double Check_ID_Right_DistFrom_Left = 0.3 / width;
    public static double Check_PaidTo_Left_DistFrom_Left = 5.8 / width;
    public static double Check_PaidTo_Right_DistFrom_Left = 0.3 / width;
}
