---
title: "ThrowableTriConsumer"
kind: "interface"
package: "com.hypixel.hytale.sneakythrow.consumer"
fqcn: "com.hypixel.hytale.sneakythrow.consumer.ThrowableTriConsumer"
api_surface: false
extends: "TriConsumer"
implements: ['TriConsumer', 'U', 'V>']
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "sneakythrow"
  - "consumer"
---

**Package:** `com.hypixel.hytale.sneakythrow.consumer`

```java
@FunctionalInterface
public interface ThrowableTriConsumer<T, U, V, E extends Throwable> extends TriConsumer<T, U, V>
```

Functional interface defining `acceptNow` that returns `void`.

## Abstract Methods

| Method | Returns | Parameters |
|---|---|---|
| `acceptNow` | `void` | `T var1, U var2, V var3` |
