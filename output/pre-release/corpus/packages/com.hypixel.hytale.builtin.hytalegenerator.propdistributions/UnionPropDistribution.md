# UnionPropDistribution

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.propdistributions | Extends: PropDistribution

public class UnionPropDistribution extends PropDistribution

A composite prop distribution that executes multiple child distributions sequentially on the same context.

Also in this package: AssignedPropDistribution, ConstantPropDistribution, Context, NoPropDistribution, PositionsPropDistribution, PropDistribution

Complete API:
  public void distribute(PropDistribution.Context context)
  public void forEachPossibleProp(Consumer<Prop> consumer)

Fields:
private final List<PropDistribution> propDistributions
