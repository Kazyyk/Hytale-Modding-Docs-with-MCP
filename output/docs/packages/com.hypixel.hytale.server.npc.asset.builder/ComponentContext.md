---
title: "ComponentContext"
kind: "enum"
package: "com.hypixel.hytale.server.npc.asset.builder"
fqcn: "com.hypixel.hytale.server.npc.asset.builder.ComponentContext"
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
public enum ComponentContext implements Supplier<String>
```

Defines the sensor context in which a component operates within the NPC behavior tree. Used by [InstructionContextHelper](InstructionContextHelper.md) to validate that components are placed in appropriate sensor contexts.

## Constants

| Constant | Description |
|---|---|
| `SensorSelf` | `"self sensor"` -- the component operates in a self-sensing context. |
| `SensorTarget` | `"target sensor"` -- the component operates in a target-sensing context. |
| `SensorEntity` | `"entity sensor"` -- the component operates in an entity-sensing context. |

## Static Fields

| Field | Type | Description |
|---|---|---|
| `NotSelfEntitySensor` | `EnumSet<ComponentContext>` | Contains `SensorTarget` and `SensorEntity`. |

## Methods

### get

```java
public String get()
```

Returns the human-readable description string.

## Related Types

- [InstructionContextHelper](InstructionContextHelper.md) -- validates component context
- [InstructionType](InstructionType.md) -- the other context dimension
