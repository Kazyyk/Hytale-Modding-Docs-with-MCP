# ThrowableBiConsumer

Type: interface | Package: com.hypixel.hytale.sneakythrow.consumer | Extends: BiConsumer | Implements: BiConsumer, U>

@FunctionalInterface
public interface ThrowableBiConsumer<T, U, E extends Throwable> extends BiConsumer<T, U>

Functional interface defining `acceptNow` that returns `void`.

## Abstract Methods

- acceptNow | void | T var1, U var2

Also in this package: ThrowableConsumer, ThrowableIntConsumer, ThrowableTriConsumer

Complete API:
  default void accept(T t, U u)
  void acceptNow(T var1, U var2)
