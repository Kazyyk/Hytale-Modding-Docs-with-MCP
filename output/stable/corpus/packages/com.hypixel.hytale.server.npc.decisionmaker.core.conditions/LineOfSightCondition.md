# LineOfSightCondition

Type: class | Package: com.hypixel.hytale.server.npc.decisionmaker.core.conditions | Extends: SimpleCondition

public class LineOfSightCondition extends SimpleCondition

## Fields

- protected static final ComponentType<EntityStore, NPCEntity> NPC_COMPONENT_TYPE

## Methods

- @Override public int getSimplicity()
- @Override protected boolean evaluate( int selfIndex, @Nonnull ArchetypeChunk<EntityStore> archetypeChunk, @Nullable Ref<EntityStore> targetRef, @Nonnull CommandBuffer<EntityStore> commandBuffer, EvaluationContext context )

Also in this package: HasTargetCondition, IsInStateCondition, NearbyCountCondition, RandomiserCondition, SelfStatAbsoluteCondition, SelfStatPercentageCondition, TargetDistanceCondition, TargetMovementStateCondition, TargetStatAbsoluteCondition, TargetStatPercentageCondition, TimeOfDayCondition, TimeSinceLastUsedCondition

Complete API:
  public int getSimplicity()
  protected boolean evaluate(int selfIndex, ArchetypeChunk<EntityStore> archetypeChunk, Ref<EntityStore> targetRef, CommandBuffer<EntityStore> commandBuffer, EvaluationContext context)

Fields:
public static final BuilderCodec<LineOfSightCondition> CODEC
protected static final ComponentType<EntityStore,NPCEntity> NPC_COMPONENT_TYPE
