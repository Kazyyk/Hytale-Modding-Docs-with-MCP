# SelectOverrideRespawnPointPage

Type: class | Package: com.hypixel.hytale.builtin.beds.respawn | Extends: RespawnPointPage

public class SelectOverrideRespawnPointPage extends RespawnPointPage

## Fields

- private static final String PAGE_SELECT_OVERRIDE_RESPAWN_POINT_PAGE
- private final Vector3i respawnPointToAddPosition
- private final RespawnBlock respawnPointToAdd
- private final PlayerRespawnPointData[] respawnPoints
- private int selectedRespawnPointIndex

## Methods

- public SelectOverrideRespawnPointPage( @Nonnull PlayerRef playerRef, @Nonnull InteractionType interactionType, @Nonnull Vector3i respawnPointToAddPosition, @Nonnull RespawnBlock respawnPointToAdd, @Nonnull PlayerRespawnPointData[] respawnPoints )
- public void build( @Nonnull Ref<EntityStore> ref, @Nonnull UICommandBuilder commandBuilder, @Nonnull UIEventBuilder eventBuilder, @Nonnull Store<EntityStore> store )
- public void handleDataEvent(@Nonnull Ref<EntityStore> ref, @Nonnull Store<EntityStore> store, @Nonnull RespawnPointPage.RespawnPointEventData data)
- private void setSelectedRespawnPoint(@Nonnull RespawnPointPage.RespawnPointEventData data)
