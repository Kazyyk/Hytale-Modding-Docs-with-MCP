---
title: "SensorAlarm.State"
kind: "enum"
package: "com.hypixel.hytale.server.npc.corecomponents.timer"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.timer.SensorAlarm.State"
api_surface: false
extends: ~
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
public static enum State implements Supplier<String>
```

States that a `SensorAlarm` can check against.

## Enum Constants

| Constant | Text | Description |
|---|---|---|
| `SET` | `"Set"` | Alarm is set and has not yet passed. |
| `UNSET` | `"Not set"` | Alarm has not been set. |
| `PASSED` | `"Passed"` | Alarm time has elapsed. |
