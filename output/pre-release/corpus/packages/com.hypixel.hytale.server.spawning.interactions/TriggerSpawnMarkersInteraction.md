# TriggerSpawnMarkersInteraction

Type: class | Package: com.hypixel.hytale.server.spawning.interactions | Extends: SimpleInstantInteraction

public class TriggerSpawnMarkersInteraction extends SimpleInstantInteraction

## Fields

- public static final BuilderCodec<TriggerSpawnMarkersInteraction> CODEC
- private String markerType
- private double range
- private double rangeSquared
- private int count

## Methods

- @Override protected void firstRun(InteractionType type, InteractionContext context, CooldownHandler cooldownHandler)
- protected Ref<EntityStore> filterMarker(Ref<EntityStore> targetRef, Vector3d position, CommandBuffer<EntityStore> commandBuffer)

Complete API:
  protected void firstRun(InteractionType type, InteractionContext context, CooldownHandler cooldownHandler)
  protected Ref<EntityStore> filterMarker(Ref<EntityStore> targetRef, Vector3d position, CommandBuffer<EntityStore> commandBuffer)

Fields:
public static final BuilderCodec<TriggerSpawnMarkersInteraction> CODEC
private String markerType
private double range
private double rangeSquared
private int count
