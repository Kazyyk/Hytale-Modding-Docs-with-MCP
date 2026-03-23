---
title: "EventHandler.Modifier"
kind: "record"
package: "com.hypixel.hytale.builtin.worldgen.modifier"
fqcn: "com.hypixel.hytale.builtin.worldgen.modifier.EventHandler.Modifier"
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
public record Modifier(@Nonnull Target target, @Nonnull Op[] ops)
```

Record containing a target and an array of operations to apply to matching events.

## Record Components

```java
@Nonnull Target target, @Nonnull Op[] ops
```
