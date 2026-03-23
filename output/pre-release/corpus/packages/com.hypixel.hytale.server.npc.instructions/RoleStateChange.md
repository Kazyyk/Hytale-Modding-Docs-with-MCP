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

Known implementors: Action, IActionListHolder, IEntityFilter, ISensorEntityCollector, ISensorEntityPrioritiser, Instruction, Motion, Sensor

Also in this package: Action, ActionList, BodyMotion, HeadMotion, Instruction, InstructionHolder, InstructionRandomized, Motion, NullSensor, Sensor

Complete API:
  default void registerWithSupport(Role role)
  default void motionControllerChanged(Ref<EntityStore> ref, NPCEntity npcComponent, MotionController motionController, ComponentAccessor<EntityStore> componentAccessor)
  default void loaded(Role role)
  default void spawned(Role role)
  default void unloaded(Role role)
  default void removed(Role role)
  default void teleported(Role role, World from, World to)
