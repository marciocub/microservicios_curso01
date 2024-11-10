package com.uncledavecode.orders_service.model.dtos;
//record es parecido a una clase inmutable
public record BaseResponse(String[] errorMessages) {
    public boolean hasErrors() {
        return errorMessages != null && errorMessages.length > 0;
    }
}