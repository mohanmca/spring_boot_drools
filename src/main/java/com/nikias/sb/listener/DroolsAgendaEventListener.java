package com.nikias.sb.listener;

import com.nikias.sb.controller.JewelleryShopController;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.kie.api.event.rule.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DroolsAgendaEventListener implements AgendaEventListener {

    private static Logger LOGGER = LoggerFactory.getLogger(DroolsAgendaEventListener.class);

    @Override
    public void matchCreated(MatchCreatedEvent matchCreatedEvent) {
        LOGGER.debug(ToStringBuilder.reflectionToString(matchCreatedEvent));
    }

    @Override
    public void matchCancelled(MatchCancelledEvent matchCancelledEvent) {
        LOGGER.debug(ToStringBuilder.reflectionToString(matchCancelledEvent));
    }

    @Override
    public void beforeMatchFired(BeforeMatchFiredEvent beforeMatchFiredEvent) {
        LOGGER.debug(ToStringBuilder.reflectionToString(beforeMatchFiredEvent));
    }

    @Override
    public void afterMatchFired(AfterMatchFiredEvent afterMatchFiredEvent) {
        LOGGER.debug(ToStringBuilder.reflectionToString(afterMatchFiredEvent));
    }

    @Override
    public void agendaGroupPopped(AgendaGroupPoppedEvent agendaGroupPoppedEvent) {
        LOGGER.debug(ToStringBuilder.reflectionToString(agendaGroupPoppedEvent));
    }

    @Override
    public void agendaGroupPushed(AgendaGroupPushedEvent agendaGroupPushedEvent) {
        LOGGER.debug(ToStringBuilder.reflectionToString(agendaGroupPushedEvent));
    }

    @Override
    public void beforeRuleFlowGroupActivated(RuleFlowGroupActivatedEvent ruleFlowGroupActivatedEvent) {
        LOGGER.debug(ToStringBuilder.reflectionToString(ruleFlowGroupActivatedEvent));
    }

    @Override
    public void afterRuleFlowGroupActivated(RuleFlowGroupActivatedEvent ruleFlowGroupActivatedEvent) {
        LOGGER.debug(ToStringBuilder.reflectionToString(ruleFlowGroupActivatedEvent));
    }

    @Override
    public void beforeRuleFlowGroupDeactivated(RuleFlowGroupDeactivatedEvent ruleFlowGroupDeactivatedEvent) {
        LOGGER.debug(ToStringBuilder.reflectionToString(ruleFlowGroupDeactivatedEvent));
    }

    @Override
    public void afterRuleFlowGroupDeactivated(RuleFlowGroupDeactivatedEvent ruleFlowGroupDeactivatedEvent) {
        LOGGER.debug(ToStringBuilder.reflectionToString(ruleFlowGroupDeactivatedEvent));
    }
}
