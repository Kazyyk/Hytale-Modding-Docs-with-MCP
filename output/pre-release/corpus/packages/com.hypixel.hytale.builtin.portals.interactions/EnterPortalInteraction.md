# EnterPortalInteraction

Type: class | Package: com.hypixel.hytale.builtin.portals.interactions

public class EnterPortalInteraction

Interaction handler for entering a portal, initiating world transition to the portal destination.

Also in this package: ReturnPortalInteraction, TargetWorldState

Complete API:
  public WaitForDataFrom getWaitForDataFrom()
  protected void interactWithBlock(World world, CommandBuffer<EntityStore> commandBuffer, InteractionType type, InteractionContext context, ItemStack itemInHand, Vector3i targetBlock, CooldownHandler cooldownHandler)
  private static CompletableFuture<EnterPortalInteraction.TargetWorldState> fetchTargetWorldState(World world, UUID playerId)
  protected void simulateInteractWithBlock(InteractionType type, InteractionContext context, ItemStack itemInHand, World world, Vector3i targetBlock)

Fields:
private static final Message MESSAGE_PORTALS_DEVICE_REF_INVALID
private static final Message MESSAGE_PORTALS_DEVICE_WORLD_IS_DEAD
private static final Message MESSAGE_PORTALS_DEVICE_NO_SPAWN
private static final Message MESSAGE_PORTALS_DEVICE_BLOCK_ENTITY_REF_INVALID
public static final Duration MINIMUM_TIME_IN_WORLD
public static final BuilderCodec<EnterPortalInteraction> CODEC
