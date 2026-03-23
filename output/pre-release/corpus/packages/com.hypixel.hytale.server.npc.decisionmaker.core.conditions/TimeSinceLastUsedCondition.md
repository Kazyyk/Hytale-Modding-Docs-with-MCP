# TimeSinceLastUsedCondition

Type: class | Package: com.hypixel.hytale.server.npc.decisionmaker.core.conditions | Extends: ScaledCurveCondition

public class TimeSinceLastUsedCondition extends ScaledCurveCondition

## Methods

- @Override protected double getInput( int selfIndex, ArchetypeChunk<EntityStore> archetypeChunk, Ref<EntityStore> target, CommandBuffer<EntityStore> commandBuffer, @Nonnull EvaluationContext context )

Also in this package: HasTargetCondition, IsInStateCondition, LineOfSightCondition, NearbyCountCondition, RandomiserCondition, SelfHasEffectCondition, SelfStatAbsoluteCondition, SelfStatPercentageCondition, TargetDistanceCondition, TargetHasEffectCondition, TargetMovementStateCondition, TargetStatAbsoluteCondition, TargetStatPercentageCondition, TimeOfDayCondition

Complete API:
  protected double getInput(int selfIndex, ArchetypeChunk<EntityStore> archetypeChunk, Ref<EntityStore> target, CommandBuffer<EntityStore> commandBuffer, EvaluationContext context)

Fields:
public static final BuilderCodec<TimeSinceLastUsedCondition> CODEC
