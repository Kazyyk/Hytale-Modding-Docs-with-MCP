# SimpleCondition

Type: class | Package: com.hypixel.hytale.server.npc.decisionmaker.core.conditions.base | Extends: Condition

public abstract class SimpleCondition extends Condition

Abstract base class extending `Condition` that provides shared logic for SimpleCondition subclasses.

## Fields

- protected double falseValue
- protected double trueValue

## Methods

- protected SimpleCondition()
- @Override public double calculateUtility(int selfIndex, ArchetypeChunk<EntityStore> archetypeChunk, Ref<EntityStore> target, CommandBuffer<EntityStore> commandBuffer, EvaluationContext context)
- @Override public int getSimplicity()
- protected abstract boolean evaluate(int var1, ArchetypeChunk<EntityStore> var2, Ref<EntityStore> var3, CommandBuffer<EntityStore> var4, EvaluationContext var5)
- @Nonnull @Override public String toString()
