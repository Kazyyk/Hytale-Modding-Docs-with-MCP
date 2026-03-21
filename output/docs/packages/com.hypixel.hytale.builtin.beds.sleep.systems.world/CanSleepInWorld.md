---
title: "CanSleepInWorld"
kind: "class"
package: "com.hypixel.hytale.builtin.beds.sleep.systems.world"
fqcn: "com.hypixel.hytale.builtin.beds.sleep.systems.world.CanSleepInWorld"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "beds"
  - "sleep"
  - "systems"
---

**Package:** `com.hypixel.hytale.builtin.beds.sleep.systems.world`

```java
public final class CanSleepInWorld
```

Provides CanSleepInWorld functionality within the world subsystem.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public static` | `CanSleepInWorld.Result` | `check(@Nonnull World world)` |
| `public` | `record` | `NotDuringSleepHoursRange(LocalDateTime worldTime, SleepConfig sleepConfig)` |
