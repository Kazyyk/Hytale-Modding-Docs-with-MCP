# TargetMovementStateCondition

Type: class | Package: com.hypixel.hytale.server.npc.decisionmaker.core.conditions | Extends: SimpleCondition

public class TargetMovementStateCondition extends SimpleCondition

## Fields

- protected MovementState movementState

## Methods

- @Override protected boolean evaluate( int selfIndex, ArchetypeChunk<EntityStore> archetypeChunk, @Nullable Ref<EntityStore> target, @Nonnull CommandBuffer<EntityStore> commandBuffer, EvaluationContext context )

Also in this package: HasTargetCondition, IsInStateCondition, LineOfSightCondition, NearbyCountCondition, RandomiserCondition, SelfStatAbsoluteCondition, SelfStatPercentageCondition, TargetDistanceCondition, TargetStatAbsoluteCondition, TargetStatPercentageCondition, TimeOfDayCondition, TimeSinceLastUsedCondition

Complete API:
  protected boolean evaluate(int selfIndex, ArchetypeChunk<EntityStore> archetypeChunk, Ref<EntityStore> target, CommandBuffer<EntityStore> commandBuffer, EvaluationContext context)

Fields:
public static final BuilderCodec<TargetMovementStateCondition> CODEC
protected MovementState movementState
