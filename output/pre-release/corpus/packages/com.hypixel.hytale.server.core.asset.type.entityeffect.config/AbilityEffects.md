# AbilityEffects

Type: class | Package: com.hypixel.hytale.server.core.asset.type.entityeffect.config

public class AbilityEffects implements NetworkSerializable<com.hypixel.hytale.protocol.AbilityEffects>

## Fields

- protected Set<InteractionType> disabled

## Methods

- public AbilityEffects(@Nonnull Set<InteractionType> disabled)
- protected AbilityEffects()
- public com.hypixel.hytale.protocol.AbilityEffects toPacket()
- public String toString()

Also in this package: ApplicationEffects, EntityEffect, ModelOverride, OverlapBehavior, RemovalBehavior

Complete API:
  public com.hypixel.hytale.protocol.AbilityEffects toPacket()
  public String toString()

Fields:
public static final BuilderCodec<AbilityEffects> CODEC
protected Set<InteractionType> disabled
