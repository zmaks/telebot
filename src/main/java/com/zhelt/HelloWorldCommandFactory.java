package com.zhelt;

import org.apache.log4j.Logger;

import io.github.nixtabyte.telegram.jtelebot.client.RequestHandler;
import io.github.nixtabyte.telegram.jtelebot.response.json.Message;
import io.github.nixtabyte.telegram.jtelebot.server.Command;
import io.github.nixtabyte.telegram.jtelebot.server.CommandFactory;

public class HelloWorldCommandFactory implements CommandFactory {

    private static final Logger LOG = Logger.getLogger(HelloWorldCommandFactory.class);

    @Override
    public Command createCommand(Message message, RequestHandler requestHandler) {
        LOG.info("MESSAGE: "+message.getText());
        return new HelloWorldCommand(message,requestHandler);
    }
}