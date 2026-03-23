# FlockMembership

Type: class | Package: com.hypixel.hytale.server.flock | Extends: java.lang.Object | Implements: Component<EntityStore>, DebugSupport.DebugFlagsChangeListener

public class FlockMembership implements Component<EntityStore>, DebugSupport.DebugFlagsChangeListener

A serialized ECS component attached to individual NPC or player entities that belong to a flock. Links the member to its flock entity via a UUID (persisted) and a runtime Ref (transient). Tracks the membership type (joining, member, leader, interim leader) and listens for debug flag changes to update the flock's visualization counter.

Serialization ID: `"FlockMembership"`, codec version 5.

## Static Methods


public static ComponentType<EntityStore, FlockMembership> getComponentType()

## Methods


public UUID getFlockId()


public void setFlockId(UUID flockId)


@Nullable
public Ref<EntityStore> getFlockRef()

Returns the runtime reference to the flock entity, or `null` if the flock is not loaded.


public void setFlockRef(@Nullable Ref<EntityStore> flockRef)


public FlockMembership.Type getMembershipType()


public void setMembershipType(FlockMembership.Type membershipType)


public void unload()

Clears the runtime flock reference. Called when the member is unloaded.


public void registerAsDebugListener(@Nonnull DebugSupport debugSupport, @Nonnull Flock flock)

Registers for debug flag change notifications. Increments the flock's `visFlockMemberCount` if the `VisFlock` flag is set.

## Inner Classes

### Type


public static enum Type

- JOINING | No | Transitional state during the join process.
- MEMBER | No | Regular flock member.
- LEADER | Yes | Elected flock leader -- owns PersistentFlockData.
- INTERIM_LEADER | Yes | Temporary leader when the actual leader is unloaded.


public boolean isActingAsLeader()

Returns `true` for `LEADER` and `INTERIM_LEADER`.

## Related Types

- Flock -- the flock entity component this membership points to
- FlockMembershipSystems -- processes join/leave/damage logic
- FlockPlugin -- registers this component type

Also in this package: EntityDeath, EntityRef, EntityRemoved, FilterPlayerFlockDamageSystem, Flock, FlockDeathSystems, FlockDebugSystem, FlockMembershipSystems, FlockPlugin, FlockRemovedStatus, FlockSystems, NPCAddedFromWorldGen, OnDamageDealt, OnDamageReceived, PersistentFlockData, PlayerChangeGameModeEventSystem, PlayerDeath, PrefabPasteEventSystem, RefChange, StoredFlock (and 2 more)

Complete API:
  public static ComponentType<EntityStore,FlockMembership> getComponentType()
  public UUID getFlockId()
  public void setFlockId(UUID flockId)
  public Ref<EntityStore> getFlockRef()
  public void setFlockRef(Ref<EntityStore> flockRef)
  public void setMembershipType(FlockMembership.Type membershipType)
  public FlockMembership.Type getMembershipType()
  public void unload()
  public void registerAsDebugListener(DebugSupport debugSupport, Flock flock)
  public void unregisterAsDebugListener(DebugSupport debugSupport, Flock flock)
  public void onDebugFlagsChanged(EnumSet<RoleDebugFlags> newFlags)
  public Component<EntityStore> clone()

Fields:
public static final int VERSION
public static final BuilderCodec<FlockMembership> CODEC
private UUID flockId
private FlockMembership.Type membershipType
private Ref<EntityStore> flockRef
private transient boolean wasVisFlock
private transient boolean listenerRegistered
