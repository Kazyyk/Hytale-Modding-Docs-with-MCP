# NPCVelocityInstructionSystem

Type: class | Package: com.hypixel.hytale.server.npc.systems | Extends: EntityTickingSystem<EntityStore>

public class NPCVelocityInstructionSystem extends EntityTickingSystem<EntityStore>

Processes velocity instructions from the physics system for NPC entities. Iterates over `Velocity.Instruction` entries and delegates to the role's motion controller:

- **Set** instructions: calls `role.processSetVelocityInstruction(velocity, config)`
- **Add** instructions: calls `role.processAddVelocityInstruction(velocity, config)`

After processing, all instructions are cleared from the velocity component. When `DebugUtils.DISPLAY_FORCES` is enabled, force debug visualizations are rendered.

## Execution Order

- GenericVelocityInstructionSystem | BEFORE
- EntityModule.getVelocityModifyingSystemType() | AFTER (via `SystemTypeDependency`)

## Query

Matches entities with `NPCEntity` and `Velocity` components.

## Related Types

- ComputeVelocitySystem -- computes velocity from position deltas
- SteeringSystem -- applies steering forces
