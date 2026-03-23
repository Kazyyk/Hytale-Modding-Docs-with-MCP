# ChangeStateInteraction

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.client | Extends: SimpleBlockInteraction

public class ChangeStateInteraction extends SimpleBlockInteraction

Changes the state of the target block to another state based on a `Changes` map. The key `"default"` can be used for the initial state of a block. When `UpdateBlockState` is true, the block state update notification is sent. Plays the interaction sound event associated with the new block state, if configured.

## Codec

`ChangeStateInteraction.CODEC` -- `BuilderCodec<ChangeStateInteraction>` for JSON deserialization from interaction asset files.

## Related Types

- Parent hierarchy types are in package `com.hypixel.hytale.server.core.modules.interaction.interaction.config`

Also in this package: AddItemInteraction, AngledWielding, ApplyForceInteraction, BlockConditionInteraction, BlockIdMatcher, BlockMatcher, BreakBlockInteraction, ChainingInteraction, ChainingTag, ChangeBlockInteraction, ChargingInteraction, ChargingTag, CooldownConditionInteraction, CostType, CycleBlockGroupInteraction, Data, DestroyBlockInteraction, ExplodeInteraction, FirstClickInteraction, Force (and 13 more)

Complete API:
  protected void interactWithBlock(World world, CommandBuffer<EntityStore> commandBuffer, InteractionType type, InteractionContext context, ItemStack itemInHand, Vector3i targetBlock, CooldownHandler cooldownHandler)
  protected void simulateInteractWithBlock(InteractionType type, InteractionContext context, ItemStack itemInHand, World world, Vector3i targetBlock)
  protected Interaction generatePacket()
  protected void configurePacket(Interaction packet)
  public String toString()

Fields:
public static final BuilderCodec<ChangeStateInteraction> CODEC
private static final int SET_SETTINGS
protected Map<String,String> stateKeys
protected boolean updateBlockState
