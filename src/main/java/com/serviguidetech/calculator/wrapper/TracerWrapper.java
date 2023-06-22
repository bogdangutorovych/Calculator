package com.serviguidetech.calculator.wrapper;

import io.corp.calculator.TracerAPI;
import io.corp.calculator.TracerImpl;
import org.springframework.stereotype.Component;

@Component
public class TracerWrapper implements TracerAPI {

    private final TracerImpl tracerImpl;

    public TracerWrapper() {
        this.tracerImpl = new TracerImpl();
    }

    @Override
    public <T> void trace(T result) {
        tracerImpl.trace(result);
    }
}

