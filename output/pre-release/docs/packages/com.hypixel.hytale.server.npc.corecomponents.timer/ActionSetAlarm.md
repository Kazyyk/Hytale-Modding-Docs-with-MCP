---
title: "ActionSetAlarm"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.timer"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.timer.ActionSetAlarm"
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
public class ActionSetAlarm extends ActionBase
```

NPC action that sets or cancels a named persistent alarm timer. Duration is randomly selected from a configurable range. When the max duration is zero, the alarm is cancelled instead of set.

## Fields

| Field | Type | Description |
|---|---|---|
| `alarm` | `Alarm` | The named alarm to set/cancel. |
| `minDuration` | `TemporalAmount` | Minimum alarm duration. |
| `randomVariation` | `long` | Range of random variation in seconds. |
| `cancel` | `boolean` | If true, unsets the alarm instead of setting it. |

## Related Types

- [BuilderActionSetAlarm](../com.hypixel.hytale.server.npc.corecomponents.timer.builders/BuilderActionSetAlarm.md) -- JSON builder for this action
- [SensorAlarm](SensorAlarm.md) -- sensor checking alarm state
