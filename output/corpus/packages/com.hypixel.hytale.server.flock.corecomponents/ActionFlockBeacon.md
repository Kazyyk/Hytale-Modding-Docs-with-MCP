# ActionFlockBeacon

Type: class | Package: com.hypixel.hytale.server.flock.corecomponents | Extends: ActionBase

public class ActionFlockBeacon extends ActionBase

## Fields

- protected static final ComponentType<EntityStore, BeaconSupport> BEACON_SUPPORT_COMPONENT_TYPE
- protected static final ComponentType<EntityStore, FlockMembership> FLOCK_MEMBERSHIP_COMPONENT_TYPE
- protected static final ComponentType<EntityStore, EntityGroup> ENTITY_GROUP_COMPONENT_TYPE
- protected final String message
- protected final double expirationTime
- protected final boolean sendToSelf
- protected final boolean sendToLeaderOnly
- protected final int sendTargetSlot

## Methods

- @Override public boolean canExecute(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, InfoProvider sensorInfo, double dt, @Nonnull Store<EntityStore> store)
- @Override public boolean execute(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, InfoProvider sensorInfo, double dt, @Nonnull Store<EntityStore> store)
- protected void sendNPCMessage( @Nonnull Ref<EntityStore> ref, @Nullable Ref<EntityStore> targetRef, @Nonnull ComponentAccessor<EntityStore> componentAccessor )
