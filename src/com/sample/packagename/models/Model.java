package com.sample.packagename.models;

import org.vertx.java.core.eventbus.EventBus;

/**
 * This class contains some basic functionality of the models like
 * providing access to a proper database instance and so on.
 * Every other model is an implementaion of this class.
 */
public abstract class Model {

    public static EventBus eventBus;

}
