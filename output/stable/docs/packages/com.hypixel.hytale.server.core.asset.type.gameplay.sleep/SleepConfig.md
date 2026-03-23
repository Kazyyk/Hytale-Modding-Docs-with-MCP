---
title: "SleepConfig"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.gameplay.sleep"
fqcn: "com.hypixel.hytale.server.core.asset.type.gameplay.sleep.SleepConfig"
api_surface: true
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "asset"
  - "type"
  - "gameplay"
  - "sleep"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.gameplay.sleep`

```java
public class SleepConfig
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<SleepConfig>` | `CODEC` |
| `public static final` | `SleepConfig` | `DEFAULT` |
| `private` | `float` | `wakeUpHour` |
| `private` | `double[]` | `allowedSleepHoursRange` |
| `private` | `SleepSoundsConfig` | `sounds` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `float` | `getWakeUpHour()` |
| `@Nullable public` | `double[]` | `getAllowedSleepHoursRange()` |
| `public` | `SleepSoundsConfig` | `getSounds()` |
| `@Nullable public` | `LocalTime` | `getSleepStartTime()` |
| `public` | `boolean` | `isWithinSleepHoursRange(LocalDateTime gameTime)` |
| `public` | `Duration` | `computeDurationUntilSleep(LocalDateTime now)` |
| `private static` | `float` | `getFractionalHourOfDay(LocalDateTime dateTime)` |
