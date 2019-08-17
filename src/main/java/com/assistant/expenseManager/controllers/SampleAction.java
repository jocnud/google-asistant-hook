package com.assistant.expenseManager.controllers;

import com.google.actions.api.ActionRequest;
import com.google.actions.api.ActionResponse;
import com.google.actions.api.DialogflowApp;
import com.google.actions.api.ForIntent;
import com.google.actions.api.response.ResponseBuilder;

public class SampleAction extends DialogflowApp {

    @ForIntent("Add Expense")
    public ActionResponse addExpense(ActionRequest actionRequest) {

        com.google.api.services.actions_fulfillment.v2.model.SimpleResponse sm =
                new com.google.api.services.actions_fulfillment.v2.model.SimpleResponse();
        sm.setTextToSpeech(" This may work Nirvik");

        ResponseBuilder r = new ResponseBuilder();
        r.add(sm);
        return r.build();
    }
}
