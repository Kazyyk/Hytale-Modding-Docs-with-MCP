# ConstantPropDistribution

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.propdistributions | Extends: PropDistribution

public class ConstantPropDistribution extends PropDistribution

A prop distribution that generates positions from a position provider and assigns a single constant prop to every position.

Also in this package: AssignedPropDistribution, Context, NoPropDistribution, PositionsPropDistribution, PropDistribution, UnionPropDistribution

Complete API:
  public void distribute(PropDistribution.Context context)
  public void forEachPossibleProp(Consumer<Prop> consumer)

Fields:
private final PositionProvider positionProvider
private final Prop prop
private final PositionProvider.Context rPositionProviderContext
private final Control rControl
private PropDistribution.Context rContext
private final Pipe.One<Vector3d> rPositionsPipe
