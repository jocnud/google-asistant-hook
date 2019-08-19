package com.assistant.expenseManager.controllers;

import com.google.actions.api.ActionRequest;
import com.google.actions.api.ActionResponse;
import com.google.actions.api.DialogflowApp;
import com.google.actions.api.ForIntent;
import com.google.actions.api.response.ResponseBuilder;
import com.google.api.services.actions_fulfillment.v2.model.BasicCard;
import com.google.api.services.actions_fulfillment.v2.model.Button;
import com.google.api.services.actions_fulfillment.v2.model.Image;
import com.google.api.services.actions_fulfillment.v2.model.OpenUrlAction;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Slf4j
public class ExpenseApp extends DialogflowApp {

    private static final String[] SUGGESTIONS =
            new String[]{"Basic Card", "Browse Carousel", "Carousel", "List", "Media", "Table Card"};


    @ForIntent("Add Expense")
    public ActionResponse addExpense(ActionRequest actionRequest) {

        log.info("Action request received {} ", actionRequest);

        String expenseType = (String) actionRequest.getParameter("ExpenseType");
        Map<String, Double> amountMap = (Map<String, Double>) actionRequest.getParameter("unit-currency");
        Double amount = amountMap.get("amount");

        log.info("Action request received {} {} ", expenseType, amount);


        ResponseBuilder responseBuilder = new ResponseBuilder();
        Button learnMoreButton =
                new Button()
                        .setTitle("Delete Assistant")
                        .setOpenUrlAction(new OpenUrlAction().setUrl("https://assistant.google.com"));
        List<Button> buttons = new ArrayList<>();
        buttons.add(learnMoreButton);
        responseBuilder
                .add(String.format(" Expense of %s rupees has been added to %s ", amount,
                        expenseType))
                .add(
                        new BasicCard()
                                .setTitle("EXPENSE ADDED")
                                .setSubtitle("Expense hae been added")
                                .setFormattedText(String.format(" Expense of %s rupees has been added to %s, feel " +
                                                "free to add more ", amount,
                                        expenseType))
                                .setImage(
                                        new Image()
                                                .setUrl("https://raw.githubusercontent.com/jocnud/jocnud.github.io/master/images/s4.jpg")
                                                .setAccessibilityText("basic_card_alt_text"))
                                .setButtons(buttons))
                .addSuggestions(SUGGESTIONS);

        return responseBuilder.build();
    }
}
