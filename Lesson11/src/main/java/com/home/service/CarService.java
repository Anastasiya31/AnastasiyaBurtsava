package com.home.service;

import com.home.model.WrongStartException;

public interface CarService {
    void start() throws WrongStartException;
}
