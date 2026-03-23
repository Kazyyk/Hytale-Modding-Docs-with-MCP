# PlayerInput.WishMovement

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.player | Implements: PlayerInput.InputUpdate

public static class PlayerInput.WishMovement implements PlayerInput.InputUpdate

An input update representing wish-based movement direction, used during knockback prediction. Unlike absolute or relative movement, wish movement is not applied directly but is consumed by the knockback simulation systems.

## Constructors


public WishMovement(double x, double y, double z)

## Methods


public double getX()
public void setX(double x)
public double getY()
public void setY(double y)
public double getZ()
public void setZ(double z)


@Override
public void apply(CommandBuffer<EntityStore> commandBuffer, ArchetypeChunk<EntityStore> archetypeChunk, int index)

No-op. Wish movement is consumed by KnockbackPredictionSystems.CaptureKnockbackInput, not the standard input processing.

## Related Types

- PlayerInput -- parent component
- KnockbackPredictionSystems -- systems that consume wish movement

Also in this package: AbsoluteMovement, AddSystem, ApplyRandomSkinPersistedComponent, AssignmentSystem, BlockPausedMovementSystem, CaptureKnockbackInput, ChunkTracker, ChunkVisibility, ClearOnRemove, ClearOnTeleport, CollisionAxis, EnsureEffectControllerSystem, EnsurePlayerInput, EnsureUniqueItemUsagesSystem, InitKnockback, InitializeSystem, InputUpdate, KillFeedDecedentEventSystem, KillFeedKillerEventSystem, KnockbackPredictionSystems (and 35 more)

Complete API:
  public double getX()
  public void setX(double x)
  public double getY()
  public void setY(double y)
  public double getZ()
  public void setZ(double z)
  public void apply(CommandBuffer<EntityStore> commandBuffer, ArchetypeChunk<EntityStore> archetypeChunk, int index)

Fields:
private double x
private double y
private double z
