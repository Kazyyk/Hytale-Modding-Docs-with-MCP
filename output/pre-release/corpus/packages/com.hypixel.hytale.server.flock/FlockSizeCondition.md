# FlockSizeCondition

Type: class | Package: com.hypixel.hytale.server.flock.decisionmaker.conditions | Extends: ScaledCurveCondition

public class FlockSizeCondition extends ScaledCurveCondition

A decision-maker condition that returns the current flock size for the evaluating NPC. Returns `1.0` if the NPC is not in a flock. Registered with codec ID `"FlockSize"`. Extends `ScaledCurveCondition`, enabling response-curve-based scaling for size-dependent behavior decisions.

## Methods


@Override
protected double getInput(int selfIndex, @Nonnull ArchetypeChunk<EntityStore> archetypeChunk, Ref<EntityStore> target, @Nonnull CommandBuffer<EntityStore> commandBuffer, EvaluationContext context)

Returns the `EntityGroup` size of the NPC's flock, or `1.0` if not in a flock.

## Related Types

- FlockMembership -- accessed to find the flock reference
- FlockPlugin -- registers this condition
