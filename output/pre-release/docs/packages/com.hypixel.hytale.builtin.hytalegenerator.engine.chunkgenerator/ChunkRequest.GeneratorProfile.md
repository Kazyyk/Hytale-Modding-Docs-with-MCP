---
title: "ChunkRequest.GeneratorProfile"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.engine.chunkgenerator"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.engine.chunkgenerator.ChunkRequest.GeneratorProfile"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T12:00:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "engine"
  - "chunkgenerator"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.engine.chunkgenerator`

```java
public static final class ChunkRequest.GeneratorProfile
```

Identifies a world generation profile by its world structure name, seed, and world counter. Used to determine whether a cached generator can be reused or a new one must be constructed. Supports cloning and equality comparison.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private final` | `String` | `worldStructureName` |
| `private` | `int` | `seed` |
| `private` | `int` | `worldCounter` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `GeneratorProfile(@Nonnull String worldStructureName, int seed, int worldCounter)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `String` | `worldStructureName()` |
| `public` | `int` | `seed()` |
| `public` | `void` | `setSeed(int seed)` |
| `@Override public` | `boolean` | `equals(Object o)` |
| `@Override public` | `int` | `hashCode()` |
| `public` | `ChunkRequest.GeneratorProfile` | `clone()` |
| `@Nonnull @Override public` | `String` | `toString()` |
