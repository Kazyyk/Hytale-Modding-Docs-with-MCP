---
title: "ThrowableFunction"
kind: "interface"
package: "com.hypixel.hytale.sneakythrow.function"
fqcn: "com.hypixel.hytale.sneakythrow.function.ThrowableFunction"
api_surface: false
extends: "Function"
implements: ['Function', 'R>']
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "sneakythrow"
  - "function"
---

**Package:** `com.hypixel.hytale.sneakythrow.function`

```java
@FunctionalInterface
public interface ThrowableFunction<T, R, E extends Throwable> extends Function<T, R>
```

Functional interface defining `applyNow` that returns `R`.

## Abstract Methods

| Method | Returns | Parameters |
|---|---|---|
| `applyNow` | `R` | `T var1` |
