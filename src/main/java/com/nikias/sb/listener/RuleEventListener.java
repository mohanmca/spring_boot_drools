package com.nikias.sb.listener;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.kie.api.event.rule.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RuleEventListener implements org.kie.api.event.rule.RuleRuntimeEventListener {

    private static Logger LOGGER = LoggerFactory.getLogger(RuleEventListener.class);

    @Override
    public void objectInserted(ObjectInsertedEvent objectInsertedEvent) {
        LOGGER.debug(ToStringBuilder.reflectionToString(objectInsertedEvent));
    }

    @Override
    public void objectUpdated(ObjectUpdatedEvent objectUpdatedEvent) {
        LOGGER.debug(ToStringBuilder.reflectionToString(objectUpdatedEvent));
    }

    @Override
    public void objectDeleted(ObjectDeletedEvent objectDeletedEvent) {
        LOGGER.debug(ToStringBuilder.reflectionToString(objectDeletedEvent));
    }
}
