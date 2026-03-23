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
