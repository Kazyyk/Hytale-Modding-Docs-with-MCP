# PropDistribution

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.propdistributions | Extends: java.lang.Object

public abstract class PropDistribution

Abstract base class for prop distributions in the world generation pipeline. Distributions determine where and which props are placed within a region by emitting (position, prop) pairs through a pipe.

Known subclasses: AssignedPropDistribution, ConstantPropDistribution, NoPropDistribution, PositionsPropDistribution, UnionPropDistribution

Also in this package: AssignedPropDistribution, ConstantPropDistribution, Context, NoPropDistribution, PositionsPropDistribution, UnionPropDistribution

Complete API:
  public abstract void distribute(PropDistribution.Context var1)
  public abstract void forEachPossibleProp(Consumer<Prop> var1)
