# PatternDirectionality

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.props.deprecated.directionality | Extends: Directionality

public class PatternDirectionality extends Directionality

A directionality that resolves rotation by testing four directional patterns (N/S/E/W) and randomly picking from matches. This type is deprecated.

Also in this package: Directionality, OrthogonalDirection, RandomDirectionality, RotatedPosition, RotatedPositionsScanResult, StaticDirectionality

Complete API:
  public Pattern getGeneralPattern()
  public Bounds3i getBoundsWith_voxelGrid(Scanner scanner)
  public List<PrefabRotation> getPossibleRotations()
  public PrefabRotation getRotationAt(Pattern.Context context)

Fields:
private final List<PrefabRotation> rotations
private final PrefabRotation south
private final PrefabRotation north
private final PrefabRotation east
private final PrefabRotation west
private final Pattern southPattern
private final Pattern northPattern
private final Pattern eastPattern
private final Pattern westPattern
private final Pattern generalPattern
private final RngField rngField
private final Bounds3i bounds_voxelGrid
