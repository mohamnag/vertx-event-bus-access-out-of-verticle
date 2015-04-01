package com.sample.packagename.models;

/**
 * This is a sample implementation of a model which holds logic
 * for user's model.
 *
 * This model may be used with one or more verticles when they
 * have some processing to be done with users.
 */
public class UserModel extends Model {

    public void doSomeChanges() {
        /*
        this function in model does some changes and in some
        cases publishes an event about the changes, to which
        one or more listening verticles will listen and react.
         */

        eventBus.publish("our.event.coming.from.model", "some data passed");
    }

}
