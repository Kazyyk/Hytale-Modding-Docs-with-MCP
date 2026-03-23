# SelfStatAbsoluteCondition

Type: class | Package: com.hypixel.hytale.server.npc.decisionmaker.core.conditions | Extends: ScaledCurveCondition

public class SelfStatAbsoluteCondition extends ScaledCurveCondition

## Fields

- protected String stat
- protected int statIndex

## Methods

- @Override protected double getInput( int selfIndex, @Nonnull ArchetypeChunk<EntityStore> archetypeChunk, Ref<EntityStore> target, CommandBuffer<EntityStore> commandBuffer, EvaluationContext context )
- @Override @Nonnull public String toString()

Also in this package: HasTargetCondition, IsInStateCondition, LineOfSightCondition, NearbyCountCondition, RandomiserCondition, SelfStatPercentageCondition, TargetDistanceCondition, TargetMovementStateCondition, TargetStatAbsoluteCondition, TargetStatPercentageCondition, TimeOfDayCondition, TimeSinceLastUsedCondition

Complete API:
  protected double getInput(int selfIndex, ArchetypeChunk<EntityStore> archetypeChunk, Ref<EntityStore> target, CommandBuffer<EntityStore> commandBuffer, EvaluationContext context)
  public String toString()

Fields:
public static final BuilderCodec<SelfStatAbsoluteCondition> CODEC
protected String stat
protected int statIndex
