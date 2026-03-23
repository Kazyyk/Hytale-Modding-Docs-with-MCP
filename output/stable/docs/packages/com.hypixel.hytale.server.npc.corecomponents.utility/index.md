---
title: "com.hypixel.hytale.server.npc.corecomponents.utility"
package: "com.hypixel.hytale.server.npc.corecomponents.utility"
generator_version: "2.0.0"
generated_at: "2026-03-21T06:08:32Z"
---

**Package:** `com.hypixel.hytale.server.npc.corecomponents.utility`

This package provides utility action, sensor, and motion components for the NPC behavior system. These are reusable building blocks for NPC instructions and motion controllers.

## Classes

| Type | Description |
|---|---|
| [ActionNothing](ActionNothing.md) | No-op action that does nothing when executed |
| [ActionRandom](ActionRandom.md) | Action that selects and executes a random child action from a weighted list |
| [ActionResetInstructions](ActionResetInstructions.md) | Action that resets specified instruction indices to their initial state |
| [ActionSequence](ActionSequence.md) | Action that executes a list of child actions in sequence |
| [ActionSetFlag](ActionSetFlag.md) | Action that sets a boolean flag on the NPC's flag store |
| [ActionTimeout](ActionTimeout.md) | Action that wraps a child action with a timeout, executing an alternative action if the timeout expires |
| [BodyMotionNothing](BodyMotionNothing.md) | Body motion component that produces no steering output |
| [BodyMotionSequence](BodyMotionSequence.md) | Body motion component that sequences through multiple body motion steps |
| [HeadMotionNothing](HeadMotionNothing.md) | Head motion component that produces no head steering output |
| [HeadMotionSequence](HeadMotionSequence.md) | Head motion component that sequences through multiple head motion steps |
| [MotionSequence](MotionSequence.md) | Generic base for sequencing motion steps with per-step lifecycle management |
| [SensorAdjustPosition](SensorAdjustPosition.md) | Sensor that adjusts the NPC's target position based on configurable offsets and conditions |
| [SensorAnd](SensorAnd.md) | Composite sensor returning true only if all child sensors return true (logical AND) |
| [SensorAny](SensorAny.md) | Sensor that always evaluates to true regardless of conditions |
| [SensorEval](SensorEval.md) | Sensor that evaluates a compiled expression to determine its boolean result |
| [SensorFlag](SensorFlag.md) | Sensor that reads a boolean flag from the NPC's flag store |
| [SensorMany](SensorMany.md) | Abstract base for composite sensors operating over a list of child sensors |
| [SensorNot](SensorNot.md) | Sensor that inverts the result of a child sensor (logical NOT) |
| [SensorOr](SensorOr.md) | Composite sensor returning true if any child sensor returns true (logical OR) |
| [SensorRandom](SensorRandom.md) | Sensor with configurable random true/false durations |
| [SensorSwitch](SensorSwitch.md) | Sensor that toggles between true and false based on a flag |
| [SensorValueProviderWrapper](SensorValueProviderWrapper.md) | Sensor that wraps a value provider, mapping its output to sensor parameters |
