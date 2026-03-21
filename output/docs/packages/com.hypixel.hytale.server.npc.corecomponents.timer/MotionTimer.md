---
title: "MotionTimer"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.timer"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.timer.MotionTimer"
api_surface: false
extends: "MotionBase"
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
public abstract class MotionTimer extends MotionBase
```

Abstract generic motion wrapper that constrains a child motion to a random time limit. The child motion is activated and deactivated with this wrapper. If the child motion returns `false` from `computeSteering`, the timer also terminates early.

## Fields

| Field | Type | Description |
|---|---|---|
| `motion` | `T` | The wrapped motion. |
| `atLeastSeconds` | `double` | Minimum active duration. |
| `atMostSeconds` | `double` | Maximum active duration. |
| `activeTime` | `double` | Elapsed active time. |
| `timeToLive` | `double` | Randomly selected duration for this activation. |

## Related Types

- [BodyMotionTimer](BodyMotionTimer.md) -- concrete body motion timer
- [HeadMotionTimer](HeadMotionTimer.md) -- concrete head motion timer
- [BuilderMotionTimer](../com.hypixel.hytale.server.npc.corecomponents.timer.builders/BuilderMotionTimer.md) -- abstract builder base
