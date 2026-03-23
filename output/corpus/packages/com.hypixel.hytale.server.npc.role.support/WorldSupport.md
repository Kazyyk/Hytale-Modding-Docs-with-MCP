# WorldSupport

Type: class | Package: com.hypixel.hytale.server.npc.role.support

public class WorldSupport

World-interaction support for NPC roles. Manages the attitude system (default player/NPC attitudes, attitude group lookups, attitude override memory with TTL), block sensor cached targets, search ray cached positions, block placement state, environment ID caching, and weather index caching. The attitude cache clears every 100ms.

## Constants

- public static final double ATTITUDE_CACHE_CLEAR_FREQUENCY

## Constructors

- public WorldSupport(NPCEntity parent, @Nonnull BuilderRole builder, @Nonnull BuilderSupport support)

## Attitude Methods

- public Attitude getDefaultPlayerAttitude()
- public Attitude getDefaultNPCAttitude()
- public int getAttitudeGroup()
- public int getItemAttitudeGroup()
- @Nonnull public Attitude getAttitude(@Nonnull Ref<EntityStore> ref, @Nonnull Ref<EntityStore> targetRef, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
- @Nullable public Attitude getItemAttitude(@Nullable ItemStack item)
- public void overrideAttitude(Ref<EntityStore> target, Attitude attitude, double duration)
- @Nullable public Attitude getOverriddenAttitude(Ref<EntityStore> target)
- public void requireAttitudeCache()

## Block Sensor Methods

- public BlockTarget getCachedBlockTarget(int blockSet)
- public void resetBlockSensorFoundBlock(int blockSet)
- public void resetAllBlockSensors()

## Search Ray Methods

- public Vector3d getCachedSearchRayPosition(int id)
- public void resetCachedSearchRayPosition(int id)
- public void resetAllCachedSearchRayPositions()

## Environment/Weather Methods

- public int getEnvironmentId(@Nonnull ComponentAccessor<EntityStore> componentAccessor)
- public int getCurrentWeatherIndex(@Nonnull ComponentAccessor<EntityStore> componentAccessor)

## Static Methods

- public static boolean hasTagInGroup(int group, int tag)
- public static boolean isGroupMember(int parentRoleIndex, @Nonnull Ref<EntityStore> ref, @Nullable int[] groups, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
- public static boolean isGroupMember(int parentRoleIndex, @Nullable Ref<EntityStore> ref, int group, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
- public static int[] createTagSetIndexArray(@Nullable String[] tagSets)

## Related Types

- CombatSupport -- uses `isGroupMember` for damage group filtering
