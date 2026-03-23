# ClearEntityEffectInteraction

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.server | Extends: com.hypixel.hytale.server.core.modules.interaction.interaction.config.SimpleInstantInteraction

public class ClearEntityEffectInteraction extends SimpleInstantInteraction

Removes a specified entity effect from the target entity. Resolves the effect by asset ID, then calls `EffectControllerComponent.removeEffect` on the target.

## Codec Properties

- EntityEffectId | String | Yes | -- | The asset ID of the entity effect to remove. Validated against `EntityEffect.VALIDATOR_CACHE`.
- Entity | InteractionTarget | Yes | USER | The entity to target for this interaction. Inherited from parent.

## Fields

- String entityEffectId
- InteractionTarget entityTarget

## Methods


@Override
protected void firstRun(@Nonnull InteractionType type, @Nonnull InteractionContext context, @Nonnull CooldownHandler cooldownHandler)

Resolves the target entity via `InteractionTarget.getEntity`, looks up the `EntityEffect` asset, and removes it from the target's `EffectControllerComponent`.


@Nonnull
@Override
protected Interaction generatePacket()

Returns a new `com.hypixel.hytale.protocol.ClearEntityEffectInteraction` packet.


@Override
protected void configurePacket(Interaction packet)

Sets the `effectId` (resolved index) and `entityTarget` on the protocol packet.


@Nonnull
@Override
public String toString()

## See Also

- `EntityEffect` -- the effect asset being cleared
- `EffectControllerComponent` -- manages active effects on entities

Also in this package: AngledDamage, BlockCustomPageSupplier, BlockEntityCustomPageSupplier, BlockSearchConsumer, ChangeStatBaseInteraction, ChangeStatInteraction, ChangeStatWithModifierInteraction, CheckUniqueItemUsageInteraction, CustomPageSupplier, DamageEntityInteraction, DestroyConditionInteraction, DoorInfo, DoorInteraction, DoorState, EntityStatOnHit, EquipItemInteraction, IncreaseBackpackCapacityInteraction, InterruptInteraction, LaunchPadInteraction, LaunchProjectileInteraction (and 13 more)

Complete API:
  protected void firstRun(InteractionType type, InteractionContext context, CooldownHandler cooldownHandler)
  protected Interaction generatePacket()
  protected void configurePacket(Interaction packet)
  public String toString()

Fields:
public static final BuilderCodec<ClearEntityEffectInteraction> CODEC
protected String entityEffectId
private InteractionTarget entityTarget
