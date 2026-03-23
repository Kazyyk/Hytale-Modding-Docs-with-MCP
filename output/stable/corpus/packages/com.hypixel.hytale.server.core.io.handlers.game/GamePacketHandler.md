# GamePacketHandler

Type: class | Package: com.hypixel.hytale.server.core.io.handlers.game | Extends: GenericPacketHandler | Implements: IPacketHandler

public class GamePacketHandler extends GenericPacketHandler implements IPacketHandler

Main game packet handler processing gameplay-related client packets including movement, interaction, and world operations.

Also in this package: InventoryPacketHandler

Complete API:
  public Deque<SyncInteractionChain> getInteractionPacketQueue()
  public PlayerRef getPlayerRef()
  public void setPlayerRef(PlayerRef playerRef, Player playerComponent)
  public String getIdentifier()
  protected void registered0(PacketHandler oldHandler)
  protected void registerHandlers()
  public void closed(ChannelHandlerContext ctx)
  public void disconnect(String message)
  public void handle(Disconnect packet)
  public void handleMouseInteraction(MouseInteraction packet, PlayerRef playerRef, Ref<EntityStore> ref, World world, Store<EntityStore> store)
  public void handle(ClientMovement packet)
  public void handle(ChatMessage packet)
  public void handle(RequestAssets packet)
  public void handle(CustomPageEvent packet)
  public void handleViewRadius(ViewRadius packet, PlayerRef playerRef, Ref<EntityStore> ref, World world, Store<EntityStore> store)
  public void handleUpdateLanguage(UpdateLanguage packet, PlayerRef playerRef, Ref<EntityStore> ref, World world, Store<EntityStore> store)
  protected void handleClientOpenWindow(ClientOpenWindow packet, PlayerRef playerRef, Ref<EntityStore> ref, World world, Store<EntityStore> store)
  public void handleSendWindowAction(SendWindowAction packet, PlayerRef playerRef, Ref<EntityStore> ref, World world, Store<EntityStore> store)
  public void handleSyncPlayerPreferences(SyncPlayerPreferences packet, PlayerRef playerRef, Ref<EntityStore> ref, World world, Store<EntityStore> store)
  public void handleClientPlaceBlock(ClientPlaceBlock packet, PlayerRef playerRef, Ref<EntityStore> ref, World world, Store<EntityStore> store)
  public void handleRemoveMapMarker(RemoveMapMarker packet, PlayerRef playerRef, Ref<EntityStore> ref, World world, Store<EntityStore> store)
  public void handleCloseWindow(CloseWindow packet, PlayerRef playerRef, Ref<EntityStore> ref, World world, Store<EntityStore> store)
  public void handle(UpdateServerAccess packet)
  public void handle(SetServerAccess packet)
  public void handle(RequestMachinimaActorModel packet)
  public void handleUpdateMachinimaScene(UpdateMachinimaScene packet, PlayerRef playerRef, Ref<EntityStore> ref, World world, Store<EntityStore> store)
  public void handle(ClientReady packet)
  public void handleUpdateWorldMapVisible(UpdateWorldMapVisible packet, PlayerRef playerRef, Ref<EntityStore> ref, World world, Store<EntityStore> store)
  public void handleTeleportToWorldMapMarker(TeleportToWorldMapMarker packet, PlayerRef playerRef, Ref<EntityStore> ref, World world, Store<EntityStore> store)
  public void handleTeleportToWorldMapPosition(TeleportToWorldMapPosition packet, PlayerRef playerRef, Ref<EntityStore> ref, World world, Store<EntityStore> store)
  public void handleCreateUserMarker(CreateUserMarker packet, PlayerRef playerRef, Ref<EntityStore> ref, World world, Store<EntityStore> store)
  public void handle(SyncInteractionChains packet)
  public void handleMountMovement(MountMovement packet, PlayerRef playerRef, Ref<EntityStore> ref, World world, Store<EntityStore> store)
  public void handleSetPaused(SetPaused packet, PlayerRef playerRef, Ref<EntityStore> ref, World world, Store<EntityStore> store)
  public void handleRequestFlyCameraMode(RequestFlyCameraMode packet, PlayerRef playerRef, Ref<EntityStore> ref, World world, Store<EntityStore> store)

Fields:
private static final double RELATIVE_POSITION_DELTA_SCALE
private PlayerRef playerRef
private Player playerComponent
private final Deque<SyncInteractionChain> interactionPacketQueue
