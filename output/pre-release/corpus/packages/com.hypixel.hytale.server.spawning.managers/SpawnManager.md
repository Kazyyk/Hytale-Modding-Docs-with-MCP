# SpawnManager

Type: class | Package: com.hypixel.hytale.server.spawning.managers

public abstract class SpawnManager<T, U>

## Fields

- private final Int2ObjectMap<T> spawnWrapperCache
- private final Object2IntMap<String> wrapperNameMap
- private final StampedLock wrapperLock

## Methods

- public T getSpawnWrapper(int spawnConfigIndex)
- @Nullable public T removeSpawnWrapper(int spawnConfigurationIndex)
- public boolean addSpawnWrapper(T spawnWrapper)
- public void onNPCLoaded(String name, IntSet changeSet)
- public void onNPCSpawnRemoved(String key)
- protected void untrackNPCs(int index)
