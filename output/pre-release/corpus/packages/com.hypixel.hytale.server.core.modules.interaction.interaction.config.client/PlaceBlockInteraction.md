# PlaceBlockInteraction

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.client | Extends: SimpleInteraction

public class PlaceBlockInteraction extends SimpleInteraction

Places the current or a specified block at the target position. Handles block rotation, filler blocks, sound events, and item durability. Validates placement against world config and block placement rules via `BlockPlaceUtils`. Requires client-side synchronization.

## Codec

`PlaceBlockInteraction.CODEC` -- `BuilderCodec<PlaceBlockInteraction>` for JSON deserialization from interaction asset files.

## Related Types

- Parent hierarchy types are in package `com.hypixel.hytale.server.core.modules.interaction.interaction.config`

Also in this package: AddItemInteraction, AngledWielding, ApplyForceInteraction, BlockConditionInteraction, BlockIdMatcher, BlockMatcher, BreakBlockInteraction, ChainingInteraction, ChainingTag, ChangeBlockInteraction, ChangeStateInteraction, ChargingInteraction, ChargingTag, CooldownConditionInteraction, CostType, CycleBlockGroupInteraction, Data, DestroyBlockInteraction, ExplodeInteraction, FirstClickInteraction (and 13 more)

Complete API:
  public WaitForDataFrom getWaitForDataFrom()
  protected final void tick0(boolean firstRun, float time, InteractionType type, InteractionContext context, CooldownHandler cooldownHandler)
  protected void simulateTick0(boolean firstRun, float time, InteractionType type, InteractionContext context, CooldownHandler cooldownHandler)
  protected com.hypixel.hytale.protocol.Interaction generatePacket()
  protected void configurePacket(com.hypixel.hytale.protocol.Interaction packet)
  public boolean needsRemoteSync()
  public String toString()

Fields:
public static final int TEMP_MAX_ADVENTURE_PLACEMENT_RANGE_SQUARED
public static final BuilderCodec<PlaceBlockInteraction> CODEC
protected String blockTypeKey
protected boolean removeItemInHand
protected boolean allowDragPlacement
