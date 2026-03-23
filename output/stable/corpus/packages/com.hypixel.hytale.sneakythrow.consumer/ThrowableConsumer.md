# ThrowableConsumer

Type: interface | Package: com.hypixel.hytale.sneakythrow.consumer | Extends: Consumer | Implements: Consumer

@FunctionalInterface
public interface ThrowableConsumer<T, E extends Throwable> extends Consumer<T>

Functional interface defining `acceptNow` that returns `void`.

## Abstract Methods

- acceptNow | void | T var1

Also in this package: ThrowableBiConsumer, ThrowableIntConsumer, ThrowableTriConsumer

Complete API:
  default void accept(T t)
  void acceptNow(T var1)
