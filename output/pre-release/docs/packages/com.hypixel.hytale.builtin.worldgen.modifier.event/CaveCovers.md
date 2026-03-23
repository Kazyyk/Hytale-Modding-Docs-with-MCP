---
title: "ModifyEvents.CaveCovers"
kind: "record"
package: "com.hypixel.hytale.builtin.worldgen.modifier.event"
fqcn: "com.hypixel.hytale.builtin.worldgen.modifier.event.ModifyEvents.CaveCovers"
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
public record CaveCovers(
```

ModifyEvent record for cave cover entries.

## Record Components

```java
@Nonnull CaveFileContext file,
        @Nonnull List<CaveNodeType.CaveNodeCoverEntry> entries,
        @Nonnull ModifyEvent.ContentLoader<CaveNodeType.CaveNodeCoverEntry> loader
```
