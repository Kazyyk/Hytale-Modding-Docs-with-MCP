# CurveCondition

Type: class | Package: com.hypixel.hytale.server.npc.decisionmaker.core.conditions.base | Extends: Condition

public abstract class CurveCondition extends Condition

Abstract base class extending `Condition` that provides shared logic for CurveCondition subclasses.

## Fields

- protected String responseCurve
- protected ResponseCurve.Reference responseCurveReference

## Methods

- protected CurveCondition()
- public String getResponseCurve()
- @Override public double calculateUtility(int selfIndex, ArchetypeChunk<EntityStore> archetypeChunk, Ref<EntityStore> target, CommandBuffer<EntityStore> commandBuffer, EvaluationContext context)
- @Override public int getSimplicity()
- protected abstract double getNormalisedInput(int var1, ArchetypeChunk<EntityStore> var2, Ref<EntityStore> var3, CommandBuffer<EntityStore> var4, EvaluationContext var5)
- @Nonnull @Override public String toString()
