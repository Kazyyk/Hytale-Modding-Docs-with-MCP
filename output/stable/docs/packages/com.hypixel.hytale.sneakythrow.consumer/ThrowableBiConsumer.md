---
title: "ThrowableBiConsumer"
kind: "interface"
package: "com.hypixel.hytale.sneakythrow.consumer"
fqcn: "com.hypixel.hytale.sneakythrow.consumer.ThrowableBiConsumer"
api_surface: false
extends: "BiConsumer"
implements: ['BiConsumer', 'U>']
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "sneakythrow"
  - "consumer"
---

**Package:** `com.hypixel.hytale.sneakythrow.consumer`

```java
@FunctionalInterface
public interface ThrowableBiConsumer<T, U, E extends Throwable> extends BiConsumer<T, U>
```

Functional interface defining `acceptNow` that returns `void`.

## Abstract Methods

| Method | Returns | Parameters |
|---|---|---|
| `acceptNow` | `void` | `T var1, U var2` |
