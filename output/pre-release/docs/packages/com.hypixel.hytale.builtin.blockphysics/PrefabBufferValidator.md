---
title: "PrefabBufferValidator"
kind: "class"
package: "com.hypixel.hytale.builtin.blockphysics"
fqcn: "com.hypixel.hytale.builtin.blockphysics.PrefabBufferValidator"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "blockphysics"
---

**Package:** `com.hypixel.hytale.builtin.blockphysics`

```java
public class PrefabBufferValidator
```

Validates prefab buffer contents including block types, filler blocks, entity components, and block states.

## Record Components

```java
int x, int y, int z, int blockId, int support, int rotation, int filler, @Nullable Holder<ChunkStore> holder, StringBuilder reason
```

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `int` | `getBlock(@Nonnull IPrefabBuffer iPrefabBuffer, Void unused, int x, int y, int z)` |
| `public` | `int` | `getFiller(@Nonnull IPrefabBuffer iPrefabBuffer, Void unused, int x, int y, int z)` |
| `public` | `int` | `getRotationIndex(@Nonnull IPrefabBuffer iPrefabBuffer, Void unused, int x, int y, int z)` |
| `public static` | `List<String>` | `validateAllPrefabs(@Nonnull List<ValidationOption> list)` |
| `public static` | `List<String>` | `validatePrefabsInPath(@Nonnull Path dataFolder, @Nonnull Set<ValidationOption> options)` |
| `public static` | `String` | `validate(@Nonnull IPrefabBuffer prefab, @Nonnull Set<ValidationOption> options)` |
| `public` | `record` | `ValidateBlockEvent(int x, int y, int z, int blockId, int support, int rotation, int filler, @Nullable Holder<ChunkStore> holder, StringBuilder reason)` |
