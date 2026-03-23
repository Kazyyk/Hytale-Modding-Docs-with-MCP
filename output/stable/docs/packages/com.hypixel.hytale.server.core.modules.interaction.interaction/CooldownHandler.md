---
title: "CooldownHandler"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.CooldownHandler"
api_surface: true
implements: "Tickable"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "interaction"
  - "cooldown"
---

**Package:** `com.hypixel.hytale.server.core.modules.interaction.interaction`

```java
public final class CooldownHandler implements Tickable
```

Manages interaction cooldowns with charge-based timers. Tracks per-interaction cooldowns identified by string IDs, supporting configurable maximum time, charge arrays, and recharge interruption.

## Key Methods

| Method | Return Type | Description |
|---|---|---|
| `isOnCooldown(RootInteraction, String, float, float[], boolean)` | `boolean` | Checks if the specified interaction is currently on cooldown |
| `resetCooldown(String, float, float[], boolean)` | `void` | Resets the cooldown and charges for an interaction |
| `getCooldown(String, float, float[], boolean, boolean)` | `CooldownHandler.Cooldown` | Gets or creates a cooldown entry; returns null if `force` is false and entry does not exist |
| `getCooldown(String)` | `CooldownHandler.Cooldown` | Gets an existing cooldown entry by ID, or null |
| `tick(float)` | `void` | Ticks all active cooldowns, removing expired entries |

## Inner Classes

- `Cooldown` -- tracks remaining cooldown time, charge count, charge timer, and recharge interruption state. Fields: `cooldownMax`, `charges`, `remainingCooldown`, `chargeTimer`, `chargeCount`, `interruptRecharge`.
