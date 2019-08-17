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
import com.google.api.services.actions_fulfillment.v2.model.RichResponse;
import com.google.api.services.actions_fulfillment.v2.model.RichResponseItem;
import com.google.api.services.actions_fulfillment.v2.model.SimpleResponse;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
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

        log.info("Action request received {} {} ", expenseType,amount);


        BasicCard basicCard = new BasicCard();
        basicCard.setFormattedText(String.format(" Expense of %f rupees has been added to %s ", amount,
                expenseType));
        basicCard.setTitle("EXPENSE ADDED");
        Image image = new Image();
        image.setUrl("https://github.com/jocnud/jocnud.github.io/blob/master/images/s4.jpg");
        basicCard.setImage(image);


        RichResponse richResponse = new RichResponse();

        RichResponseItem richResponseItem1 = new RichResponseItem();
        RichResponseItem richResponseItem2 = new RichResponseItem();
        richResponseItem1.setBasicCard(basicCard);

        SimpleResponse simpleResponse = new SimpleResponse();
        simpleResponse.setTextToSpeech(String.format(" Expense of %s rupees has been added to %s ", amount,
                expenseType));
        richResponseItem2.setSimpleResponse(simpleResponse);

        richResponse.setItems(Arrays.asList(richResponseItem2));

        ResponseBuilder responseBuilder = new ResponseBuilder();
        //responseBuilder.add(richResponse);


        Button learnMoreButton =
                new Button()
                        .setTitle("basic_card_button_text")
                        .setOpenUrlAction(new OpenUrlAction().setUrl("https://assistant.google.com"));
        List<Button> buttons = new ArrayList<>();
        buttons.add(learnMoreButton);
        String text = "basic_card_text";
        responseBuilder
                .add("basic_card_response")
                .add(
                        new BasicCard()
                                .setTitle("basic_card_title")
                                .setSubtitle("basic_card_sub_title")
                                .setFormattedText(text)
                                .setImage(
                                        new Image()
                                                .setUrl("https://github.com/jocnud/jocnud.github.io/blob/master/images/s4.jpg")
                                                .setAccessibilityText("basic_card_alt_text"))
                                .setButtons(buttons))
                .addSuggestions(SUGGESTIONS);

        return responseBuilder.build();
    }
}
