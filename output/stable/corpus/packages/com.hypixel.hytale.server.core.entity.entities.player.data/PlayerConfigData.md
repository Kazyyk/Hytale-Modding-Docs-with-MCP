# PlayerConfigData

Type: class | Package: com.hypixel.hytale.server.core.entity.entities.player.data

public final class PlayerConfigData

Provides PlayerConfigData functionality within the data subsystem.

## Fields

- @Nonnull private final transient AtomicBoolean hasChanged
- private int blockIdVersion
- private String world
- private String preset
- @Nonnull private Set<String> knownRecipes
- @Nonnull private Set<String> unmodifiableKnownRecipes
- private Map<String, PlayerWorldData> perWorldData
- @Nonnull private Map<String, PlayerWorldData> unmodifiablePerWorldData
- @Nonnull private Set<String> discoveredZones
- @Nonnull private Set<String> unmodifiableDiscoveredZones
- @Nonnull private Set<UUID> discoveredInstances
- @Nonnull private Set<UUID> unmodifiableDiscoveredInstances
- private Object2IntMap<String> reputationData
- @Nonnull private Object2IntMap<String> unmodifiableReputationData
- @Nonnull private Set<UUID> activeObjectiveUUIDs
- @Nonnull private Set<UUID> unmodifiableActiveObjectiveUUIDs
- public final Vector3d lastSavedPosition
- public final Vector3f lastSavedRotation

## Methods

- public int getBlockIdVersion()
- public void setBlockIdVersion(int blockIdVersion)
- public String getWorld()
- public void setWorld(@Nonnull String world)
- public String getPreset()
- public void setPreset(@Nonnull String preset)
- @Nonnull public Set<String> getKnownRecipes()
- public void setKnownRecipes(@Nonnull Set<String> knownRecipes)
- @Nonnull public Map<String, PlayerWorldData> getPerWorldData()
- @Nonnull public PlayerWorldData getPerWorldData(@Nonnull String worldName)
- public void setPerWorldData(@Nonnull Map<String, PlayerWorldData> perWorldData)
- @Nonnull public Set<String> getDiscoveredZones()
- public void setDiscoveredZones(@Nonnull Set<String> discoveredZones)
- @Nonnull public Set<UUID> getDiscoveredInstances()
- public void setDiscoveredInstances(@Nonnull Set<UUID> discoveredInstances)
- @Nonnull public Object2IntMap<String> getReputationData()
- public void setReputationData(@Nonnull Object2IntMap<String> reputationData)
- @Nonnull public Set<UUID> getActiveObjectiveUUIDs()
- public void setActiveObjectiveUUIDs(@Nonnull Set<UUID> activeObjectiveUUIDs)
- public void markChanged()
- public boolean consumeHasChanged()
- public void cleanup(@Nonnull Universe universe)

Also in this package: PlayerDeathPositionData, PlayerRespawnPointData, PlayerWorldData, UniqueItemUsagesComponent

Complete API:
  public int getBlockIdVersion()
  public void setBlockIdVersion(int blockIdVersion)
  public String getWorld()
  public void setWorld(String world)
  public String getPreset()
  public void setPreset(String preset)
  public Set<String> getKnownRecipes()
  public void setKnownRecipes(Set<String> knownRecipes)
  public Map<String,PlayerWorldData> getPerWorldData()
  public PlayerWorldData getPerWorldData(String worldName)
  public void setPerWorldData(Map<String,PlayerWorldData> perWorldData)
  public Set<String> getDiscoveredZones()
  public void setDiscoveredZones(Set<String> discoveredZones)
  public Set<UUID> getDiscoveredInstances()
  public void setDiscoveredInstances(Set<UUID> discoveredInstances)
  public Object2IntMap<String> getReputationData()
  public void setReputationData(Object2IntMap<String> reputationData)
  public Set<UUID> getActiveObjectiveUUIDs()
  public void setActiveObjectiveUUIDs(Set<UUID> activeObjectiveUUIDs)
  public void markChanged()
  public boolean consumeHasChanged()
  public void cleanup(Universe universe)

Fields:
public static final BuilderCodec<PlayerConfigData> CODEC
private final transient AtomicBoolean hasChanged
private int blockIdVersion
private String world
private String preset
private Set<String> knownRecipes
private Set<String> unmodifiableKnownRecipes
private Map<String,PlayerWorldData> perWorldData
private Map<String,PlayerWorldData> unmodifiablePerWorldData
private Set<String> discoveredZones
private Set<String> unmodifiableDiscoveredZones
private Set<UUID> discoveredInstances
private Set<UUID> unmodifiableDiscoveredInstances
private Object2IntMap<String> reputationData
private Object2IntMap<String> unmodifiableReputationData
private Set<UUID> activeObjectiveUUIDs
private Set<UUID> unmodifiableActiveObjectiveUUIDs
public final Vector3d lastSavedPosition
public final Vector3f lastSavedRotation
