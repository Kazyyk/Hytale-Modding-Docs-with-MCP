# Modifier

Type: class | Package: com.hypixel.hytale.server.core.modules.entitystats.modifier | Implements: NetworkSerializable<com.hypixel.hytale.protocol.Modifier>

public abstract class Modifier implements NetworkSerializable<com.hypixel.hytale.protocol.Modifier>

## Fields

- public static final CodecMapCodec<Modifier> CODEC
- protected static final BuilderCodec<Modifier> BASE_CODEC
- protected Modifier.ModifierTarget target

## Constructors

- public Modifier()
- public Modifier(Modifier.ModifierTarget target)

## Methods

- public abstract float apply(float var1)
- public Modifier.ModifierTarget getTarget()
- @Nonnull public com.hypixel.hytale.protocol.Modifier toPacket()
- @Override public boolean equals(@Nullable Object o)
- @Override public int hashCode()
- @Nonnull @Override public String toString()

## Inner Types

- `Modifier.ModifierTarget`

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
