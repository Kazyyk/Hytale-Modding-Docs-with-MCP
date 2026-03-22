---
title: "ObjectPool"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.util"
fqcn: "com.hypixel.hytale.server.worldgen.util.ObjectPool"
api_surface: false
extends: null
implements: ["Function<T, T>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "worldgen"
  - "util"
---

**Package:** `com.hypixel.hytale.server.worldgen.util`

```java
public class ObjectPool<T extends Function<T, T>> implements Function<T, T>
```

Implements `Function` to provide ObjectPool functionality.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private final` | `BlockingQueue<T>` | `items` |
| `private final` | `Supplier<T>` | `supplier` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `ObjectPool(int size, Supplier<T> supplier)` |
| `public` | `T` | `acquire()` |
| `public <K extends T>` | `void` | `recycle(@Nonnull K v)` |
| `public` | `int` | `size()` |
| `public` | `T` | `apply(T cachedKey)` |
