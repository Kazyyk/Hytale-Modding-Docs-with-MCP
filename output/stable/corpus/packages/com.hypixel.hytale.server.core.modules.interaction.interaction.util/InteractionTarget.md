# InteractionTarget

Type: enum | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.util

public enum InteractionTarget

Enumeration with values: `USER`, `OWNER`, `TARGET`.

## Enum Constants

- USER | Enumeration constant.
- OWNER | Enumeration constant.
- TARGET | Enumeration constant.

## Accessors

- getEntity(InteractionContext ctx, Ref<EntityStore> ref) | Ref<EntityStore> | Accessor method.

## Methods

- toProtocol() | com.hypixel.hytale.protocol.InteractionTarget | Instance method.

Complete API:
  public Ref<EntityStore> getEntity(InteractionContext ctx, Ref<EntityStore> ref)
  public com.hypixel.hytale.protocol.InteractionTarget toProtocol()

Fields:
public static final EnumCodec<InteractionTarget> CODEC
