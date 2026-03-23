# OverrideNearbyRespawnPointPage

Type: class | Package: com.hypixel.hytale.builtin.beds.respawn | Extends: RespawnPointPage

public class OverrideNearbyRespawnPointPage extends RespawnPointPage

## Fields

- private static final String PAGE_OVERRIDE_NEARBY_SPAWN_POINT_PAGE
- private final Vector3i respawnPointPosition
- private final RespawnBlock respawnPointToAdd
- private final PlayerRespawnPointData[] nearbyRespawnPoints
- private final int radiusLimitRespawnPoint

## Methods

- public OverrideNearbyRespawnPointPage( @Nonnull PlayerRef playerRef, @Nonnull InteractionType interactionType, @Nonnull Vector3i respawnPointPosition, @Nonnull RespawnBlock respawnPointToAdd, @Nonnull PlayerRespawnPointData[] nearbyRespawnPoints, int radiusLimitRespawnPoint )
- public void build( @Nonnull Ref<EntityStore> ref, @Nonnull UICommandBuilder commandBuilder, @Nonnull UIEventBuilder eventBuilder, @Nonnull Store<EntityStore> store )
- public void handleDataEvent(@Nonnull Ref<EntityStore> ref, @Nonnull Store<EntityStore> store, @Nonnull RespawnPointPage.RespawnPointEventData data)
