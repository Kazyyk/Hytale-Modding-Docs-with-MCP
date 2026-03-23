# TriggerCooldownInteraction

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.client | Extends: SimpleInstantInteraction

public class TriggerCooldownInteraction extends SimpleInstantInteraction

Triggers a cooldown as if it was triggered normally (deducts a charge). If no explicit `Cooldown` is provided, defaults to the root interaction's cooldown. Unlike `ResetCooldownInteraction`, this calls `deductCharge()` instead of `resetCharges()`.

## Codec

`TriggerCooldownInteraction.CODEC` -- `BuilderCodec<TriggerCooldownInteraction>` for JSON deserialization from interaction asset files.

## Related Types

- Parent hierarchy types are in package `com.hypixel.hytale.server.core.modules.interaction.interaction.config`

Also in this package: AddItemInteraction, AngledWielding, ApplyForceInteraction, BlockConditionInteraction, BlockIdMatcher, BlockMatcher, BreakBlockInteraction, ChainingInteraction, ChainingTag, ChangeBlockInteraction, ChangeStateInteraction, ChargingInteraction, ChargingTag, CooldownConditionInteraction, CostType, CycleBlockGroupInteraction, Data, DestroyBlockInteraction, ExplodeInteraction, FirstClickInteraction (and 13 more)

Complete API:
  protected void firstRun(InteractionType type, InteractionContext context, CooldownHandler cooldownHandler)
  protected static void resetCooldown(InteractionContext context, CooldownHandler cooldownHandler, String cooldownId, float cooldownTime, float[] chargeTimes, boolean interruptRecharge0)
  protected Interaction generatePacket()
  protected void configurePacket(Interaction packet)
  public String toString()

Fields:
public static final BuilderCodec<TriggerCooldownInteraction> CODEC
private InteractionCooldown cooldown
