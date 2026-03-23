# RegeneratingModifier

Type: class | Package: com.hypixel.hytale.server.core.modules.entitystats.asset.modifier

public class RegeneratingModifier

Modifies the regeneration amount of an entity stat based on conditions. When all conditions are met, returns the configured `amount` as a multiplier; otherwise returns `1.0` (no modification).

## Fields

- public static final BuilderCodec<RegeneratingModifier> CODEC
- protected Condition[] conditions
- protected float amount

## Methods

- public float getModifier(ComponentAccessor<EntityStore> store, Ref<EntityStore> ref, Instant currentTime)

Complete API:
  public float getModifier(ComponentAccessor<EntityStore> store, Ref<EntityStore> ref, Instant currentTime)
  public String toString()

Fields:
public static final BuilderCodec<RegeneratingModifier> CODEC
protected Condition[] conditions
protected float amount
