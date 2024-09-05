package com.datastaxtutorials.shoppingassistant;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.messages.MessageInput;
import com.vaadin.flow.component.messages.MessageList;
import com.vaadin.flow.component.messages.MessageListItem;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.StreamResource;

@Route("")
public class ShoppingAssistantMainView extends VerticalLayout {

	private static final long serialVersionUID = 6488265013567165582L;
    private static final String USER_AVATAR = "https://api.dicebear.com/6.x/big-ears-neutral/svg?seed=Molly";
    private static final String AI_AVATAR = "https://api.dicebear.com/6.x/bottts/svg?seed=Sheba";
    private static final String LOGO_FILE = "astra_apparel_border_sm.png";
    
	private ShoppingAssistantController controller;
	private MessageList chat;
	private MessageInput query;
	private List<MessageListItem> messages;
	
	public ShoppingAssistantMainView() {
		
		controller = new ShoppingAssistantController();
		messages = new ArrayList<>();
		
		add(showImage());

		chat = new MessageList();
		query = new MessageInput();

		add(chat, query);
		
		query.addSubmitListener(this::getResponse);
		
		chat.setSizeFull();
		chat.setMaxWidth("800px");
		
		query.setWidthFull();
		query.setMaxWidth("800px");
	}
	
	public Component showImage() {
		HorizontalLayout layout = new HorizontalLayout();
		
		Image mcImage = new Image();
		StreamResource imageResource = new StreamResource(LOGO_FILE,
				() -> getClass().getResourceAsStream("/images/" + LOGO_FILE));
		
		mcImage.setSrc(imageResource);
		mcImage.setWidth("300px");
		
		layout.add(mcImage);
		
		return layout;
	}
	
	private void getResponse(MessageInput.SubmitEvent submitEvent) {
		
		ShoppingAssistantRequest req = new ShoppingAssistantRequest(submitEvent.getValue());
		Instant requestTime = LocalDateTime.now().toInstant(ZoneOffset.UTC);
		messages.add(new MessageListItem(req.getInputValue(), requestTime, "User", USER_AVATAR));
		chat.setItems(messages);

		ShoppingAssistantResponse resp = controller.askQuestion(req);
		Instant responseTime = LocalDateTime.now().toInstant(ZoneOffset.UTC);
		messages.add(new MessageListItem(resp.getMessage(), responseTime, "Astra Apparel", AI_AVATAR));
		chat.setItems(messages);
	}
}
