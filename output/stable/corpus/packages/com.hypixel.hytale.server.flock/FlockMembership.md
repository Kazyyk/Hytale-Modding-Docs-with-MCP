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
