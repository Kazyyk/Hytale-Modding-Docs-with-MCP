# ResetCooldownInteraction

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.client | Extends: SimpleInstantInteraction

public class ResetCooldownInteraction extends SimpleInstantInteraction

Resets a cooldown to its maximum values. If no explicit `Cooldown` is provided, defaults to the root interaction's cooldown configuration. Resets both the cooldown timer and all charges.

## Codec

`ResetCooldownInteraction.CODEC` -- `BuilderCodec<ResetCooldownInteraction>` for JSON deserialization from interaction asset files.

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
public static final BuilderCodec<ResetCooldownInteraction> CODEC
private InteractionCooldown cooldown
