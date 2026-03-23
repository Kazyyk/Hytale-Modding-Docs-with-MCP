---
title: "NeighbourBlockTagsLocationCondition"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.worldlocationcondition"
fqcn: "com.hypixel.hytale.builtin.adventure.worldlocationcondition.NeighbourBlockTagsLocationCondition"
api_surface: false
extends: "WorldLocationCondition"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "builtin"
  - "adventure"
  - "worldlocationcondition"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.adventure.worldlocationcondition`

```java
public class NeighbourBlockTagsLocationCondition extends WorldLocationCondition
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull public static final` | `BuilderCodec<NeighbourBlockTagsLocationCondition>` | `CODEC` |
| `protected` | `String` | `tagPatternId` |
| `protected` | `NeighbourBlockTagsLocationCondition.NeighbourDirection` | `neighbourDirection` |
| `protected` | `IntRange` | `support` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `boolean` | `test(@Nonnull World world, int worldX, int worldY, int worldZ)` |
| `private` | `boolean` | `checkBlockHasTag(int x, int y, int z, @Nullable BlockAccessor worldChunk)` |
| `@Override public` | `boolean` | `equals(@Nullable Object o)` |
| `@Override public` | `int` | `hashCode()` |
| `@Nonnull @Override public` | `String` | `toString()` |

## Inner Types

- `NeighbourBlockTagsLocationCondition.NeighbourDirection`
