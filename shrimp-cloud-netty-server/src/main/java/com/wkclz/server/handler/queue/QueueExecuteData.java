package com.wkclz.server.handler.queue;

import com.wkclz.server.bean.ReceiveData;
import com.wkclz.server.handler.interfaces.ExecuteData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Component;

@Component("queue")
@ConditionalOnExpression("'${netty.executeDataName}'.equals('queue')")
public class QueueExecuteData implements ExecuteData {

    @Autowired
    private MessageChannel messageChannel;

    @Override
    public void invoke(ReceiveData r) {
        messageChannel.send(MessageBuilder.withPayload(r).build());
    }

}
