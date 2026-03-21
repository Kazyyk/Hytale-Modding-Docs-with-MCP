---
title: "ThrowableSupplier"
kind: "interface"
package: "com.hypixel.hytale.sneakythrow.supplier"
fqcn: "com.hypixel.hytale.sneakythrow.supplier.ThrowableSupplier"
api_surface: false
extends: "Supplier"
implements: ['Supplier']
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "sneakythrow"
  - "supplier"
---

**Package:** `com.hypixel.hytale.sneakythrow.supplier`

```java
@FunctionalInterface
public interface ThrowableSupplier<T, E extends Throwable> extends Supplier<T>
```

Functional interface defining `getNow` that returns `T`.

## Abstract Methods

| Method | Returns | Parameters |
|---|---|---|
| `getNow` | `T` | `` |
