# TargetDistanceCondition

Type: class | Package: com.hypixel.hytale.server.npc.decisionmaker.core.conditions | Extends: ScaledCurveCondition

public class TargetDistanceCondition extends ScaledCurveCondition

## Fields

- private static final ComponentType<EntityStore, TransformComponent> TRANSFORM_COMPONENT_TYPE

## Methods

- @Override protected double getInput( int selfIndex, @Nonnull ArchetypeChunk<EntityStore> archetypeChunk, @Nullable Ref<EntityStore> target, @Nonnull CommandBuffer<EntityStore> commandBuffer, EvaluationContext context )

Also in this package: HasTargetCondition, IsInStateCondition, LineOfSightCondition, NearbyCountCondition, RandomiserCondition, SelfHasEffectCondition, SelfStatAbsoluteCondition, SelfStatPercentageCondition, TargetHasEffectCondition, TargetMovementStateCondition, TargetStatAbsoluteCondition, TargetStatPercentageCondition, TimeOfDayCondition, TimeSinceLastUsedCondition

Complete API:
  protected double getInput(int selfIndex, ArchetypeChunk<EntityStore> archetypeChunk, Ref<EntityStore> target, CommandBuffer<EntityStore> commandBuffer, EvaluationContext context)

Fields:
public static final BuilderCodec<TargetDistanceCondition> CODEC
private static final ComponentType<EntityStore,TransformComponent> TRANSFORM_COMPONENT_TYPE
