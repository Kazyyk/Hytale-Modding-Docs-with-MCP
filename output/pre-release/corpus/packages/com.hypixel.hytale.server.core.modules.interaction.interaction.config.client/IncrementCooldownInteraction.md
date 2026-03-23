# IncrementCooldownInteraction

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.client | Extends: SimpleInstantInteraction

public class IncrementCooldownInteraction extends SimpleInstantInteraction

Increases a cooldown's time, charge time, or charge count by specified amounts. The `Id` field identifies the cooldown; if empty, defaults to the root interaction's cooldown. Supports `InterruptRecharge` to stop ongoing recharge. The `ChargeTime` value is negated during decoding (additive becomes subtractive internally).

## Codec

`IncrementCooldownInteraction.CODEC` -- `BuilderCodec<IncrementCooldownInteraction>` for JSON deserialization from interaction asset files.

## Related Types

- Parent hierarchy types are in package `com.hypixel.hytale.server.core.modules.interaction.interaction.config`

Also in this package: AddItemInteraction, AngledWielding, ApplyForceInteraction, BlockConditionInteraction, BlockIdMatcher, BlockMatcher, BreakBlockInteraction, ChainingInteraction, ChainingTag, ChangeBlockInteraction, ChangeStateInteraction, ChargingInteraction, ChargingTag, CooldownConditionInteraction, CostType, CycleBlockGroupInteraction, Data, DestroyBlockInteraction, ExplodeInteraction, FirstClickInteraction (and 13 more)

Complete API:
  protected void firstRun(InteractionType type, InteractionContext context, CooldownHandler cooldownHandler)
  protected void processCooldown(CooldownHandler cooldownHandler, String cooldownId)
  protected Interaction generatePacket()
  protected void configurePacket(Interaction packet)
  public String toString()

Fields:
public static final BuilderCodec<IncrementCooldownInteraction> CODEC
private String cooldown
private float cooldownTime
private float chargeTime
private int charge
private boolean interruptRecharge
