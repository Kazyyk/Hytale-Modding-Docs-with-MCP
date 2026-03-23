# NPCEntity

Type: class | Package: com.hypixel.hytale.server.npc.entities | Extends: LivingEntity | Implements: INonPlayerCharacter

public class NPCEntity extends LivingEntity implements INonPlayerCharacter

## Fields

- private String roleName
- private int roleIndex
- private Role role
- private int spawnRoleIndex
- private String spawnRoleName
- private String spawnConfigurationName
- private int environmentIndex
- private int spawnConfigurationIndex
- private boolean isSpawnTracked
- private boolean isDespawning
- private boolean isPlayingDespawnAnim
- private float despawnRemainingSeconds
- private float despawnCheckRemainingSeconds
- private float despawnAnimationRemainingSeconds
- private float cachedEntityHorizontalSpeedMultiplier
- private final Vector3d leashPoint
- private float leashHeading
- private float leashPitch
- private boolean hasLeashPosition
- private float hoverPhase
- private double hoverHeight
- private float initialModelScale
- private Instant spawnInstant
- private PathManager pathManager
- private final DamageData damageData
- private BlockTypeView blackboardBlockTypeView
- private IntList blackboardBlockTypeSets
- private BlockEventView blackboardBlockChangeView
- private Map<BlockEventType, IntSet> blackboardBlockChangeSets
- private EntityEventView blackboardEntityEventView

## Methods

