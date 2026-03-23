---
title: "SleepMultiplayer"
kind: "class"
package: "com.hypixel.hytale.protocol.packets.world"
fqcn: "com.hypixel.hytale.protocol.packets.world.SleepMultiplayer"
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
public class SleepMultiplayer
```

Sub-structure representing multiplayer sleep state, tracking how many players are sleeping vs awake and a sample of awake player UUIDs.

## Fields

| Modifier | Type | Name |
|---|---|---|
| public | `int` | `sleepersCount` |
| public | `int` | `awakeCount` |
| @Nullable public | `UUID[]` | `awakeSample` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public static` | `SleepMultiplayer` | `deserialize(@Nonnull ByteBuf buf, int offset)` |
| `public static` | `int` | `computeBytesConsumed(@Nonnull ByteBuf buf, int offset)` |
| `public` | `void` | `serialize(@Nonnull ByteBuf buf)` |
| `public` | `int` | `computeSize()` |
| `public static` | `ValidationResult` | `validateStructure(@Nonnull ByteBuf buffer, int offset)` |
