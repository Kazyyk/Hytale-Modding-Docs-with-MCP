# PersistentFlockData

Type: class | Package: com.hypixel.hytale.server.flock | Extends: java.lang.Object | Implements: Component<EntityStore>

public class PersistentFlockData implements Component<EntityStore>

Serialized flock metadata stored on the leader NPC entity for chunk persistence and on the Flock entity at runtime. Tracks maximum grow size, allowed roles (sorted for binary search), and current flock size.

Serialization ID: `"FlockData"`.

## Static Methods


public static ComponentType<EntityStore, PersistentFlockData> getComponentType()

## Constructors


public PersistentFlockData(@Nullable FlockAsset flockDefinition, @Nonnull String[] allowedRoles)

Initializes from a FlockAsset and allowed roles. Blocked roles from the asset are removed from the allowed list.

## Methods


public int getMaxGrowSize()


public boolean isFlockAllowedRole(String role)

Uses binary search on the sorted allowed roles array.


public void increaseSize()


public void decreaseSize()

## Related Types

- Flock -- holds this data at runtime
- FlockAsset -- provides max grow size and blocked roles
- FlockMembershipSystems -- reads this data for join validation

Also in this package: EntityDeath, EntityRef, EntityRemoved, FilterPlayerFlockDamageSystem, Flock, FlockDeathSystems, FlockDebugSystem, FlockMembership, FlockMembershipSystems, FlockPlugin, FlockRemovedStatus, FlockSystems, NPCAddedFromWorldGen, OnDamageDealt, OnDamageReceived, PlayerChangeGameModeEventSystem, PlayerDeath, PrefabPasteEventSystem, RefChange, StoredFlock (and 2 more)

Complete API:
  public static ComponentType<EntityStore,PersistentFlockData> getComponentType()
  public int getMaxGrowSize()
  public boolean isFlockAllowedRole(String role)
  public void increaseSize()
  public void decreaseSize()
  public Component<EntityStore> clone()

Fields:
public static final BuilderCodec<PersistentFlockData> CODEC
private int maxGrowSize
private String[] flockAllowedRoles
private int size
