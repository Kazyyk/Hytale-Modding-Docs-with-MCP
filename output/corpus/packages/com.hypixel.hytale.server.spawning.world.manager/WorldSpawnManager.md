# WorldSpawnManager

Type: class | Package: com.hypixel.hytale.server.spawning.world.manager | Extends: SpawnManager<WorldSpawnWrapper, WorldNPCSpawn>

public class WorldSpawnManager extends SpawnManager<WorldSpawnWrapper, WorldNPCSpawn>

## Fields

- protected final Int2ObjectConcurrentHashMap<EnvironmentSpawnParameters> environmentSpawnParametersMap
- protected final Long2IntMap npcEnvCombinations
- protected final Int2ObjectMap<IntSet> npcTypesPerEnvironment

## Constructors

- public WorldSpawnManager()

## Methods

- @Nullable public WorldSpawnWrapper removeSpawnWrapper(int spawnConfigurationIndex)
- public boolean addSpawnWrapper(@Nonnull WorldSpawnWrapper spawnWrapper)
- public IntSet getRolesForEnvironment(int environment)
- @Nonnull public EnvironmentSpawnParameters createEnvironmentSpawnParameters(int environmentIndex, @Nullable Environment environment)
- public EnvironmentSpawnParameters getEnvironmentSpawnParameters(int environmentIndex)
- public void updateSpawnParameters(int environmentIndex, @Nullable Environment environment)
- public void rebuildConfigurations(@Nullable IntSet changeSet)
- public static void trackNPCs(@Nonnull IntSet spawnConfigs)
- @Override public void untrackNPCs(int spawnConfig)
- public static void untrackNPCs(@Nonnull IntSet spawnConfigs)
- public static void onEnvironmentChanged()
- private static void untrackNPC(@Nonnull World world, @Nonnull NPCEntity npc)
- private static void onEnvironmentChanged(@Nonnull World world)
- private static void onRoleRemoved(@Nonnull World world, int roleIndex, @Nonnull IntSet environments)
- private static void onRoleAdded(@Nonnull World world, int roleIndex, @Nonnull IntSet environments, WorldSpawnWrapper spawnWrapper, @Nonnull RoleSpawnParameters spawnParams)
- private static long combinedIndex(int npc, int environment)
- private boolean haveCombination(int npc, int environment)
- private void addCombination(int npc, int environment, int config)
- private void removeCombination(int npc, int environment)
- private String getCombination(int npc, int environment)
