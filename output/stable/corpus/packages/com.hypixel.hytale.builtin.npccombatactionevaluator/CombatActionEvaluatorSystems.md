# CombatActionEvaluatorSystems

Type: class | Package: com.hypixel.hytale.builtin.npccombatactionevaluator

public class CombatActionEvaluatorSystems

ECS systems for NPC combat action evaluation, including tick processing, basic attack logic, and entity initialization on add.

## Key Methods

- public static ComponentType<EntityStore, CombatActionEvaluatorSystems.CombatConstructionData> getComponentType()
- public String getCombatState()
- public void setCombatState(String state)
- public int getMarkedTargetSlot()
- public void setMarkedTargetSlot(int markedTargetSlot)
- public int getMinRangeSlot()
- public void setMinRangeSlot(int minRangeSlot)
- public int getMaxRangeSlot()
- public void setMaxRangeSlot(int maxRangeSlot)
- public int getPositioningAngleSlot()
- public void setPositioningAngleSlot(int positioningAngleSlot)
- public Component<EntityStore> clone()
- public Set<Dependency<EntityStore>> getDependencies()
- public Query<EntityStore> getQuery()
- public boolean isParallel(int archetypeChunkSize, int taskCount)
- public void tick(float dt, int index, @Nonnull ArchetypeChunk<EntityStore> archetypeChunk, @Nonnull Store<EntityStore> store, @Nonnull CommandBuffer<EntityStore> commandBuffer)
- public void onEntityAdd(@Nonnull Holder<EntityStore> holder, @Nonnull AddReason reason, @Nonnull Store<EntityStore> store)
- public void onEntityRemoved(@Nonnull Holder<EntityStore> holder, @Nonnull RemoveReason reason, @Nonnull Store<EntityStore> store)

Also in this package: CombatConstructionData, EvaluatorTick, NPCCombatActionEvaluatorPlugin, OnAdded, Positioning

Fields:
private static final HytaleLogger LOGGER
