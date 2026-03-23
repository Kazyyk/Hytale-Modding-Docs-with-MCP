---
title: "BlockHealth"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.blockhealth"
fqcn: "com.hypixel.hytale.server.core.modules.blockhealth.BlockHealth"
api_surface: false
extends: null
implements:
  - "Cloneable"
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "blockhealth"
  - "damage"
---

**Package:** `com.hypixel.hytale.server.core.modules.blockhealth`

```java
public class BlockHealth implements Cloneable
```

Tracks the health state of a single block. Health is a float normalized around `1.0` (full health). A block is considered destroyed when health reaches zero or below (checked via `MathUtil.closeToZero`). Also records the game time of the last damage event for regeneration delay calculation.

The `NO_DAMAGE_INSTANCE` sentinel is immutable and represents a block at full health.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BlockHealth` | `NO_DAMAGE_INSTANCE` |
| `private` | `float` | `health` |
| `private` | `Instant` | `lastDamageGameTime` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `float` | `getHealth()` |
| `public` | `void` | `setHealth(float health)` |
| `public` | `Instant` | `getLastDamageGameTime()` |
| `public` | `void` | `setLastDamageGameTime(Instant lastDamageGameTime)` |
| `public` | `boolean` | `isDestroyed()` |
| `public` | `boolean` | `isFullHealth()` |
| `public` | `void` | `deserialize(@Nonnull ByteBuf buf, byte version)` |
| `public` | `void` | `serialize(@Nonnull ByteBuf buf)` |
| `@Nonnull protected` | `BlockHealth` | `clone()` |
