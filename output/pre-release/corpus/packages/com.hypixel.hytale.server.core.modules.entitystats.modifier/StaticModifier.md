# StaticModifier

Type: class | Package: com.hypixel.hytale.server.core.modules.entitystats.modifier | Extends: Modifier

public class StaticModifier extends Modifier

## Fields

- public static final BuilderCodec<StaticModifier> CODEC
- public static final BuilderCodec<StaticModifier> ENTITY_CODEC
- protected StaticModifier.CalculationType calculationType
- protected float amount

## Constructors

- protected StaticModifier()
- public StaticModifier(Modifier.ModifierTarget target, StaticModifier.CalculationType calculationType, float amount)

## Methods

- public StaticModifier.CalculationType getCalculationType()
- public float getAmount()
- @Override public float apply(float statValue)
- @Nonnull @Override public com.hypixel.hytale.protocol.Modifier toPacket()
- @Override public boolean equals(@Nullable Object o)
- @Override public int hashCode()
- @Nonnull @Override public String toString()

## Inner Types

- `StaticModifier.CalculationType`

Also in this package: CalculationType, DefaultModifiers, Modifier, ModifierTarget

Complete API:
  public StaticModifier.CalculationType getCalculationType()
  public float getAmount()
  public float apply(float statValue)
  public com.hypixel.hytale.protocol.Modifier toPacket()
  public boolean equals(Object o)
  public int hashCode()
  public String toString()

Fields:
public static final BuilderCodec<StaticModifier> CODEC
public static final BuilderCodec<StaticModifier> ENTITY_CODEC
protected StaticModifier.CalculationType calculationType
protected float amount
