# ModelOverride

Type: class | Package: com.hypixel.hytale.server.core.asset.type.entityeffect.config

public class ModelOverride implements NetworkSerializable<com.hypixel.hytale.protocol.ModelOverride>

## Fields

- protected String model
- protected String texture

## Methods

- protected ModelOverride()
- public com.hypixel.hytale.protocol.ModelOverride toPacket()
- public String toString()

Also in this package: AbilityEffects, ApplicationEffects, EntityEffect, OverlapBehavior, RemovalBehavior

Complete API:
  public com.hypixel.hytale.protocol.ModelOverride toPacket()
  public String toString()

Fields:
public static final BuilderCodec<ModelOverride> CODEC
protected String model
protected String texture
protected Map<String,ModelAsset.AnimationSet> animationSetMap
