package com.supermarket.main;

import java.util.Scanner;

/**
 * Created by horiav on 25/12/2015.
 */
public class SupermarketMain
{
    private static Launcher launcher = new Launcher();

    public static void main( final String[] args )
    {
        if ( args != null )
        {
            launcher.runApp( args );
        }
        else
        {
//            String flag;
//            String bound;
//            Scanner in = new Scanner(System.in);
//            flag = in.nextLine();
//            bound = in.nextLine();
//
//
//            launcher.runApp( new String[] { flag, bound } );
        }
    }

    static void setLauncher( final Launcher launcher )
    {
        SupermarketMain.launcher = launcher;
    }
}
