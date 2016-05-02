package com.supermarket.main;

import org.junit.Test;
import org.mockito.Mockito;

/**
 * Created by horiav on 26/12/2015.
 */
public class SupermarketMainTest
{
    @Test
    public void testMain() throws Exception
    {
        Launcher mockLauncher = Mockito.mock( Launcher.class );
        SupermarketMain.setLauncher( mockLauncher );
        SupermarketMain.main( new String[] { "1", "5" } );
        Mockito.verify( mockLauncher ).runApp( new String[] { "1", "5" } );
    }
}
