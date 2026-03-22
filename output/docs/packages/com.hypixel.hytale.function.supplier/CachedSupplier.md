---
title: "CachedSupplier"
kind: "class"
package: "com.hypixel.hytale.function.supplier"
fqcn: "com.hypixel.hytale.function.supplier.CachedSupplier"
api_surface: false
extends: ~
implements: ['Supplier']
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "function"
  - "supplier"
---

**Package:** `com.hypixel.hytale.function.supplier`

```java
public class CachedSupplier<T> implements Supplier<T>
```

Utility for supplying values with caching or special behavior.

## Accessors

| Method | Returns | Description |
|---|---|---|
| `get()` | `T` | Accessor method. |
| `getValue()` | `T` | Accessor method. |

## Methods

| Method | Returns | Description |
|---|---|---|
| `invalidate()` | `void` | Instance method. |
