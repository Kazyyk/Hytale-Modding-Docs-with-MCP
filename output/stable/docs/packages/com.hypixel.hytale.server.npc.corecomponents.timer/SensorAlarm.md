---
title: "SensorAlarm"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.timer"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.timer.SensorAlarm"
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
public class SensorAlarm extends SensorBase
```

NPC sensor that checks the state of a named persistent alarm. Supports three states: SET (alarm exists and has not passed), UNSET (alarm not set), and PASSED (alarm time has elapsed). Optionally clears the alarm when PASSED is detected.

## Fields

| Field | Type | Description |
|---|---|---|
| `alarm` | `Alarm` | The named alarm to check. |
| `state` | `SensorAlarm.State` | The state to match against. |
| `clear` | `boolean` | Whether to clear the alarm on PASSED match. |

## Related Types

- [ActionSetAlarm](ActionSetAlarm.md) -- action that sets alarms
- [SensorAlarm.State](SensorAlarm.State.md) -- alarm state enum
- [BuilderSensorAlarm](../com.hypixel.hytale.server.npc.corecomponents.timer.builders/BuilderSensorAlarm.md) -- JSON builder for this sensor
