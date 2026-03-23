---
title: "ModifyEvents.CaveTypes"
kind: "record"
package: "com.hypixel.hytale.builtin.worldgen.modifier.event"
fqcn: "com.hypixel.hytale.builtin.worldgen.modifier.event.ModifyEvents.CaveTypes"
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
public record CaveTypes(@Nonnull CaveFileContext file, @Nonnull List<CaveType> entries, @Nonnull ModifyEvent.ContentLoader<CaveType> loader)
```

ModifyEvent record for cave type entries.

## Record Components

```java
@Nonnull CaveFileContext file, @Nonnull List<CaveType> entries, @Nonnull ModifyEvent.ContentLoader<CaveType> loader
```
