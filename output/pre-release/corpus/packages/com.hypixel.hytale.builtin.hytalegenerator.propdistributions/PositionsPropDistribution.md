# PositionsPropDistribution

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.propdistributions | Extends: PropDistribution

public class PositionsPropDistribution extends PropDistribution

A prop distribution that generates positions from a position provider and assigns `EmptyProp.INSTANCE` to each. Intended as a base layer for other distributions to override.

Also in this package: AssignedPropDistribution, ConstantPropDistribution, Context, NoPropDistribution, PropDistribution, UnionPropDistribution

Complete API:
  public void distribute(PropDistribution.Context context)
  public void forEachPossibleProp(Consumer<Prop> consumer)

Fields:
private final PositionProvider positionProvider
private final PositionProvider.Context rPositionProviderContext
private PropDistribution.Context rContext
private final Pipe.One<Vector3d> rPositionsPipe
