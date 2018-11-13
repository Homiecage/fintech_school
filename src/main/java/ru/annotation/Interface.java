package ru.annotation;

import org.junit.jupiter.api.*;

import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Tag("interface")
public @interface Interface {

}