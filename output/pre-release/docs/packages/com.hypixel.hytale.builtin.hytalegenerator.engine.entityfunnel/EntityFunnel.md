---
title: "EntityFunnel"
kind: "interface"
package: "com.hypixel.hytale.builtin.hytalegenerator.engine.entityfunnel"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.engine.entityfunnel.EntityFunnel"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T12:00:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "engine"
  - "entityfunnel"
  - "interface"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.engine.entityfunnel`

```java
public interface EntityFunnel
```

Defines the contract for receiving entity placement data during world generation. Provides a no-op `NULL` instance with zero-volume bounds. Implementations include `EntityBufferView` and [RotationEntityFunnel](RotationEntityFunnel.md).

## Fields

| Modifier | Type | Name |
|---|---|---|
| `static` | `EntityFunnel` | `NULL` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| | `void` | `addEntity(@Nonnull EntityPlacementData var1)` |
| `@Nonnull` | `Bounds3i` | `getBounds()` |
