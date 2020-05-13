package com.aurea.automation.codegraph.oa3;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;

import java.util.function.Consumer;
import java.util.function.Function;

public interface Oper<T extends Oper> {
    public T reqSpec(Consumer<RequestSpecBuilder> consumer);
    public <R> R execute(Function<Response, R> handler);
}
