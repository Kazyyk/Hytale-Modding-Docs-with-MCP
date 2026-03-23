---
title: "ModifyEvents.BiomeFluids"
kind: "record"
package: "com.hypixel.hytale.builtin.worldgen.modifier.event"
fqcn: "com.hypixel.hytale.builtin.worldgen.modifier.event.ModifyEvents.BiomeFluids"
api_surface: false
generator_version: "2.0.0"
generated_at: "2026-03-22T21:11:59Z"
tags:
  - "worldgen"
  - "modifier"
  - "record"
---

**Package:** `com.hypixel.hytale.builtin.worldgen.modifier.event`

```java
public record BiomeFluids(
```

ModifyEvent record for biome fluid entries.

## Record Components

```java
@Nonnull BiomeFileContext file, @Nonnull List<WaterContainer.Entry> entries, @Nonnull ModifyEvent.ContentLoader<WaterContainer.Entry> loader
```
