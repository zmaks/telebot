package com.zhelt;

import io.github.nixtabyte.telegram.jtelebot.server.impl.DefaultCommandDispatcher;
import io.github.nixtabyte.telegram.jtelebot.server.impl.DefaultCommandQueue;
import io.github.nixtabyte.telegram.jtelebot.server.impl.DefaultCommandWatcher;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        DefaultCommandDispatcher commandDispatcher = new DefaultCommandDispatcher(10,100, new DefaultCommandQueue());
        commandDispatcher.startUp();

        DefaultCommandWatcher commandWatcher = new DefaultCommandWatcher(2000,100,"207572767:AAGIfFfsL5DIC6vRpAtzb1pkEgAXgi3ESVM",commandDispatcher,new HelloWorldCommandFactory());
        commandWatcher.startUp();
    }
}
