# CooldownConditionInteraction

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.client | Extends: SimpleInstantInteraction

public class CooldownConditionInteraction extends SimpleInstantInteraction

Checks whether a specified cooldown (by `Id`) is currently active. If the cooldown has time remaining, the interaction succeeds (state = Finished); if the cooldown is complete or absent, it fails. For non-player entities, defers to client state.

## Codec

`CooldownConditionInteraction.CODEC` -- `BuilderCodec<CooldownConditionInteraction>` for JSON deserialization from interaction asset files.

## Related Types

- Parent hierarchy types are in package `com.hypixel.hytale.server.core.modules.interaction.interaction.config`

Also in this package: AddItemInteraction, AngledWielding, ApplyForceInteraction, BlockConditionInteraction, BlockIdMatcher, BlockMatcher, BreakBlockInteraction, ChainingInteraction, ChainingTag, ChangeBlockInteraction, ChangeStateInteraction, ChargingInteraction, ChargingTag, CostType, CycleBlockGroupInteraction, Data, DestroyBlockInteraction, ExplodeInteraction, FirstClickInteraction, Force (and 13 more)

Complete API:
  protected void firstRun(InteractionType type, InteractionContext context, CooldownHandler cooldownHandler)
  protected boolean checkCooldown(CooldownHandler cooldownHandler, String cooldownId)
  protected Interaction generatePacket()
  protected void configurePacket(Interaction packet)
  public String toString()

Fields:
public static final BuilderCodec<CooldownConditionInteraction> CODEC
private String cooldown
