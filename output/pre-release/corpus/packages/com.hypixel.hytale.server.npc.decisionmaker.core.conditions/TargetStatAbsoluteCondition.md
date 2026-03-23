# TargetStatAbsoluteCondition

Type: class | Package: com.hypixel.hytale.server.npc.decisionmaker.core.conditions | Extends: ScaledCurveCondition

public class TargetStatAbsoluteCondition extends ScaledCurveCondition

## Fields

- protected String stat
- protected int statIndex

## Methods

- @Override protected double getInput( int selfIndex, ArchetypeChunk<EntityStore> archetypeChunk, @Nullable Ref<EntityStore> target, @Nonnull CommandBuffer<EntityStore> commandBuffer, EvaluationContext context )
- @Override @Nonnull public String toString()

Also in this package: HasTargetCondition, IsInStateCondition, LineOfSightCondition, NearbyCountCondition, RandomiserCondition, SelfHasEffectCondition, SelfStatAbsoluteCondition, SelfStatPercentageCondition, TargetDistanceCondition, TargetHasEffectCondition, TargetMovementStateCondition, TargetStatPercentageCondition, TimeOfDayCondition, TimeSinceLastUsedCondition

Complete API:
  protected double getInput(int selfIndex, ArchetypeChunk<EntityStore> archetypeChunk, Ref<EntityStore> target, CommandBuffer<EntityStore> commandBuffer, EvaluationContext context)
  public String toString()

Fields:
public static final BuilderCodec<TargetStatAbsoluteCondition> CODEC
protected String stat
protected int statIndex
