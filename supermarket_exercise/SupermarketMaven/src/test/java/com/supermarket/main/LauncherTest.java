package com.supermarket.main;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

/**
 * Created by horiav on 28/12/2015.
 */
public class LauncherTest
{
    Launcher testLauncher = Mockito.spy( Launcher.class );

    @Test
    public void testRunAppMethod()
    {
        assertEquals( "Total value of shopping is: 0.0", testLauncher.runApp( new String[] { "0", "0" } ) );
        assertEquals( "Total value of shopping is: 5.75", testLauncher.runApp( new String[] { "0", "1" } ) );
        assertEquals( "Total value of shopping is: 0.0", testLauncher.runApp( new String[] { "1", "1" } ) );
    }
}
