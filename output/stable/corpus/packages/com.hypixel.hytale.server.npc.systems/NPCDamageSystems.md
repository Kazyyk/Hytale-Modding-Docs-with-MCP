# NPCDamageSystems

Type: class | Package: com.hypixel.hytale.server.npc.systems

public class NPCDamageSystems

Container class for five ECS systems that handle NPC damage events: receiving damage, dealing damage, posting to the blackboard event view, filtering invalid damage, and dropping items on death.

## Inner Systems

### NPCDamageSystems.DamageDealtSystem


public static class DamageDealtSystem extends DamageEventSystem

When an entity takes damage from an NPC source, notifies the source NPC's `DamageData` that it inflicted damage. Operates in the `InspectDamageGroup`.

### NPCDamageSystems.DamageReceivedSystem


public static class DamageReceivedSystem extends DamageEventSystem

Records damage received by NPCs into their `DamageData` via `onSufferedDamage()`. Operates in the `InspectDamageGroup`.

### NPCDamageSystems.DamageReceivedEventViewSystem


public static class DamageReceivedEventViewSystem extends DamageEventSystem

Posts damage events to the blackboard's `EntityEventView` so that nearby NPCs with entity event sensors can detect attacks. Skips creative-mode players unless they have `allowNPCDetection` enabled in their player settings. Operates in the `InspectDamageGroup`.

### NPCDamageSystems.FilterDamageSystem


public static class FilterDamageSystem extends DamageEventSystem

Filters incoming damage by checking `NPCEntity.getCanCauseDamage()`. If the source entity is not permitted to damage the NPC, the damage is cancelled. Operates in the `FilterDamageGroup`.

### NPCDamageSystems.DropDeathItems


public static class DropDeathItems extends DeathSystems.OnDeathSystem

On NPC death (when `ItemsLossMode` is `ALL`), drops inventory items and/or items from the role's drop list. Only processes non-player NPC entities. Items are spawned at the entity's position offset by 1 block upward.

**Query:** `NPCEntity AND TransformComponent AND HeadRotation AND NOT Player`

Drop logic:
1. If `role.isPickupDropOnDeath()`, drops all items from the NPC's inventory.
2. If the role has a `dropListId`, generates random item drops via `ItemModule`.
3. Spawns `ItemComponent` entities for all collected items.

## Related Types

- NPCDeathSystems -- death event handling systems
- BlackboardSystems -- blackboard views updated by damage events

Also in this package: AddSimulationManagerSystem, AddSpawnEntityEffectSystem, AddedFromExternalSystem, AddedFromWorldGenSystem, AddedSystem, AvoidanceSystem, BalancingInitialisationSystem, BeaconAddRemoveSystem, BeaconSystem, BehaviourTickSystem, BlackboardSystems, BreakBlockEventSystem, ComputeVelocitySystem, DamageBlockEventSystem, DamageDealtSystem, DamageReceivedEventViewSystem, DamageReceivedSystem, DropDeathItems, EntityViewSystem, FailedSpawnSystem (and 48 more)
