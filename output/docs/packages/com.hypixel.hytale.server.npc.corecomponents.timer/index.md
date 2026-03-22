---
title: "com.hypixel.hytale.server.npc.corecomponents.timer"
package: "com.hypixel.hytale.server.npc.corecomponents.timer"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "npc"
  - "timer"
  - "behavior"
  - "package-index"
---

**Package:** `com.hypixel.hytale.server.npc.corecomponents.timer`

NPC behavioral components for time-based actions and sensors. Provides timer and alarm primitives used in NPC behavior trees for delayed actions, timed motions, and scheduled state checks. Each runtime type has a corresponding builder in the `builders` subpackage. None of the types in this package are part of the public API surface.

## Actions

| Type | Kind | Description |
|---|---|---|
| [ActionSetAlarm](ActionSetAlarm.md) | class | Sets or cancels a named persistent alarm with a random duration. |
| [ActionTimer](ActionTimer.md) | class | Controls named timers (start, stop, pause, continue, restart, modify). |

## Motions

| Type | Kind | Description |
|---|---|---|
| [MotionTimer](MotionTimer.md) | class | Abstract wrapper constraining a child motion to a random time limit. |
| [BodyMotionTimer](BodyMotionTimer.md) | class | Body motion with time limit. |
| [HeadMotionTimer](HeadMotionTimer.md) | class | Head motion with time limit. |

## Sensors

| Type | Kind | Description |
|---|---|---|
| [SensorAlarm](SensorAlarm.md) | class | Checks alarm state (SET, UNSET, PASSED) with optional auto-clear. |
| [SensorTimer](SensorTimer.md) | class | Checks timer state and remaining value range. |
| [SensorAlarm.State](SensorAlarm.State.md) | enum | Alarm states: SET, UNSET, PASSED. |
