package com.wonit.handler;

public interface CommandHandler<T> {
    void handle(T t);
}
