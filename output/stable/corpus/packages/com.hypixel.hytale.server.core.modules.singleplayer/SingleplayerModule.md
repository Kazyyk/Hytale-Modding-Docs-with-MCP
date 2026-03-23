# SingleplayerModule

Type: class | Package: com.hypixel.hytale.server.core.modules.singleplayer | Extends: JavaPlugin

public class SingleplayerModule extends JavaPlugin

## Fields

- public static final PluginManifest MANIFEST
- private static SingleplayerModule instance
- private Access access
- private Access requestedAccess
- private List<InetSocketAddress> publicAddresses

## Methods

- public static SingleplayerModule get()
- @Override protected void setup()
- @Override protected void start()
- public Access getAccess()
- public Access getRequestedAccess()
- public void requestServerAccess(Access access)
- public void setPublicAddresses(List<InetSocketAddress> publicAddresses)
- public void updateAccess(Access access)
- public static void checkClientPid()
- public static UUID getUuid()
- public static String getUsername()
- public static boolean isOwner(PlayerRef player)
- public static boolean isOwner(PlayerAuthentication playerAuth, UUID playerUuid)

Also in this package: SingleplayerRequestAccessEvent

Complete API:
  public static SingleplayerModule get()
  protected void setup()
  protected void start()
  public Access getAccess()
  public Access getRequestedAccess()
  public void requestServerAccess(Access access)
  public void setPublicAddresses(List<InetSocketAddress> publicAddresses)
  public void updateAccess(Access access)
  public static void checkClientPid()
  public static UUID getUuid()
  public static String getUsername()
  public static boolean isOwner(PlayerRef player)
  public static boolean isOwner(PlayerAuthentication playerAuth, UUID playerUuid)

Fields:
public static final PluginManifest MANIFEST
private static SingleplayerModule instance
private Access access
private Access requestedAccess
private List<InetSocketAddress> publicAddresses
