---
title: "ParametrizedBufferType"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.engine.bufferbundle.buffers.type"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.engine.bufferbundle.buffers.type.ParametrizedBufferType"
api_surface: false
extends: "BufferType"
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
public class ParametrizedBufferType extends BufferType
```

A [BufferType](BufferType.md) that additionally specifies a type parameter class (e.g., `Material.class` for a `VoxelBuffer<Material>`). Used to distinguish buffer types that share the same buffer class but differ in their generic parameter. Equality includes the parameter class in addition to the base BufferType fields.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull public final` | `Class` | `parameterClass` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `ParametrizedBufferType(@Nonnull String name, int index, @Nonnull Class bufferClass, @Nonnull Class parameterClass, @Nonnull Supplier<Buffer> bufferSupplier)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `boolean` | `isValidType(@Nonnull Class bufferClass, @Nonnull Class parameterClass)` |
| `@Override public` | `boolean` | `isValid(@Nonnull Buffer buffer)` |
| `@Override public` | `boolean` | `equals(Object o)` |
| `@Override public` | `int` | `hashCode()` |
