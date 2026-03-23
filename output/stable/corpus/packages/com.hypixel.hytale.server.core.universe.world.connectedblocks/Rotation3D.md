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

Also in this package: AdjacentSide, ConnectedBlockFaceTags, ConnectedBlockPatternRule, ConnectedBlockResult, ConnectedBlockRuleSet, ConnectedBlockShape, ConnectedBlocksModule, ConnectedBlocksUtil, CustomConnectedBlockPattern, CustomConnectedBlockTemplateAsset, CustomTemplateConnectedBlockPattern, CustomTemplateConnectedBlockRuleSet, IncludeOrExclude, MirrorAxis, PatternRotationDefinition

Complete API:
  public void assign(Rotation yaw, Rotation pitch, Rotation roll)
  public void assign(RotationTuple rotation)
  public void add(Rotation3D toAdd)
  public void subtract(Rotation3D toSubtract)
  public void negate()
  public Rotation3D rotateSelfBy(Rotation rotationYawToRotate, Rotation rotationPitchToRotate, Rotation rotationRollToRotate)
  public void rotateSelfBy(Rotation3D rotation)

Fields:
public Rotation rotationYaw
public Rotation rotationPitch
public Rotation rotationRoll
