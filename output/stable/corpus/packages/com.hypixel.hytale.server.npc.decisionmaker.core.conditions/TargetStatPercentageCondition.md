# TargetStatPercentageCondition

Type: class | Package: com.hypixel.hytale.server.npc.decisionmaker.core.conditions | Extends: CurveCondition

public class TargetStatPercentageCondition extends CurveCondition

## Fields

- protected String stat
- protected int statIndex

## Methods

- @Override protected double getNormalisedInput( int selfIndex, ArchetypeChunk<EntityStore> archetypeChunk, @Nullable Ref<EntityStore> target, @Nonnull CommandBuffer<EntityStore> commandBuffer, EvaluationContext context )
- @Override @Nonnull public String toString()

Also in this package: HasTargetCondition, IsInStateCondition, LineOfSightCondition, NearbyCountCondition, RandomiserCondition, SelfStatAbsoluteCondition, SelfStatPercentageCondition, TargetDistanceCondition, TargetMovementStateCondition, TargetStatAbsoluteCondition, TimeOfDayCondition, TimeSinceLastUsedCondition

Complete API:
  protected double getNormalisedInput(int selfIndex, ArchetypeChunk<EntityStore> archetypeChunk, Ref<EntityStore> target, CommandBuffer<EntityStore> commandBuffer, EvaluationContext context)
  public String toString()

Fields:
public static final BuilderCodec<TargetStatPercentageCondition> CODEC
protected String stat
protected int statIndex
