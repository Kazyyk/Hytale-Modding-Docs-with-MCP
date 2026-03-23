# ThrowableBiFunction

Type: interface | Package: com.hypixel.hytale.sneakythrow.function | Extends: BiFunction | Implements: BiFunction, U, R>

@FunctionalInterface
public interface ThrowableBiFunction<T, U, R, E extends Throwable> extends BiFunction<T, U, R>

Functional interface defining `applyNow` that returns `R`.

## Abstract Methods

- applyNow | R | T var1, U var2

Also in this package: ThrowableFunction

Complete API:
  default R apply(T t, U u)
  R applyNow(T var1, U var2)
