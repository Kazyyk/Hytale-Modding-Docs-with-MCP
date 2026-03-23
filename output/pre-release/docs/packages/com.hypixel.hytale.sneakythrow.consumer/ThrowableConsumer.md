---
title: "ThrowableConsumer"
kind: "interface"
package: "com.hypixel.hytale.sneakythrow.consumer"
fqcn: "com.hypixel.hytale.sneakythrow.consumer.ThrowableConsumer"
api_surface: false
extends: "Consumer"
implements: ['Consumer']
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "sneakythrow"
  - "consumer"
---

**Package:** `com.hypixel.hytale.sneakythrow.consumer`

```java
@FunctionalInterface
public interface ThrowableConsumer<T, E extends Throwable> extends Consumer<T>
```

Functional interface defining `acceptNow` that returns `void`.

## Abstract Methods

| Method | Returns | Parameters |
|---|---|---|
| `acceptNow` | `void` | `T var1` |
