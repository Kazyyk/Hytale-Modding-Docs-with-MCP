# BreakBlockInteraction

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.client | Extends: SimpleBlockInteraction

public class BreakBlockInteraction extends SimpleBlockInteraction

Attempts to break the target block. Supports a `Harvest` mode for gather-style pickup versus standard break. Can specify a `Tool` ID and `MatchTool` flag to require a specific tool. Behavior varies by game mode: Creative mode performs an instant block break, while other modes apply block damage. The `interactWithBlock` method body could not be fully decompiled due to a Vineflower limitation with switch expressions over `GameMode`.

## Codec

`BreakBlockInteraction.CODEC` -- `BuilderCodec<BreakBlockInteraction>` for JSON deserialization from interaction asset files.

## Related Types

- Parent hierarchy types are in package `com.hypixel.hytale.server.core.modules.interaction.interaction.config`

Also in this package: AddItemInteraction, AngledWielding, ApplyForceInteraction, BlockConditionInteraction, BlockIdMatcher, BlockMatcher, ChainingInteraction, ChainingTag, ChangeBlockInteraction, ChangeStateInteraction, ChargingInteraction, ChargingTag, CooldownConditionInteraction, CostType, CycleBlockGroupInteraction, Data, DestroyBlockInteraction, ExplodeInteraction, FirstClickInteraction, Force (and 13 more)

Complete API:
  protected void tick0(boolean firstRun, float time, InteractionType type, InteractionContext context, CooldownHandler cooldownHandler)
  protected void interactWithBlock(World param1, CommandBuffer<EntityStore> param2, InteractionType param3, InteractionContext param4, ItemStack param5, Vector3i param6, CooldownHandler param7)
  protected void simulateInteractWithBlock(InteractionType type, InteractionContext context, ItemStack itemInHand, World world, Vector3i targetBlock)
  protected Interaction generatePacket()
  protected void configurePacket(Interaction packet)
  public String toString()

Fields:
public static final BuilderCodec<BreakBlockInteraction> CODEC
protected boolean harvest
protected String toolId
protected boolean matchTool
