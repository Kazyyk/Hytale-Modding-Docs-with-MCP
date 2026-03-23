---
title: "SensorTimer"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.timer"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.timer.SensorTimer"
api_surface: false
extends: "SensorBase"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "npc"
  - "timer"
  - "behavior"
---

**Package:** `com.hypixel.hytale.server.npc.corecomponents.timer`

```java
public class SensorTimer extends SensorBase
```

NPC sensor that checks whether a named timer exists and its current value falls within a configurable range. Also checks the timer state (ANY, RUNNING, PAUSED, STOPPED, ELAPSED).

## Fields

| Field | Type | Description |
|---|---|---|
| `timer` | `Timer` | The named timer to check. |
| `timerState` | `Timer.TimerState` | Required timer state. |
| `minTimeRemaining` | `double` | Minimum acceptable value. |
| `maxTimeRemaining` | `double` | Maximum acceptable value. |

## Related Types

- [ActionTimer](ActionTimer.md) -- action that controls timers
- [BuilderSensorTimer](../com.hypixel.hytale.server.npc.corecomponents.timer.builders/BuilderSensorTimer.md) -- JSON builder for this sensor
