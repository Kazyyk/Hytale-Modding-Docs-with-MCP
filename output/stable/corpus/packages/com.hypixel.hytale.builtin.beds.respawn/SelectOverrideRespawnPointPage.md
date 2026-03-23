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

Also in this package: OverrideNearbyRespawnPointPage, RespawnPointEventData, RespawnPointPage, SetNameRespawnPointPage

Complete API:
  public void build(Ref<EntityStore> ref, UICommandBuilder commandBuilder, UIEventBuilder eventBuilder, Store<EntityStore> store)
  public void handleDataEvent(Ref<EntityStore> ref, Store<EntityStore> store, RespawnPointPage.RespawnPointEventData data)
  private void setSelectedRespawnPoint(RespawnPointPage.RespawnPointEventData data)

Fields:
private static final Message MESSAGE_SERVER_CUSTOM_UI_NEED_TO_SELECT_RESPAWN_POINT
private static final Value<String> DEFAULT_RESPAWN_BUTTON_STYLE
private static final Value<String> SELECTED_RESPAWN_BUTTON_STYLE
private static final String PAGE_SELECT_OVERRIDE_RESPAWN_POINT_PAGE
private final Vector3i respawnPointToAddPosition
private final RespawnBlock respawnPointToAdd
private final PlayerRespawnPointData[] respawnPoints
private int selectedRespawnPointIndex
