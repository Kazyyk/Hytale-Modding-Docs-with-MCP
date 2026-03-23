# ReturnPortalInteraction

Type: class | Package: com.hypixel.hytale.builtin.portals.interactions

public class ReturnPortalInteraction

Interaction handler for returning from a portal fragment world back to the source world.

Also in this package: EnterPortalInteraction, TargetWorldState

Complete API:
  protected void interactWithBlock(World world, CommandBuffer<EntityStore> commandBuffer, InteractionType type, InteractionContext context, ItemStack itemInHand, Vector3i targetBlock, CooldownHandler cooldownHandler)
  protected void simulateInteractWithBlock(InteractionType type, InteractionContext context, ItemStack itemInHand, World world, Vector3i targetBlock)
  public WaitForDataFrom getWaitForDataFrom()

Fields:
public static final Duration MINIMUM_TIME_IN_WORLD
public static final Duration WARNING_TIME
public static final BuilderCodec<ReturnPortalInteraction> CODEC
private static final Message MESSAGE_PORTALS_ATTUNING_TO_WORLD
private static final Message MESSAGE_PORTALS_DEVICE_NOT_IN_PORTAL_WORLD
