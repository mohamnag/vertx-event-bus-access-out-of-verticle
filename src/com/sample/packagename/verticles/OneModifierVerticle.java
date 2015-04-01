package com.sample.packagename.verticles;

import com.sample.packagename.models.UserModel;
import org.vertx.java.core.Handler;
import org.vertx.java.core.eventbus.EventBus;
import org.vertx.java.core.eventbus.Message;
import org.vertx.java.core.json.JsonObject;
import org.vertx.java.platform.Verticle;

/**
 * This verticle is one of the verticles who uses the {@link UserModel}
 * and may cause the model to publish the named event. The change may
 * be well itself the result of another event.
 */
public class OneModifierVerticle extends Verticle {


    @Override
    public void start() {

        EventBus eventBus = vertx.eventBus();

        eventBus.registerHandler("some.other.event", new changeHandler());

    }

    /**
     * This handles some other event and applies some changes to {@link UserModel}
     * which will then need an event to be fired from inside model to inform others
     * about the changes to act on.
     */
    private class changeHandler implements Handler<Message<JsonObject>> {

        public void handle(Message<JsonObject> message) {

            /*
            This is where the change is to be done in model
             */
            new UserModel().doSomeChanges();

        }

    }

}
