package com.sample.packagename.verticles;

import org.vertx.java.core.Handler;
import org.vertx.java.core.eventbus.EventBus;
import org.vertx.java.core.eventbus.Message;
import org.vertx.java.core.json.JsonObject;
import org.vertx.java.platform.Verticle;

/**
 * This is a sample worker verticle interested on our published event
 */
public class SampleWorkerVerticle extends Verticle {


    @Override
    public void start() {

        EventBus eventBus = vertx.eventBus();

        eventBus.registerHandler("our.event.coming.from.model", new handleModelEvent());

    }

    private class handleModelEvent implements Handler<Message<JsonObject>> {

        @Override
        public void handle(Message<JsonObject> message) {

            /*
            here our worker does some background processing when the event is
            published.
             */

        }

    }

}
