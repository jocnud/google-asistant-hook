package com.assistant.expenseManager.controllers;

import com.google.actions.api.ActionRequest;
import com.google.actions.api.ActionResponse;
import com.google.actions.api.DialogflowApp;
import com.google.actions.api.ForIntent;
import com.google.actions.api.response.ResponseBuilder;
import com.google.api.services.actions_fulfillment.v2.model.BasicCard;
import com.google.api.services.actions_fulfillment.v2.model.Image;
import com.google.api.services.actions_fulfillment.v2.model.RichResponse;
import com.google.api.services.actions_fulfillment.v2.model.RichResponseItem;
import com.google.api.services.actions_fulfillment.v2.model.SimpleResponse;

import java.util.Arrays;

public class ExpenseApp extends DialogflowApp {

    @ForIntent("Add Expense")
    public ActionResponse addExpense(ActionRequest actionRequest) {

        String expenseType = (String) actionRequest.getParameter("expenseType");
        String amount = (String) actionRequest.getParameter("unit-currency");

        BasicCard basicCard = new BasicCard();
        basicCard.setFormattedText(String.format(" Expense of %s rupees has been added to %s ", amount, expenseType));
        basicCard.setTitle("EXPENSE ADDED");
        Image image = new Image();
        image.setUrl("https://github.com/jocnud/jocnud.github.io/blob/master/images/s4.jpg");
        basicCard.setImage(image);


        RichResponse richResponse = new RichResponse();
        RichResponseItem richResponseItem = new RichResponseItem();
        richResponseItem.setBasicCard(basicCard);

        SimpleResponse simpleResponse = new SimpleResponse();
        simpleResponse.setTextToSpeech(String.format(" Expense of %s rupees has been added to %s ", amount,
                expenseType));
        richResponseItem.setSimpleResponse(simpleResponse);

        richResponse.setItems(Arrays.asList(richResponseItem));

        ResponseBuilder responseBuilder = new ResponseBuilder();
        responseBuilder.add(richResponse);

        return responseBuilder.build();
    }
}
