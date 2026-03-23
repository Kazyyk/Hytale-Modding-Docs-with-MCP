---
title: "ModifyEvents.BiomeDynamicLayers"
kind: "record"
package: "com.hypixel.hytale.builtin.worldgen.modifier.event"
fqcn: "com.hypixel.hytale.builtin.worldgen.modifier.event.ModifyEvents.BiomeDynamicLayers"
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
public record BiomeDynamicLayers(
```

ModifyEvent record for biome dynamic layer entries.

## Record Components

```java
@Nonnull BiomeFileContext file,
        @Nonnull List<LayerContainer.DynamicLayer> entries,
        @Nonnull ModifyEvent.ContentLoader<LayerContainer.DynamicLayer> loader
```
