# DestroyBlockInteraction

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.client | Extends: SimpleInstantInteraction

public class DestroyBlockInteraction extends SimpleInstantInteraction

Destroys the target block at the position specified in the interaction context. Delegates to `BlockHarvestUtils.performBlockBreak()` for the actual block removal.

## Codec

`DestroyBlockInteraction.CODEC` -- `BuilderCodec<DestroyBlockInteraction>` for JSON deserialization from interaction asset files.

## Related Types

- Parent hierarchy types are in package `com.hypixel.hytale.server.core.modules.interaction.interaction.config`

Also in this package: AddItemInteraction, AngledWielding, ApplyForceInteraction, BlockConditionInteraction, BlockIdMatcher, BlockMatcher, BreakBlockInteraction, ChainingInteraction, ChainingTag, ChangeBlockInteraction, ChangeStateInteraction, ChargingInteraction, ChargingTag, CooldownConditionInteraction, CostType, CycleBlockGroupInteraction, Data, ExplodeInteraction, FirstClickInteraction, Force (and 13 more)

Complete API:
  protected void firstRun(InteractionType type, InteractionContext context, CooldownHandler cooldownHandler)

Fields:
public static final BuilderCodec<DestroyBlockInteraction> CODEC
