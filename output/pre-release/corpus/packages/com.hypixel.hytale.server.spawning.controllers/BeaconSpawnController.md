# BeaconSpawnController

Type: class | Package: com.hypixel.hytale.server.spawning.controllers | Extends: SpawnController<NPCBeaconSpawnJob>

public class BeaconSpawnController extends SpawnController<NPCBeaconSpawnJob>

Spawn controller for beacon-based NPC spawning. Manages spawn slots, player-based threat distribution, spawn radius/beacon radius constraints, concurrent spawn limits, idle NPC despawn timers, and round-based spawn scheduling.

## Fields

- public static final | int | MAX_ATTEMPTS_PER_TICK | Max spawn attempts per tick (5)
- public static final | double | ROUNDING_BREAK_POINT | Rounding break point (0.25)

Also in this package: Result, SpawnController, SpawnControllerSystem, SpawnJobSystem

Complete API:
  public int getMaxActiveJobs()
  public NPCBeaconSpawnJob createRandomSpawnJob(ComponentAccessor<EntityStore> componentAccessor)
  public void initialise(BeaconSpawnWrapper spawnWrapper)
  public int getSpawnsThisRound()
  public void setRemainingSpawns(int remainingSpawns)
  public void addRoundSpawn()
  public boolean isRoundStart()
  public void setRoundStart(boolean roundStart)
  public Ref<EntityStore> getOwnerRef()
  public int[] getBaseMaxConcurrentSpawns()
  public List<PlayerRef> getPlayersInRegion()
  public int getCurrentScaledMaxConcurrentSpawns()
  public void setCurrentScaledMaxConcurrentSpawns(int currentScaledMaxConcurrentSpawns)
  public Duration getDespawnBeaconAfterTimeout()
  public double getSpawnRadiusSquared()
  public double getBeaconRadiusSquared()
  public int getBaseMaxTotalSpawns()
  public void setCurrentScaledMaxTotalSpawns(int currentScaledMaxTotalSpawns)
  public List<Ref<EntityStore>> getSpawnedEntities()
  public void setNextPlayerIndex(int nextPlayerIndex)
  public Reference2DoubleMap<Ref<EntityStore>> getEntityTimeoutCounter()
  public Object2IntMap<UUID> getEntitiesPerPlayer()
  public boolean isDespawnNPCsIfIdle()
  public double getDespawnNPCAfterTimeout()
  public Comparator<PlayerRef> getThreatComparator()
  public void notifySpawnedEntityExists(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)
  public void onJobFinished(ComponentAccessor<EntityStore> componentAccessor)
  public void notifyNPCRemoval(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)
  public boolean hasSlots()
  public void markNPCUnspawnable(int roleIndex)
  public void clearUnspawnableNPCs()
  public void onAllConcurrentSpawned(ComponentAccessor<EntityStore> componentAccessor)

Fields:
private static final HytaleLogger LOGGER
public static final int MAX_ATTEMPTS_PER_TICK
public static final double ROUNDING_BREAK_POINT
private final Ref<EntityStore> ownerRef
private final List<Ref<EntityStore>> spawnedEntities
private final List<PlayerRef> playersInRegion
private int nextPlayerIndex
private final Object2IntMap<UUID> entitiesPerPlayer
private final Reference2DoubleMap<Ref<EntityStore>> entityTimeoutCounter
private final IntSet unspawnableRoles
private final Comparator<PlayerRef> threatComparator
private int baseMaxTotalSpawns
private int currentScaledMaxTotalSpawns
private int[] baseMaxConcurrentSpawns
private int currentScaledMaxConcurrentSpawns
private int spawnsThisRound
private int remainingSpawns
private boolean roundStart
private double beaconRadiusSquared
private double spawnRadiusSquared
private double despawnNPCAfterTimeout
private Duration despawnBeaconAfterTimeout
private boolean despawnNPCsIfIdle
