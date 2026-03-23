# PlayerInput.RelativeMovement

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.player | Implements: PlayerInput.InputUpdate

public static class PlayerInput.RelativeMovement implements PlayerInput.InputUpdate

An input update that moves the player by a relative offset from its current position. Reads the current transform position and calls `Player.moveTo()` with the offset applied.

## Constructors


public RelativeMovement(double x, double y, double z)

## Methods


public double getX()
public void setX(double x)
public double getY()
public void setY(double y)
public double getZ()
public void setZ(double z)


@Override
public void apply(@Nonnull CommandBuffer<EntityStore> commandBuffer, @Nonnull ArchetypeChunk<EntityStore> archetypeChunk, int index)

Adds the relative offset to the current position.

## Related Types

- PlayerInput -- parent component
- PlayerInput.AbsoluteMovement -- absolute position alternative
