package com.sample.packagename.verticles;

import org.vertx.java.core.Handler;
import org.vertx.java.core.eventbus.EventBus;
import org.vertx.java.core.eventbus.Message;
import org.vertx.java.core.json.JsonObject;
import org.vertx.java.platform.Verticle;

/**
 * This verticle is also interested in the event published from model.
 */
public class AnotherVerticle extends Verticle {


    public void start() {

        EventBus eventBus = vertx.eventBus();

        eventBus.registerHandler("our.event.coming.from.model", new handleModelEvent());
    }


    private class handleModelEvent implements Handler<Message<JsonObject>> {

        @Override
        public void handle(Message<JsonObject> message) {

            /*
            this is another handler which will do some further processing
            when the event is published.
             */

        }

    }
}
