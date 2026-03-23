# InteractionSystems

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.system

public class InteractionSystems

Container class for ECS systems that manage entity interactions. Houses systems for interaction manager lifecycle, entity tracker synchronization, and interaction ticking.

## Inner Types

- **CleanUpSystem** -- `RefSystem<EntityStore>` that clears the `InteractionManager` when an entity is removed.
- **EntityTrackerRemove** -- `RefChangeSystem<EntityStore, Interactions>` that queues tracker removal updates when the `Interactions` component is removed.
- **PlayerAddManagerSystem** -- `HolderSystem<EntityStore>` that adds an `InteractionManager` component to players on entity add.
- **TickInteractionManagerSystem** -- `EntityTickingSystem<EntityStore>` that ticks interaction managers each frame and sends sync packets to players. Implements `StatModifyingSystem`.
- **TrackerTickSystem** -- `EntityTickingSystem<EntityStore>` that queues interaction component updates to entity tracker viewers.
