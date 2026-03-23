# PlayerSetupConnectEvent

Type: class | Package: com.hypixel.hytale.server.core.event.events.player | Extends: PlayerEvent

public class PlayerSetupConnectEvent extends PlayerEvent

Fired during player connection setup phase.

Also in this package: AddPlayerToWorldEvent, DrainPlayerFromWorldEvent, Formatter, PlayerChatEvent, PlayerConnectEvent, PlayerCraftEvent, PlayerDisconnectEvent, PlayerEvent, PlayerInteractEvent, PlayerMouseButtonEvent, PlayerMouseMotionEvent, PlayerReadyEvent, PlayerRefEvent, PlayerSetupDisconnectEvent

Complete API:
  public PacketHandler getPacketHandler()
  public UUID getUuid()
  public String getUsername()
  public PlayerAuthentication getAuth()
  public byte[] getReferralData()
  public boolean isReferralConnection()
  public HostAddress getReferralSource()
  public ClientReferral getClientReferral()
  public void referToServer(String host, int port)
  public void referToServer(String host, int port, byte[] data)
  public String getReason()
  public void setReason(String reason)
  public boolean isCancelled()
  public void setCancelled(boolean cancelled)
  public String toString()

Fields:
public static final String DEFAULT_REASON
private final PacketHandler packetHandler
private final String username
private final UUID uuid
private final PlayerAuthentication auth
private final byte[] referralData
private final HostAddress referralSource
private boolean cancelled
private String reason
private ClientReferral clientReferral
