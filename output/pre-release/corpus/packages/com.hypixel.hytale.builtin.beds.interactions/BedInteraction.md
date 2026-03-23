# BedInteraction

Type: class | Package: com.hypixel.hytale.builtin.beds.interactions | Extends: SimpleBlockInteraction

public class BedInteraction extends SimpleBlockInteraction

Interaction handler extending `SimpleBlockInteraction`.

## Methods

- toString() | String | public method.

Complete API:
  protected void interactWithBlock(World world, CommandBuffer<EntityStore> commandBuffer, InteractionType type, InteractionContext context, ItemStack itemInHand, Vector3i pos, CooldownHandler cooldownHandler)
  protected void simulateInteractWithBlock(InteractionType type, InteractionContext context, ItemStack itemInHand, World world, Vector3i targetBlock)
  private static PlayerRespawnPointData[] getNearbySavedRespawnPoints(Vector3i currentRespawnPointPosition, PlayerRespawnPointData[] respawnPoints, int radiusLimitRespawnPoint)
  public String toString()

Fields:
private static final Message MESSAGE_SERVER_CUSTOM_UI_RESPAWN_POINT_CLAIMED
public static final BuilderCodec<BedInteraction> CODEC
