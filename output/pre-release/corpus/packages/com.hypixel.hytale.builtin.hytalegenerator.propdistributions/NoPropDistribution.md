# NoPropDistribution

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.propdistributions | Extends: PropDistribution

public class NoPropDistribution extends PropDistribution

A no-op prop distribution that produces no (position, prop) pairs. Singleton accessed via `INSTANCE`.

Also in this package: AssignedPropDistribution, ConstantPropDistribution, Context, PositionsPropDistribution, PropDistribution, UnionPropDistribution

Complete API:
  public void distribute(PropDistribution.Context context)
  public void forEachPossibleProp(Consumer<Prop> consumer)

Fields:
public static final PropDistribution INSTANCE
