# Modifier

Type: class | Package: com.hypixel.hytale.server.core.modules.entitystats | Implements: NetworkSerializable<Modifier>

public abstract class Modifier implements NetworkSerializable<Modifier>

Abstract base class for stat value modifiers. A modifier targets either the `MIN` or `MAX` bound of a stat value. Concrete implementations define how the modifier transforms the bound.

## Static Fields

- CODEC | CodecMapCodec<Modifier> | Polymorphic codec. Registered types: "Boost" and "Static" (both `StaticModifier`).

## Methods

- apply(float) | float | Abstract. Applies this modifier to a stat bound value.
- getTarget() | ModifierTarget | Returns whether this modifier targets `MIN` or `MAX`.
- toPacket() | Modifier` (protocol) | Converts to protocol format. Only `StaticModifier` is supported on the client.

## Inner Types

- Modifier.ModifierTarget

## Related Types

- StaticModifier -- concrete modifier with additive/multiplicative calculation
- DefaultModifiers -- well-known modifier key constants

Known subclasses: StaticModifier

Also in this package: CalculationType, DefaultModifiers, ModifierTarget, StaticModifier

Complete API:
  public abstract float apply(float var1)
  public Modifier.ModifierTarget getTarget()
  public com.hypixel.hytale.protocol.Modifier toPacket()
  public boolean equals(Object o)
  public int hashCode()
  public String toString()

Fields:
public static final CodecMapCodec<Modifier> CODEC
protected static final BuilderCodec<Modifier> BASE_CODEC
protected Modifier.ModifierTarget target
