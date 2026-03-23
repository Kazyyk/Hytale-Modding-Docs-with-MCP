# RotatedPosition

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.props.directionality

public class RotatedPosition

Class in the directionality subsystem.

## Fields

- x | int | final int field.
- y | int | final int field.
- z | int | final int field.
- rotation | PrefabRotation | final PrefabRotation field.

## Constructors

- RotatedPosition(int x, int y, int z, @Nonnull PrefabRotation rotation) | Creates a new RotatedPosition instance.

## Methods

- getRelativeTo(@Nonnull RotatedPosition other) | RotatedPosition | public method.
- toVector3i() | Vector3i | public method.

Also in this package: Directionality, OrthogonalDirection, PatternDirectionality, RandomDirectionality, RotatedPositionsScanResult, StaticDirectionality

Complete API:
  public RotatedPosition getRelativeTo(RotatedPosition other)
  public Vector3i toVector3i()

Fields:
public final int x
public final int y
public final int z
public final PrefabRotation rotation
