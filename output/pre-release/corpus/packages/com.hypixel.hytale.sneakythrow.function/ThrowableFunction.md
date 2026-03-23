# ThrowableFunction

Type: interface | Package: com.hypixel.hytale.sneakythrow.function | Extends: Function | Implements: Function, R>

@FunctionalInterface
public interface ThrowableFunction<T, R, E extends Throwable> extends Function<T, R>

Functional interface defining `applyNow` that returns `R`.

## Abstract Methods

- applyNow | R | T var1

Also in this package: ThrowableBiFunction

Complete API:
  default R apply(T t)
  R applyNow(T var1)
