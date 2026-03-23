# UseWateringCanInteraction

Type: class | Package: com.hypixel.hytale.builtin.adventure.farming.interactions | Extends: SimpleBlockInteraction

public class UseWateringCanInteraction extends SimpleBlockInteraction

Waters a TilledSoilBlock by setting `wateredUntil` to the current game time plus the configured `Duration` (in seconds). If the target is a crop, looks one block below for the soil. Schedules a tick at the watering expiry time.

Also in this package: ChangeFarmingStageInteraction, FertilizeSoilInteraction, HarvestCropInteraction, UseCaptureCrateInteraction, UseCoopInteraction

Complete API:
  protected void interactWithBlock(World world, CommandBuffer<EntityStore> commandBuffer, InteractionType type, InteractionContext context, ItemStack itemInHand, Vector3i targetBlock, CooldownHandler cooldownHandler)
  private boolean waterBlockAt(World world, int x, int y, int z, Instant wateredUntil)
  protected void simulateInteractWithBlock(InteractionType type, InteractionContext context, ItemStack itemInHand, World world, Vector3i targetBlock)

Fields:
public static final BuilderCodec<UseWateringCanInteraction> CODEC
protected long duration
protected String[] refreshModifiers
protected int radiusX
protected int radiusZ
