# RandomDirectionality

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.props.deprecated.directionality | Extends: Directionality

public class RandomDirectionality extends Directionality

A directionality that always matches and picks a random rotation from all four rotations. This type is deprecated.

Also in this package: Directionality, OrthogonalDirection, PatternDirectionality, RotatedPosition, RotatedPositionsScanResult, StaticDirectionality

Complete API:
  public Pattern getGeneralPattern()
  public Bounds3i getBoundsWith_voxelGrid(Scanner scanner)
  public List<PrefabRotation> getPossibleRotations()
  public PrefabRotation getRotationAt(Pattern.Context context)

Fields:
private final List<PrefabRotation> rotations
private final Pattern pattern
private final RngField rngField
