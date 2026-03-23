# LocalSpawnState

Type: class | Package: com.hypixel.hytale.server.spawning.local | Extends: Resource<EntityStore>

public class LocalSpawnState implements Resource<EntityStore>

World-level resource tracking local spawn controller state including active controller references, pending spawns, and a force-trigger flag.

## Methods

- public static ResourceType<EntityStore, LocalSpawnState> getResourceType()
- public List<Ref<EntityStore>> getLocalControllerList()
- public List<LegacySpawnBeaconEntity> getLocalPendingSpawns()
- public boolean pollForceTriggerControllers()
- public void forceTriggerControllers()

Also in this package: LocalSpawnBeacon, LocalSpawnBeaconSystem, LocalSpawnController, LocalSpawnControllerSystem, LocalSpawnForceTriggerSystem, LocalSpawnSetupSystem

Complete API:
  public static ResourceType<EntityStore,LocalSpawnState> getResourceType()
  public List<Ref<EntityStore>> getLocalControllerList()
  public List<LegacySpawnBeaconEntity> getLocalPendingSpawns()
  public boolean pollForceTriggerControllers()
  public void forceTriggerControllers()
  public Resource<EntityStore> clone()

Fields:
private final List<Ref<EntityStore>> localControllerList
private final List<LegacySpawnBeaconEntity> localPendingSpawns
private boolean forceTriggerControllers
