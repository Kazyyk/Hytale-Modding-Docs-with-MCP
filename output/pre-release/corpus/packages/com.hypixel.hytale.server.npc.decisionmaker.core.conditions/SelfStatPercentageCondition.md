# SelfStatPercentageCondition

Type: class | Package: com.hypixel.hytale.server.npc.decisionmaker.core.conditions | Extends: CurveCondition

public class SelfStatPercentageCondition extends CurveCondition

## Fields

- protected String stat
- protected int statIndex

## Methods

- @Override protected double getNormalisedInput( int selfIndex, @Nonnull ArchetypeChunk<EntityStore> archetypeChunk, Ref<EntityStore> target, CommandBuffer<EntityStore> commandBuffer, EvaluationContext context )
- @Override @Nonnull public String toString()

Also in this package: HasTargetCondition, IsInStateCondition, LineOfSightCondition, NearbyCountCondition, RandomiserCondition, SelfHasEffectCondition, SelfStatAbsoluteCondition, TargetDistanceCondition, TargetHasEffectCondition, TargetMovementStateCondition, TargetStatAbsoluteCondition, TargetStatPercentageCondition, TimeOfDayCondition, TimeSinceLastUsedCondition

Complete API:
  protected double getNormalisedInput(int selfIndex, ArchetypeChunk<EntityStore> archetypeChunk, Ref<EntityStore> target, CommandBuffer<EntityStore> commandBuffer, EvaluationContext context)
  public String toString()

Fields:
public static final BuilderCodec<SelfStatPercentageCondition> CODEC
protected String stat
protected int statIndex
