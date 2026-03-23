---
title: "com.hypixel.hytale.server.npc.corecomponents.utility.builders"
kind: "package"
package: "com.hypixel.hytale.server.npc.corecomponents.utility.builders"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.utility.builders"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "npc"
  - "builder"
  - "behavior"
---

**Package:** `com.hypixel.hytale.server.npc.corecomponents.utility.builders`

Builder classes for NPC behavior tree components. Provides JSON-configurable builders for actions (do-nothing, random selection, sequencing, flag setting, timeouts, instruction resets), motion controllers (body/head motion with nothing/sequence variants), and sensors (boolean logic, evaluation, flags, random, switch, value providers, position adjustment).

## Types

| Type | Kind | Description |
|---|---|---|
| [BuilderActionNothing](BuilderActionNothing.md) | class | Builds an `ActionNothing` -- a no-op action used as a placeholder in behavior trees. |
| [BuilderActionRandom](BuilderActionRandom.md) | class | Builds an `ActionRandom` that selects randomly from a weighted list of child actions. |
| [BuilderActionResetInstructions](BuilderActionResetInstructions.md) | class | Builds an `ActionResetInstructions` that resets the NPC's instruction set. |
| [BuilderActionSequence](BuilderActionSequence.md) | class | Builds an `ActionSequence` that executes a list of child actions in order. |
| [BuilderActionSetFlag](BuilderActionSetFlag.md) | class | Builds an `ActionSetFlag` that sets a named flag on the NPC blackboard. |
| [BuilderActionTimeout](BuilderActionTimeout.md) | class | Builds an `ActionTimeout` that wraps a child action with a configurable time limit. |
| [BuilderBodyMotionNothing](BuilderBodyMotionNothing.md) | class | Builds a no-op body motion controller. |
| [BuilderBodyMotionSequence](BuilderBodyMotionSequence.md) | class | Builds a body motion controller that plays a sequence of motions. |
| [BuilderHeadMotionNothing](BuilderHeadMotionNothing.md) | class | Builds a no-op head motion controller. |
| [BuilderHeadMotionSequence](BuilderHeadMotionSequence.md) | class | Builds a head motion controller that plays a sequence of head motions. |
| [BuilderMotionSequence](BuilderMotionSequence.md) | class | Shared builder for motion sequence entries used by both body and head motion sequence builders. |
| [BuilderSensorAdjustPosition](BuilderSensorAdjustPosition.md) | class | Builds a sensor that adjusts the NPC's target position based on configurable offset parameters. |
| [BuilderSensorAnd](BuilderSensorAnd.md) | class | Builds a composite sensor that returns true only when all child sensors return true (logical AND). |
| [BuilderSensorAny](BuilderSensorAny.md) | class | Builds a composite sensor that returns true when any child sensor returns true. |
| [BuilderSensorEval](BuilderSensorEval.md) | class | Builds a sensor that evaluates an expression against the NPC's blackboard context. |
| [BuilderSensorFlag](BuilderSensorFlag.md) | class | Builds a sensor that checks whether a named flag is set on the NPC blackboard. |
| [BuilderSensorMany](BuilderSensorMany.md) | class | Builds a composite sensor operating on multiple child sensors with configurable aggregation. |
| [BuilderSensorNot](BuilderSensorNot.md) | class | Builds a sensor that inverts the result of a child sensor (logical NOT). |
| [BuilderSensorOr](BuilderSensorOr.md) | class | Builds a composite sensor that returns true when at least one child sensor returns true (logical OR). |
| [BuilderSensorRandom](BuilderSensorRandom.md) | class | Builds a sensor that returns true with a configurable probability. |
| [BuilderSensorSwitch](BuilderSensorSwitch.md) | class | Builds a sensor that selects between child sensors based on a switch condition. |
| [BuilderSensorValueProviderWrapper](BuilderSensorValueProviderWrapper.md) | class | Builds a sensor that wraps a value provider, returning true when the provided value meets a condition. |
| [BuilderValueToParameterMapping](BuilderValueToParameterMapping.md) | class | Builder for mapping value provider outputs to NPC action parameters. |
