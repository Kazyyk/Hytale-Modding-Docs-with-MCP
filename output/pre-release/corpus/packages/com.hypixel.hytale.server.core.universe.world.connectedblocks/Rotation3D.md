# Rotation3D

Type: class | Package: com.hypixel.hytale.server.core.universe.world.connectedblocks

public class Rotation3D

Represents a 3D rotation state for connected block face evaluation.

## Key Methods

- public void assign(Rotation yaw, Rotation pitch, Rotation roll)
- public void assign(@Nonnull RotationTuple rotation)
- public void add(@Nonnull Rotation3D toAdd)
- public void subtract(@Nonnull Rotation3D toSubtract)
- public void negate()
- public Rotation3D rotateSelfBy(@Nonnull Rotation rotationYawToRotate, @Nonnull Rotation rotationPitchToRotate, @Nonnull Rotation rotationRollToRotate)
- public void rotateSelfBy(@Nonnull Rotation3D rotation)
