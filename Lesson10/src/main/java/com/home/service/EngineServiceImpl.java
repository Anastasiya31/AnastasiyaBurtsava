package com.home.service;

import com.home.model.Engine;
import lombok.Getter;
import lombok.Setter;

import static com.home.utils.CarUtils.engineS;
import static com.home.utils.CarUtils.fuels;

@Getter
@Setter
public class EngineServiceImpl implements EngineService {
    private final Engine engine;
    private GasolineTankServiceImpl gasolineTankService;

    public EngineServiceImpl(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void start() {
        if (fuels) {
            System.out.println("Двигатель заведён");
            engineS = true;
        } else {
            System.out.println("Двигатель не заведён");
            engineS = false;
        }
    }
}



