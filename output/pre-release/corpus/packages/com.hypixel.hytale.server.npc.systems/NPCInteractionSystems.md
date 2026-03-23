# NPCInteractionSystems

Type: class | Package: com.hypixel.hytale.server.npc.systems

public class NPCInteractionSystems

Container class for two ECS systems that manage NPC-player interactions.

## Inner Systems

### NPCInteractionSystems.AddSimulationManagerSystem


public static class AddSimulationManagerSystem extends HolderSystem<EntityStore>

Adds an `InteractionManager` component to NPC entities that do not already have one. The interaction manager uses `NPCInteractionSimulationHandler` to handle NPC-side interaction logic.

**Query:** `NPCEntity AND NOT InteractionManager`


@Override
public void onEntityAdd(@Nonnull Holder<EntityStore> holder, @Nonnull AddReason reason, @Nonnull Store<EntityStore> store)

Creates and adds an `InteractionManager` with the NPC component and a new `NPCInteractionSimulationHandler`.

### NPCInteractionSystems.TickHeldInteractionsSystem


public static class TickHeldInteractionsSystem extends EntityTickingSystem<EntityStore>

Ticks held interactions for NPC entities each frame. Processes `Held`, `HeldOffhand`, and all `Equipped` armor slot interactions.

**Query:** `NPCEntity AND InteractionManager`


@Override
public void tick(
    float dt,
    int index,
    @Nonnull ArchetypeChunk<EntityStore> archetypeChunk,
    @Nonnull Store<EntityStore> store,
    @Nonnull CommandBuffer<EntityStore> commandBuffer
)

For each NPC, calls `InteractionManager.tryRunHeldInteraction()` for:
1. `InteractionType.Held` (main hand)
2. `InteractionType.HeldOffhand` (off hand)
3. `InteractionType.Equipped` for each armor slot (iterated by capacity)

## Related Types

- RoleBuilderSystem -- configures interactions during role setup
- NPCSystems -- lifecycle systems
