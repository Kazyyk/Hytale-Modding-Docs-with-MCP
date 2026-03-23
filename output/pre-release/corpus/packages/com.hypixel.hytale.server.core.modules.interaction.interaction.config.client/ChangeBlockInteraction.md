# ChangeBlockInteraction

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.client | Extends: SimpleBlockInteraction

public class ChangeBlockInteraction extends SimpleBlockInteraction

Changes the target block to another block based on a `Changes` map (from block type key to block type key). Optionally plays a world sound event at the block location. Supports a `RequireNotBroken` flag that fails the interaction if the held item has zero durability. Lazily resolves block type IDs from keys on first use.

## Codec

`ChangeBlockInteraction.CODEC` -- `BuilderCodec<ChangeBlockInteraction>` for JSON deserialization from interaction asset files.

## Related Types

- Parent hierarchy types are in package `com.hypixel.hytale.server.core.modules.interaction.interaction.config`

Also in this package: AddItemInteraction, AngledWielding, ApplyForceInteraction, BlockConditionInteraction, BlockIdMatcher, BlockMatcher, BreakBlockInteraction, ChainingInteraction, ChainingTag, ChangeStateInteraction, ChargingInteraction, ChargingTag, CooldownConditionInteraction, CostType, CycleBlockGroupInteraction, Data, DestroyBlockInteraction, ExplodeInteraction, FirstClickInteraction, Force (and 13 more)

Complete API:
  protected void processConfig()
  protected void interactWithBlock(World world, CommandBuffer<EntityStore> commandBuffer, InteractionType type, InteractionContext context, ItemStack itemInHand, Vector3i targetBlock, CooldownHandler cooldownHandler)
  private Int2IntMap getChangeMapIds()
  protected void simulateInteractWithBlock(InteractionType type, InteractionContext context, ItemStack itemInHand, World world, Vector3i targetBlock)
  protected Interaction generatePacket()
  protected void configurePacket(Interaction packet)
  public String toString()

Fields:
public static final BuilderCodec<ChangeBlockInteraction> CODEC
private static final int SET_BLOCK_SETTINGS
protected Map<String,String> blockTypeKeys
protected Int2IntMap changeMapIds
protected String soundEventId
protected transient int soundEventIndex
protected boolean requireNotBroken
