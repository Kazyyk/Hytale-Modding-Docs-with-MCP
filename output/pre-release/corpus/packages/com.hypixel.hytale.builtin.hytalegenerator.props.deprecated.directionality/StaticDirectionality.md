# StaticDirectionality

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.props.deprecated.directionality | Extends: Directionality

public class StaticDirectionality extends Directionality

A directionality that always returns a single fixed rotation. This type is deprecated.

Also in this package: Directionality, OrthogonalDirection, PatternDirectionality, RandomDirectionality, RotatedPosition, RotatedPositionsScanResult

Complete API:
  public PrefabRotation getRotationAt(Pattern.Context context)
  public Pattern getGeneralPattern()
  public Bounds3i getBoundsWith_voxelGrid(Scanner scanner)
  public List<PrefabRotation> getPossibleRotations()

Fields:
private final List<PrefabRotation> possibleRotations
private final PrefabRotation rotation
private final Pattern pattern
