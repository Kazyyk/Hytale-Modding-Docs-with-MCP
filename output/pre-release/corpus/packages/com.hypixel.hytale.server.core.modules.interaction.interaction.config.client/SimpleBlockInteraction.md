# SimpleBlockInteraction

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.client | Extends: SimpleInteraction

public abstract class SimpleBlockInteraction extends SimpleInteraction

Abstract base class for all block-targeted interactions. Provides the `UseLatestTarget` codec field that controls whether the client's most recent target block position is used. Subclasses implement `interactWithBlock()` for server-side logic and `simulateInteractWithBlock()` for client-side prediction. Handles target block resolution, chunk lookup, and block face determination.

## Codec

`SimpleBlockInteraction.CODEC` -- `BuilderCodec<SimpleBlockInteraction>` for JSON deserialization from interaction asset files.

## Related Types

- Parent hierarchy types are in package `com.hypixel.hytale.server.core.modules.interaction.interaction.config`

Known subclasses: AddItemInteraction, BedInteraction, BlockConditionInteraction, BlockConditionInteraction, BreakBlockInteraction, BreakBlockInteraction, CanBreakRespawnPointInteraction, ChangeBlockInteraction, ChangeBlockInteraction, ChangeFarmingStageInteraction, ChangeStateInteraction, ChangeStateInteraction, CycleBlockGroupInteraction, DestroyTreasureConditionInteraction, DoorInteraction, EnterPortalInteraction, FertilizeSoilInteraction, HarvestCropInteraction, LaunchPadInteraction, OpenBenchPageInteraction, OpenContainerInteraction, OpenProcessingBenchInteraction, OpenTreasureContainerInteraction, PickBlockInteraction, PickBlockInteraction, PlaceFluidInteraction, ReturnPortalInteraction, SeatingInteraction, SpawnMinecartInteraction, SpawnNPCInteraction, TeleportConfigInstanceInteraction, TeleporterInteraction, UseBlockInteraction, UseBlockInteraction, UseCaptureCrateInteraction, UseCoopInteraction, UseWateringCanInteraction

Also in this package: AddItemInteraction, AngledWielding, ApplyForceInteraction, BlockConditionInteraction, BlockIdMatcher, BlockMatcher, BreakBlockInteraction, ChainingInteraction, ChainingTag, ChangeBlockInteraction, ChangeStateInteraction, ChargingInteraction, ChargingTag, CooldownConditionInteraction, CostType, CycleBlockGroupInteraction, Data, DestroyBlockInteraction, ExplodeInteraction, FirstClickInteraction (and 13 more)

Complete API:
  public WaitForDataFrom getWaitForDataFrom()
  protected void tick0(boolean firstRun, float time, InteractionType type, InteractionContext context, CooldownHandler cooldownHandler)
  protected abstract void interactWithBlock(World var1, CommandBuffer<EntityStore> var2, InteractionType var3, InteractionContext var4, ItemStack var5, Vector3i var6, CooldownHandler var7)
  protected void simulateTick0(boolean firstRun, float time, InteractionType type, InteractionContext context, CooldownHandler cooldownHandler)
  protected abstract void simulateInteractWithBlock(InteractionType var1, InteractionContext var2, ItemStack var3, World var4, Vector3i var5)
  protected void computeCurrentBlockSyncData(InteractionContext context)
  protected com.hypixel.hytale.protocol.Interaction generatePacket()
  protected void configurePacket(com.hypixel.hytale.protocol.Interaction packet)
  public boolean needsRemoteSync()
  public String toString()

Fields:
public static final BuilderCodec<SimpleBlockInteraction> CODEC
private boolean useLatestTarget
