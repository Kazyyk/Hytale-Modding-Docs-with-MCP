---
title: "SleepClock"
kind: "class"
package: "com.hypixel.hytale.protocol.packets.world"
fqcn: "com.hypixel.hytale.protocol.packets.world.SleepClock"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "protocol"
  - "packets"
  - "world"
---

**Package:** `com.hypixel.hytale.protocol.packets.world`

```java
public class SleepClock
```

Sub-structure representing sleep clock state, including start/target game times, progress, and duration.

## Fields

| Modifier | Type | Name |
|---|---|---|
| @Nullable public | `InstantData` | `startGametime` |
| @Nullable public | `InstantData` | `targetGametime` |
| public | `float` | `progress` |
| public | `float` | `durationSeconds` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public static` | `SleepClock` | `deserialize(@Nonnull ByteBuf buf, int offset)` |
| `public static` | `int` | `computeBytesConsumed(@Nonnull ByteBuf buf, int offset)` |
| `public` | `void` | `serialize(@Nonnull ByteBuf buf)` |
| `public` | `int` | `computeSize()` |
| `public static` | `ValidationResult` | `validateStructure(@Nonnull ByteBuf buffer, int offset)` |
