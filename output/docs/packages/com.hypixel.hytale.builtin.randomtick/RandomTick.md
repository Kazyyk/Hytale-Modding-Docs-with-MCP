---
title: "RandomTick"
kind: "class"
package: "com.hypixel.hytale.builtin.randomtick"
fqcn: "com.hypixel.hytale.builtin.randomtick.RandomTick"
api_surface: false
extends: null
implements: ["Resource"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "randomtick"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.randomtick`

```java
public class RandomTick implements Resource
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `int` | `blocksPerSectionPerTickStable` |
| `private` | `int` | `blocksPerSectionPerTickUnstable` |
| `private` | `Random` | `random` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `ResourceType<ChunkStore,RandomTick>` | `getResourceType()` |
| `public` | `int` | `getBlocksPerSectionPerTickStable()` |
| `public` | `int` | `getBlocksPerSectionPerTickUnstable()` |
| `public` | `Random` | `getRandom()` |
| `@Nullable @Override public` | `Resource<ChunkStore>` | `clone()` |
