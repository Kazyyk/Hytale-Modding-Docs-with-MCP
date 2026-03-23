# PlayerInput.AbsoluteMovement

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.player | Implements: PlayerInput.InputUpdate

public static class PlayerInput.AbsoluteMovement implements PlayerInput.InputUpdate

An input update that moves the player to absolute world coordinates. Calls `Player.moveTo()` with the specified x, y, z values.

## Constructors


public AbsoluteMovement(double x, double y, double z)

## Methods


public double getX()
public void setX(double x)
public double getY()
public void setY(double y)
public double getZ()
public void setZ(double z)


@Override
public void apply(@Nonnull CommandBuffer<EntityStore> commandBuffer, @Nonnull ArchetypeChunk<EntityStore> archetypeChunk, int index)

Moves the player entity to the absolute position.

## Related Types

- PlayerInput -- parent component
- PlayerInput.RelativeMovement -- relative position alternative
