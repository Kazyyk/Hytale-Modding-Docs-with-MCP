# RoleStateChange

Type: interface | Package: com.hypixel.hytale.server.npc.instructions

public interface RoleStateChange

## Methods

- void registerWithSupport(Role role)
- void motionControllerChanged( @Nullable Ref<EntityStore> ref, @Nonnull NPCEntity npcComponent, MotionController motionController, @Nullable ComponentAccessor<EntityStore> componentAccessor )
- void loaded(Role role)
- void spawned(Role role)
- void unloaded(Role role)
- void removed(Role role)
- void teleported(Role role, World from, World to)
