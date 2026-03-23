# AssignedPropDistribution

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.propdistributions | Extends: PropDistribution

public class AssignedPropDistribution extends PropDistribution

A prop distribution that wraps another distribution, replacing empty props with props determined by an `Assignments` lookup based on position.

Also in this package: ConstantPropDistribution, Context, NoPropDistribution, PositionsPropDistribution, PropDistribution, UnionPropDistribution

Complete API:
  public void distribute(PropDistribution.Context context)
  public void forEachPossibleProp(Consumer<Prop> consumer)

Fields:
private final PropDistribution propDistribution
private final Assignments assignments
private final boolean isOverrideAllProps
private final PropDistribution.Context rPropDistributionContext
private PropDistribution.Context rContext
private final Pipe.Two<Vector3d,Prop> rChildPipe
