---
title: "com.hypixel.hytale.server.npc.corecomponents.timer.builders"
package: "com.hypixel.hytale.server.npc.corecomponents.timer.builders"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "npc"
  - "timer"
  - "builder"
  - "package-index"
---

**Package:** `com.hypixel.hytale.server.npc.corecomponents.timer.builders`

Builder classes for NPC timer components. Each builder reads JSON configuration and constructs the corresponding runtime timer action, sensor, or motion. None of the types in this package are part of the public API surface.

## Action Builders

| Type | Kind | Description |
|---|---|---|
| [BuilderActionSetAlarm](BuilderActionSetAlarm.md) | class | Builder for `ActionSetAlarm`. |
| [BuilderActionTimer](BuilderActionTimer.md) | class | Abstract base builder for timer control actions. |
| [BuilderActionTimerStart](BuilderActionTimerStart.md) | class | Builder for timer START action. |
| [BuilderActionTimerStop](BuilderActionTimerStop.md) | class | Builder for timer STOP action. |
| [BuilderActionTimerPause](BuilderActionTimerPause.md) | class | Builder for timer PAUSE action. |
| [BuilderActionTimerContinue](BuilderActionTimerContinue.md) | class | Builder for timer CONTINUE action. |
| [BuilderActionTimerRestart](BuilderActionTimerRestart.md) | class | Builder for timer RESTART action. |
| [BuilderActionTimerModify](BuilderActionTimerModify.md) | class | Builder for timer MODIFY action. |

## Motion Builders

| Type | Kind | Description |
|---|---|---|
| [BuilderMotionTimer](BuilderMotionTimer.md) | class | Abstract base builder for motion timers. |
| [BuilderBodyMotionTimer](BuilderBodyMotionTimer.md) | class | Builder for `BodyMotionTimer`. |
| [BuilderHeadMotionTimer](BuilderHeadMotionTimer.md) | class | Builder for `HeadMotionTimer`. |

## Sensor Builders

| Type | Kind | Description |
|---|---|---|
| [BuilderSensorAlarm](BuilderSensorAlarm.md) | class | Builder for `SensorAlarm`. |
| [BuilderSensorTimer](BuilderSensorTimer.md) | class | Builder for `SensorTimer`. |
