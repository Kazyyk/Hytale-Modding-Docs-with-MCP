# TeleporterPlugin

Type: class | Package: com.hypixel.hytale.builtin.adventure.teleporter | Extends: JavaPlugin

public class TeleporterPlugin extends JavaPlugin

Plugin providing teleporter functionality for adventure mode, enabling point-to-point teleportation between configured locations.

Also in this package: TeleporterOwnedWarpRefChangeSystem, TeleporterOwnedWarpRefSystem

Complete API:
  public static TeleporterPlugin get()
  protected void setup()
  public ComponentType<ChunkStore,Teleporter> getTeleporterComponentType()
  public ComponentType<EntityStore,UsedTeleporter> getUsedTeleporterComponentType()

Fields:
private static TeleporterPlugin instance
private ComponentType<ChunkStore,Teleporter> teleporterComponentType
private ComponentType<EntityStore,UsedTeleporter> usedTeleporterComponentType
