# UseEntityInteraction

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.client | Extends: SimpleInstantInteraction

public class UseEntityInteraction extends SimpleInstantInteraction

Attempts to use the target entity, executing any interactions configured on it. Resolves the target entity from the client-provided network ID, looks up the entity's `Interactions` component, and runs the interaction associated with the current interaction type. Requires client-side synchronization.

## Codec

`UseEntityInteraction.CODEC` -- `BuilderCodec<UseEntityInteraction>` for JSON deserialization from interaction asset files.

## Related Types

- Parent hierarchy types are in package `com.hypixel.hytale.server.core.modules.interaction.interaction.config`

Also in this package: AddItemInteraction, AngledWielding, ApplyForceInteraction, BlockConditionInteraction, BlockIdMatcher, BlockMatcher, BreakBlockInteraction, ChainingInteraction, ChainingTag, ChangeBlockInteraction, ChangeStateInteraction, ChargingInteraction, ChargingTag, CooldownConditionInteraction, CostType, CycleBlockGroupInteraction, Data, DestroyBlockInteraction, ExplodeInteraction, FirstClickInteraction (and 13 more)

Complete API:
  public WaitForDataFrom getWaitForDataFrom()
  protected final void firstRun(InteractionType type, InteractionContext context, CooldownHandler cooldownHandler)
  protected Interaction generatePacket()
  public boolean needsRemoteSync()
  public String toString()

Fields:
public static final BuilderCodec<UseEntityInteraction> CODEC
