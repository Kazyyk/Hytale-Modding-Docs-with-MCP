---
title: "NPCVelocityInstructionSystem"
kind: "class"
package: "com.hypixel.hytale.server.npc.systems"
fqcn: "com.hypixel.hytale.server.npc.systems.NPCVelocityInstructionSystem"
api_surface: false
extends: "EntityTickingSystem<EntityStore>"
implements: ~
generator_version: "2.0.0"
generated_at: "2026-03-21T02:17:06Z"
tags:
  - "npc"
  - "ecs-system"
  - "physics"
---

**Package:** `com.hypixel.hytale.server.npc.systems`

```java
public class NPCVelocityInstructionSystem extends EntityTickingSystem<EntityStore>
```

Processes velocity instructions from the physics system for NPC entities. Iterates over `Velocity.Instruction` entries and delegates to the role's motion controller:

- **Set** instructions: calls `role.processSetVelocityInstruction(velocity, config)`
- **Add** instructions: calls `role.processAddVelocityInstruction(velocity, config)`

After processing, all instructions are cleared from the velocity component. When `DebugUtils.DISPLAY_FORCES` is enabled, force debug visualizations are rendered.

## Execution Order

| Dependency | Direction |
|---|---|
| `GenericVelocityInstructionSystem` | BEFORE |
| `EntityModule.getVelocityModifyingSystemType()` | AFTER (via `SystemTypeDependency`) |

## Query

Matches entities with `NPCEntity` and `Velocity` components.

## Related Types

- [ComputeVelocitySystem](ComputeVelocitySystem.md) -- computes velocity from position deltas
- [SteeringSystem](SteeringSystem.md) -- applies steering forces
