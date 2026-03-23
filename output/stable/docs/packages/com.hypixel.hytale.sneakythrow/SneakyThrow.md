---
title: "SneakyThrow"
kind: "class"
package: "com.hypixel.hytale.sneakythrow"
fqcn: "com.hypixel.hytale.sneakythrow.SneakyThrow"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "sneakythrow"
  - "class"
---

**Package:** `com.hypixel.hytale.sneakythrow`

```java
public class SneakyThrow
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public static` | `RuntimeException` | `sneakyThrow(Throwable t)` |
| `private static` | `T` | `sneakyThrow0(Throwable t) throws T` |
| `public static` | `Runnable` | `sneakyRunnable(ThrowableRunnable<E> runnable)` |
| `public static` | `Supplier<T>` | `sneakySupplier(ThrowableSupplier<T,E> supplier)` |
| `public static` | `IntSupplier` | `sneakySupplier(ThrowableIntSupplier<E> supplier)` |
| `public static` | `Consumer<T>` | `sneakyConsumer(ThrowableConsumer<T,E> consumer)` |
| `public static` | `BiConsumer<T,U>` | `sneakyConsumer(ThrowableBiConsumer<T,U,E> consumer)` |
| `public static` | `TriConsumer<T,U,V>` | `sneakyConsumer(ThrowableTriConsumer<T,U,V,E> consumer)` |
| `public static` | `IntConsumer` | `sneakyIntConsumer(ThrowableIntConsumer<E> consumer)` |
| `public static` | `Function<T,R>` | `sneakyFunction(ThrowableFunction<T,R,E> function)` |
| `public static` | `BiFunction<T,U,R>` | `sneakyFunction(ThrowableBiFunction<T,U,R,E> function)` |
