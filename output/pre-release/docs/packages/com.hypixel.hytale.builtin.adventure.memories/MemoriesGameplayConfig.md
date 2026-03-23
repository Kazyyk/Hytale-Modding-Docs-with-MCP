---
title: "MemoriesGameplayConfig"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.memories"
fqcn: "com.hypixel.hytale.builtin.adventure.memories.MemoriesGameplayConfig"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "memories"
  - "config"
  - "gameplay"
---

**Package:** `com.hypixel.hytale.builtin.adventure.memories`

```java
public class MemoriesGameplayConfig
```

Gameplay configuration for the memories system, loaded as a plugin config from `GameplayConfig`. Defines per-level memory thresholds, particle effects for recording memories, catch item ID, entity catch particle, and view distance for catch particles.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `String` | `ID` |
| `public static final` | `BuilderCodec<MemoriesGameplayConfig>` | `CODEC` |
| `private` | `int[]` | `memoriesAmountPerLevel` |
| `private` | `String` | `memoriesRecordParticles` |
| `private` | `String` | `memoriesCatchItemId` |
| `private` | `ModelParticle` | `memoriesCatchEntityParticle` |
| `private` | `int` | `memoriesCatchParticleViewDistance` |
| `private` | `String` | `memoriesRestoreSoundEventId` |
| `private` | `String` | `memoriesCatchSoundEventId` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `MemoriesGameplayConfig` | `get(@Nonnull GameplayConfig config)` |
| `public` | `int[]` | `getMemoriesAmountPerLevel()` |
| `public` | `String` | `getMemoriesRecordParticles()` |
| `public` | `String` | `getMemoriesCatchItemId()` |
| `public` | `ModelParticle` | `getMemoriesCatchEntityParticle()` |
| `public` | `String` | `getMemoriesRestoreSoundEventId()` |
| `public` | `String` | `getMemoriesCatchSoundEventId()` |
| `public` | `int` | `getMemoriesCatchParticleViewDistance()` |
