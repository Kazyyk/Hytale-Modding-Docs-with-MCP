---
title: "ActionTimer"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.timer"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.timer.ActionTimer"
api_surface: false
extends: "ActionBase"
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
public class ActionTimer extends ActionBase
```

NPC action that controls named timers. Supports six operations: START, PAUSE, STOP, MODIFY, CONTINUE, and RESTART. Each operation has a corresponding builder subclass and constructor overload.

## Fields

| Field | Type | Description |
|---|---|---|
| `timer` | `Timer` | The named timer to control. |
| `action` | `Timer.TimerAction` | The operation to perform. |
| `minStartValue` | `double` | Start range lower bound (START/MODIFY). |
| `maxStartValue` | `double` | Start range upper bound (START). |
| `rate` | `double` | Countdown rate (START/MODIFY). |
| `repeating` | `boolean` | Whether the timer loops (START/MODIFY). |

## Related Types

- [SensorTimer](SensorTimer.md) -- sensor checking timer state
- [BuilderActionTimerStart](../com.hypixel.hytale.server.npc.corecomponents.timer.builders/BuilderActionTimerStart.md) -- builder for START action
- [BuilderActionTimerStop](../com.hypixel.hytale.server.npc.corecomponents.timer.builders/BuilderActionTimerStop.md) -- builder for STOP action
