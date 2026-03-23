# NPCDeathSystems

Type: class | Package: com.hypixel.hytale.server.npc.systems

public class NPCDeathSystems

Container class for two ECS systems that process NPC death events.

## Inner Systems

### NPCDeathSystems.EntityViewSystem


public static class EntityViewSystem extends DeathSystems.OnDeathSystem

Posts death events to the blackboard's `EntityEventView` when an NPC or player dies from an entity source. Enables nearby NPCs with entity event sensors to detect deaths. Skips creative-mode players unless `allowNPCDetection` is enabled.

**Query:** `(NPCEntity OR Player) AND TransformComponent`

### NPCDeathSystems.NPCKillsEntitySystem


public static class NPCKillsEntitySystem extends DeathSystems.OnDeathSystem

Notifies the killing NPC's `DamageData` when it kills any living entity. Records the kill position for potential use by sensors.

**Query:** `AllLegacyLivingEntityTypesQuery AND TransformComponent`

## Related Types

- NPCDamageSystems -- damage event handling
- BlackboardSystems -- event view updated by death events

Also in this package: AddSimulationManagerSystem, AddSpawnEntityEffectSystem, AddedFromExternalSystem, AddedFromWorldGenSystem, AddedSystem, AvoidanceSystem, BalancingInitialisationSystem, BeaconAddRemoveSystem, BeaconSystem, BehaviourTickSystem, BlackboardSystems, BreakBlockEventSystem, ComputeVelocitySystem, DamageBlockEventSystem, DamageDealtSystem, DamageReceivedEventViewSystem, DamageReceivedSystem, DropDeathItems, EntityViewSystem, FailedSpawnSystem (and 49 more)
