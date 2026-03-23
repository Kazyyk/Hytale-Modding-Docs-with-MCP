---
title: "ModifyEvents.BiomeEnvironments"
kind: "record"
package: "com.hypixel.hytale.builtin.worldgen.modifier.event"
fqcn: "com.hypixel.hytale.builtin.worldgen.modifier.event.ModifyEvents.BiomeEnvironments"
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
public record BiomeEnvironments(
```

ModifyEvent record for biome environment entries.

## Record Components

```java
@Nonnull BiomeFileContext file,
        @Nonnull List<EnvironmentContainer.EnvironmentContainerEntry> entries,
        @Nonnull ModifyEvent.ContentLoader<EnvironmentContainer.EnvironmentContainerEntry> loader
```
