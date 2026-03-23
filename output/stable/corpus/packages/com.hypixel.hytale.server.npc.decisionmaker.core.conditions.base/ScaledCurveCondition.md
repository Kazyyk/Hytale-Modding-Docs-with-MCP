# ScaledCurveCondition

Type: class | Package: com.hypixel.hytale.server.npc.decisionmaker.core.conditions.base | Extends: Condition

public abstract class ScaledCurveCondition extends Condition

Abstract base class extending `Condition` that provides shared logic for ScaledCurveCondition subclasses.

## Fields

- protected ScaledResponseCurve responseCurve

## Methods

- protected ScaledCurveCondition()
- public ScaledResponseCurve getResponseCurve()
- @Override public double calculateUtility(int selfIndex, ArchetypeChunk<EntityStore> archetypeChunk, Ref<EntityStore> target, CommandBuffer<EntityStore> commandBuffer, EvaluationContext context)
- @Override public int getSimplicity()
- protected abstract double getInput(int var1, ArchetypeChunk<EntityStore> var2, Ref<EntityStore> var3, CommandBuffer<EntityStore> var4, EvaluationContext var5)
- @Nonnull @Override public String toString()
