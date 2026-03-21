---
title: "InstructionType"
kind: "enum"
package: "com.hypixel.hytale.server.npc.asset.builder"
fqcn: "com.hypixel.hytale.server.npc.asset.builder.InstructionType"
api_surface: false
extends: ~
implements:
  - "Supplier<String>"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "npc"
  - "asset"
  - "builder"
---

**Package:** `com.hypixel.hytale.server.npc.asset.builder`

```java
public enum InstructionType implements Supplier<String>
```

Defines the instruction context types in the NPC behavior tree. Used by [InstructionContextHelper](InstructionContextHelper.md) to validate that actions, sensors, and motions are placed in appropriate instruction slots.

## Constants

| Constant | Description |
|---|---|
| `Default` | `"the default behaviour instruction"` -- the main behavior tree root. |
| `Interaction` | `"the interaction instruction"` -- triggered by player/NPC interaction. |
| `Death` | `"the death instruction"` -- executed on NPC death. |
| `Component` | `"a component"` -- a reusable component reference. |
| `StateTransitions` | `"state transition actions"` -- actions triggered by state changes. |

## Static Fields

| Field | Type | Contents |
|---|---|---|
| `Any` | `EnumSet<InstructionType>` | All values. |
| `MotionAllowedInstructions` | `EnumSet<InstructionType>` | `Default` only. |
| `StateChangeAllowedInstructions` | `EnumSet<InstructionType>` | `Default, Interaction, Death, Component`. |

## Methods

### get

```java
public String get()
```

Returns the human-readable description.

## Related Types

- [InstructionContextHelper](InstructionContextHelper.md) -- uses this for context validation
- [ComponentContext](ComponentContext.md) -- the other context dimension
- [BuilderSupport](BuilderSupport.md) -- tracks the current instruction context
