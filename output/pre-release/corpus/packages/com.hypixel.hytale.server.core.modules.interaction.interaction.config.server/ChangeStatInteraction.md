# ChangeStatInteraction

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.server | Extends: com.hypixel.hytale.server.core.modules.interaction.interaction.config.server.ChangeStatBaseInteraction

public class ChangeStatInteraction extends ChangeStatBaseInteraction

Changes the given entity stats directly. On first run, retrieves the `EntityStatMap` component from the interacting entity and calls `processStatChanges` with the configured stat modifiers, value type, and behaviour. Uses `EntityStatMap.Predictable.SELF` for prediction.

## Codec Properties

Inherits all codec properties from ChangeStatBaseInteraction. No additional properties.

## Methods


@Override
protected void firstRun(@Nonnull InteractionType type, @Nonnull InteractionContext context, @Nonnull CooldownHandler cooldownHandler)

Retrieves the `EntityStatMap` from the entity's `EntityStore` command buffer and applies stat changes.


@Nonnull
@Override
protected Interaction generatePacket()

Returns a new `com.hypixel.hytale.protocol.ChangeStatInteraction` packet.


@Override
protected void configurePacket(Interaction packet)

Populates the protocol packet with `statModifiers`, `valueType`, `changeStatBehaviour`, and `entityTarget`.


@Nonnull
@Override
public String toString()

## See Also

- ChangeStatBaseInteraction -- parent class providing shared codec fields
- ChangeStatWithModifierInteraction -- variant that applies armor-based modifiers

Also in this package: AngledDamage, BlockEntityCustomPageSupplier, BlockSearchConsumer, ChangeStatBaseInteraction, ChangeStatWithModifierInteraction, CheckUniqueItemUsageInteraction, ClearEntityEffectInteraction, CustomPageSupplier, DamageEntityInteraction, DoorInfo, DoorInteraction, DoorState, EntityStatOnHit, EquipItemInteraction, IncreaseBackpackCapacityInteraction, InterruptInteraction, LaunchPadInteraction, LaunchProjectileInteraction, ModifyInventoryInteraction, OpenContainerInteraction (and 11 more)

Complete API:
  protected void firstRun(InteractionType type, InteractionContext context, CooldownHandler cooldownHandler)
  protected Interaction generatePacket()
  protected void configurePacket(Interaction packet)
  public String toString()

Fields:
public static final BuilderCodec<ChangeStatInteraction> CODEC
