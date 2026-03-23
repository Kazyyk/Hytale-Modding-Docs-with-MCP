# Directionality

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.props.deprecated.directionality | Extends: java.lang.Object

public abstract class Directionality

Abstract base class for determining placement rotation of props based on surrounding block patterns. Provides a general pattern for scanning and a rotation resolver. This type is deprecated.

Known subclasses: PatternDirectionality, RandomDirectionality, StaticDirectionality

Also in this package: OrthogonalDirection, PatternDirectionality, RandomDirectionality, RotatedPosition, RotatedPositionsScanResult, StaticDirectionality

Complete API:
  public abstract PrefabRotation getRotationAt(Pattern.Context var1)
  public abstract Pattern getGeneralPattern()
  public abstract Bounds3i getBoundsWith_voxelGrid(Scanner var1)
  public abstract List<PrefabRotation> getPossibleRotations()
  public static Directionality noDirectionality()