- @Nullable public static ComponentType<EntityStore, NPCEntity> getComponentType()
- @Nonnull public AlarmStore getAlarmStore()
- @Override @Nonnull protected Inventory createDefaultInventory()
- @Nullable public Role getRole()
- public void invalidateCachedHorizontalSpeedMultiplier()
- public void storeTickStartPosition(@Nonnull Vector3d position)
- public boolean tickDespawnAnimationRemainingSeconds(float dt)
- public void setDespawnAnimationRemainingSeconds(float seconds)
- public boolean tickDespawnRemainingSeconds(float dt)
- public void setDespawnRemainingSeconds(float seconds)
- public void setDespawning(boolean despawning)
- public void setPlayingDespawnAnim(boolean playingDespawnAnim)
- public boolean tickDespawnCheckRemainingSeconds(float dt)
- public void setDespawnCheckRemainingSeconds(float seconds)
- public void setInitialModelScale(float scale)
- public Vector3d getOldPosition()
- public void playAnimation( @Nonnull Ref<EntityStore> ref, @Nonnull AnimationSlot animationSlot, @Nullable String animationId, @Nonnull ComponentAccessor<EntityStore> componentAccessor )
- public void clearDamageData()
- public void setToDespawn()
- public void setDespawnTime(float time)
- public double getDespawnTime()
- @Override public boolean canBreathe( @Nonnull Ref<EntityStore> ref, @Nonnull BlockMaterial breathingMaterial, int fluidId, @Nonnull ComponentAccessor<EntityStore> componentAccessor )
- public DamageData getDamageData()
- public boolean getCanCauseDamage(@Nonnull Ref<EntityStore> attackerRef, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
- public void onFlockSetState( @Nonnull Ref<EntityStore> ref, @Nonnull String state, @Nullable String subState, @Nonnull ComponentAccessor<EntityStore> componentAccessor )
- public void onFlockSetTarget(@Nonnull String targetSlot, @Nonnull Ref<EntityStore> target)
- public void saveLeashInformation(@Nonnull Vector3d position, @Nonnull Vector3f rotation)
- public void saveLeashBlockType()
- public boolean requiresLeashPosition()
- public Vector3d getLeashPoint()
- public void setLeashPoint(@Nonnull Vector3d leashPoint)
- public float getLeashHeading()
- public void setLeashHeading(float leashHeading)
- public float getLeashPitch()
- public void setLeashPitch(float leashPitch)
- public float getHoverPhase()
- public void setHoverPhase(float hoverPhase)
- public double getHoverHeight()
- public void setHoverHeight(double hoverHeight)
- public String getRoleName()
- public void setRoleName(String roleName)
- public int getRoleIndex()
- public void setRoleIndex(int roleIndex)
- public void setRole(Role role)
- public int getSpawnRoleIndex()
- public void setSpawnRoleIndex(int spawnRoleIndex)
- @Nonnull public BlockTypeView getBlockTypeBlackboardView(@Nonnull Ref<EntityStore> ref, @Nonnull Store<EntityStore> store)
- @Nullable public BlockTypeView removeBlockTypeBlackboardView()
- public void initBlockTypeBlackboardView(@Nonnull Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)
- public void initBlockChangeBlackboardView(@Nonnull Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)
- public void addBlackboardBlockTypeSets(IntList blackboardBlockSets)
- public IntList getBlackboardBlockTypeSets()
- public void addBlackboardBlockChangeSets(@Nonnull BlockEventType type, @Nonnull IntSet sets)
- public IntSet getBlackboardBlockChangeSet(BlockEventType type)
- public Map<BlockEventType, IntSet> getBlackboardBlockChangeSets()
- public void notifyBlockChange(@Nonnull BlockEventType type, @Nonnull EventNotification notification)
- public void addBlackboardEntityEventSets(@Nonnull EntityEventType type, @Nonnull IntSet sets)
- public IntSet getBlackboardEntityEventSet(@Nonnull EntityEventType type)
- public Map<EntityEventType, IntSet> getBlackboardEntityEventSets()
- public void notifyEntityEvent(@Nonnull EntityEventType type, @Nonnull EntityEventNotification notification)
- public void setEnvironment(int env)
- public int getEnvironment()
- public int getSpawnConfiguration()
- public void setSpawnConfiguration(int spawnConfigurationIndex)
- public boolean updateSpawnTrackingState(boolean newState)
- public boolean isDespawning()
- public boolean isPlayingDespawnAnim()
- public EnumSet<RoleDebugFlags> getRoleDebugFlags()
- public void setRoleDebugFlags(@Nonnull EnumSet<RoleDebugFlags> flags)
- public void setSpawnInstant(@Nonnull Instant spawned)
- public Instant getSpawnInstant()
- public void setInventorySize(int hotbarCapacity, int inventoryCapacity, int offHandCapacity)
- @Deprecated public int getLegacyWorldgenId()
- @Nonnull public PathManager getPathManager()
- public static boolean setAppearance(@Nonnull Ref<EntityStore> ref, @Nonnull String name, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
- public void setAppearance(@Nonnull Ref<EntityStore> ref, @Nonnull ModelAsset modelAsset, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
- public float getCurrentHorizontalSpeedMultiplier(@Nullable Ref<EntityStore> ref, @Nullable ComponentAccessor<EntityStore> componentAccessor)
- @Override @Nonnull public String toString()
- @Override public String getNPCTypeId()
- @Override public int getNPCTypeIndex()
- public void addReservation(@Nonnull UUID playerUUID)
- public void removeReservation(@Nonnull UUID playerUUID)
- public boolean isReserved()
- public boolean isReservedBy(@Nonnull UUID playerUUID)

Also in this package: PathManager

Complete API:
  public static ComponentType<EntityStore,NPCEntity> getComponentType()
  public AlarmStore getAlarmStore()
  public Role getRole()
  public void invalidateCachedHorizontalSpeedMultiplier()
  public void storeTickStartPosition(Vector3d position)
  public boolean tickDespawnAnimationRemainingSeconds(float dt)
  public void setDespawnAnimationRemainingSeconds(float seconds)
  public boolean tickDespawnRemainingSeconds(float dt)
  public void setDespawnRemainingSeconds(float seconds)
  public void setDespawning(boolean despawning)
  public void setPlayingDespawnAnim(boolean playingDespawnAnim)
  public boolean tickDespawnCheckRemainingSeconds(float dt)
  public void setDespawnCheckRemainingSeconds(float seconds)
  public void setInitialModelScale(float scale)
  public Vector3d getOldPosition()
  public void playAnimation(Ref<EntityStore> ref, AnimationSlot animationSlot, String animationId, ComponentAccessor<EntityStore> componentAccessor)
  public void clearDamageData()
  public void setToDespawn()
  public void setDespawnTime(float time)
  public double getDespawnTime()
  public boolean canBreathe(Ref<EntityStore> ref, BlockMaterial breathingMaterial, int fluidId, ComponentAccessor<EntityStore> componentAccessor)
  public DamageData getDamageData()
  public boolean getCanCauseDamage(Ref<EntityStore> attackerRef, ComponentAccessor<EntityStore> componentAccessor)
  public void onFlockSetState(Ref<EntityStore> ref, String state, String subState, ComponentAccessor<EntityStore> componentAccessor)
  public void onFlockSetTarget(String targetSlot, Ref<EntityStore> target)
  public void saveLeashInformation(Vector3d position, Vector3f rotation)
  public void saveLeashBlockType()
  public boolean requiresLeashPosition()
  public Vector3d getLeashPoint()
  public void setLeashPoint(Vector3d leashPoint)
  public float getLeashHeading()
  public void setLeashHeading(float leashHeading)
  public float getLeashPitch()
  public void setLeashPitch(float leashPitch)
  public float getHoverPhase()
  public void setHoverPhase(float hoverPhase)
  public double getHoverHeight()
  public void setHoverHeight(double hoverHeight)
  public String getRoleName()
  public void setRoleName(String roleName)
  public int getRoleIndex()
  public void setRoleIndex(int roleIndex)
  public void setRole(Role role)
  public int getSpawnRoleIndex()
  public void setSpawnRoleIndex(int spawnRoleIndex)
  public BlockTypeView getBlockTypeBlackboardView(Ref<EntityStore> ref, Store<EntityStore> store)
  public BlockTypeView removeBlockTypeBlackboardView()
  public void initBlockTypeBlackboardView(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)
  public void initBlockChangeBlackboardView(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)
  public void addBlackboardBlockTypeSets(IntList blackboardBlockSets)
  public IntList getBlackboardBlockTypeSets()
  public void addBlackboardBlockChangeSets(BlockEventType type, IntSet sets)
  public IntSet getBlackboardBlockChangeSet(BlockEventType type)
  public Map<BlockEventType,IntSet> getBlackboardBlockChangeSets()
  public void notifyBlockChange(BlockEventType type, EventNotification notification)
  public void addBlackboardEntityEventSets(EntityEventType type, IntSet sets)
  public IntSet getBlackboardEntityEventSet(EntityEventType type)
  public Map<EntityEventType,IntSet> getBlackboardEntityEventSets()
  public void notifyEntityEvent(EntityEventType type, EntityEventNotification notification)
  public void setEnvironment(int env)
  public int getEnvironment()
  public int getSpawnConfiguration()
  public void setSpawnConfiguration(int spawnConfigurationIndex)
  public boolean updateSpawnTrackingState(boolean newState)
  public boolean isDespawning()
  public boolean isPlayingDespawnAnim()
  public EnumSet<RoleDebugFlags> getRoleDebugFlags()
  public void setRoleDebugFlags(EnumSet<RoleDebugFlags> flags)
  public void setSpawnInstant(Instant spawned)
  public Instant getSpawnInstant()
  public int getLegacyWorldgenId()
  public PathManager getPathManager()
  public static boolean setAppearance(Ref<EntityStore> ref, String name, ComponentAccessor<EntityStore> componentAccessor)
  public void setAppearance(Ref<EntityStore> ref, ModelAsset modelAsset, ComponentAccessor<EntityStore> componentAccessor)
  public float getCurrentHorizontalSpeedMultiplier(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)
  public String toString()
  public String getNPCTypeId()
  public int getNPCTypeIndex()
  public void addReservation(UUID playerUUID)
  public void removeReservation(UUID playerUUID)
  public boolean isReserved()
  public boolean isReservedBy(UUID playerUUID)

Fields:
public static final BuilderCodec<NPCEntity> CODEC
private String roleName
private int roleIndex
private Role role
private int spawnRoleIndex
private String spawnRoleName
private String spawnConfigurationName
private int environmentIndex
private int spawnConfigurationIndex
private boolean isSpawnTracked
private boolean isDespawning
private boolean isPlayingDespawnAnim
private float despawnRemainingSeconds
private float despawnCheckRemainingSeconds
private float despawnAnimationRemainingSeconds
private float cachedEntityHorizontalSpeedMultiplier
private final Vector3d leashPoint
private float leashHeading
private float leashPitch
private boolean hasLeashPosition
private float hoverPhase
private double hoverHeight
private float initialModelScale
private Instant spawnInstant
private PathManager pathManager
private final DamageData damageData
private BlockTypeView blackboardBlockTypeView
private IntList blackboardBlockTypeSets
private BlockEventView blackboardBlockChangeView
private Map<BlockEventType,IntSet> blackboardBlockChangeSets
private EntityEventView blackboardEntityEventView
private Map<EntityEventType,IntSet> blackboardEntityEventSets
private AlarmStore alarmStore
private int worldgenId
private final Set<UUID> reservedBy
private final Vector3d oldPosition
