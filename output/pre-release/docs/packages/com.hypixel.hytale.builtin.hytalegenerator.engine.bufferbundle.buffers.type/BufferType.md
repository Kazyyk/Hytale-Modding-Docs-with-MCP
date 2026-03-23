---
title: "BufferType"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.engine.bufferbundle.buffers.type"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.engine.bufferbundle.buffers.type.BufferType"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T12:00:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "engine"
  - "bufferbundle"
  - "buffers"
  - "type"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.engine.bufferbundle.buffers.type`

```java
public class BufferType
```

Identifies a buffer type in the world generation pipeline. Each BufferType has a unique name, index, buffer class, and a supplier that creates new buffer instances. Used as a key in `BufferBundle` to organize grids of buffers by their content type. Equality is based on the index, buffer class, and supplier.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull public final` | `Class` | `bufferClass` |
| `public final` | `int` | `index` |
| `@Nonnull public final` | `Supplier<Buffer>` | `bufferSupplier` |
| `@Nonnull public final` | `String` | `name` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `BufferType(@Nonnull String name, int index, @Nonnull Class bufferClass, @Nonnull Supplier<Buffer> bufferSupplier)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `boolean` | `equals(Object o)` |
| `public` | `boolean` | `isValidType(@Nonnull Class bufferClass)` |
| `public` | `boolean` | `isValid(@Nonnull Buffer buffer)` |
| `@Override public` | `int` | `hashCode()` |
