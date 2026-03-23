# ThrowableTriConsumer

Type: interface | Package: com.hypixel.hytale.sneakythrow.consumer | Extends: TriConsumer | Implements: TriConsumer, U, V>

@FunctionalInterface
public interface ThrowableTriConsumer<T, U, V, E extends Throwable> extends TriConsumer<T, U, V>

Functional interface defining `acceptNow` that returns `void`.

## Abstract Methods

- acceptNow | void | T var1, U var2, V var3

Also in this package: ThrowableBiConsumer, ThrowableConsumer, ThrowableIntConsumer

Complete API:
  default void accept(T t, U u, V v)
  void acceptNow(T var1, U var2, V var3)
