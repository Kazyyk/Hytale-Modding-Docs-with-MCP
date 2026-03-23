# RespawnPointPage

Type: class | Package: com.hypixel.hytale.builtin.beds.respawn

public abstract class RespawnPointPage extends InteractiveCustomUIPage<RespawnPointPage.RespawnPointEventData>

## Fields

- private static final int RESPAWN_NAME_MAX_LENGTH
- private String action
- private String indexStr
- private int index
- private String respawnPointName

## Methods

- public RespawnPointPage(@Nonnull PlayerRef playerRef, @Nonnull InteractionType interactionType)
- public abstract void build(@Nonnull Ref<EntityStore> var1, @Nonnull UICommandBuilder var2, @Nonnull UIEventBuilder var3, @Nonnull Store<EntityStore> var4)
- protected void setRespawnPointForPlayer( @Nonnull Ref<EntityStore> ref, @Nonnull Store<EntityStore> store, @Nonnull Vector3i blockPosition, @Nonnull RespawnBlock respawnBlock, @Nonnull String respawnPointName, @Nullable PlayerRespawnPointData... respawnPointsToRemove )
- private static PlayerRespawnPointData[] handleRespawnPointsToRemove( @Nonnull World world, @Nonnull PlayerRespawnPointData[] respawnPoints, @Nullable PlayerRespawnPointData[] respawnPointsToRemove )
- protected void displayError(@Nonnull Message errorMessage)
- public String getAction()
- public int getIndex()
- public String getRespawnPointName()

Known subclasses: OverrideNearbyRespawnPointPage, SelectOverrideRespawnPointPage, SetNameRespawnPointPage

Also in this package: OverrideNearbyRespawnPointPage, RespawnPointEventData, SelectOverrideRespawnPointPage, SetNameRespawnPointPage

Complete API:
  public abstract void build(Ref<EntityStore> var1, UICommandBuilder var2, UIEventBuilder var3, Store<EntityStore> var4)
  protected void setRespawnPointForPlayer(Ref<EntityStore> ref, Store<EntityStore> store, Vector3i blockPosition, RespawnBlock respawnBlock, String respawnPointName, PlayerRespawnPointData respawnPointsToRemove)
  private static PlayerRespawnPointData[] handleRespawnPointsToRemove(World world, PlayerRespawnPointData[] respawnPoints, PlayerRespawnPointData[] respawnPointsToRemove)
  protected void displayError(Message errorMessage)

Fields:
private static final Message MESSAGE_SERVER_CUSTOM_UI_NEED_TO_SET_NAME
private static final int RESPAWN_NAME_MAX_LENGTH
