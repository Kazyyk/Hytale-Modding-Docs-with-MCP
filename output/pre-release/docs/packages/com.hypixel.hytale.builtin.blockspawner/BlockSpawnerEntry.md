---
title: "BlockSpawnerEntry"
kind: "class"
package: "com.hypixel.hytale.builtin.blockspawner"
fqcn: "com.hypixel.hytale.builtin.blockspawner.BlockSpawnerEntry"
api_surface: false
extends: null
implements:
  - "IWeightedElement"
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "blockspawner"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.blockspawner`

```java
public class BlockSpawnerEntry implements IWeightedElement
```

Implements `IWeightedElement`.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull public static` | `BuilderCodec<BlockSpawnerEntry>` | `CODEC` |
| `private` | `String` | `blockName` |
| `private` | `Holder<ChunkStore>` | `blockComponents` |
| `private` | `double` | `weight` |
| `private` | `BlockSpawnerEntry.RotationMode` | `rotationMode` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `public String` | `getBlockName()` |
| `` | `public Holder<ChunkStore>` | `getBlockComponents()` |
| `` | `public BlockSpawnerEntry.RotationMode` | `getRotationMode()` |
| `@Override public` | `double` | `getWeight()` |

## Enum Constants

- `NONE`
- `RANDOM`
- `INHERIT`
