# WakeUpOnDismountSystem

Type: class | Package: com.hypixel.hytale.builtin.beds.sleep.systems.player | Extends: RefChangeSystem<EntityStore, MountedComponent>

public class WakeUpOnDismountSystem extends RefChangeSystem<EntityStore, MountedComponent>

Resets the player's somnolence state to AWAKE when they dismount from a bed.

Also in this package: BigServer, EnterBedSystem, NotReady, NotificationState, RegisterTrackerSystem, SleepNotificationSystem, SmallServer, UpdateSleepPacketSystem

Complete API:
  public ComponentType<EntityStore,MountedComponent> componentType()
  public Query<EntityStore> getQuery()
  public void onComponentAdded(Ref<EntityStore> ref, MountedComponent component, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
  public void onComponentSet(Ref<EntityStore> ref, MountedComponent oldComponent, MountedComponent newComponent, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
  public void onComponentRemoved(Ref<EntityStore> ref, MountedComponent component, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)

Fields:
private final ComponentType<EntityStore,MountedComponent> mountedComponentType
private final ComponentType<EntityStore,PlayerSomnolence> playerSomnolenceComponentType
