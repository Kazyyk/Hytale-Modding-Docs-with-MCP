# PlayerWorldData

Type: class | Package: com.hypixel.hytale.server.core.entity.entities.player.data | Implements: UserMapMarkersStore

public final class PlayerWorldData implements UserMapMarkersStore

Implements `UserMapMarkersStore` to provide PlayerWorldData functionality.

## Constants

- private static final int DEATH_POSITIONS_COUNT_MAX

## Fields

- private transient PlayerConfigData playerConfigData
- private Transform lastPosition
- private SavedMovementStates lastMovementStates
- private Map<String, UserMapMarker> mapMarkersById
- private boolean firstSpawn
- @Nullable private PlayerRespawnPointData[] respawnPoints
- @Nonnull private List<PlayerDeathPositionData> deathPositions

## Methods

- private PlayerWorldData()
- public void setPlayerConfigData(@Nonnull PlayerConfigData playerConfigData)
- public Transform getLastPosition()
- public void setLastPosition(@Nonnull Transform lastPosition)
- public SavedMovementStates getLastMovementStates()
- public void setLastMovementStates(@Nonnull MovementStates lastMovementStates, boolean save)
- private void setLastMovementStates_internal(@Nonnull MovementStates lastMovementStates)
- @Nonnull @Override public Collection<? extends UserMapMarker> getUserMapMarkers()
- @Override public Collection<? extends UserMapMarker> getUserMapMarkers(UUID placedByUuid)
- @Override public void setUserMapMarkers(@Nullable Collection<? extends UserMapMarker> markers)
- @Nullable @Override public UserMapMarker getUserMapMarker(String markerId)
- public boolean isFirstSpawn()
- public void setFirstSpawn(boolean firstSpawn)
- @Nullable public PlayerRespawnPointData[] getRespawnPoints()
- public void setRespawnPoints(@Nonnull PlayerRespawnPointData[] respawnPoints)
- @Nonnull public List<PlayerDeathPositionData> getDeathPositions()
- public void addLastDeath(@Nonnull String markerId, @Nonnull Transform transform, int deathDay)
- public boolean removeLastDeath(@Nonnull String markerId)
