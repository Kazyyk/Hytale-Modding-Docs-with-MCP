---
title: "EventHandler.PriorityEntry"
kind: "record"
package: "com.hypixel.hytale.builtin.worldgen.modifier"
fqcn: "com.hypixel.hytale.builtin.worldgen.modifier.EventHandler.PriorityEntry"
api_surface: false
generator_version: "2.0.0"
generated_at: "2026-03-22T21:11:59Z"
tags:
  - "worldgen"
  - "modifier"
  - "record"
---

**Package:** `com.hypixel.hytale.builtin.worldgen.modifier`

```java
public record PriorityEntry(WorldGenModifier modifier, int packPriority) implements Comparable<EventHandler.PriorityEntry>
```

Record pairing a WorldGenModifier with its asset pack priority for sorting.

## Record Components

```java
WorldGenModifier modifier, int packPriority
```
